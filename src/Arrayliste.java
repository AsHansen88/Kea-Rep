import java.util.ArrayList;
import java.util.Random;

public class Arrayliste {

  Random ran = new Random();

  private String bob;
  private String hej;
  private String Nej;
  private String string;

  public static void main(String[] args) {

    new Arrayliste().go();

  }

  void go() {

    ArrayList<String> arrey = new ArrayList<>();

    arrey.add(hej);
    arrey.add(bob);
    arrey.add(Nej);
    arrey.add(string);

    doesArraylistContainString(arrey, string);
  }

  public boolean doesArraylistContainString(ArrayList arrey, String string) {

     if (arrey.contains(string)) {

      System.out.println("The string has been found");
      return true;

    } else {

      System.out.println("prøv igen");
      return false;

     }

  }

}
