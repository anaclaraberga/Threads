import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Multiplication implements Runnable{

  	private JTextField firstResult;
	  private JTextField secondResult;
	  private JLabel resultMultiplication;

    public Multiplication(JTextField firstResult, JTextField secondResult, JLabel resultMultiplication) {
      this.firstResult = firstResult;
      this.secondResult = secondResult;
      this.resultMultiplication = resultMultiplication;
    }

  @Override
  public void run() {

    long inicio = System.currentTimeMillis();
    long value1 = Long.parseLong(firstResult.getText());
		long value2 = Long.parseLong(secondResult.getText());
		BigInteger calculate = new BigInteger("0");
		
		for (int i = 0; i < value1; i++) {
			for (int j = 0; j < value2; j++) {
				calculate = calculate.add(new BigInteger("1"));
			}
		}

		resultMultiplication.setText(calculate.toString());

    long fim = System.currentTimeMillis();
    long total = ((fim - inicio) / 1000) % 60;

		System.out.println(total);
  }
  
}