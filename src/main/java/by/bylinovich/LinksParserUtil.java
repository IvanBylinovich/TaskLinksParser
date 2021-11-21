package by.bylinovich;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinksParserUtil {

    // метод принимает на вход абсолютный url веб страницы, и возвращает список ссылок, содержащихся в нем.
    // the method accepts the absolute url of a web page as input, and returns a list of links contained in it.
    public static List<String> parsWebPage(String url) throws IOException {

        List<String> urlList = new ArrayList<>();

        //считывается html веб станица, отбираются участки по тегу <a>.
        //the html web page is read, sections are selected by the <a> tag.
        Document doc = Jsoup.connect(url).get();
        Elements aLinks = doc.body().getElementsByTag("a");

        for(Element e : aLinks){
            //получается текст, содержащийся в “href”, и при необходимости добавляется недостающая часть до абсолютного url.
            //text contained in the “href” is obtained, and if necessary, the missing part is added to the absolute url.
            String string = e.attr("abs:href");
            //отсеивает содержимое javascript ссылки
            //filters out the contents of the javascript link
            if(string.indexOf("http" ) == 0){
                urlList.add(string);
            }
        }

        return urlList;
    }





}
