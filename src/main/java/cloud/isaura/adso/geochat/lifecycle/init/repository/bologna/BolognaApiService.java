package cloud.isaura.adso.geochat.lifecycle.init.repository.bologna;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

//@Path("/explore/v2.1/catalog/datasets/iperbole-wifi-affluenza/records?where=data%3E%3Ddate%272024-03-15%27%20and%20data%3Cdate%272024-03-16%27")
@Path("/")
@RegisterRestClient(configKey="bolognaApi")
@ClientHeaderParam(name = "Accept", value = "application/json")
public interface BolognaApiService
{
    //data>=date'2023-03-19' and data<date'2023-03-20'
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String getRecords(@QueryParam("where") String whereClause);

}
