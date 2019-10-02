package radar.runtime.event.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Event extends Identity {

    @Getter
    @Setter
    private String bizType;


    @Getter
    @Setter
    private List<Entity> entities;


}
