package converter;

import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.*;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Toolkit;

public class Aboutpanel extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Currency_converter cn = new Currency_converter();

	/**
	 * Create the panel.
	 */
	public Aboutpanel() {
		setType(Type.POPUP);
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@SuppressWarnings("deprecation")
			@Override
			public void windowClosing(WindowEvent e) {
				cn.frmCurrencyConverter.show();
				cn.mainpage.show();
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		setResizable(false);

		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Code\\Java Programs\\Currency\\src\\Images\\icon.png"));
		setTitle("About");
		getContentPane().setBackground(Color.WHITE);
		cn.mainpage.setVisible(false);
		setBackground(Color.WHITE);
		setForeground(new Color(165, 42, 42));
		setBounds(100, 100, 445, 260);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Currency Converter ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 29));
		lblNewLabel.setBounds(-26, 2, 492, 67);
		getContentPane().add(lblNewLabel);

		JTextPane txtpnCurrencyConverterMade = new JTextPane();
		txtpnCurrencyConverterMade.setEditable(false);
		txtpnCurrencyConverterMade.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtpnCurrencyConverterMade.setText(
				"Currency Converter made using the java and using the Exchange rates API which is free to use. \r\r\nCurrenlty has 165+ Countries Currency.\r\n\r\nMade by Prathamesh Dhande ");
		txtpnCurrencyConverterMade.setBounds(10, 79, 453, 185);
		getContentPane().add(txtpnCurrencyConverterMade);
	}
}
