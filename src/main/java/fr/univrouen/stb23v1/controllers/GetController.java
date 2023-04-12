package fr.univrouen.stb23v1.controllers;

import model.STB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @GetMapping("/resume")
    public String getListRSSinXML() {
        return "Envoi de la liste des STB";
    }

    @GetMapping("/stbid")
    public String getRSSinXML(@RequestParam(value="id") String texte) {
        return "Detail de la STB" + texte;
    }

    @GetMapping("/test")
    public String getSTBDetail(@RequestParam(value="id") String id, @RequestParam(value="titre") String title) {
        return "Test : \n"+ "Ip : " + id + "\nTitre : " + title;
    }

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody STB getXml() {
        return new STB(123, "Test STB", "2023-04-01T14:22:33");
    }
}
