package converter;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Currency_converter {

	public JFrame frmCurrencyConverter;
	public JPanel mainpage;

	public Currency_converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {

		frmCurrencyConverter = new JFrame();
		frmCurrencyConverter.getContentPane().setBackground(Color.ORANGE);
		frmCurrencyConverter.getContentPane().setLayout(null);
		frmCurrencyConverter.setBounds(100, 100, 735, 464);
		frmCurrencyConverter.setResizable(false);
		mainpage = new JPanel();
		mainpage.setBackground(Color.WHITE);
		mainpage.setBounds(0, 0, 721, 427);
		frmCurrencyConverter.getContentPane().add(mainpage);
		mainpage.setLayout(null);
		mainpage.setVisible(true);

		JPanel imagepanel = new JPanel();
		imagepanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		imagepanel.setBounds(0, 0, 488, 427);
		mainpage.add(imagepanel);
		imagepanel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel mainpageimage = new JLabel();
		ImageIcon mainpageicon = new ImageIcon("D:\\Code\\Java Programs\\Currency\\src\\Images\\main.jpg");
		Image mainicon = mainpageicon.getImage().getScaledInstance(488, 427, 0);
		ImageIcon mpicon = new ImageIcon(mainicon);
		mainpageimage.setIcon(mpicon);
		imagepanel.add(mainpageimage);

		JPanel buttonpanel = new JPanel();
		buttonpanel.setBackground(Color.WHITE);
		buttonpanel.setBounds(498, 29, 199, 359);
		mainpage.add(buttonpanel);
		buttonpanel.setLayout(new GridLayout(3, 3, 90, 90));

		JButton open = new JButton("Open");
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conveter_frame cn = new conveter_frame();
				cn.setVisible(true);
				frmCurrencyConverter.dispose();
			}
		});
		open.setToolTipText("Opens a convertor");
		open.setBackground(new Color(222, 184, 135));
		open.setFont(new Font("Times New Roman", Font.BOLD, 25));
		buttonpanel.add(open);

		JButton about = new JButton("About");
		about.setToolTipText("Opens about window");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aboutpanel ab = new Aboutpanel();
				ab.setVisible(true);
				frmCurrencyConverter.dispose();

			}
		});
		about.setBackground(new Color(222, 184, 135));
		about.setFont(new Font("Times New Roman", Font.BOLD, 25));
		buttonpanel.add(about);

		JButton exit = new JButton("Exit");
		exit.setToolTipText("Exits the window");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBackground(new Color(222, 184, 135));
		exit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		buttonpanel.add(exit);
		frmCurrencyConverter.setTitle("Currency Converter");
		frmCurrencyConverter.setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\Code\\Java Programs\\Currency\\src\\Images\\icon.png"));

		frmCurrencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
