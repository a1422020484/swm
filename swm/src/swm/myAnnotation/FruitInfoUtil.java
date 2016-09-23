package swm.myAnnotation;

import java.lang.reflect.Field;

public class FruitInfoUtil {
public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer=" 供应商信息：";
        String strFruitOwner = " 苹果的拥有者 ： ";
		//getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，
		//但是不包括父类的申明字段。 
		
		//同样类似的还有getConstructors()和getDeclaredConstructors()，
		//getMethods()和getDeclaredMethods()。
        Field[] fields = clazz.getDeclaredFields();
        //通过类名获得getFields()获得某个类的所有的公共（public）的字段，包括父类。因为变量都是private 所以field
        Field[] fields2 = clazz.getFields();
        for(Field field :fields2){
        	System.out.println(field);
        }
        for(Field field :fields){
        	//isAnnotationPresent如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
            if(field.isAnnotationPresent(FruitName.class)){
            	//getAnnotation获得该属性上指定的注解，如果没有则返回null
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
            else if(field.isAnnotationPresent(FruitOwner.class)){
            	FruitOwner fruitOwner = (FruitOwner) field.getAnnotation(FruitOwner.class);
            	strFruitOwner += fruitOwner.ownerName();
            	System.out.println(strFruitOwner);
            }
        }
    }
}
