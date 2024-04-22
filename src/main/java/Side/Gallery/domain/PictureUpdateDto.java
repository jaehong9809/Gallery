package Side.Gallery.domain;

import lombok.Data;

@Data
public class PictureUpdateDto {
    private String pictureName;
    private byte[] data;

    public PictureUpdateDto(String pictureName, byte[] data) {
        this.pictureName = pictureName;
        this.data = data;
    }

    public PictureUpdateDto() {
    }
}
