package es.thalesalv.simplecrud.application.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(Profiles.FRANCAIS)
public class FrancaisMessageConstants implements MessageConstants {

    @Override
    public String profile() {
        return Profiles.FRANCAIS;
    }

    @Override
    public String messageKey() {
        return "Message";
    }

    @Override
    public String languageKey() {
        return "Cette application fonctionne en";
    }

    @Override
    public String languageValue() {
        return "français";
    }

    @Override
    public String bookNotFoundMessage() {
        return "Oups! Livre non trouvé :: ";
    }
    
    @Override
    public String openshiftKey() {
        return "OpenShift est très";
    }

    @Override
    public String messageForEveryoneKey() {
        return "Message à tous";
    }
}