package radar.runtime.event.model;

import lombok.Getter;
import lombok.Setter;
import radar.meta.enums.ScriptLanguage;

public class Attribute extends Identity{

    @Getter
    @Setter
    private String script;

    @Getter
    @Setter
    private ScriptLanguage scriptLanguage;

}