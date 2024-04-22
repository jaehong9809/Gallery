package Side.Gallery.repository;

import Side.Gallery.domain.Picture;
import Side.Gallery.domain.PictureFeat;
import Side.Gallery.domain.PictureUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@RequiredArgsConstructor
public class MainRepositoryImpl implements TotalRepository {
    private final PictureRepository repository;
    @Override
    public Picture save(Picture picture) {
        return repository.save(picture);
    }

    @Override
    public void update(Long pictureId, PictureUpdateDto pictureUpdateDto) {
        Picture picture = repository.findById(pictureId).orElseThrow();
        picture.setData(pictureUpdateDto.getData());
        picture.setPictureName(pictureUpdateDto.getPictureName());
    }

    @Override
    public Optional<Picture> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Picture> findAll() {
        return repository.findAll();
    }
}
