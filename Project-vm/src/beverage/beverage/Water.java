package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Water extends JFrame implements ActionListener{
	private JButton waterBtn;    
	
	public void actionPerformed(ActionEvent e) {
		waterNum++;
	}
	
	public Water() {
/*		JPanel pn = new JPanel();
		this.setTitle("¾È³ç ÀÚÆÇ±â¾ä :D!");
		this.setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pn.setLayout(null);
//		pn.setBackground(Color.yellow);
		pn.setOpaque(true);
		Color bcolor= new Color(255, 250, 210);
		pn.setBackground(bcolor);
*/		
		waterBtn = new JButton("»ý¼ö 450¿ø");
		waterBtn.setBackground(Color.pink);
		waterBtn.setBounds(350, 100, 150, 40);
		waterBtn.addActionListener(this);
		
//		add(pn);
//		pn.add(waterBtn);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Water w = new Water();
	}
	
	private int waterPrice;
	private int waterNum;

	public int getwaterNum() { return waterNum; }
	public void setwaterNum(int waterNum) { this.waterNum = 3; }

	public int getwaterPrice() { return waterPrice; }
	public void setwaterPrice(int waterPrice) { this.waterPrice = 450; }

	
}
