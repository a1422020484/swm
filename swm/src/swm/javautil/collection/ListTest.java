package swm.javautil.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * @author yang
 * list允许多个空值 与set不一样
 */
public class ListTest {
	public static void main(String[] args) {
//		ListTest.listArrayExc();
	}
	@Test
	public void listArrayExc(){
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("4");
		l.add("3");
		l.add(null);
		l.add(null);
		for(String e : l){
			//Exception in thread "main" java.util.ConcurrentModificationException  读取list的时候是不能对list进行修改的 否则会抛异常
			//l.remove(2);
			System.out.println(e);
		}
	}
	@Test
	public  void listLinkedList(){
		List<String> l = new LinkedList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add(null);
		
		for(String e : l){
			//Exception in thread "main" java.util.ConcurrentModificationException  读取list的时候是不能对list进行修改的 否则会抛异常
			//l.remove(2);
			System.out.println(e);
		}
	}
	@Test
	public  void iteratorList(){
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("32");
		l.add("31");
		l.add("35");
		l.add(null);
		l.add(null);
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()){
			//Exception in thread "main" java.util.ConcurrentModificationException  读取list的时候是不能对list进行修改的 否则会抛异常
			//l.remove(2);
			System.out.println(it.next());
		}
	}
	@Test
	public  void listIteratorList(){
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("32");
		l.add("31");
		l.add("351");
		l.add("3");
		l.add(null);
		l.add(null);
		//listIterator(int index)超出的时候抛出异常java.lang.IndexOutOfBoundsException: Index: 7
		Iterator<String> it = l.listIterator();
		while(it.hasNext()){
			//Exception in thread "main" java.util.ConcurrentModificationException  读取list的时候是不能对list进行修改的 否则会抛异常
			//l.remove(2);
			System.out.println(it.next());
		}
		l.clear();;
		System.out.println(l.size());
	}
}
