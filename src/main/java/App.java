import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld1 == beanHelloWorld2);
        Cat beanCat1 = applicationContext.getBean("getCat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("getCat", Cat.class);
        System.out.println(beanCat1 == beanCat2);
    }
}