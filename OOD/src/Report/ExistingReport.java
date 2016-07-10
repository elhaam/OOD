package Report;

import DB.DataSource;

public class ExistingReport {
	private static ExistingReport self = null;
	private DataSource db;
	
	public static ExistingReport getInstance() {
		if (self == null) {
			return new ExistingReport();
		}
		return self;
	}
	
	private ExistingReport() {
		db = DataSource.getInstance();
	}
	
	// TODO

}
