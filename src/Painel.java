import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Container;
 
public class Painel extends JFrame {
  public void painelCalculator() {
    Container janela = getContentPane();

		JTextField firstResult = new JTextField(10);
		JTextField secondResult = new JTextField(10);
		JButton button = new JButton(" = ");
		JLabel resultAddiction = new JLabel(" ? ");
		JLabel resultSubtraction = new JLabel(" ? ");
		JLabel resultMultiplication = new JLabel(" ? ");
		JLabel resultDivision = new JLabel(" ? ");

    firstResult.setBounds(150,40,100,20);
		secondResult.setBounds(150,80,100,20);
		button.setBounds(150,120,100,20);

    JFormattedTextField jFormattedAddiction = new JFormattedTextField(resultAddiction);
    jFormattedAddiction.setBounds(100, 120, 100, 20);
		
		
		button.addActionListener(new ButtonAction(firstResult, secondResult, resultAddiction, resultSubtraction, resultMultiplication, resultDivision));
		
		JPanel painel = new JPanel();

		painel.add(new JLabel("Primeiro valor:"));
		painel.add(firstResult);
		painel.add(new JLabel("Segundo valor:"));
		painel.add(new JLabel(" "));
		painel.add(secondResult);
		painel.add(button);
		painel.add(new JLabel("Adição:"));
		painel.add(resultAddiction);
		painel.add(new JLabel("Subtração:"));
		painel.add(resultSubtraction);
		painel.add(new JLabel("Multiplicação:"));
		painel.add(resultMultiplication);
		painel.add(new JLabel("Divisão:"));
		painel.add(resultDivision);


		janela.add(painel);
		setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
