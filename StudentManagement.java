package LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
	static int n;
	static Student[] student = new Student[n];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		student = inputStudent();
		outputStudent(student);
		// sap xep cac ban hoc sinh theo ten
		System.out.println("Sort by Name: ");
		sortByName(student);
		// Sap xep cac ban hoc sinh theo gioi tinh
		System.out.println("Sort by Gender:");
		sortByGender(student);
		// loc ra nhung doi tuong co gioi tinh la inputGender
		System.out.println("Nhap gender: ");
		String gender = sc.nextLine();
		outputStudent(filterByGender(student, gender));
		// loc ra nhung ban co id nhap tu ban phim
		System.out.println("Nhap Class:");
		String lop = sc.nextLine();
		filterById(student, lop);
	}
	
	public static Student[] inputStudent() {
		String name, id, gender, address, birth;
		System.out.println("Nhap so luong sinh vien:");
		n = Integer.parseInt(sc.nextLine());
		Student[] students = new Student[n];
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
			students[i] = new Student(id, name, birth, address, gender);
		}
		return students;
	}
	
	public static void outputStudent(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}
	// sapws xep thu tu cac ban hoc sinh theo ten
	public static void sortByName(Student[] students) {
		Arrays.sort(students, Comparator.comparing(Student::getName));
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
	
	// sap xep thu tu cac ban hoc sinh theo gioi tinh 
	public static void sortByGender(Student[] students) {
		Arrays.sort(students, Comparator.comparing(Student::getGender));
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
	// Loc ra nhung sinh vien co gioi tinh la inputGender() 
	public static Student[] filterByGender(Student[] students,String inputGender) {
		int count = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getGender().equals(inputGender)) {
				count++;
			}
		}
		int m = 0;
		Student[] studentGender = new Student[count];
		for(int i = 0; i < students.length; i++) {
			if(students[i].getGender().equals(inputGender)) {
				studentGender[m] = students[i];
				m++;
			}
		}
		return studentGender;
	}
	// loc ra nhuwngx sinh vien thuoc khoa class ( 2 ki tu dau tien cua id cho bien khoa may )
	public static void filterById(Student[] students, String id) {
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
// Hay vien chuong trinh tren bang arraylist
}
