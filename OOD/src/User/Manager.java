package User;

import ResourceManagment.Job;
import ResourceManagment.Subsystem;

public class Manager extends Employee {

	public Manager(String fname, String lname, int melliNo, int employeeNo, String start, 
			Job job, Subsystem sub, String pw) {
		super(fname, lname, melliNo, employeeNo, start, job, sub, pw);
	}

}
