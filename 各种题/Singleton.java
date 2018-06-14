package S;

import java.util.Scanner;

public class SingletonDemo {
	// 饿汉模式
	// 在调用get方法的时候才new

//	private SingletonDemo() {
// 
//	}
//
//	
//	private static SingletonDemo singleton=new SingletonDemo();
//	
//	public static SingletonDemo getInstance(){
//		
//		
//		return singleton;
//	}
//	
	
	
	//懒汉模式在类加载的就实例化 get()直接返回
	
	//双重检查
	
	//大部分查询进不了 同步块提高了效率 第一个判断
	
//	假如两个线程A、B，A执行了if (instance == null)语句，
	//它会认为单例对象没有创建，此时线程切到B也执行了同样的语
	//句，B也认为单例对象没有创建，然后两个线程依次执行同步代码块，并分别创建了一个单例对象。为了解决这个问题，还需要在同步代码块中增加if (instance == null)语句，也就是上面看到的代码2。
	
	
	//此时若有两个线程 a判断=null b此时也进行了判断 判断为空
	//这时就会有两个线程分别创建单列对象
	
	
	//考虑到JVM指令重排序的问题  加上volatile  禁止重排   private static volatile Singleton instance = null;  
	private static SingletonDemo singleton=null;
	
	
	public static SingletonDemo get(){
		if (singleton==null){
			synchronized (SingletonDemo.class) {
				if(singleton==null){
					singleton=new SingletonDemo();
				}
			}
			
		}
		return singleton;
	}
	
	
	
	
	//静态内部类的方法  
	//反射创建这个对象只能是这个类被加载过了
	//它是在内部类里面去创建对象实例
	//只要应用不使用这个内部类 就不会被加载 
	//实现了延时加载  类加载器实现了线程安全
  
  
	private static class Singlton{
		public static SingletonDemo singglenton1=new SingletonDemo();
	}
	
	public static SingletonDemo  getS(){
		return Singlton.singglenton1;
	}	
	
}
