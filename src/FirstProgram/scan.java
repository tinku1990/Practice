package FirstProgram;
import java.util.Scanner;
public class scan {
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many marks in english");
		double p1 = sc.nextDouble();
		System.out.println("Hmm good");
		System.out.println("what about maths");
		double p2 = sc.nextDouble();
		System.out.println("ohh great");
		System.out.println("tell your total marks");
		double p3 = sc.nextDouble();
		System.out.println("overall your percentage is");
		double Totalmarks = p1 + p2 + p3;
		System.out.println("Totalmarks:" + Totalmarks);
		double percentage = (Totalmarks / 600) * 100;
		System.out.println("Overall percentage:" + percentage);
		sc.close();
	}
}
