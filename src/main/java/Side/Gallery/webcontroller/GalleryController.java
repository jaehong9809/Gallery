package Side.Gallery.webcontroller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/gallery")
public class GalleryController {

    @GetMapping
    public String gallery(){

        return "home";
    }

}
