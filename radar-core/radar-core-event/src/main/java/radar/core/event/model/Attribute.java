package radar.core.event.model;

import lombok.Getter;
import lombok.Setter;
import radar.core.event.model.enums.ScriptLanguage;

public class Attribute extends Identity{

    @Getter
    @Setter
    private String script;

    @Getter
    @Setter
    private ScriptLanguage scriptLanguage;

}
