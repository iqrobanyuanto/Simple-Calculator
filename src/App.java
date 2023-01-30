import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      Integer[] pack = new Integer[2];
      //input
      System.out.print("Input number: ");
      Integer a = input.nextInt();
      System.out.print("Input Operator: ");
      char x = input.next().charAt(0);
      System.out.print("Input number: ");
      Integer b = input.nextInt();
      input.close();
      //pack
      packNUM(pack,a,b);
      //prInteger
      KalkulasiPerhitungan.defOP(pack, x);;
    }
//
    public static void packNUM(Integer[] packs,Integer a, Integer b){
      packs[0] = a;
      packs[1] = b;
    }
}