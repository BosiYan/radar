package radar.core.event.api;

import radar.core.event.model.Event;

import java.util.Map;

public interface EventBoxParser {

    EventBox parser(Event event, Map<String, Object> ctx);
}
