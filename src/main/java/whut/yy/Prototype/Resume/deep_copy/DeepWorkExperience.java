package whut.yy.Prototype.Resume.deep_copy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeepWorkExperience implements Cloneable{
    private String workDate;
    private String workLocation;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
