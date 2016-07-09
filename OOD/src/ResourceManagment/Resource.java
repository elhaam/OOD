package ResourceManagment;

import DB.DataSource;

public class Resource {
	

	ResourceType type;
	public DataSource db;

	public Resource(ResourceType type) {
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	public void addResource(Resource resource){
		this.db=DataSource.getInstance();
	}
}
