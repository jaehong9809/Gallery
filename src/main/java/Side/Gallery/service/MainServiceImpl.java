package Side.Gallery.service;

import Side.Gallery.domain.Picture;
import Side.Gallery.domain.PictureUpdateDto;
import Side.Gallery.repository.TotalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MainServiceImpl implements GalleryService{
    private final TotalRepository pictureRepository;

    public MainServiceImpl(TotalRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Transactional
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

    @Override
    public void update(Long id, PictureUpdateDto pictureUpdateDto) {
        pictureRepository.update(id, pictureUpdateDto);
    }
}
