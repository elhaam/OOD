package Report;

import DB.DataSource;

public class CyclicReport {
	private static CyclicReport self = null;
	private DataSource db;
	
	public static CyclicReport getInstance() {
		if (self == null) {
			return new CyclicReport();
		}
		
		return self;
	}
	
	private CyclicReport() {
		db = DataSource.getInstance();
	}
	
	// TODO 
	
	
}
