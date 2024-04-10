package Side.Gallery.repository;

import Side.Gallery.domain.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Primary
@Repository
@Transactional
@RequiredArgsConstructor
public class TotalRepositoryImpl implements TotalRepository {
    private final PictureRepository repository;
    @Override
    public Picture save(Picture picture) {
        return repository.save(picture);
    }

    @Override
    public void update(Long pictureId) {

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
