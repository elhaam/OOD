package DB;

import java.text.SimpleDateFormat;

public class DataSource {
	private static DataSource instance;
	private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	private Driver db;

	private DataSource() {
		db = Driver.getInstance();
	}

	public void close() {
		db.close();
	}

	public static DataSource getInstance() {
		if (instance == null)
			instance = new DataSource();
		return instance;
	}

}
