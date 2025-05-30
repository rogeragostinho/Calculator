import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		CalculatorFrame calculatorFrame = new CalculatorFrame();
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorFrame.setSize(200, 190);
		calculatorFrame.setVisible(true);
	}
}