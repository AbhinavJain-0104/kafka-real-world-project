package abhinav.springboot.Controller;

import abhinav.springboot.entity.WikimediaData;
import abhinav.springboot.repository.WikimediaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WikimediaController {

    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<WikimediaData> allWikimediaData = wikimediaDataRepository.findAll();
        allWikimediaData.forEach(WikimediaData::parseData);
        model.addAttribute("wikimediaDataList", allWikimediaData);
        return "index";
    }
}
