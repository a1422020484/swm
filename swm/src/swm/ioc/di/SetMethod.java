package swm.ioc.di;

/**
 * @author Administrator
 *	通过set的方式进行依赖注入
 */
public class SetMethod {
	
	public String message;
	public String address;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void sayHello(){
		System.out.println("message :" + message +",address :"+address);
	}
}
