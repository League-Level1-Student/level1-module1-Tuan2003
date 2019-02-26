import javax.swing.JOptionPane;

public class Vault {
int secretCode = 666;
boolean tryCode(int code) {
	
	if(code == secretCode) {
	JOptionPane.showMessageDialog(null, "You got it right! The code was " + code);
	return true;	
	}else {
	JOptionPane.showMessageDialog(null, "You are wrong !!!!!!!");
	return false;
	}
	
}

}
