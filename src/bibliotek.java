import java.util.ArrayList;
import java.util.Random;

public class bibliotek {

  Random ran = new Random();
  Bog bg = new Bog();

  void go() {

    ArrayList<String> Bogliste = new ArrayList<>();

    Bogliste.add("Harry Potter");
    Bogliste.add("Java");
    Bogliste.add("python");

    boggraber(Bogliste);

  }

    public boolean boggraber(ArrayList Bogliste) {

    if(!Bogliste.contains(bg.getISBN(Bogliste))){

      System.out.println("Tillykke du har fået, bogen med samme ISBN nr");
      return true;

    }else
      System.out.println("Desværre");
      return false;

    }


}
