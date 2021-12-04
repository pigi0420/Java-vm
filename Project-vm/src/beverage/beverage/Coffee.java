package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Coffee extends JFrame implements ActionListener{
	private JButton coffeeBtn;    
	
	public void actionPerformed(ActionEvent e) {
		coffeeNum++;
	}
	
	public Coffee() {
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
		coffeeBtn = new JButton("Ä¿ÇÇ 500¿ø");
		coffeeBtn.setBackground(Color.pink);
		coffeeBtn.setBounds(350, 160, 150, 40);
		coffeeBtn.addActionListener(this);
		
//		add(pn);
//		pn.add(coffeeBtn);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Coffee c = new Coffee();
	}
	
	private int coffeePrice;
	private int coffeeNum;

	public int getCoffeeNum() { return coffeeNum; }
	public void setCoffeeNum(int coffeeNum) { this.coffeeNum = 3; }

	public int getCoffeePrice() { return coffeePrice; }
	public void setCoffeePrice(int coffeePrice) { this.coffeePrice = 450; }
}
