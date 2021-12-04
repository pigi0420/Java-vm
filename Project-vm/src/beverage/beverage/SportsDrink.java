package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SportsDrink extends JFrame implements ActionListener{
	private JButton sportsDrinkBtn;    
	
	public void actionPerformed(ActionEvent e) {
		sportsDrinkNum++;
	}
	
	public SportsDrink() {
/*		JPanel pn = new JPanel();
		this.setTitle("안녕 자판기얌 :D!");
		this.setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pn.setLayout(null);
//		pn.setBackground(Color.yellow);
		pn.setOpaque(true);
		Color bcolor= new Color(255, 250, 210);
		pn.setBackground(bcolor);
*/		
		sportsDrinkBtn = new JButton("이온음료 550원");
		sportsDrinkBtn.setBackground(Color.pink);
		sportsDrinkBtn.setBounds(350, 220, 150, 40);
		sportsDrinkBtn.addActionListener(this);
		
//		add(pn);
//		pn.add(sportsDrinkBtn);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SportsDrink s = new SportsDrink();
	}
	
	private int sportsDrinkPrice;
	private int sportsDrinkNum;

	public int getsportsDrinkNum() { return sportsDrinkNum; }
	public void setsportsDrinkNum(int sportsDrinkNum) { this.sportsDrinkNum = 3; }

	public int getsportsDrinkPrice() { return sportsDrinkPrice; }
	public void setsportsDrinkPrice(int sportsDrinkPrice) { this.sportsDrinkPrice = 450; }
}
