package Side.Gallery.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Data
@Entity(name ="picturetable" )
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String pictureName;


    private byte[] data;

    public Picture(){
    }

    public Picture(String pictureName, byte[] data){
        this.pictureName = pictureName;
        this.data = data;
    }
}
