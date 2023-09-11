import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener {

	private JTextField firstResult;
	private JTextField secondResult;
	private JLabel resultAddiction;
	private JLabel resultSubtraction;
	private JLabel resultMultiplication;
	private JLabel resultDivision;

	public ButtonAction(JTextField firstResult, JTextField secondResult, JLabel resultAddiction, JLabel resultSubtraction, JLabel resultMultiplication, JLabel resultDivision) {
		this.firstResult = firstResult;
		this.secondResult = secondResult;
		this.resultAddiction = resultAddiction;
		this.resultSubtraction = resultSubtraction;
		this.resultMultiplication = resultMultiplication;
		this.resultDivision = resultDivision;
	}

	@Override

	public void actionPerformed(ActionEvent e) {

		Runnable addiction = new Addiction(firstResult, secondResult, resultAddiction);
		Runnable subtraction = new Subtraction(firstResult, secondResult, resultSubtraction);
		Runnable multiplication = new Multiplication(firstResult, secondResult, resultMultiplication);
		Runnable division = new Division(firstResult, secondResult, resultDivision);
		
		Thread threadAddiction = new Thread(addiction);
		Thread threadSubtraction = new Thread(subtraction);
		Thread threadMultiplication = new Thread(multiplication);
		Thread threadDivision = new Thread(division);

		threadAddiction.start();
		threadSubtraction.start();
		threadMultiplication.start();
		threadDivision.start();
	}

}