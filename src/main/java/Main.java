import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        System.out.println("Config file loaded.");
        Actor actor = (Actor) factory.getBean("actor");
        Movie movie1 = (Movie) factory.getBean("movie1");
        System.out.println(movie1.getActor().getName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        Movie movie2 = (Movie)context.getBean("movie2");
        System.out.println(movie2.getActor().getName());
    }
}
