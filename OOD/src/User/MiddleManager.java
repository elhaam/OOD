package User;

import ResourceManagment.Job;
import ResourceManagment.Subsystem;

public class MiddleManager extends User {

	private Object employeeid;
	public MiddleManager(String f, String l, int m, int e, String start, 
			Job job, Subsystem sub, String pw) {
		super(f, l, m, e, start, job, sub, pw);
		employeeid = e;
	}
	public void addMiddleManager(){
		db.insert("middle-manager",this.employeeid);	
		// TODO set foreign key
	}

}
