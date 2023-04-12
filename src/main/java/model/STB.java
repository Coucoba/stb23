package model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "stb")
@XmlAccessorType(XmlAccessType.NONE)
public class STB {

    private static final long serialVersionUID = 1L;

    @XmlAttribute
    private Integer id;

    @XmlElement
    private String title;

    @XmlElement
    private String published;

    public STB(Integer id, String title, String published) {
        super();
        this.id = id;
        this.title = title;
        this.published = published;
    }

    public STB() {}

    @Override
    public String toString() {
        return ("STB (" + id.toString() + ") du " + published + "\n" + title + "\n");
    }

}
