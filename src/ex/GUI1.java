package ex;

//import java.awt.*;
import javax.swing.*;

class VButton extends JFrame{
	
	VButton() {
		setTitle("�ȳ�, ��ư!");
	//	���ἱ�� ��ư & �� ���� ǰ�� ��ư
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JButton n = new JButton("���� ���Ǳ�");
		n.setBounds(200, 10, 200, 60);
		
		JButton c = new JButton("Ŀ�� 500");
		c.setBounds(350, 100, 150, 40);
		
		JButton cs = new JButton("ǰ��");
		cs.setBounds(510, 100, 40, 40);
		
		JButton w = new JButton("���� 450");
		w.setBounds(350, 160, 150, 40);
		
		JButton ws = new JButton("ǰ��");
		ws.setBounds(510, 160, 40, 40);
		
		JButton sd = new JButton("�̿����� 550");
		sd.setBounds(350, 220, 150, 40);
		
		JButton sds = new JButton("ǰ��");
		sds.setBounds(510, 220, 40, 40);
		
		JButton pc = new JButton("���Ŀ�� 700");
		pc.setBounds(350, 280, 150, 40);
		
		JButton pcs = new JButton("ǰ��");
		pcs.setBounds(510, 280, 40, 40);
		
		JButton sw = new JButton("ź������ 750");
		sw.setBounds(350, 340, 150, 40);
		
		JButton sws = new JButton("ǰ��");
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
		
// ���Աݾ� ǥ�� & ����, ���� ���Ա� & ��ȯ��ư 
		JButton inm = new JButton("���Աݾ�: ");
		inm.setBounds(350, 400, 200, 40);
		
		JButton pb = new JButton("��ȯ����");
		pb.setBounds(500, 460, 50, 40);
		
		JButton pm = new JButton("�������Ա�");
		pm.setBounds(360, 460, 130, 40);
		
		JButton mm = new JButton("�������Ա�");
		mm.setBounds(220, 460, 130, 40);
		
		p.add(inm);
		p.add(pb);
		p.add(pm);
		p.add(mm);
		
		
//������ �޴�
		JButton mgm = new JButton("������ �޴�");
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
