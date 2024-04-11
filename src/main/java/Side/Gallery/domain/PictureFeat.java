package Side.Gallery.domain;

import lombok.Data;

@Data
public class PictureFeat {
    private long id;
    private String pictureName;
    private String url;

    public PictureFeat(long id, String pictureName, String URL) {
        this.id = id;
        this.pictureName = pictureName;
        this.url = URL;
    }
}
