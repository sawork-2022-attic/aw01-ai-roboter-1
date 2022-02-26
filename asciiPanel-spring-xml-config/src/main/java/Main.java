import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

            AsciiPanel panel = context.getBean("asciiPanel", AsciiPanel.class);
            System.out.println(panel.getAsciiFont().getFontFilename());
    }
}
