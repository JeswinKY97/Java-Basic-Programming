package Programming;
import java.util.*;
class breadjam
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
    System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter") ;
    System.out.println("Enter the choice");
      int c=s.nextInt();
    double kj=4.1868;
    int br=74;
    int bu=102;
    int jam=26;
    Calories ca=new Calories();
    switch(c)
    {
      case 1:
    	  System.out.println("Enter the number of Slice of bread");
    	   int br1=s.nextInt();
    ca.calculateCalories(br,br1,kj);
    break;
      case 2:
    	  System.out.println("Enter the number of Slice of bread");
          int br2=s.nextInt();
        System.out.println("Enter the number of teaspoon of Jam");
          int jam1=s.nextInt();
        ca.calculateCalories(br,jam,br2,jam1,kj);
        break;
      case 3:
    	  System.out.println("Enter the number of Slice of bread");
          int br3=s.nextInt();
        System.out.println("Enter the number of teaspoon of Jam");
          int jam2=s.nextInt();
          System.out.println("Enter the number of teaspoon of Butter");
          int bu1=s.nextInt();
        ca.calculateCalories(br,bu,jam,br3,jam2,bu1,kj);
        break;
    
    }
  }
}
class Calories
{
 public void calculateCalories(int br,int br1,double kj) {
    
   double r1=br1*br;
   double r=r1*kj;
    System.out.printf("%.3f kJ of energy generated from %.1fcalories",r,r1);
 }

public void calculateCalories(int br, int bu, int jam, int br3, int jam2, int bu1,double kj) {
	// TODO Auto-generated method stub
	double r1=(br3*br)+(jam2*jam)+(bu1*bu);
	double r=r1*kj;
	System.out.printf("%.3f kJ of energy generated from %.1fcalories",r,r1);
}

public void calculateCalories(int br,int jam,int br2,int jam1,double kj) {
    
    double r1=(br2*br)+(jam1*jam);
    double r=r1*kj;
    System.out.printf("%.3f kJ of energy generated from %.1fcalories",r,r1);
}
}

