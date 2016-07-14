package ResourceManagment;

public class FinancialResource extends Resource{
	private String bank;
	private int accountNo;
	private String accountOwner;
	FinancialType type;
	private int area;
	private int cost;
	private String owner;
	private String address;
	public int i=0;
	public int j=0;
	
	public FinancialResource(String b,String a,int n) {
		super(ResourceType.FINANCIAL);
		// TODO Auto-generated constructor stu.
		this.type=FinancialType.BUDGET;
		this.bank=b;
		this.accountNo=n;
		this.accountOwner=a;
	}
	public FinancialResource(int a,int c,String o,String ad) {
		super(ResourceType.FINANCIAL);
		// TODO Auto-generated constructor stub
		this.type=FinancialType.MELK;
		this.area=a;
		this.cost=c;
		this.owner=o;
		this.address=ad;
	}
	public void addResource(){
		j++;
		if(type == FinancialType.BUDGET){
		    System.out.println("budget");
			db.insert("financial-resource-budget", this.accountNo,this.bank,this.accountOwner);
		//	db.insert("financial-resource",j,null,this.accountNo);
		}
		else{
			i++;
			System.out.println("melk");
			//db.insert("financial-resource-melk", this.owner,this.cost,this.area,this.address,i);
			db.insert("financial-resource",j,i,null);
		}
			
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public FinancialType getType() {
		return type;
	}
	public void setType(FinancialType type) {
		this.type = type;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
