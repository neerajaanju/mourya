package test1.webapp.props;


import org.eurekaclinical.standardapis.props.CasEurekaClinicalProperties;

/**
 * Created by akalsan on 9/15/16.
 */
public class WebappProperties extends CasEurekaClinicalProperties {

    public String getServiceUrl() {
        return getValue("test project.service.url");
    }

    public String getUrl() {
        return getValue("test project.webapp.url");
    }

    public WebappProperties() {
        super("/etc/tp");
    }

    @Override
    public String getProxyCallbackServer() {
        return getValue("test project.webapp.callbackserver");
    }
}
