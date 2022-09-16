package ss5_access_modifier.only_java;

public class OnlyJava {
    private String name;
    private String classes ;

    public OnlyJava() {
        this.name = "NhatTan";
        this.classes = "C0622I1";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public OnlyJava(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "OnlyJava{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
