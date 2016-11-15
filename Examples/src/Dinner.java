import javax.swing.JOptionPane;

public class Dinner {
	public static void main(String[] args) {
	//int totalnumberofpeople=7;
	//double totalbill=123.56;
	//double answer=totalbill/totalnumberofpeople;
//	System.out.println("With "+totalnumberofpeople+" people and a bill of $ "+totalbill+" each person should pay "+answer);
//	String varx1 = JOptionPane.showInputDialog("Enter an x value ");
//	double x1 = Double.parseDouble(varx1);
//	String vary1 = JOptionPane.showInputDialog("Enter a y value ");
//	double y1 = Double.parseDouble(varx1);
//	String varx2 = JOptionPane.showInputDialog("Enter an x value ");
//	double x2 = Double.parseDouble(varx1);
//	String vary2 = JOptionPane.showInputDialog("Enter a y value ");
//	double y2 = Double.parseDouble(varx1);
//	System.out.println(y2);
//	double slope = (y2-y1)/(x2-x1);
//	System.out.println(slope);
	int a=5,b=6;
	System.out.println(findSum(a,b));
	//System.out.println(double num=a+b);
	System.out.println(findproduct(a,b));
	}
	public static int findSum(int a, int b){
		int sum = a+b;
		return sum;
	}
	public static int findproduct(int a, int b){
		int product= a*b;
		return product;
	}

}
