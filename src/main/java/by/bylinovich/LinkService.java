package by.bylinovich;

import java.util.ArrayList;
import java.util.List;

public class LinkService {


    public static List<Link> createLinksList(List<String> urlList){
        List<Link> linkList = new ArrayList<>();

        int linkNumber = 0;

        for(String url : urlList){
            linkNumber++;
            linkList.add(new Link(String.valueOf(linkNumber), url, url));

        }

        return linkList;
    }
}
