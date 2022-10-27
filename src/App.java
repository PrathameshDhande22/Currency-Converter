import java.awt.EventQueue;

import converter.Currency_converter;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currency_converter window = new Currency_converter();
					window.frmCurrencyConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
