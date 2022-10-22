package whut.yy.Prototype.Resume;


import whut.yy.Prototype.Resume.deep_copy.DeepResume;
import whut.yy.Prototype.Resume.shallow_copy.Resume;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //region 浅拷贝
        System.out.println("===================浅拷贝===================");
        Resume resume = new Resume("张三");
        resume.setPersonalInfo("20", "男");
        resume.setWorkExperience("2008", "百度");

        Resume resume1 = (Resume) resume.clone();
        resume1.setPersonalInfo("21", "女");
        resume1.setWorkExperience("2010", "腾讯");

        Resume resume2 = (Resume) resume.clone();
        resume2.setPersonalInfo("22", "男");
        resume2.setWorkExperience("2018", "阿里");

        resume.display();
        resume1.display();
        resume2.display();
        //endregion

        //region 深拷贝
        System.out.println("===================深拷贝===================");
        DeepResume deepResume = new DeepResume("张三");
        deepResume.setPersonalInfo("20", "男");
        deepResume.setWorkExperience("2008", "百度");

        DeepResume deepResume1 = (DeepResume) deepResume.clone();
        deepResume1.setPersonalInfo("21", "女");
        deepResume1.setWorkExperience("2010", "腾讯");

        DeepResume deepResume2 = (DeepResume) deepResume.clone();
        deepResume2.setPersonalInfo("22", "男");
        deepResume2.setWorkExperience("2018", "阿里");

        deepResume.display();
        deepResume1.display();
        deepResume2.display();
        //endregion
    }
}
