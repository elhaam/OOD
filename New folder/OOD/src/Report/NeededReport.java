package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;
import distributing.BusyResource;

public class NeededReport {
	private static NeededReport self = null;
	private Driver db;
	
	public static NeededReport getInstance() {
		if (self == null) {
			return new NeededReport();
		}
		return self;
	}
	
	private NeededReport() {
		db = Driver.getInstance();
	}

	public ArrayList<String[]> generateNeededReport() {
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
