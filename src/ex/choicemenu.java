package ex;

import java.util.Scanner;

class Coffe{
	int cn;
	String c;
	void show(){
		if(cn>=1) {
			cn = cn - 1;
			System.out.print(c+"\n");
		
			//System.out.println(cn);
		}
		else
			System.out.print(c+cn+" ǰ�� �ٸ� ���Ḧ �����ϼ���/n");
	}
}

class Water{
	int wn;
	String w;
	void show(){
		if(wn>=1) {
			wn = wn - 1;
			System.out.print(w+"\n");
		
			//System.out.println(wn);
		}
		else
			System.out.print(w+wn+" ǰ�� �ٸ� ���Ḧ �����ϼ���/n");
	}
}

class SportsD{
	int sdn;
	String sd;
	void show(){
		if(sdn>=1) {
			sdn = sdn - 1;
			System.out.print(sd+"\n");
		
			//System.out.println(sdn);
		}
		else
			System.out.print(sd+sdn+" ǰ�� �ٸ� ���Ḧ �����ϼ���/n");
	}
}

class PrCoffe{
	int pcn;
	String pc;
	void show(){
		if(pcn>=1) {
			pcn = pcn - 1;
			System.out.print(pc+"\n");
		
			//System.out.println(pcn);
		}
		else
			System.out.print(pc+pcn+" ǰ�� �ٸ� ���Ḧ �����ϼ���/n");
	}
}

class Soda{
	int san;
	String sa;
	void show(){
		if(san>=1) {
			san = san - 1;
			System.out.print(sa+"\n");
		
			//System.out.println(san);
		}
		else
			System.out.print(sa+san+" ǰ�� �ٸ� ���Ḧ �����ϼ���\n");
	}
}

public class choicemenu {
	public static void main(String[] args) {
		String cdr=null;
		
		Coffe pCoffe = new Coffe();
		String c="coffe";
		pCoffe.cn = 3;
		
		Water pWater = new Water();
		String w="water";
		pWater.wn = 3;
		
		SportsD pSportsD = new SportsD();
		String sd="sports drink";
		pSportsD.sdn = 3;
		
		PrCoffe pPrCoffe = new PrCoffe();
		String pc="sports drink";
		pPrCoffe.pcn = 3;
		
		Soda pSoda = new Soda();
		String sa="soda";
		pSoda.san = 3;
		
		String e = "end";
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���Ḧ �����Ͻÿ�:");
			cdr = sc.nextLine();
			
			if(cdr.equals(c)) {
				pCoffe.c="Ŀ��";		
				pCoffe.show();
				
			}
			else if(cdr.equals(w)) {
				pWater.w="����";		
				pWater.show();
				
			}
			else if(cdr.equals(sd)) {
				pSportsD.sd="�̿�����";		
				pSportsD.show();
				
			}
			
			else if(cdr.equals(e)) {
				System.out.println("���Ǳ� �̿� ����");		
				break;
    		}
			
			else {
				System.out.println("�ٽýõ��ϼ���");
				
			}
		}

	}

}
