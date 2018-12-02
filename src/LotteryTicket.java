import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
	public static void main(String[] args) {
		
	
		int lotteryTicket = 0;
			
			
				Random random = new Random();
					  int lotteryTicket1 = random.nextInt(9)+1;
					 
					  int lotteryTicket2 = random.nextInt(9)+1;
					
					  int lotteryTicket3 = random.nextInt(9)+1;
					 
					  int lotteryTicket4 = random.nextInt(9)+1;
					  
					  int lotteryTicket5 = random.nextInt(9)+1;
					  JOptionPane.showMessageDialog(null, lotteryTicket1+lotteryTicket2+lotteryTicket3+lotteryTicket4+lotteryTicket5);
			
				
			
	}
}
