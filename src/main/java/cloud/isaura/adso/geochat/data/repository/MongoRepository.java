package cloud.isaura.adso.geochat.data.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MongoRepository implements PanacheMongoRepository<TurnoutEntity>
{
    public String getMap() {
        return "{\n" +
                "\"type\": \"FeatureCollection\",\n" +
                "\"features\": [\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"0000000000000000315a\", \"capacityMw\": 15.0, \"commissioningYear\": 1942.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 685.39771183776759, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026827\", \"name\": \"Dos Bocas\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30936.0, \"yearOfCapacityData\": 0, \"longitude\": -66.666298637062695, \"latitude\": 18.335899336487358 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.666298637062695, 18.335899336487358 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"000000000000000026e5\", \"capacityMw\": 1492.0, \"commissioningYear\": 1975.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 8334.010811804319, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026809\", \"name\": \"Aguirre\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Oil\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/aguirre.asp\", \"weppId\": 30928.0, \"yearOfCapacityData\": 0, \"longitude\": -66.23079607357684, \"latitude\": 17.951899390168816 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.23079607357684, 17.951899390168816 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002fda\", \"capacityMw\": 990.0, \"commissioningYear\": 1962.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 5529.9401499237765, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026811\", \"name\": \"Costa Sur\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Oil\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/costasur.asp\", \"weppId\": 30934.0, \"yearOfCapacityData\": 0, \"longitude\": -66.753402717040728, \"latitude\": 18.000298473002918 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.753402717040728, 18.000298473002918 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003f76\", \"capacityMw\": 602.0, \"commissioningYear\": 1960.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 3362.6504750041554, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026814\", \"name\": \"Palo Seco\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Oil\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/PALOSECO.ASP\", \"weppId\": 30942.0, \"yearOfCapacityData\": 0, \"longitude\": -66.148597004757633, \"latitude\": 18.455300685395482 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.148597004757633, 18.455300685395482 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002def\", \"capacityMw\": 10.0, \"commissioningYear\": 1915.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 456.93180789184504, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026821\", \"name\": \"Carite 1\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/historia_eng.asp  https:\\/\\/mapcarta.com\\/21472530\", \"weppId\": 65289.0, \"yearOfCapacityData\": 0, \"longitude\": -66.106003671495117, \"latitude\": 18.044702201293134 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.106003671495117, 18.044702201293134 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004727\", \"capacityMw\": 8.6400003433227539, \"commissioningYear\": 1929.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 394.78908201855415, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026823\", \"name\": \"Toro Negro 1\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/historia_eng.asp\", \"weppId\": 30950.0, \"yearOfCapacityData\": 0, \"longitude\": -66.487898922116429, \"latitude\": 18.13180182217009 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.487898922116429, 18.13180182217009 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"0000000000000000342e\", \"capacityMw\": 7.1999998092651376, \"commissioningYear\": 1941.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 328.99090168212837, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026825\", \"name\": \"Garzas 1\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA; CEPR\", \"url\": \"http:\\/\\/www.prepa.com\\/historia_eng.asp; http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30938.0, \"yearOfCapacityData\": 0, \"longitude\": -66.734594228797278, \"latitude\": 18.094100122763205 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.734594228797278, 18.094100122763205 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"0000000000000000342f\", \"capacityMw\": 5.0399999618530273, \"commissioningYear\": 1941.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 230.29363117748989, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026826\", \"name\": \"Garzas 2\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA; CEPR\", \"url\": \"http:\\/\\/www.prepa.com\\/historia_eng.asp; http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 49078.0, \"yearOfCapacityData\": 0, \"longitude\": -66.730500774030205, \"latitude\": 18.072700896807721 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.730500774030205, 18.072700896807721 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004728\", \"capacityMw\": 1.919999957084656, \"commissioningYear\": 1937.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 87.730907115234245, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026824\", \"name\": \"Toro Negro 2\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA; CEPR\", \"url\": \"http:\\/\\/www.prepa.com\\/historia_eng.asp; http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30949.0, \"yearOfCapacityData\": 0, \"longitude\": -66.511594585114452, \"latitude\": 18.166399987243775 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.511594585114452, 18.166399987243775 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004339\", \"capacityMw\": 27.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 12.040047035167005, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028017\", \"name\": \"San Fermin Solar Farm\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Solar\", \"source\": \"TSK\", \"url\": \"http:\\/\\/www.grupotsk.com\\/proyectos\\/puerto-rico\", \"weppId\": 66179.0, \"yearOfCapacityData\": 0, \"longitude\": -65.90769852944625, \"latitude\": 18.405501444830595 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.90769852944625, 18.405501444830595 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"000000000000000026e4\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028012\", \"name\": \"Aguirre\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.231201851772695, \"latitude\": 17.953299547899597 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.231201851772695, 17.953299547899597 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002871\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028014\", \"name\": \"Yabucoa\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30951.0, \"yearOfCapacityData\": 0, \"longitude\": -65.824897481984834, \"latitude\": 18.106398323468607 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.824897481984834, 18.106398323468607 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002fd9\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028011\", \"name\": \"Costa Sur\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.753701476811287, \"latitude\": 18.001801190057932 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.753701476811287, 18.001801190057932 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003079\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028013\", \"name\": \"Daguao\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30937.0, \"yearOfCapacityData\": 0, \"longitude\": -65.667700792547706, \"latitude\": 18.232501701260055 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.667700792547706, 18.232501701260055 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"000000000000000031f7\", \"capacityMw\": 507.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 3572.0528788054826, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026812\", \"name\": \"EcoEléctrica\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Gas Natural Fenosa  International Power\", \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 18991.0, \"yearOfCapacityData\": 0, \"longitude\": -66.755204193866291, \"latitude\": 17.981200143191007 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.755204193866291, 17.981200143191007 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003821\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028010\", \"name\": \"Jobos\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30940.0, \"yearOfCapacityData\": 0, \"longitude\": -66.140196058372936, \"latitude\": 17.961499834736884 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.140196058372936, 17.961499834736884 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003b65\", \"capacityMw\": 220.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 1550.0032215723986, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028007\", \"name\": \"Mayagüez\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30941.0, \"yearOfCapacityData\": 0, \"longitude\": -67.160005846599176, \"latitude\": 18.219400862365031 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -67.160005846599176, 18.219400862365031 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003f75\", \"capacityMw\": 126.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 887.7291178096466, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028008\", \"name\": \"Palo Seco\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.149800962042065, \"latitude\": 18.455100025848076 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.149800962042065, 18.455100025848076 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"0000000000000000483c\", \"capacityMw\": 42.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 295.9097059365489, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028009\", \"name\": \"Vega Baja\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Gas\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30948.0, \"yearOfCapacityData\": 0, \"longitude\": -66.391403975319861, \"latitude\": 18.44580280015164 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.391403975319861, 18.44580280015164 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004869\", \"capacityMw\": 6.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 33.514788787416833, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028006\", \"name\": \"Vieques EPP\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Oil\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 49079.0, \"yearOfCapacityData\": 0, \"longitude\": -65.444001069999487, \"latitude\": 18.142900524692116 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.444001069999487, 18.142900524692116 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002884\", \"capacityMw\": 25.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 1142.3295197296125, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026828\", \"name\": \"Yauco 1\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Hydro\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30952.0, \"yearOfCapacityData\": 0, \"longitude\": -66.871100689346406, \"latitude\": 18.110598796660952 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.871100689346406, 18.110598796660952 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002dd9\", \"capacityMw\": 18.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 822.47725420532117, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028015\", \"name\": \"Caonillas 1\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Hydro\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30933.0, \"yearOfCapacityData\": 0, \"longitude\": -66.643204952706895, \"latitude\": 18.296101859585352 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.643204952706895, 18.296101859585352 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002dda\", \"capacityMw\": 3.5999999046325684, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 164.49545084106418, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1028016\", \"name\": \"Caonillas 2\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": null, \"primaryFuel\": \"Hydro\", \"source\": \"CEPR\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30932.0, \"yearOfCapacityData\": 0, \"longitude\": -66.669098952524266, \"latitude\": 18.239698690360314 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.669098952524266, 18.239698690360314 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002da8\", \"capacityMw\": 247.5, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 1382.4850374809446, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026810\", \"name\": \"Cambalache\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Oil\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/AEEES2_ENG.ASP\", \"weppId\": 30930.0, \"yearOfCapacityData\": 0, \"longitude\": -66.696798888268262, \"latitude\": 18.469101603155892 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.696798888268262, 18.469101603155892 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002885\", \"capacityMw\": 9.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 411.23862710266053, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026829\", \"name\": \"Yauco 2\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30953.0, \"yearOfCapacityData\": 0, \"longitude\": -66.883697649822395, \"latitude\": 18.05359810789475 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.883697649822395, 18.05359810789475 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"000000000000000042ab\", \"capacityMw\": 5.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 228.46590394592252, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026831\", \"name\": \"Río Blanco\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Hydro\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": 30945.0, \"yearOfCapacityData\": 0, \"longitude\": -65.785202564407044, \"latitude\": 18.243600403782079 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.785202564407044, 18.243600403782079 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"000000000000000026a2\", \"capacityMw\": 24.0, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 10.702264031259556, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026807\", \"name\": \"AES Ilumina\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"AES Corporation\", \"primaryFuel\": \"Solar\", \"source\": \"PV Tech\", \"url\": \"http:\\/\\/www.pv-tech.org\\/news\\/aes_solar_closes_financing_on_24mw_pv_power_plant_in_puerto_rico_constructi\", \"weppId\": 62587.0, \"yearOfCapacityData\": 0, \"longitude\": -66.159102646839557, \"latitude\": 17.946798178563672 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.159102646839557, 17.946798178563672 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004314\", \"capacityMw\": 15.5, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 6.9118788535217979, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026820\", \"name\": \"Salinas\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Sonnedix\", \"primaryFuel\": \"Solar\", \"source\": \"Sonnedix\", \"url\": \"http:\\/\\/www.sonnedix.com\\/news\\/sonnedix-and-yarotek-announce-start-of-construction-of-58mw-solar-farm-in-puerto-rico\\/\", \"weppId\": 65198.0, \"yearOfCapacityData\": 0, \"longitude\": -66.220495550143397, \"latitude\": 17.978600487276847 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.220495550143397, 17.978600487276847 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"0000000000000000268f\", \"capacityMw\": 454.29998779296881, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 450562.69234955107, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026808\", \"name\": \"A.E.S. Corp.\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"AES Corporation\", \"primaryFuel\": \"Coal\", \"source\": \"Fluor; PREPA\", \"url\": \"http:\\/\\/www.fluor.com\\/projects\\/solid-fueled-power-aes-puerto-rico-epc; http:\\/\\/energia.pr.gov\\/datos\\/plantas\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.149399642947245, \"latitude\": 17.947400157205887 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.149399642947245, 17.947400157205887 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000002817\", \"capacityMw\": 4.5, \"commissioningYear\": 0.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 2.006674505861167, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026819\", \"name\": \"Windmar Ponce\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Windmar Renewable Energy\", \"primaryFuel\": \"Solar\", \"source\": \"Windmar Renewable Energy\", \"url\": \"http:\\/\\/www.windmarpv.com\\/#filter=*\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.54849810543277, \"latitude\": 18.062297814050027 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.54849810543277, 18.062297814050027 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004348\", \"capacityMw\": 864.0, \"commissioningYear\": 2009.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 4826.1295853880247, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026816\", \"name\": \"San Juan CC\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"PREPA\", \"primaryFuel\": \"Oil\", \"source\": \"PREPA\", \"url\": \"http:\\/\\/www.prepa.com\\/sanjuan.asp\", \"weppId\": 30947.0, \"yearOfCapacityData\": 0, \"longitude\": -66.104500954440098, \"latitude\": 18.426998771009263 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.104500954440098, 18.426998771009263 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004106\", \"capacityMw\": 23.399999618530273, \"commissioningYear\": 2011.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 4.1513368078628412, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026815\", \"name\": \"Punta Lima\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Sovereign Bank\", \"primaryFuel\": \"Wind\", \"source\": \"Gestamp Wind\", \"url\": \"http:\\/\\/www.gestampwind.com\\/en\\/business\\/innovating-projects\\/punta-lima\", \"weppId\": 64313.0, \"yearOfCapacityData\": 0, \"longitude\": -65.694803208750542, \"latitude\": 18.186800374563294 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.694803208750542, 18.186800374563294 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003a3d\", \"capacityMw\": 26.0, \"commissioningYear\": 2012.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 11.594119367197855, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026817\", \"name\": \"Loiza Solar Park\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Uriel Renewables and Coqui Power\", \"primaryFuel\": \"Solar\", \"source\": \"Clean Technica\", \"url\": \"http:\\/\\/www.eosolenergy.com\\/proyectos.html\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -65.90280243648958, \"latitude\": 18.413398512796249 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -65.90280243648958, 18.413398512796249 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000004368\", \"capacityMw\": 101.1999969482422, \"commissioningYear\": 2012.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 17.953644656227329, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026818\", \"name\": \"Santa Isabel Wind Farm\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Pattern Energy\", \"primaryFuel\": \"Wind\", \"source\": \"Pattern Energy\", \"url\": \"http:\\/\\/patternenergy.com\\/en\\/operations\\/facilities\\/santa_isabel\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -66.398003444878967, \"latitude\": 17.985298057059129 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -66.398003444878967, 17.985298057059129 ] } },\n" +
                "{ \"type\": \"Feature\", \"properties\": { \"systemIndex\": \"00000000000000003ee1\", \"capacityMw\": 57.650001525878899, \"commissioningYear\": 2015.0, \"country\": \"USA\", \"countryLong\": \"United States of America\", \"estimatedGenerationGwh\": 25.707730058421397, \"generationGwh2013\": 0.0, \"generationGwh2014\": 0.0, \"generationGwh2015\": 0.0, \"generationGwh2016\": 0.0, \"generationGwh2017\": 0.0, \"geolocationSource\": \"WRI\", \"gppdIdnr\": \"WRI1026813\", \"name\": \"Oriana Solar Farm\", \"otherFuel1\": null, \"otherFuel2\": null, \"otherFuel3\": null, \"owner\": \"Sonnedix\", \"primaryFuel\": \"Solar\", \"source\": \"Sonnedix\", \"url\": \"http:\\/\\/www.sonnedix.com\\/news\\/sonnedix-and-yarotek-announce-start-of-construction-of-58mw-solar-farm-in-puerto-rico\\/\", \"weppId\": null, \"yearOfCapacityData\": 0, \"longitude\": -67.044296633363302, \"latitude\": 18.472900757253431 }, \"geometry\": { \"type\": \"Point\", \"coordinates\": [ -67.044296633363302, 18.472900757253431 ] } }\n" +
                "]\n" +
                "}\n";
    }
}
