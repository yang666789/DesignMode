package whut.yy.State.WriteProgram;

public class Client {
    public static void main(String[] args) {
        Work emergencyProjects = new Work();

        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(15);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(17);
        emergencyProjects.setFinish(false);
//        emergencyProjects.setFinish(true);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(20);
        emergencyProjects.writeProgram();
    }
}
