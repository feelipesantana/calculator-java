import functions.Options;

public class Calculator {
  
  public static void main(String[] args) {
    var execOption =  new Options();

    int result = execOption.multiply(33,10);

    System.out.println("O resultado é: "+ result);
  }
}
