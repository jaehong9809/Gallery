package Side.Gallery.webcontroller;


import Side.Gallery.domain.Picture;
import Side.Gallery.service.GalleryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/gallery")
@Slf4j
public class GalleryController {

    private final GalleryService galleryService;
    @GetMapping
    public String gallery(Model model){
        List<Picture> pictures = galleryService.findAll();

        model.addAttribute("pictures", pictures);
        return "home";
    }

    @GetMapping("/add")
    public String addPage(){
        return "addPicture";
    }



    @PostMapping("/add")

    public String addPicture(@RequestParam("pictureName")String pictureName,
                             @RequestParam("data")MultipartFile data,
                             Model model){
        try {
            Picture picture = new Picture(pictureName, data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        model.addAttribute("picture", pictureName);
        return "redirect:/";
    }

}
