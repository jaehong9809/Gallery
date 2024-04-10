package Side.Gallery.domain;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Picture {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name", length=20)
    private String pictureName;

    private String URL;

    public Picture(){
    }

    public Picture(String pictureName, String URL){
        this.pictureName = pictureName;
        this.URL = URL;
    }
}
