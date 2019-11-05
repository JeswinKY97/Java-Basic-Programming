package Oops;
import java.util.Scanner;
public class Objectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=s.next();
		Carnew c=new Carnew(str);
		Carnew.a();
		Carnew.b();
		Carnew.m();
		Carnew.disply(str);
		}
		

	}


class Carnew{
	String str;
	public Carnew(String str) {
		str=str;
	}
	public static void m() {
		System.out.println("Welcome Car m");
		System.out.println("Welcome Car model gtfdt");
	}
	public static void b() {
		System.out.println("Welcome Car b");
		System.out.println("Welcome Car model yffg");
	}
	public static void a() {
		System.out.println("Welcome Car a");
		System.out.println("Welcome Car model gtfdt");
	}
	public static void disply(String str) {
		System.out.println(str);
		
	}
}