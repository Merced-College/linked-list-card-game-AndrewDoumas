package cardGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.border.BevelBorder;

public class CardGameGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardGameGUI frame = new CardGameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardGameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton c2 = new JButton("");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c2.setIcon(new ImageIcon("D:\\GitDirectory\\linked-list-card-game-AndrewDoumas\\linked-list-card-game-katkanemoto\\pics\\AH.png"));
		
		c2.setBounds(39, 292, 148, 217);
		contentPane.add(c2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(128, 515, 101, 22);
		contentPane.add(menuBar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(239, 515, 101, 22);
		contentPane.add(menuBar_1);
		
		JButton c2_1 = new JButton("");
		c2_1.setIcon(new ImageIcon("D:\\GitDirectory\\linked-list-card-game-AndrewDoumas\\linked-list-card-game-katkanemoto\\pics\\KH.png"));
		c2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c2_1.setBounds(205, 292, 148, 217);
		contentPane.add(c2_1);
		
		JButton c2_2 = new JButton("");
		c2_2.setIcon(new ImageIcon("D:\\GitDirectory\\linked-list-card-game-AndrewDoumas\\linked-list-card-game-katkanemoto\\pics\\QH.png"));
		c2_2.setBounds(363, 292, 148, 217);
		contentPane.add(c2_2);
		
		JButton c2_3 = new JButton("");
		c2_3.setIcon(new ImageIcon("D:\\GitDirectory\\linked-list-card-game-AndrewDoumas\\linked-list-card-game-katkanemoto\\pics\\JH.png"));
		c2_3.setBounds(521, 292, 148, 217);
		contentPane.add(c2_3);
		
		JButton c2_4 = new JButton("");
		c2_4.setIcon(new ImageIcon("D:\\GitDirectory\\linked-list-card-game-AndrewDoumas\\linked-list-card-game-katkanemoto\\pics\\10H.png"));
		c2_4.setBounds(679, 292, 148, 217);
		contentPane.add(c2_4);
	}
}
