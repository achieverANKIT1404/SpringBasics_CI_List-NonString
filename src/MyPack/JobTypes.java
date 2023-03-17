package MyPack;

public class JobTypes {

	private int id;
	private String name;
	private String postBy;
	
	public JobTypes() {
		super();
	}

	public JobTypes(int id, String name, String postBy) {
		super();
		this.id = id;
		this.name = name;
		this.postBy = postBy;
	}

	@Override
	public String toString() {
		return "JobTypes [id=" + id + ", name=" + name + ", postBy=" + postBy + "]";
	}
	
}
