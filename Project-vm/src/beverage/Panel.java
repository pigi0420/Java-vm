package beverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JFrame implements ActionListener{
	public JButton waterBtn;
	public JButton coffeeBtn;
	public JButton sportsDrinkBtn;
	public JButton pCoffeeBtn; 
	public JButton softDrinkBtn; 
	
	public Panel(){
		JPanel pn = new JPanel();
		this.setTitle("안녕 자판기얌 :D!");
		setSize(600, 700);
		pn.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(pn);
		
		waterBtn = new JButton("생수 450원");
		waterBtn.setBackground(Color.pink);
		waterBtn.setBounds(350, 100, 150, 40);
		pn.add(waterBtn);
		
		coffeeBtn = new JButton("커피 500원");
		coffeeBtn.setBackground(Color.pink);
		coffeeBtn.setBounds(350, 160, 150, 40);
		pn.add(coffeeBtn);
		
		sportsDrinkBtn = new JButton("이온음료 550원");
		sportsDrinkBtn.setBackground(Color.pink);
		sportsDrinkBtn.setBounds(350, 220, 150, 40);
		pn.add(sportsDrinkBtn);
		
		pCoffeeBtn = new JButton("고급커피 700원");
		pCoffeeBtn.setBackground(Color.pink);
		pCoffeeBtn.setBounds(350, 280, 150, 40);
		pn.add(pCoffeeBtn);
		
		softDrinkBtn = new JButton("탄산음료 750원");
		softDrinkBtn.setBackground(Color.pink);
		softDrinkBtn.setBounds(350, 340, 150, 40);
		pn.add(softDrinkBtn);
		
		
		}
		
	@Override 
	public void actionPerformed(ActionEvent event) { 
		Water w = new Water();
		Coffee c = new Coffee();
		SportsDrink sp = new SportsDrink();
		PCoffee pc = new PCoffee();
		SoftDrink so = new SoftDrink();
		
		if (event.getSource() == waterBtn) { 
			w.setwaterNum(ABORT);
		}
		
		else if (event.getSource() == coffeeBtn) { 
			c.coffeeNum--;
		}
		
		else if (event.getSource() == sportsDrinkBtn) { 
			sp.sportsDrinkNum--;
		}
		
		else if (event.getSource() == pCoffeeBtn) { 
			pc.pCoffeeNum--;
		}
		
		else if (event.getSource() == softDrinkBtn) { 
			so.softDrinkNum--;
		}

	
	}
	
	
	public static void main(String[] args) {
		Water w = new Water();
		
		new Panel();
		
		System.out.println(w.waterNum);
	
	}


}