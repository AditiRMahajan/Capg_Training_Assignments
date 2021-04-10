import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

public class MyApplication {
 
    public static void main(String a[]){
 
        @SuppressWarnings("resource")
        ApplicationContext context =  new AnnotationConfigApplicationContext(MyApplicationConfig.class);
        MydbConfig dbConfig = (MydbConfig) context.getBean("dbConfig");
        System.out.println(dbConfig.toString());
    }
}