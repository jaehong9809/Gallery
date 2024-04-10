package Side.Gallery.repository;

import Side.Gallery.domain.Picture;

import java.util.List;
import java.util.Optional;

public interface TotalRepository {
    Picture save(Picture picture);
    void update(Long pictureId);

    Optional<Picture> findById(Long id);

    List<Picture> findAll();
}
