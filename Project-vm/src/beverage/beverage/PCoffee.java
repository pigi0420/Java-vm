package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PCoffee extends JFrame implements ActionListener{
	private JButton pCoffeeBtn;    
	
	public void actionPerformed(ActionEvent e) {
		pCoffeeNum++;
	}
	
	public PCoffee() {
/*		JPanel pn = new JPanel();
		this.setTitle("안녕 자판기얌 :D!");
		this.setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pn.setLayout(null);
//		pn.setBackground(Color.e1f0b4);
		pn.setOpaque(true);
		Color bcolor= new Color(255, 250, 210);
		pn.setBackground(bcolor);
*/		
		pCoffeeBtn = new JButton("고급커피 700원");
		pCoffeeBtn.setBackground(Color.pink);
		pCoffeeBtn.setBounds(350, 280, 150, 40);
		pCoffeeBtn.addActionListener(this);
		
//		add(pn);
//		pn.add(pCoffeeBtn);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		PCoffee pc = new PCoffee();
	}
	
	private int pCoffeePrice;
	private int pCoffeeNum;

	public int getpCoffeeNum() { return pCoffeeNum; }
	public void setpCoffeeNum(int pCoffeeNum) { this.pCoffeeNum = 3; }

	public int pCoffeePrice() { return pCoffeePrice; }
	public void pCoffeePrice(int pCoffeePrice) { this.pCoffeePrice = 450; }
}
