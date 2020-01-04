package page;
import page.SubWeb;
public class Web{
    private final static Web INVALID_WEB = new Web("姓名不能为空");
    private String name;
    public static Web newStaticWeb(String name) {
        if(name == null) {
            return INVALID_WEB;
        } else if (name.contains("net")) {
            return new SubWeb(name);
        }
        return new Web(name);
    }
    public static Web newStaticSubWeb(String name) {
        return new Web(name + "-sub");
    }
    private Web(String name) {
       this.name = name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public String getName() {
        return name;
    }
}
