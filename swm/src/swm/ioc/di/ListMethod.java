package swm.ioc.di;

import java.util.List;

/**
 * @author Administrator
 * 注入一个list
 */
public class ListMethod {
	private List<String> values;
	
	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public void sayHello(){
		/*for(int i=0 ;i<values.size();i++){
			System.out.println(values);
		}*/
		
		for(String si : values){
			System.out.println(si);
		}
	}
}
