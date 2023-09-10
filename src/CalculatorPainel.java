import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPainel {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Multiplicação Demorada");

		JTextField firstResult = new JTextField(10);
		JTextField secondResult = new JTextField(10);
		JButton button = new JButton(" = ");
		JLabel result = new JLabel("           ?          ");
		
		button.addActionListener(new ButtonAction(firstResult, secondResult, result));
		
		JPanel painel = new JPanel();
		painel.add(firstResult);
		painel.add(new JLabel("x"));
		painel.add(secondResult);
		painel.add(button);
		painel.add(result);
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}
}


