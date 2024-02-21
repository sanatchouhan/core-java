package in.co.rays.Comparable;

public class MarkSheet implements Comparable<MarkSheet>{

	public int id;
	public String name;
	public int marks;
	
	
	public MarkSheet(int id, String name, int marks) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	
	public String toString() {
		
		return id+" "+name+" "+marks;
	}

	@Override
	public int compareTo(MarkSheet m1) {
		
		//return this.id-m1.id;
		//return this.marks-m1.marks;
		return this.name.compareTo(m1.name);
	}
	
}
