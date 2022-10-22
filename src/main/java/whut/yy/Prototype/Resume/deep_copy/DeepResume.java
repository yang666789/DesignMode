package whut.yy.Prototype.Resume.deep_copy;

public class DeepResume implements Cloneable {

    private String name;
    private String age;
    private String sex;
    private DeepWorkExperience workExperience;

    public void setWorkExperience(DeepWorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public DeepResume(String name) {
        this.name = name;
        workExperience = new DeepWorkExperience();
    }

    public void setPersonalInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String workDate, String workLocation) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setWorkLocation(workLocation);
    }

    public void display() {
        System.out.println("Resume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", workDate=" + workExperience.getWorkDate() + '\'' +
                ", workLocation=" + workExperience.getWorkLocation() +
                '}');
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepResume object = (DeepResume) super.clone();
        object.setWorkExperience((DeepWorkExperience) this.workExperience.clone());
        return object;
    }
}
