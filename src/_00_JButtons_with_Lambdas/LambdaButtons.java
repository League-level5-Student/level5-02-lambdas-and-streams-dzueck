package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		addNumbers.addActionListener( (ActionEvent e)->{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Type some fucking numbers");
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			System.out.println(n1 + n2);
		});
		randNumber.addActionListener( (ActionEvent e)->{
			System.out.println(new Random().nextInt(999999));
		});
		tellAJoke.addActionListener( (ActionEvent e)->{
			System.out.println("What comes between retard and you. Nothing");
		});
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
