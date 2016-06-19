package distributing;

import ResourceManagment.InformationType;
import ResourceManagment.Resource;
import ResourceManagment.ResourceType;

public class Requirement {

	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;
	private String assignDate;
	
	public Requirement(String n,String s,String cd ,String ad) {

		this.requirementName=n;
		this.section=s;
		this.createDate=cd;
		this.assignDate = ad;
		
	}
	public void CreateRequirement(){};
	public void EditRequirement(){};
	
	
}
