package com.microsoft.services.odata;

import com.microsoft.services.odata.interfaces.ODataURL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.microsoft.services.odata.Helpers.urlEncode;

/**
 * The type ODataURLImpl.
 */
public class ODataURLImpl implements ODataURL {

    /**
     * The Base url.
     */
    String baseUrl;
    /**
     * The Path components.
     */
    List<String> pathComponents = new ArrayList<String>();
    /**
     * The Query string parameters.
     */
    Map<String, String> queryStringParameters = new HashMap<String, String>();

    @Override
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = removeTrailingSlash(baseUrl);
    }

    @Override
    public void appendPathComponent(String pathComponent) {
        this.pathComponents.add(pathComponent);
    }

    @Override
    public void prependPathComponent(String pathComponent) {
        this.pathComponents.add(0, pathComponent);
    }

    @Override
    public void addQueryStringParameter(String name, String value) {
        queryStringParameters.put(name, value);
    }

    @Override
    public Map<String, String> getQueryStringParameters() {
        return new HashMap<String, String>(queryStringParameters);
    }

    @Override
    public String getBaseUrl() {
        return this.baseUrl;
    }

    @Override
    public List<String> getPathComponents() {
        return new ArrayList<String>(this.pathComponents);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.baseUrl);

        sb.append("/");

        for (String component : this.pathComponents) {
            if (component.length() > 0) {
                sb.append(addTrailingSlash(urlEncode(component)));
            }
        }

        Set<String> parameterNames = this.queryStringParameters.keySet();

        if (parameterNames.size() > 0) {

            sb.append("?");

            for (String name : parameterNames) {
                sb.append(urlEncode(name));
                sb.append("=");
                sb.append(urlEncode(this.queryStringParameters.get(name)));
                sb.append("&");
            }
        }

        return sb.toString();
    }

    private static String addTrailingSlash(String s) {
        if (!s.endsWith("/")) {
            s = s + "/";
        }
        return s;
    }

    private static String removeTrailingSlash(String s) {
        if (s.endsWith("/")) {
            s = s.substring(0, s.length() - 1);
        }

        return s;
    }
}
