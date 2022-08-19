import java.util.Scanner;

public class Sortering {

  String words;
  int counts;

  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    new Sortering().go();
  }

  void go(){
    sortering();
  }

  public void sortering() {

    System.out.println("SKriv antal strenge du vil sortere: ");
    counts = scan.nextInt();


    String str[] = new String[counts];
    Scanner scan2 = new Scanner(System.in);

    System.out.println("Skriv strengene en efter en: ");
    for(int i = 0; i < counts; i++){

      str[i] = scan2.nextLine();

    }

    scan.close();
    scan2.close();

    for(int i = 0; i < counts; i++){
      for(int j= i + 1; j < counts; j++){
        if(str[i].compareTo(str[j])>0){
          words = str[i];
          str[i] = str[j];
          str[j] = words;

        }
      }
    }
    System.out.println("Stringene er sorteret i alfabetisk orden: ");
    for(int i = 0; i <= counts - 1; i++) {
      System.out.println(str[i] + ", ");
    }
  }


}
