import com.demo.component.ArticleController;
import com.demo.component.UserComponent;
import com.demo.controller.StudentController;
import com.demo.module.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        //1.先得到bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        //2.取出bean对象
        User user = (User) context.getBean("user");

        User user1 = context.getBean(User.class); //根据Bean类型获取Bean

        User user2 = context.getBean("user", User.class);//根据Bean名称和类型获取Bean
        //3.使用bean
        System.out.println(user.sayHi());

        ArticleController articleController = context.getBean("articleController", ArticleController.class);
        System.out.println(articleController.sayHello());


        UserComponent component = context.getBean("userComponent", UserComponent.class);
        System.out.println(component.sayHi());

        Student student = context.getBean("s3", Student.class);
        System.out.println(student);

        StudentController studentController = context.getBean("studentController", StudentController.class);
        studentController.sayHi();
    }
}
