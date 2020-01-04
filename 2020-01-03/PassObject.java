public class PassObject{
  public static void main(String[] args){
    Letter letter = new Letter();
    letter.c = 'x';
    System.out.println("letter.c = " + letter.c);
    assignLetter(letter);

    System.out.println("letter.c = " + letter.c);
  }
  static void assignLetter(Letter letter) {
    letter.c = 'y';
  }
}
class Letter {
  char c;
}