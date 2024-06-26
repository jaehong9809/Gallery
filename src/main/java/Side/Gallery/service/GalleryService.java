package Side.Gallery.service;

import Side.Gallery.domain.Picture;
import Side.Gallery.domain.PictureUpdateDto;

import java.util.List;
import java.util.Optional;

public interface GalleryService {

    Picture save(Picture picture);

    Optional<Picture> findById(Long id);

    List<Picture> findAll();

    void update(Long id, PictureUpdateDto pictureUpdateDto);

}
