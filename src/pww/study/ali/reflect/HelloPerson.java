package pww.study.ali.reflect;

import java.lang.reflect.Constructor;

// 使用Class实例化其他对象时,一定要定义一个无参数的构造函数;
public class HelloPerson {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("pww.study.ali.reflect.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person person = null;
		Person per1 = null;
		Person per2 = null;
		Person per3 = null;
		Person per4 = null;
		// 取得全部的构造函数;
		Constructor<?> cons[] = demo.getConstructors();
		try {
			person = (Person) demo.newInstance();
			per1 = (Person) cons[0].newInstance();
			per2 = (Person) cons[1].newInstance("pww");
			per3 = (Person) cons[2].newInstance(18);
			per4 = (Person) cons[3].newInstance("pww",18);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		person.setName("pww");
		person.setAge(18);
		System.out.println(person);
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}
}
