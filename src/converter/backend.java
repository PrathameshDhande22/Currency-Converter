package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class backend {
	String from, to;
	double currency;
	private double rate;

	private double result = 0;

	protected backend(String from, String to, double currency) {
		this.from = from;
		this.to = to;
		this.currency = currency;
	}

	public boolean checkstring() {
		if (from.equals(to)) {
			return false;
		} else {
			
			convert();
			return true;
		}
	}

	private void convert() {

		String ubody = new String("https://api.exchangerate.host/convert?");
		StringBuilder url = new StringBuilder();
		url.append(ubody);
		url.append("from=" + from + "&to=" + to + "&amount=" + currency);
		String newurl = url.toString();
		URL u;
		try {
			u = new URL(newurl);
			HttpURLConnection http = (HttpURLConnection) u.openConnection();
			http.setRequestMethod("GET");
			http.connect();
			BufferedReader bf = new BufferedReader(new InputStreamReader(http.getInputStream()));
			String response = bf.readLine();
			JSONObject object = new JSONObject(response);
			result = object.getDouble("result");
			JSONObject obj = new JSONObject(object.get("info").toString());
			rate = obj.getDouble("rate");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (JSONException js) {
			js.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public double getRate() {
		return rate;
	}

	public double getConvertedCurrency() {
		return result;
	}

}
