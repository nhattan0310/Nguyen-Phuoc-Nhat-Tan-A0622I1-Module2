package test_the_best;

public class Students {
    //khai bao thuowc
    private int id;
    private String name;
    public Students(int id,String name){
        this.id=id;
        this.name =name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
