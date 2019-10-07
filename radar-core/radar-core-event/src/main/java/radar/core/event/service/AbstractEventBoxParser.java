package radar.core.event.service;

import radar.common.script.api.DynamicCompiler;
import radar.core.event.api.EventBox;
import radar.core.event.api.EventBoxParser;
import radar.core.event.model.Event;
import radar.core.event.util.EventBoxUtil;

import java.lang.reflect.Constructor;
import java.util.Map;

public abstract class AbstractEventBoxParser implements EventBoxParser {

    private DynamicCompiler dynamicCompiler;

    @Override
    public EventBox parser(Event event, Map<String, Object> ctx) {
        String sourceCode = getSourceCode(event);
        Class clz = dynamicCompiler.compiler(sourceCode, EventBoxUtil.generateEventClassName(event));
        if (!EventBox.class.isAssignableFrom(clz)){
            throw new IllegalStateException();
        }

        try {
            Constructor constructor = clz.getConstructor(Map.class);
            EventBox eventBox = (EventBox) constructor.newInstance(ctx);
            return eventBox;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        return null;
    }


    public abstract String getSourceCode(Event event);


}
