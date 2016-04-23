package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConstructorDemo();
		getFieldDemo();
		getMethodDemo();
		getMethodDemo2();
	}

	private static void getMethodDemo2() throws Exception {
		//静态方法的调用
		String className = "Reflect.Person";
		Class clazz = Class.forName(className);
		
		String methodName = "staticshow";
		Method method = clazz.getMethod(methodName, null);
		method.invoke(null, null);
	}

	private static void getMethodDemo() throws Exception{
		String className = "Reflect.Person";
		Class clazz = Class.forName(className);
		
		String methodName = "show";
		Method method=clazz.getMethod(methodName,String.class,int.class);
		method.invoke(clazz.newInstance(),"wangcai",20);
	}

	private static void getFieldDemo() throws Exception {
		// TODO Auto-generated method stub
		String className = "Reflect.Person";
		Class clazz = Class.forName(className);
		
		String fieldName = "age";
		//Field field=clazz.getField(fieldName);
		Field field = clazz.getDeclaredField(fieldName);
		
		System.out.println(field);
		
		Object obj = clazz.newInstance();
		field.setAccessible(true);//取消权限检查，暴力访问
		field.set(obj,30);//IllegalAccessException :age字段为私有
		
		System.out.println(field.get(obj));
	}

	private static void getConstructorDemo() throws Exception {
		String className = "Reflect.Person";
		Class clazz = Class.forName(className);
		
		Constructor con = clazz.getConstructor(String.class,int.class);
		Object obj = con.newInstance("lixi",21);
	}

}
