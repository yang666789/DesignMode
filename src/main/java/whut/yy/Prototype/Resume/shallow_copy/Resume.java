package whut.yy.Prototype.Resume.shallow_copy;

public class Resume implements Cloneable {

    private String name;
    private String age;
    private String sex;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
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
        return super.clone();
    }
}
