import asciiPanel.AsciiPanel;
import config.AsciiPanelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);

        AsciiPanel panel = context.getBean(AsciiPanel.class);

        System.out.println(panel.getAsciiFont().getFontFilename());
    }
}
