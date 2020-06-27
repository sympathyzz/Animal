package demo;

public class animal {
	int age;
	int weight;
	public void running(){
		System.out.println("running");
	}
	public void eating(){
		System.out.println("eating");
	}
	public animal(int age, int weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
