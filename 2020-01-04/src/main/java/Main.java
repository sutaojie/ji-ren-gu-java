import page.Web;
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello");
        Web web = Web.newStaticWeb(null);
        Web subWeb = Web.newStaticWeb("net");
//        web.setName("web");
        System.out.println(web.getName());
        System.out.println(subWeb.getName());

        Person person = new Person();
        person.name = "xxx";
        System.out.println(person.name);
    }
}