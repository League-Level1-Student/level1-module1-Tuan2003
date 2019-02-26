import javax.swing.JOptionPane;

public class JamesBond {
public static void main(String[] args) {
	Vault vault = new Vault();
	
	boolean correct = false;
	while(!correct) {
		int code = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the code?"));
		correct = vault.tryCode(code);
	}
}
}
