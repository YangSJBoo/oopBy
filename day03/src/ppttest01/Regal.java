package ppttest01;

public class Regal {
    private String type;
    private String id;
    public Regal() {}

    public Regal(String id,String type) {//构造函数重载
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
