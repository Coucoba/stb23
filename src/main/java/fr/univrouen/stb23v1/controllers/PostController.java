package fr.univrouen.stb23v1.controllers;

import model.TestSTB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class PostController {

    @RequestMapping(value="/testpost", method = RequestMethod.POST, consumes = "application/xml")
    public String postTest(@RequestBody String flux) {
        return "<result><response>Message reçu : </response>" + flux + "</result>";
    }

    @PostMapping(value= "/poststb", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postSTB() throws IOException {
        TestSTB stb = new TestSTB();
        return stb.loadFileXML();
    }

}
