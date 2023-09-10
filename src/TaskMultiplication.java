import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaskMultiplication implements Runnable{

  	private JTextField firstResult;
	  private JTextField secondResult;
	  private JLabel result;

    public TaskMultiplication(JTextField firstResult, JTextField secondResult, JLabel result) {
      this.firstResult = firstResult;
      this.secondResult = secondResult;
      this.result = result;
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

		result.setText(calculate.toString());

    long fim = System.currentTimeMillis();
    long total = ((fim - inicio) / 1000) % 60;

		System.out.println(total);
  }
  
}
