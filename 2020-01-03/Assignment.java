public class Assignment{
  public static void main(String[] args){
    Tank t1 = new Tank();
    Tank t2 = new Tank();
    t1.level = 48;
    t2= t1;
    System.out.println("t1.level == t2.level " + (t1.level == t2.level));
    System.out.println("t1== t2" + (t1 == t2));
    System.out.println("t1.equals(t2)" + (t1.equals(t2)));
    t2.level = 23;
    System.out.println("t1.level == t2.level " + (t1.level == t2.level));
  }
}
class Tank{
  int level;
}