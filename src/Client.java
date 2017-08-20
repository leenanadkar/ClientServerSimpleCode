import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		int number,temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("192.168.1.102",1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter any number to be multiplied by 5000");
		number = sc.nextInt();
		
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(number);
		
		temp = sc1.nextInt();
		System.out.println(temp);
	}

}
