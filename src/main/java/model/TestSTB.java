package model;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestSTB {

    public String loadFileXML() throws IOException {
        Resource resource = new DefaultResourceLoader().getResource("classpath:xml\\test0.xml");
        return resource.getContentAsString(StandardCharsets.UTF_8);
    }

}
