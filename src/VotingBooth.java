import javax.swing.JOptionPane;

public class VotingBooth {


public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How old are you in years?");
	
	int height2 = Integer.parseInt(height);
	
	if(height2 < 18) {
	System.out.println("you cannot vote");
	
	}
	else {
		System.out.println("you can vote");
	}

	}
}

