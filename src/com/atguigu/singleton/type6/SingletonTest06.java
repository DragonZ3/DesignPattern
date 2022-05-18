package com.atguigu.singleton.type6;


import static sun.awt.image.PixelConverter.Argb.instance;

public class SingletonTest06 {

	public static void main(String[] args) {

//		SingletonTest06.test1();
//		SingletonTest06.test2();
	}
	public static void test1(){
		System.out.println("双重检查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

//	public static void test2(){
//		System.out.println("双重检查");
//		SingL singL = SingL.getSingL();
//		SingL singL1 = SingL.getSingL();
//		System.out.println(singL == singL1); // true
//		System.out.println("singL.hashCode=" + singL1.hashCode());
//		System.out.println("singL.hashCode=" + singL1.hashCode());
//
//	}

}


// 懒汉式(线程安全，同步方法)
class Singleton {
//	volatile是Java提供的一种轻量级的同步机制
	private static volatile Singleton instance;
	
	private Singleton() {}
	
	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
	//同时保证了效率, 推荐使用
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
}

