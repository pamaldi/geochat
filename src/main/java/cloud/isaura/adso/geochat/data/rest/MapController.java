package cloud.isaura.adso.geochat.data.rest;

import cloud.isaura.adso.geochat.data.repository.MongoRepository;
import cloud.isaura.adso.geochat.data.repository.TurnoutEntity;
import cloud.isaura.adso.geochat.data.rest.responses.*;
import cloud.isaura.adso.geochat.data.services.MapService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/map")
public class MapController
{
    @Inject
    MapService mapService;

    private static final Logger LOGGER = Logger.getLogger("MapController");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MapResponse map(@QueryParam("startDate") LocalDate startDate, @QueryParam("endDate") LocalDate endDate)
    {
       LOGGER.info("Invoke map with startDate "+startDate+" and endDate "+endDate);
       return mapService.data(startDate,endDate);
    }
}
