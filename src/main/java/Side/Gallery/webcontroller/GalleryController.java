package Side.Gallery.webcontroller;


import Side.Gallery.domain.Picture;
import Side.Gallery.service.GalleryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/gallery")
@Slf4j
public class GalleryController {

    private final GalleryService galleryService;
    @GetMapping
    public String gallery(){

        return "home";
    }

    @GetMapping("/add")
    public String addPage(){
        return "addPicture";
    }



    @PostMapping("/add")
    public String addPicture(@ModelAttribute Picture picture, Model model){
        Picture inputPicture = galleryService.save(picture);
        Picture a = galleryService.findById(inputPicture.getId()).get();

        log.info("src = {}", a.getData());
        model.addAttribute("picture", a);
        return "redirect:/";
    }

}
