package MyPack;

import java.util.Iterator;
import java.util.List;

public class Jobs {

	private int srNo;
	private String jobName;
	private List<JobTypes> jobTypes;
	
	public Jobs() {
		super();
	}

	public Jobs(int srNo) {
		super();
		this.srNo = srNo;
	}

	public Jobs(String jobName) {
		super();
		this.jobName = jobName;
	}

	public Jobs(List<JobTypes> jobTypes) {
		super();
		this.jobTypes = jobTypes;
	}

	public Jobs(int srNo, String jobName) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
	}

	public Jobs(String jobName, List<JobTypes> jobTypes) {
		super();
		this.jobName = jobName;
		this.jobTypes = jobTypes;
	}

	public Jobs(int srNo, String jobName, List<JobTypes> jobTypes) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
		this.jobTypes = jobTypes;
	}
	
	public void JobsInfo(){
		
		System.out.println(srNo+" "+jobName);
		System.out.println("Available Jobs....");
		
		Iterator<JobTypes> itr = jobTypes.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
			
	}
}
