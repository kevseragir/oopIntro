package homework1;


public class Main {
	
	public static void main(String[] args) {

	Course course1 = new Course(1,"Java-React","12-12-2023");
	
	Course course2 = new Course(2,"C#","12-12-2021");
	
	Course course3 = new Course(3,"Python","12-1-2020");
	
	Course[] course = {course1,course2,course3};
	
	Student student1 = new Student(1,"Ayse ","Bulut","aysebulut@gmail.com");
	Student student2 = new Student(2,"Fatma ","Kaya","fatma@gmail.com");
	Student student3 = new Student(3,"Hayriye ","Toprak","heyou@gmail.com");
	Student[] student= {student1,student2,student3};
	
	for (Student students:student) {
		System.out.println("sistem kaydi alindi: "+students.firstName+students.lastName);
	
		StudentManager studentmanager= new StudentManager();
		studentmanager.addToList(student1);
		studentmanager.addToList(student2);
		studentmanager.addToList(student3);
		 System.out.println(student.length);
	
		 CourseManger coursemanager= new CourseManger();
			coursemanager.addToList(course1);
			coursemanager.addToList(course2);
			coursemanager.addToList(course3);
			 System.out.println(course.length);
		
	
	}

}
}
