package pww.study.ali.reflect;

public class hello {
	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			demo1 = Class.forName("pww.study.ali.reflect.Demo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;
		
		System.out.println("类名称:" + demo1.getName());
		System.out.println("类名称:" + demo2.getName());
		System.out.println("类名称:" + demo2.getName());
	}
}
