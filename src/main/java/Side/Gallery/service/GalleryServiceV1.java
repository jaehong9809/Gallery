package Side.Gallery.service;

import Side.Gallery.domain.Picture;
import Side.Gallery.repository.TotalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Primary
@Service
public class GalleryServiceV1 implements GalleryService{
    private final TotalRepository pictureRepository;

    public GalleryServiceV1(TotalRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Override
    public Picture save(Picture picture) {
        return pictureRepository.save(picture);
    }

    @Override
    public Optional<Picture> findById(Long id) {

        return pictureRepository.findById(id);
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }
}
