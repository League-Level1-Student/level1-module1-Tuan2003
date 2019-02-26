import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	String flavor  = JOptionPane.showInputDialog(null,"What flavor do you want on your popcorn?");
	int time = Integer.parseInt(JOptionPane.showInputDialog(null, "How long do you want your popcorn to cook for?"));
	Popcorn popcorn = new Popcorn(flavor);
	microwave.setTime(time);
	microwave.putInMicrowave(popcorn);
	microwave.startMicrowave();
	popcorn.applyHeat();
	popcorn.eat();
	
}
}
