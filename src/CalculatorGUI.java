import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
public class CalculatorGUI extends JFrame implements ActionListener {

	private JTextField input = new JTextField();
	Panel functionPanel;
	Panel Head;
	JPanel generalPanel = new JPanel();
	Double num1 = 0.0, num2 = 0.0, result = 0.0;
	private JButton[] numberButton = new JButton[10];

	CalculatorGUI() {
		super("Calculate");
		this.setSize(420, 580);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// result screen design
		input.setBackground(new Color(0, 0, 0));
		input.setBounds(0, 0, 405, 150);
		input.setFont(new Font("Ink Free", Font.BOLD, 30));
		input.setForeground(Color.WHITE);
		input.setEditable(false);
		this.add(input);

		// Clear,delete and exit functions design
		Head = new Panel();
		Head.setBounds(0, 150, 405, 60);
		Head.setLayout(new GridLayout(1, 3, 0, 0));
		this.add(Head);
		// function panel design
		generalPanel.setLayout(null);
		generalPanel.setBounds(0, 210, 405, 330);
		functionPanel = new Panel();
		functionPanel.setBounds(0, 210, 405, 330);
		functionPanel.setLayout(new GridLayout(7, 5, 0, 0));
		this.add(generalPanel);
		generalPanel.add(functionPanel);
		this.setVisible(true);

		Head.add(Del);
		Head.add(Clear);
		Head.add(Exit);

		functionPanel.add(Sin);
		functionPanel.add(Cos);
		functionPanel.add(Tan);
		functionPanel.add(csc);
		functionPanel.add(sec);

		functionPanel.add(Pi);
		functionPanel.add(Cube);
		functionPanel.add(Square);
		functionPanel.add(Int);
		functionPanel.add(Mod);

		functionPanel.add(Div);
		functionPanel.add(Faq);
		functionPanel.add(Sqrt);
		functionPanel.add(Percent);
		functionPanel.add(OneDiv);

		functionPanel.add(Mul);
		functionPanel.add(Nine);
		functionPanel.add(Eight);
		functionPanel.add(Seven);
		functionPanel.add(Pow);

		functionPanel.add(Minus);
		functionPanel.add(Six);
		functionPanel.add(Five);
		functionPanel.add(Four);
		functionPanel.add(PowerOfTen);

		functionPanel.add(Sub);
		functionPanel.add(Three);
		functionPanel.add(Two);
		functionPanel.add(One);
		functionPanel.add(Log);

		functionPanel.add(Equal);
		functionPanel.add(Point);
		functionPanel.add(Zero);
		functionPanel.add(PlusMinus);
		functionPanel.add(Ln);

		One.addActionListener(this);
		Two.addActionListener(this);
		Three.addActionListener(this);
		Four.addActionListener(this);
		Five.addActionListener(this);
		Six.addActionListener(this);
		Seven.addActionListener(this);
		Eight.addActionListener(this);
		Nine.addActionListener(this);
		Zero.addActionListener(this);
		Sub.addActionListener(this);
		Mul.addActionListener(this);
		Div.addActionListener(this);
		Minus.addActionListener(this);
		Point.addActionListener(this);
		Del.addActionListener(this);
		Clear.addActionListener(this);
		Square.addActionListener(this);
		Sqrt.addActionListener(this);
		Cube.addActionListener(this);
		Percent.addActionListener(this);
		Mod.addActionListener(this);
		OneDiv.addActionListener(this);
		PlusMinus.addActionListener(this);
		Equal.addActionListener(this);
		Equal.setIcon(new ImageIcon(getClass().getResource("resources//buttonequalpic.png")));

		Faq.addActionListener(this);
		Sin.addActionListener(this);
		Cos.addActionListener(this);
		Tan.addActionListener(this);
		csc.addActionListener(this);
		sec.addActionListener(this);
		PowerOfTen.addActionListener(this);
		Log.addActionListener(this);
		Ln.addActionListener(this);
		Pow.addActionListener(this);
		Exit.addActionListener(this);
		Pi.addActionListener(this);
		Int.addActionListener(this);

		numberButton[0] = Zero;
		numberButton[1] = One;
		numberButton[2] = Two;
		numberButton[3] = Three;
		numberButton[4] = Four;
		numberButton[5] = Five;
		numberButton[6] = Six;
		numberButton[7] = Seven;
		numberButton[8] = Eight;
		numberButton[9] = Nine;
	}
	private HeadButton Exit = new HeadButton("EXIT");
	private HeadButton Del = new HeadButton("Delete");
	private HeadButton Clear = new HeadButton("Clear");

