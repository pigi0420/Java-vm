/*package ex;

import java.util.Scanner;

class Coffee{
	int cn;
	String c;
	void show(){
		System.out.print(c);
		cn = cn - 1;
		System.out.println(cn);
	}
}

public class coffe1 {
	public static void main(String[] args) {
		Coffee vCoffe = new Coffee();
		vCoffe.cn = 3;
		String c="coffe";
		String cdr=null;
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("음료를 선택하시오:");
		//cdr = sc.nextLine();
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("음료를 선택하시오:");
			cdr = sc.nextLine();
			
			if(cdr.equals(c)) {
				vCoffe.c="커피";		
				vCoffe.show();
				break;
			}
			else {
				System.out.println("다시시도하세용");
				
			}
		}

	}

}*/
