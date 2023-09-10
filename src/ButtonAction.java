import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener {

	private JTextField firstResult;
	private JTextField secondResult;
	private JLabel result;

	public ButtonAction(JTextField firstResult, JTextField secondResult, JLabel result) {
		this.firstResult = firstResult;
		this.secondResult = secondResult;
		this.result = result;
	}

	@Override

	public void actionPerformed(ActionEvent e) {

		Runnable taskMultiplication = new TaskMultiplication(firstResult, secondResult, result);
		
		Thread threadCalculate = new Thread(taskMultiplication);

		threadCalculate.start();
	}

}