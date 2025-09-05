import java.util.ArrayList;
import java.util.List;

public class Expo2 {
    private static List<Double> result = new ArrayList<>();

    public Expo2(){}
    
    private static List<Double> maiorQue1(double num){
        double number =  Math.floor(num);
        double temp =  Math.floor(num);

        if(temp == 1){
            result.add((double) 0);
            return result;
        }

        int count = 0;

        while(temp != 1.0){
            count ++;
            temp = temp / 2;
            temp = Math.floor(temp);
        }

        result.add( (double) count);
        number = (int) (number - Math.pow(2, count));
        if(number != 0){ maiorQue1(number); }
        
        return result;
    }

    private static List<Double> menorQue1(double num){
        int number = (int) num;
        num = num - number;
        int count = -1;

        while(num != 0){
            double temp = Math.pow(2, count);

            if(temp > num){
                count --;
                continue;
            }
            else{
                result.add( (double) count);
                num = num - Math.pow(2, count);
                count --;
            }
        }
        return result;
    }

    public static List<Double> calcularFator2(double num){

        if(num < 0){ num = num * -1; }

        if(num == 0){
            result.add(Double.NEGATIVE_INFINITY);
            return result;
        }

        menorQue1(num);
        maiorQue1(num);

        return result;
    }

}
