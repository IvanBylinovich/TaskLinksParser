package by.bylinovich;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;


@FacesValidator("by.bylinovich.UrlValidator")
public class URLValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent component, Object value){

        String d = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        if(!(value.toString().matches(d))){
            FacesMessage msg =
                    new FacesMessage("URL validation failed","Адрес web-страницы указан не верно");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
