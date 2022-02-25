import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

            ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");

//            AsciiFont panel = context.getBean(AsciiFont.class);
            AsciiPanel panel = context.getBean(AsciiPanel.class);
            System.out.println(panel.getAsciiFont().getFontFilename());

    }
}
