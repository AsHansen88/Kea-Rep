import java.util.Scanner;

public class Kvadrat {

  private int side;
  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    new Kvadrat().go();

  }

  void go() {

    kvadrat();

  }

  public void kvadrat(){

    System.out.println("Se et kvadrat: ");

    side = scan.nextInt();

    for(int i = 1; i <= side; i++){
      for(int j = 1; j <= side; j++){

        System.out.print("* ");
    }

      System.out.print("\n");
    }


  }
}