	private FunctionButton One = new FunctionButton("1");
	private FunctionButton Two = new FunctionButton("2");
	private FunctionButton Three = new FunctionButton("3");
	private FunctionButton Four = new FunctionButton("4");
	private FunctionButton Five = new FunctionButton("5");
	private FunctionButton Six = new FunctionButton("6");
	private FunctionButton Seven = new FunctionButton("7");
	private FunctionButton Eight = new FunctionButton("8");
	private FunctionButton Nine = new FunctionButton("9");
	private FunctionButton Zero = new FunctionButton("0");
	private FunctionButton Mul = new FunctionButton("*");
	private FunctionButton Div = new FunctionButton("/");
	private FunctionButton Sub = new FunctionButton("+");
	private FunctionButton Equal = new FunctionButton("=");
	private FunctionButton Minus = new FunctionButton("-");
	private FunctionButton Point = new FunctionButton(".");
	private FunctionButton Percent = new FunctionButton("%");
	private FunctionButton OneDiv = new FunctionButton("1/n");
	private FunctionButton PlusMinus = new FunctionButton("\u00B1");
	private FunctionButton Pow = new FunctionButton("x^y");
	private FunctionButton Sin = new FunctionButton("sin");
	private FunctionButton Cos = new FunctionButton("cos");
	private FunctionButton Tan = new FunctionButton("tan");
	private FunctionButton csc = new FunctionButton("csc");
	private FunctionButton sec = new FunctionButton("sec");
	private FunctionButton PowerOfTen = new FunctionButton("10^n");
	private FunctionButton Log = new FunctionButton("log");
	private FunctionButton Ln = new FunctionButton("ln");
	private FunctionButton Mod = new FunctionButton("Mod");
	private FunctionButton Pi = new FunctionButton("pi");
	private FunctionButton Int = new FunctionButton("Int");
	private FunctionButton Square = new FunctionButton("x\u00B2");
	private FunctionButton Cube = new FunctionButton("x\u00B3");
	private FunctionButton Sqrt = new FunctionButton("\u221A");
	private FunctionButton Faq = new FunctionButton("x\u0021");
	String operatorKey = "-1";

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButton[i]) {
				input.setText(input.getText().concat(String.valueOf(i).trim()));

			}
		}
		if (e.getSource() == Point) {
			input.setText(input.getText().concat("."));
			num1 = Double.parseDouble(input.getText());

		}
		if (e.getSource() == Sub) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}
			operatorKey = "+";
		}
		if (e.getSource() == Div) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}
			operatorKey = "/";
		}
		if (e.getSource() == Minus) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}

			operatorKey = "-";
		}
		if (e.getSource() == Mul) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}

			operatorKey = "*";

		}
		if (e.getSource() == Mod) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}
			operatorKey = "Mod";
		}
		if (e.getSource() == Pow) {
			try {
				num1 = Double.parseDouble(input.getText());
				input.setText(" ");
			} catch (Exception ae) {
				input.setText("NaN");
			}
			operatorKey = "x^y";
		}
		if (e.getSource() == Percent) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = num1 / 100;
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;

		}
		if (e.getSource() == OneDiv) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = 1 / num1;
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}

		if (e.getSource() == PlusMinus) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = -1 * num1;
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Sin) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.sin(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Cos) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.cos(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Tan) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.tan(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == csc) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = 1 / (Math.sin(num1));
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == sec) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = 1 / (Math.cos(num1));
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == PowerOfTen) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.pow(10, num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Log) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.log10(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Ln) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.log(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Pi) {
			result = Math.PI;
			input.setText(String.valueOf(result).trim());
			num1 = result;
		}
		if (e.getSource() == Int) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.rint(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}

			num1 = result;
		}
		if (e.getSource() == Square) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = num1 * num1;
				input.setText(String.valueOf(result).trim());

			} catch (Exception ae) {
				input.setText("NaN");
			}

			num1 = result;
		}
		if (e.getSource() == Cube) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = num1 * num1 * num1;
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Sqrt) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Math.sqrt(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Faq) {
			try {
				num1 = Double.parseDouble(input.getText());
				result = Faqtorial(num1);
				input.setText(String.valueOf(result).trim());
			} catch (Exception ae) {
				input.setText("NaN");
			}
			num1 = result;
		}
		if (e.getSource() == Exit) {
			System.exit(0);
		}
		if (e.getSource() == Clear) {
			input.setText("");
		}
		if (e.getSource() == Del) {
			String str = input.getText();
			input.setText("");
			for (int i = 0; i < str.length() - 1; i++) {
				input.setText(input.getText() + str.charAt(i));
			}
		}

		if (e.getSource() == Equal) {
			if (operatorKey == "+") {
				num2 = Double.parseDouble(input.getText());
				result = num1 + num2;
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}
			if (operatorKey == "-") {
				num2 = Double.parseDouble(input.getText());
				result = num1 - num2;
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}
			if (operatorKey == "*") {
				num2 = Double.parseDouble(input.getText());
				result = num1 * num2;
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}
			if (operatorKey == "/") {
				num2 = Double.parseDouble(input.getText());
				result = num1 / num2;
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}
			if (operatorKey == "x^y") {
				num2 = Double.parseDouble(input.getText());
				result = Math.pow(num1, num2);
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}
			if (operatorKey == "Mod") {
				num2 = Double.parseDouble(input.getText());
				result = (Math.max(num1, num2)) % (Math.min(num1, num2));
				input.setText(String.valueOf(result).trim());
				num1 = result;
			}

		}
	}

	public double Faqtorial(double num) {
		double faqresult = 1.0;
		for (int i = 1; i <= num; i++) {
			faqresult *= i;
		}
		return faqresult;
	}
}
