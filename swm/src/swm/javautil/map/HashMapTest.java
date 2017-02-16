package swm.javautil.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author yang
 *1、无序，另一些映射实现则不保证顺序，如 HashMap 类。
 *2、key只有一个和以为null，不能重复
 *3、线程不安全的，此实现不是同步的，是快速失败的，除非通过 Iterator 自身的 remove 方法，
 *4、默认加载因子 (.75)，超过了则会rehash 操作，增加到原来从而哈希表将具有大约  两倍  的桶数。
 *
 */
public class HashMapTest {

	@Test
	public void hashMap(){
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("1", "3");
		hm.put("3", "3");
		hm.put("2", "3");
		hm.put("22", "3");
		hm.put("11", "3");
		hm.put("4", "3");
		for(String strkey : hm.keySet()){
			System.out.println(strkey +":"+hm.get(strkey));
		}
	}
}
