package Week1.Day2;

public class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public double sub(double num1,double num2) {
		return num1-num2;
		}
	public double mul(double num1,double num2) {
	 return num1*num2;
	}
public static void main(String[] args) {
	Calculator cal = new Calculator();
    System.out.println(cal.add(2,5));
    System.out.println(cal.sub(2.4,5.6));
    System.out.println(cal.mul(3.4, 7.8));
	
}			
}

