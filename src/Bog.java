import java.util.ArrayList;
import java.util.Random;

public class Bog {

  private boolean ISBN;
  private boolean titel;
  private boolean udgivelsesår;

  Random ran = new Random();

  public static void main(String[] args) {

    new bibliotek().go();

    }

   public Bog() {

    ISBN = ran.nextBoolean();
    titel = ran.nextBoolean();
    udgivelsesår = ran.nextBoolean();

  }

  public boolean gettitel() {

    return titel;

  }

  public void settitel() {

  }

  public boolean getISBN(ArrayList bogliste){

    return ISBN;
  }

  public void setISBN(ArrayList bogliste){

  }

  public boolean getUdgivelsesår() {
    return udgivelsesår;
  }

  public void setUdgivelsesår(){

  }

  @Override
  public String toString() {
    return "Bog{" +
        "ISBN=" + ISBN +
        ", titel='" + titel + '\'' +
        ", udgivelsesår=" + udgivelsesår +
        '}';
  }
}
