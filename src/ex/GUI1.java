package ex;

//import java.awt.*;
import javax.swing.*;

class VButton extends JFrame{
	
	VButton() {
		setTitle("안녕, 버튼!");
	//	음료선택 버튼 & 각 음료 품절 버튼
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JButton n = new JButton("루의 자판기");
		n.setBounds(200, 10, 200, 60);
		
		JButton c = new JButton("커피 500");
		c.setBounds(350, 100, 150, 40);
		
		JButton cs = new JButton("품절");
		cs.setBounds(510, 100, 40, 40);
		
		JButton w = new JButton("생수 450");
		w.setBounds(350, 160, 150, 40);
		
		JButton ws = new JButton("품절");
		ws.setBounds(510, 160, 40, 40);
		
		JButton sd = new JButton("이온음료 550");
		sd.setBounds(350, 220, 150, 40);
		
		JButton sds = new JButton("품절");
		sds.setBounds(510, 220, 40, 40);
		
		JButton pc = new JButton("고급커피 700");
		pc.setBounds(350, 280, 150, 40);
		
		JButton pcs = new JButton("품절");
		pcs.setBounds(510, 280, 40, 40);
		
		JButton sw = new JButton("탄산음료 750");
		sw.setBounds(350, 340, 150, 40);
		
		JButton sws = new JButton("품절");
		sws.setBounds(510, 340, 40, 40); 
		
		add(p);
		p.add(n);
		p.add(c);
		p.add(w);
		p.add(sd);
		p.add(pc);
		p.add(sw); 
		
		p.add(cs);
		p.add(ws);
		p.add(sds);
		p.add(pcs);
		p.add(sws);
		
// 투입금액 표기 & 동전, 지폐 투입구 & 반환버튼 
		JButton inm = new JButton("투입금액: ");
		inm.setBounds(350, 400, 200, 40);
		
		JButton pb = new JButton("반환래버");
		pb.setBounds(500, 460, 50, 40);
		
		JButton pm = new JButton("지폐투입구");
		pm.setBounds(360, 460, 130, 40);
		
		JButton mm = new JButton("동전투입구");
		mm.setBounds(220, 460, 130, 40);
		
		p.add(inm);
		p.add(pb);
		p.add(pm);
		p.add(mm);
		
		
//관리자 메뉴
		JButton mgm = new JButton("관리자 메뉴");
		mgm.setBounds(450, 40, 100, 30);
		
		p.add(mgm);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 700);
		setVisible(true);
	}
	

}

public class GUI1 {

	public static void main(String[] args) {
		new VButton();

	}

}
