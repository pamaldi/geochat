package cloud.isaura.adso.geochat.lifecycle.init.repository.bologna;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;


@ApplicationScoped
public class WifiDataResource
{
    @Inject
    @RestClient
    BolognaApiService bolognaApiService;


    public String getWifiData() {
        return bolognaApiService.getRecords("data>=date'2024-03-15' and data<date'2024-03-16'");

    }
}
