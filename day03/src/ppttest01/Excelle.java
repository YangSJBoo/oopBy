package ppttest01;

public class Excelle {
    private String type;
    private String id;

    public Excelle() {}

    public Excelle(String id,String type) {//构造函数重载
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
