package Side.Gallery;

import Side.Gallery.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
@SpringBootApplication(scanBasePackages = "Side.Gallery.webcontroller")
public class GalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);
	}

}
