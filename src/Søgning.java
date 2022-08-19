import java.util.ArrayList;

public class Søgning {

  private String string;

  public static void main(String[] args) {
    new Søgning().go();
  }

  void go(){

    ArrayList<String> Array = new ArrayList<>();
    Array.add("Martin");
    Array.add("Kim");
    Array.add("Sebastian");
    Array.add(string);

    Searching(Array, string);

  }

public void Searching(ArrayList Array, String string) {


    if(Array.contains(string)){
      System.out.println(Array.indexOf(string));

    }else
      System.out.println("-1");

}


    }








