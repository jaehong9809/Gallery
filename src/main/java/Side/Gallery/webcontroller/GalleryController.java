package Side.Gallery.webcontroller;


import Side.Gallery.domain.Picture;
import Side.Gallery.domain.PictureFeat;
import Side.Gallery.service.GalleryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/gallery")
@Slf4j
public class GalleryController {

    private final GalleryService galleryService;
    @GetMapping
    public String gallery(Model model) throws SQLException {
        List<Picture> pictures = galleryService.findAll();
        List<PictureFeat> delivery = new ArrayList<>();
        for (Picture picture : pictures) {
            delivery.add(new PictureFeat(
                    picture.getId(),
                    picture.getPictureName(),
                    Base64.getEncoder().encodeToString(picture.getData())));
        }
        model.addAttribute("pictures", delivery);
        return "home";
    }

    @GetMapping("/add")
    public String addPage(){
        return "addPicture";
    }



    @PostMapping("/add")
    public String addPicture(@RequestParam("pictureName")String pictureName,
                             @RequestParam("data")MultipartFile data,
                             Model model) throws IOException {
        
        // 파일 입력을 안했을 경우
        if (data.equals(null)) {
            return "redirect:/";        
        }
        

        Picture picture = new Picture(pictureName, data.getBytes());
        galleryService.save(picture);
        model.addAttribute("picture", picture);
        return "redirect:/";
    }

    @GetMapping("/picture/{id}")
    public String onePicture(@PathVariable("id") long id, Model model) {
        Picture picture = galleryService.findById(id).get();
        PictureFeat pictureFeat = new PictureFeat(
                picture.getId(),
                picture.getPictureName(),
                Base64.getEncoder().encodeToString(picture.getData()));

        model.addAttribute("picture", pictureFeat);
        return "onePicture";
    }

}
