package radar.core.event.model;

import lombok.Getter;
import lombok.Setter;
import radar.core.event.model.enums.ScriptLanguage;

import java.util.List;

public class Event extends Identity {

    @Getter
    @Setter
    private String bizType;


    @Getter
    @Setter
    private List<Entity> entities;

    @Getter
    @Setter
    private ScriptLanguage scriptLanguage;

}
