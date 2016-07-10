package Report;

import DB.DataSource;

public class NeededReport {
	private static NeededReport self = null;
	private DataSource db;
	
	public static NeededReport getInstance() {
		if (self == null) {
			return new NeededReport();
		}
		return self;
	}
	
	private NeededReport() {
		db = DataSource.getInstance();
	}

	// TODO
}
