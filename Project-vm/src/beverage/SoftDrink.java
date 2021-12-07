package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SoftDrink extends JFrame implements ActionListener{
	private JButton softDrinkBtn;    
	
	public void actionPerformed(ActionEvent e) {
		softDrinkNum++;
	}
	
	public SoftDrink() {
/*		JPanel pn = new JPanel();
		this.setTitle("¾È³ç ÀÚÆÇ±â¾ä :D!");
		this.setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pn.setLayout(null);
//		pn.setBackground(Color.e1f0b4);
		pn.setOpaque(true);
		Color bcolor= new Color(255, 250, 210);
		pn.setBackground(bcolor);
*/		
		softDrinkBtn = new JButton("Åº»êÀ½·á 750¿ø");
		softDrinkBtn.setBackground(Color.pink);
		softDrinkBtn.setBounds(350, 340, 150, 40);
		softDrinkBtn.addActionListener(this);
		
//		add(pn);
//		pn.add(softDrinkBtn);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SoftDrink sd = new SoftDrink();
	}
	
	private int softDrinkPrice;
	private int softDrinkNum;

	public int getsoftDrinkNum() { return softDrinkNum; }
	public void setsoftDrinkNum(int pCoffeeNum) { this.softDrinkNum = 3; }

	public int softDrinkPrice() { return softDrinkPrice; }
	public void softDrinkPrice(int softDrinkPrice) { this.softDrinkPrice = 450; }
}
