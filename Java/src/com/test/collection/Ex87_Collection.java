package com.test.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex87_Collection {

	public static void main(String[] args) {
		
		//Ex87_Collection.java
		//m1();
		m2();
		
	}

	private static void m2() {
		
		//직원들..
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("홍과장", 35, 350, 150, Position.과장, 2010, 2, 10));
		list.add(new Employee("남궁부장", 40, 400, 200, Position.부장, 2005, 5, 10));
		list.add(new Employee("차대리", 30, 300, 100, Position.대리, 2012, 7, 5));
		list.add(new Employee("김대리", 30, 300, 100, Position.대리, 2012, 7, 5));
		list.add(new Employee("박대리", 30, 300, 100, Position.대리, 2012, 7, 5));
		list.add(new Employee("정원", 25, 250, 50, Position.사원, 2016, 1, 20));
		
		System.out.println(list);
		
		//정렬(이름)
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				//return o1.getName().compareTo(o2.getName());
				//return o2.getName().compareTo(o1.getName());
				return o1.getName().length() - o2.getName().length();
			}
			
		});
		
		System.out.println(list);
		
		//정렬(나이)
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		System.out.println(list);
		
		//정렬(급여)
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus());
			}
			
		});
		
		System.out.println(list);
		
		
		//System.out.println(list.get(0).getPosition().ordinal());
		//System.out.println(list.get(1).getPosition().ordinal());
		
		//정렬(직급)
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				//return o1.getPosition().ordinal() - o2.getPosition().ordinal();
				
				int result = o1.getPosition().ordinal() - o2.getPosition().ordinal();
				
				if (result != 0) { //두사람의 직급이 다른 경우 > 직급으로 정렬
					return result;
				} else { //두사람의 직급이 동일한 경우 > 이름순으로 정렬
					return o1.getName().compareTo(o2.getName());
				}
			}
			
		});
		
		System.out.println(list);
		
		
		//정렬(입사일)
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
			
				//날짜비교
				//1. tick 값 비교
				//2. compareTo() 사용
				return o2.getDate().compareTo(o1.getDate());
			}
		
		});
		
		System.out.println(list);
		
		
		
	}

	private static void m1() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);		nums.add(50);		nums.add(30);		nums.add(40);		nums.add(20);
		
		System.out.println("원본 : " + nums);
		Comparator<Integer> c = new MyComparator();
		nums.sort(c);
		System.out.println("결과 : " + nums);
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");	list.add("아무개");	list.add("하하하");	list.add("호호호");
		
		System.out.println("원본 : " + list);
		MyComparator2 c2 = new MyComparator2();
		list.sort(c2);
		System.out.println("결과 : " + list);
		
		
		
		ArrayList<Double> nums2 = new ArrayList<Double>();
		nums2.add(3.5);	nums2.add(2.1);	nums2.add(7.3);	nums2.add(2.9);	nums2.add(4.7);
		
		System.out.println("원본 : " + nums2);
		nums2.sort(new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				
				return (int)(o1 - o2);
			}
			
		});
		System.out.println("결과 : " + nums2);
		
		
	}
	
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1 - o2; //정렬 기준
	}
	
}


class MyComparator2 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2); //정렬 기준
	}
	
}


//직원
class Employee {
	
	private String 		name;					//이름
	private int 				age;						//나이
	private int				salary;					//급여
	private int 				bonus;					//상여금
	private Position		position;				//직급
	private Calendar	date;					//입사일
	
	public Employee(String name, int age, int salary, int bonus, Position position, int year, int month, int date) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.bonus = bonus;
		this.position = position;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, date, 0, 0, 0);
		this.date = c; //입사일	
		
	}
	
	@Override
	public String toString() {
		
		String temp = "";
		//temp = this.age + "";
		//temp = this.salary + this.bonus + "";
		temp = this.position + "";
		//temp = String.format("%tF", this.date);
		
		return String.format("%s(%s)", this.name, temp);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
	
	
	
	
}

enum Position {
	부장, //0
	과장, //1
	대리, //2
	사원 //3
}















