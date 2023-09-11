import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addiction implements Runnable{
  private JTextField firstResult;
  private JTextField secondResult;
  private JLabel resultAddiction;

  public Addiction(JTextField firstResult, JTextField secondResult, JLabel resultAddiction) {
    this.firstResult = firstResult;
    this.secondResult = secondResult;
    this.resultAddiction = resultAddiction;
  }

@Override
public void run() {

  long inicio = System.currentTimeMillis();
  long value1 = Long.parseLong(firstResult.getText());
  long value2 = Long.parseLong(secondResult.getText());

  Long calculate = (long) 0;
  
  for (int i = 0; i <= value1; i++) {
  }
  
  for (int j = 0; j <= value2; j++) {
  calculate = value1 + value2;
  }

  resultAddiction.setText(Long.toString(calculate));

  long fim = System.currentTimeMillis();
  long total = ((fim - inicio) / 1000) % 60;

  System.out.println(total);
}
}