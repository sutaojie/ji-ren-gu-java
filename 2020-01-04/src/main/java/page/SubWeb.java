package page;
import page.Web;
public class SubWeb extends Web {
    public SubWeb (String name) {
        Web.newStaticSubWeb(name);
    }
}