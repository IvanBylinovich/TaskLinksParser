package by.bylinovich;

public class Link {

    private String number;
    private String name;
    private String url;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Link() {
    }

    public Link(String number, String name, String url) {
        this.number = number;
        this.name = name;
        this.url = url;
    }
}
