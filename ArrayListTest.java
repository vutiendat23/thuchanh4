package LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListTest {
	static Scanner sc = new Scanner(System.in);
	static int n;
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student> ();
		students = inputStudent();
		outputStudent(students);
		// sap xep cac ban hoc sinh theo ten
		System.out.println("Sort by Name: ");
		sortByName(students);
		// Sap xep cac ban hoc sinh theo gioi tinh
		System.out.println("Sort by Gender:");
		sortByGender(students);
		// loc ra nhung doi tuong co gioi tinh la inputGender
		System.out.println("Nhap gender: ");
		String gender = sc.nextLine();
		outputStudent(filterByGender(students, gender));
		// loc ra nhung ban co id nhap tu ban phim
		System.out.println("Nhap Class:");
		String lop = sc.nextLine();
		filterById(students, lop);
	}

	public static ArrayList<Student> inputStudent() {
		String name, id, gender, address, birth;
		System.out.println("Nhap so luong sinh vien:");
		n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> students = new ArrayList<Student> ();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap du lieu: ");
			System.out.println("ID:");
			id = sc.nextLine();
			System.out.println("Name:");
			name = sc.nextLine();
			System.out.println("Birth:");
			birth = sc.nextLine();
			System.out.println("Address:");
			address = sc.nextLine();
			System.out.println("Gender: ");
			gender = sc.nextLine();
			Student student = new Student(id, name, birth, address, gender);
			students.add(student);
		}
		return students;
	}
	
	public static void outputStudent(ArrayList<Student> students) {
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
	// sapws xep thu tu cac ban hoc sinh theo ten
	public static void sortByName(ArrayList<Student> students) {
		students.sort(Comparator.comparing(Student::getName));
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
	
	// sap xep thu tu cac ban hoc sinh theo gioi tinh 
	public static void sortByGender(ArrayList<Student> students) {
		students.sort(Comparator.comparing(Student::getGender));
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
	// Loc ra nhung sinh vien co gioi tinh la inputGender() 
	public static ArrayList<Student> filterByGender(ArrayList<Student> students,String inputGender) {
		ArrayList<Student> result = new ArrayList<Student> ();
		for(Student student : students) {
			if(student.getGender().equals(inputGender)) {
				result.add(student);
			}
		}
		return result;
	}
	// loc ra nhuwngx sinh vien thuoc khoa class ( 2 ki tu dau tien cua id cho bien khoa may )
	public static void filterById(ArrayList<Student> students, String id) {
		ArrayList<Student> fillter = new ArrayList<Student> ();
		for(Student student : students) {
			String studentId = student.getId().substring(0,2);
			if(studentId.equals(id)) {
				fillter.add(student);
			}
		}
		for(Student student : fillter) {
			System.out.println(student.toString());
		}
	}
	
	
}
