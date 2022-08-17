import java.util.Scanner;

public class Hvor_tit_skal_græsset_slås {

  Scanner scan = new Scanner(System.in);

  private double græs_nu = 4;
  private double græs_Max;
  private double dage;



  public static void main(String[] args) {

    new Hvor_tit_skal_græsset_slås().go();
  }

  void go(){
    græs_klipning(græs_nu, græs_Max);
  }

  public double græs_klipning(double græs_nu, double græs_Max){

    System.out.println("Skriv hvor højt græsset er: ");

    græs_nu = scan.nextDouble();

    System.out.println("Skriv hvor mange dage du ikke har klippet græsset: ");

    dage = scan.nextDouble();

    græs_Max = 0.8*dage+4;

    if (græs_Max > 10.0)
    System.out.println("Tid til græs klipning: " + græs_Max + "cm ");

    else if(græs_Max < 10.0)
    System.out.println("Der er " + græs_Max + " dage Til græsset skal slås");

    return 10.0;
  }

}
