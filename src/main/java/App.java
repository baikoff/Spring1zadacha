import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat bean1 = (Cat) applicationContext.getBean("cat");

        Cat bean2 = (Cat) applicationContext.getBean("cat");

        HelloWorld bean3 = (HelloWorld) applicationContext.getBean("helloworld");


        boolean srav = bean == bean3;
        boolean srav1 = bean2 == bean1;
        System.out.println(srav);
        System.out.println(srav1);
    }
}