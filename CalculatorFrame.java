import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
//import javax.swing.
import javax.swing.JPanel;
import javax.swing.JButton;
//import java.awt.
import java.awt.GridLayout;

class CalculatorFrame extends JFrame
{
	private final JTextField textField;
	private final JButton[][] buttons;
	private final String[][] buttonsText = {
		{"7", "8", "9", "/"},
		{"4", "5", "6", "*"},
		{"1", "2", "3", "-"},
		{"0", ".", "=", "+"}
	};
	private final JPanel panelCenter;

	public CalculatorFrame()
	{
		super("Calculator");
		setLayout(new BorderLayout());

		textField = new JTextField();
		textField.setEditable(false);
		add(textField, BorderLayout.NORTH);

		panelCenter = new JPanel(new GridLayout(4, 4, 3, 3));
		add(panelCenter, BorderLayout.CENTER);

		buttons = new JButton[buttonsText.length][buttonsText[0].length];

		for (int i = 0; i < buttonsText.length; i++)
		{
			for (int j = 0; j < buttonsText[0].length; j++)
			{
				buttons[i][j] = new JButton(buttonsText[i][j]);
				panelCenter.add(buttons[i][j]);
			}
		}
	}
}