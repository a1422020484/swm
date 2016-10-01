package swm.aopSleep.mindreader;



/**
 * @author Administrator
 *	读心者接口 完成两个方法  
 *	1、获得想法
 *	2、说出想法
 */
public interface MindReader {
	void interceotThoughts(String thought);
	String getThought();
}
