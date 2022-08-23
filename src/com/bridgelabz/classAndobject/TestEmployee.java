package com.bridgelabz.classAndobject;
class Employee{
    int id;
    String name;
    float salary;
    void insert(int id, String name, float salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(101,"ajeet",45000);
        e2.insert(102,"irfan",25000);
        e3.insert(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
		// TODO Auto-generated method stub

	}

}
