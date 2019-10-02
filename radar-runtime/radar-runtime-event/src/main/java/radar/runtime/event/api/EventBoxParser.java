package radar.runtime.event.api;

import radar.runtime.event.model.Event;

import java.util.Map;

public interface EventBoxParser {

    EventBox parser(Event event, Map<String, Object> ctx);
}
