package teste.model;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int id;
	public static List<Student> studentList;
	
	static {
		studentRepository();
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
	}

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	private static void studentRepository() {
		studentList = new ArrayList<>(asList(new Student (1, "Deku"), new Student (2, "Todoroki")));
	}
	
	public Student(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
