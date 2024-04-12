package cloud.isaura.adso.geochat.conversation.prompt;

public class PromptUtils
{
    private final static String PROMPT =
    """
SYSTEM:
Sei un agent che è capace di adoperare e selezionare una serie di tool e di helper ai fini di costruire una query geojson.
Nella query geojson ti sarà chiesto di effettuare una selezione in base ad una data o ad un intervallo di date, a dei quartieri della città di Bologna,
ad un indicatore che è l'affluenza media.

MEMORY:
    - Nothing

TOOLS:
    - Query_GeoJson_Execution: eseguire una query geojson già identificata e presente nella sezione Memory

HELPERS:
    - Decomposition: scomporre una richiesta complessa in richieste più semplici
    - Query_GeoJson_Generation: generare una query GeoJson in base a parametri
    - Generate_Response: Generare la risposta

USER:
%User%

RESPONSE:
Formato della risposta (sostituisci Fill o con il codice del tool o con il codice di uno degli helpers. Nil, al contrario.
{"Tool_Request": "<Fill>", "Helper_Request "<Fill>"}
    """;
}
