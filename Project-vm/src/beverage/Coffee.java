package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Coffee extends JFrame implements ActionListener{
	private JButton coffeeButton;    
	
	public void actionPerformed(ActionEvent e) {
		coffeeNum++;
	}
	
	public Coffee() {
		this.setTitle("¾È³ç ÀÚÆÇ±â¾ä :D!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 700);
		setLayout(null);
		
		JPanel pn = new JPanel();
//		pn.setBackground(getForeground(Color.yellow));
		
		coffeeButton = new JButton("Ä¿ÇÇ 500");
		coffeeButton.setBounds(350, 100, 150, 40);
		coffeeButton.addActionListener(this);
		
		add(pn);
		pn.add(coffeeButton);
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
