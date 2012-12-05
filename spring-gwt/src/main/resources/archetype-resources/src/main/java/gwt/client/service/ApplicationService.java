package ${package}.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("/application.rpc")
public interface ApplicationService extends RemoteService {
    public String hello();
}