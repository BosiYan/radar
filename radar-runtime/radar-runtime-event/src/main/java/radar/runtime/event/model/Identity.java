package radar.runtime.event.model;


import lombok.Getter;
import lombok.Setter;

public abstract class Identity {

    @Getter
    @Setter
    public String code;


    @Getter
    @Setter
    public String name;


}
