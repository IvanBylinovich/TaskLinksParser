package by.bylinovich;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean {

    private List<Link> links = new ArrayList<>();

    private String page;


    public void fillLinksList() {

        try {
            this.links =  LinkService.createLinksList(LinksParserUtil.parsWebPage(this.page));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cleanLinksList(){
        links.clear();
    }


    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Link> getLinks() {
        return links;
    }

    public String getPage() {
        return page;
    }


    public void setPage(String page) {
        this.page = page;
    }
}
