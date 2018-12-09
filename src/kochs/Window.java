package kochs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ch.aplu.turtle.Playground;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JComboBox;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int place = 0 ;
	int placeIn  ;
	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 41, 269, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String[] choice = {"select...", "Ïî÷àòè ìàëşâàòè ç öåíòğó canvas","Ïî÷àòè ç ë³âî¿ ÷àñòèíè", "Íàìàëşâàòè ïîâíó ç³ğêó Êîõà",};
		JComboBox comboBox = new JComboBox(choice);
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == comboBox)
				if(comboBox.getSelectedItem().equals("Ïî÷àòè ìàëşâàòè ç öåíòğó canvas")) {
				  place = - 90;
				}else if(comboBox.getSelectedItem().equals("Ïî÷àòè ç ë³âî¿ ÷àñòèíè")) {
					place = -190;
				}else if(comboBox.getSelectedItem().equals("Íàìàëşâàòè ïîâíó ç³ğêó Êîõà")) {
					
			}else {
				 JOptionPane.showMessageDialog(null, "Íåïğàâèëüí³ äàí³");
			}}
		});
		comboBox.setBounds(317, 41, 181, 41);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("\u041F\u0456\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0438");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int input;
			try {
			 input = Integer.parseInt(textField.getText());
			 if(input >= 0 && input <= 11) {
			new Kochs(input, place);
			 }else {
				 JOptionPane.showMessageDialog(null, "ä³àïçîí â³ä 0 äî 11 Ñïğîáóéòå ùåğàç");
			 }
			}catch (Exception e) {
			 JOptionPane.showMessageDialog(null, "ä³àïçîí â³ä 0 äî 11 Ñïğîáóéòå ùåğàç");
			}
			}
		});
		btnNewButton.setBounds(24, 110, 134, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u0412\u0432\u0456\u0434 \u043A\u0456\u043B\u044C\u043A\u043E\u0441\u0442\u0456 \u0456\u0442\u0435\u0440\u0430\u0446\u0456\u0439");
		lblNewLabel.setBounds(24, 0, 256, 41);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u041F\u043E\u0437\u0438\u0446\u0456\u044F \u043F\u043E\u0447\u0430\u0442\u043A\u0443");
		label.setBounds(411, 0, 256, 41);
		contentPane.add(label);
		
	
		
		
	}
}
