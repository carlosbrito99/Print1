package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cozinha {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cozinha window = new Cozinha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cozinha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USUARIO\\OneDrive\\\u00C1rea de Trabalho\\aps\\Imagem.PNG"));
		frame.getContentPane().setBackground(new Color(224, 196, 31));
		frame.getContentPane().setForeground(new Color(128, 128, 128));
		frame.setEnabled(false);
		frame.setBounds(100, 100, 617, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Pedidos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(28, 128, 84, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Visualizar Pedidos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 153, 137, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 193, 17));
		panel.setBounds(-54, 30, 655, 68);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Super System Food");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(0, 95, 601, 34);
		frame.getContentPane().add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(0, 426, 601, 45);
		frame.getContentPane().add(panel_2_1_1);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBounds(531, 0, 70, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(Color.BLACK);
		panel_2_1_2.setBounds(0, 0, 601, 34);
		frame.getContentPane().add(panel_2_1_2);
		
		table = new JTable();
		table.setBounds(10, 255, 137, -25);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(89, 314, 210, -58);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(255, 255, 255));
		table_2.setBounds(0, 223, 601, 156);
		frame.getContentPane().add(table_2);
	}
}
