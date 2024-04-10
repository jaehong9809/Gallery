package Side.Gallery.service;

import Side.Gallery.domain.Picture;

import java.util.Optional;

public interface GalleryService {

    Picture save(Picture picture);

    Optional<Picture> findById(Long id);

}
