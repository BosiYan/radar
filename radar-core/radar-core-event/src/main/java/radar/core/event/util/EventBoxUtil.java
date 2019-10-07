package radar.core.event.util;

import radar.core.event.model.Event;

public class EventBoxUtil {


    /**
     * 事件📥盒子类名
     * @param event
     * @return
     */
    public static String generateEventClassName(Event event){
        StringBuilder builder = new StringBuilder();
        builder.append(event.getCode())
                .append(event.getId());
        return builder.toString();
    }
}
