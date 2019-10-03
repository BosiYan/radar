package radar.core.event.model;

import lombok.Getter;
import lombok.Setter;
import radar.meta.enums.ScriptLanguage;

import java.util.List;

public class Entity extends Identity {

    @Getter
    @Setter
    private String script;

    @Getter
    @Setter
    private ScriptLanguage scriptLanguage;

    @Getter
    @Setter
    private List<Attribute> attributes;
}
