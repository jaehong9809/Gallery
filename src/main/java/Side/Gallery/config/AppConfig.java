package Side.Gallery.config;

import Side.Gallery.repository.PictureRepository;
import Side.Gallery.repository.TotalRepository;
import Side.Gallery.repository.MainRepositoryImpl;
import Side.Gallery.service.GalleryService;
import Side.Gallery.service.MainServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AppConfig {
    private final PictureRepository pictureRepository;

    @Bean
    public GalleryService galleryService(){
        return new MainServiceImpl(totalRepository());
    }

    @Bean
    public TotalRepository totalRepository(){
        return new MainRepositoryImpl(pictureRepository);
    }
}
