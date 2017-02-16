package swm.innerclass;

public class CaculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaculateArea ca = new CaculateArea();
		CaculateArea.Circle b = ca.new Circle(123.33);
	}
	
	public abstract class Shape{
		public String getName(){
			return this.getClass().getSimpleName();
		}
	}
	
	public class Circle extends Shape{
		private double radius;
		public Circle(double radius){
			System.out.println(radius);
		}
	}
}
