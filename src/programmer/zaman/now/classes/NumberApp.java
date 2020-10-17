package programmer.zaman.now.classes;

public class NumberApp {
  public static void main(String[] args) {


    Integer intValue = 10;

    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Short shortValue = doubleValue.shortValue();

    String contoh = "100.10";

    Double contohInt = Double.valueOf(contoh);
    System.out.println(contohInt);

  }
}
