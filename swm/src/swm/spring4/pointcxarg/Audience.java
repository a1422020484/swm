package swm.spring4.pointcxarg;

public class Audience {

//	public void silenceCellPhones(){
//		System.out.println("silence Cell Phones");
//	}
//	public void afterCellPhones(int intValue){
//		System.out.println("after Cell Phones");
//		System.out.println("afterCellPhones" + intValue);
//	}
	
	public void beforeHandler(String name,int age){
		System.out.println("name="+name+",age="+age);
	}
}
