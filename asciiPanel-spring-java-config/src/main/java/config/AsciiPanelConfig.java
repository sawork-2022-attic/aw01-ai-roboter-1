package config;


import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfig {
    @Bean
    public AsciiFont cp437_9x16(){
        return AsciiFont.CP437_9x16;
    }

    @Bean
    public AsciiFont cp437_8x8() {
        return AsciiFont.CP437_8x8;
    }

    @Bean
    public AsciiPanel asciiPanel(){
        AsciiPanel panel = new AsciiPanel();
        panel.setAsciiFont(cp437_9x16());
        return panel;
    }
}