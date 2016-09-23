package swm.myAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果拥有者注解
 * @author Mr YANG
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitOwner {
	//可以不理解为方法名，注入参数的特殊写法
	//如果定义为value时候  给参数注入值得时候不用谢参数名
	String ownerName() default "";
}
