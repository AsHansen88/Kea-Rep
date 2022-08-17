import java.util.Locale;
import java.util.Scanner;

public class Propercase {

  String string;
  String sætning;
  String ord;


  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    new Propercase().go();

  }

  void go(){

    Sætning();

  }

  public void Sætning(){

    System.out.println("Skriv en sætning: ");

    string = scan.nextLine().toUpperCase();

    sætning = scan.nextLine().substring(0, 3).toLowerCase();

    System.out.println(string);
    System.out.println(sætning);


  }

}
