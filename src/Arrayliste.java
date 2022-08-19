import java.util.ArrayList;

public class Arrayliste {

  private String bob;
  private String Kim;
  private String John;
  private String string;

  public static void main(String[] args) {

    new Arrayliste().go();

  }

  void go() {

    ArrayList<String> arrey = new ArrayList<>();

    arrey.add(bob);
    arrey.add(bob);
    arrey.add(John);
    arrey.add(string);

    doesArraylistContainString(arrey, string);
  }

  public boolean doesArraylistContainString(ArrayList arrey, String string) {

     if (arrey.contains(string)) {

      System.out.println("The string has been found");
      return true;

    } else {

      arrey.add(string);
      System.out.println("prøv igen");
      return false;

     }

  }

}
