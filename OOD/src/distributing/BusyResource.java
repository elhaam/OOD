package distributing;

import java.awt.List;

import ResourceManagment.Job;
import ResourceManagment.Resource;
import ResourceManagment.ResourceType;
import ResourceManagment.Subsystem;

public class  BusyResource {
	
	private String AssignDate;
	private String Resource;
	private String Section;
	private String Project;
	
	
	public BusyResource (String AD) {
		
	
		this.AssignDate=AD;
		
	}
	
	public void assignResource( Resource res, Requirement req){
		
		
	};
	public void registerBusyResource(){};
	public void ReleasingResource(){};
	public void information(){};

}
