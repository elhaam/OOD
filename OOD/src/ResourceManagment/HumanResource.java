package ResourceManagment;


public class HumanResource extends Resource{
	private String firstName;
	private String lastName;
	private int melliNo;
	private int employeeNo;
	private String StartDate;
	Job job;
	Subsystem subsystem;
	
	public HumanResource(String f,String l,int m, int e, String s,Job j,Subsystem sub) {
		super(ResourceType.HUMAN);
		this.firstName=f;
		this.lastName=l;
		this.melliNo=m;
		this.employeeNo=e;
		this.StartDate=s;
		this.job=j;
		this.subsystem=sub;
		
	}

}
