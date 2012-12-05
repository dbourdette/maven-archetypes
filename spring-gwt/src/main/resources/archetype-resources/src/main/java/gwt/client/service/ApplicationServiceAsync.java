package ${package}.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ApplicationServiceAsync {
    public void hello(AsyncCallback<String> callback);
}