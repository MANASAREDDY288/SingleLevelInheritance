package singlelevelinheritance;

public class Son extends Father{
	int age=25;
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println("name:"+s.name);
		System.out.println("age:"+s.age);
	}

}
