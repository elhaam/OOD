package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;
import distributing.BusyResource;

public class ExistingReport {
	private static ExistingReport self = null;
	private Driver db;
	
	public static ExistingReport getInstance() {
		if (self == null) {
			return new ExistingReport();
		}
		return self;
	}
	
	private ExistingReport() {
		db = Driver.getInstance();
	}
	
	public ArrayList<String[]> generateExistingReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO check the name of below list class
		ArrayList<BusyResource> list2 = (ArrayList<BusyResource>) db.getAllRows("BusyResource");
		
		for (BusyResource k : list2) {
			System.out.println("id  : "+k.getID());
			
			String[] str = new String[3];
			str[0] = k.getProjectName();
			str[1] = k.getStartDate();
			str[2] = k.getSection();
			// TODO endate == null and groupby type
			result.add(str);
		}
	return result;	
	}

}
