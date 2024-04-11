package cloud.isaura.adso.geochat.data.rest.responses;

import java.time.LocalDate;
import java.util.List;

public record MapResponseDetail(LocalDate startDate, LocalDate endDate, List<MapResponseProperties> mapResponseProperties)
{
}
