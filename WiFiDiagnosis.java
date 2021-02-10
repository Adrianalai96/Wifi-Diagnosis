import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		Scanner input = new Scanner(System.in);
		int computer;
		int router;
		int plug;
		int move;
		
		System.out.println("First step: Reboot your computer");
		System.out.println("Are you able to connect to the internet? (type 1 for yes or type 2 for no)");
		computer = input.nextInt();
		if(computer == 1) {
			System.out.println("Rebooting your computer seems to work");
			System.exit(1);
		}
		
		
		System.out.println("Second step: Reboot your router");
		System.out.println("Are you able to connect to the internet? (type 1 for yes or type 2 for no)");
		router = input.nextInt();
		if(router == 1) {
			System.out.println("Rebooting your router seems to work");
			System.exit(1);
		}
		
		System.out.println("Third step: Make sure the cables are plugged in firmly and your router is getting power");
		System.out.println("Are you able to connect to the internet? (type 1 for yes or type 2 for no)");
		plug = input.nextInt();
		if(plug == 1) {
			System.out.println("Checking for lose cables seemed to work");
			System.exit(1);
		}
		
		System.out.println("Fourth step: Move your computer closer to your router");
		System.out.println("Are you able to connect to the internet? (type 1 for yes or type 2 for no)");
		move = input.nextInt();
		if(move == 1) {
			System.out.println("Moving your computer closer seemed to work");
			System.exit(1);
		}
		
		System.out.println("Fith step: Contact your ISP");
		System.out.println("Are you able to connect to the internet? (type 1 for yes or type 2 for no)");
		move = input.nextInt();
		if(move == 1) {
			System.out.println("Contacting your ISP seemed to work");
			System.exit(1);
		}else {
			System.out.println("Make sure your ISP is hooked up to your router.");
			System.exit(1);
		}
		
		
		
	}

}
