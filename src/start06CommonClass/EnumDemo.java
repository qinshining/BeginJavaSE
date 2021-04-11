package start06CommonClass;

public class EnumDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setGender(Gender.MALE);
        System.out.println(stu.getGender());

        EngineerLevel junior = EngineerLevel.JUNIOR;
        junior.show();
        EngineerLevel.showAll();
    }
}

class Student {
    private Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return  this.gender;
    }
}

enum Gender {
    MALE, FEMALE
}

enum EngineerLevel {
    JUNIOR("junior"), MID("mid"), HIGH("high");

    private final String levelName;

    EngineerLevel(String levelName) {
        this.levelName = levelName;
    }

    public void show() {
        System.out.println(this.levelName);
    }

    public static void showAll() {
        for (var e :
                values()) {
            System.out.println(e.levelName);
        }
    }
}
