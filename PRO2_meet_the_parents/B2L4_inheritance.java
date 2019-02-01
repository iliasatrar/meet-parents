package 2;

public class main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Erwin");
		Teacher t1 = new Teacher();
		t1.setName("Henk Obama");
		Parent p1 = new Parent();
		p1.setName("Famke Louise");
		Mentor h1 = new Mentor();
		h1.setName("Miloš Despotović");
		
		System.out.println(s1.getName());
		System.out.println(t1.getName());
		System.out.println(p1.getName());
		System.out.println(h1.getName());
	}
}
