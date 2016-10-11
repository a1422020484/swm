package swm.javautil.set;

import java.util.HashSet;

import org.junit.Test;

/**
 * @author yang
 *1、一个不包含重复元素的 collection。更确切地讲，set 不包含满足 e1.equals(e2) 的元素对 e1 和 e2，并且最多包含一个 null 元素。
 *2、无序
 *3、注意，此实现不是同步的，快速失败的
 */
public class HashSetTest {
	@Test
	public void hashSetTest(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.toArray();
	}
	 
}
