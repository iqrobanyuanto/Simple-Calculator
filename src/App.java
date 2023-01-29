public class App {

    public static void main(String[] args) throws Exception {
        System.out.print("Enter a list of numbers separated by a comma: ");
        String input = "23,2,123,1";
        String[] numbers = input.split(",");
        for (String number : numbers) {
          int num = Integer.parseInt(number);
          System.out.println(num);
        }
    }

    public static void definenum(String[] numbers){

    }
}