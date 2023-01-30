public class KalkulasiPerhitungan {
    public static void defOP(Integer number[], char operator){
        int r = 0;
        switch(operator){
            case '+':
            r = number[0] + number[1];
            break;
            case '/':
            r = number[0] / number[1];
            break;
            case '*':
            r = number[0] * number[1];
            break;
            case '-':
            r = number[0] - number[1];
            break;
        }
        System.out.print(r);
    }
}
