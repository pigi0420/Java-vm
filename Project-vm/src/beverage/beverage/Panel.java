package beverage;

import java.awt.Color;
import javax.swing.*;

public class Panel extends JFrame {
	public Panel(){
		JPanel pn = new JPanel();
		this.setTitle("¾È³ç ÀÚÆÇ±â¾ä :D!");
		this.setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pn.setLayout(null);
//		pn.setBackground(Color.e1f0b4);
		pn.setOpaque(true);
		Color bcolor= new Color(255, 250, 210);
		pn.setBackground(bcolor);
		add(pn);
		
		
		}
		
	
	
	public static void main(String[] args) {
		Water water = new Water();
		water.waterBtn();
		Coffee c = new Coffee();
		SportsDrink s = new SportsDrink();
		SoftDrink sd = new SoftDrink();
		PCoffee pc = new PCoffee();
	}

}
