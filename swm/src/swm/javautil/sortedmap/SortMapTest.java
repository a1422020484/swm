package swm.javautil.sortedmap;

import org.junit.Test;

/**
 * @author yang
 *1、带排序的，该映射是根据其键的自然顺序进行排序的，或者根据通常在创建有序映射时提供的 Comparator 进行排序。
 *2、所有这些键都必须是可互相比较的
 */
public class SortMapTest {

	@Test
	public void sortTest(){
		String a = "1";
		String b = "5545";
		
		a.equals(b);
		System.out.println(a.compareTo(b));
	}
}
