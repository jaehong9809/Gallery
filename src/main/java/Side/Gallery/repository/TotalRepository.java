package Side.Gallery.repository;

import Side.Gallery.domain.Picture;
import Side.Gallery.domain.PictureFeat;
import Side.Gallery.domain.PictureUpdateDto;

import java.util.List;
import java.util.Optional;

public interface TotalRepository {
    Picture save(Picture picture);
    void update(Long pictureId, PictureUpdateDto pictureUpdateDto);

    Optional<Picture> findById(Long id);

    List<Picture> findAll();
}
