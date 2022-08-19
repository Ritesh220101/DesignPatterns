package com.aurionpro.test;
import com.aurionpro.model.*;
public class CompositeTest {

	public static void main(String[] args) {
	IComponent hd=new Leaf(5000, "HDD");
	IComponent mouse=new Leaf(500, "Mouse");
	IComponent monitor=new Leaf(10000, "Monitor");
	IComponent ram=new Leaf(3000, "Ram");
	IComponent cpu=new Leaf(20000,"CPU");
	
	Composite ph=new Composite("PheriPheral");
	Composite cabinet=new Composite("Cabinet");
	Composite motherboard=new Composite("MotherBoard");
	Composite computer=new Composite("Computer");
	
	ph.addComponent(mouse);
	ph.addComponent(monitor);
	ph.showNamePrice();
	System.out.println("-------------------------");
	cabinet.addComponent(hd);
	cabinet.addComponent(motherboard);
	cabinet.showNamePrice();
	System.out.println("-------------------------");
	motherboard.addComponent(ram);
	motherboard.addComponent(cpu);
	motherboard.showNamePrice();
	System.out.println("-------------------------");
	computer.addComponent(ph);
	computer.addComponent(cabinet);
	computer.showNamePrice();
	

	}
	

}
