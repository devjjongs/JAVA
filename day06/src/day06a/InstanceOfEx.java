package day06a;
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Person)
			System.out.print("Student ");
		if(p instanceof Person)
			System.out.print("Resercher ");
		if(p instanceof Person)
			System.out.print("Professor ");
	System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t");	print(new Student());
		System.out.print("new Researcher() ->\t");	print(new Researcher());
		System.out.print("new Professor() ->\t");	print(new Professor());
	}
}
