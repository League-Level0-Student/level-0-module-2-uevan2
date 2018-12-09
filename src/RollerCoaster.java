import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		
		int height2 = Integer.parseInt(height);
		
		if(height2 < 48) {
		System.out.println("you cannot ride the roller coaster");
		
		}
		else {
			System.out.println("you can ride the roller coaster");
		}
	
		}
	}


