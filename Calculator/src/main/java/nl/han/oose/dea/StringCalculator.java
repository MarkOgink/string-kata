package nl.han.oose.dea;

/**
 * Hello world!
 *
 */
public class StringCalculator
{
    public static void main( String[] args )
    {
        var calculator = new StringCalculator();
        System.out.println(calculator.add("1,3\n5"));

    }

    public int add(String numbers){
        if("".equals(numbers)){
            return 0;
        }
        else if(numbers.contains(",") || numbers.contains("\n")){
            String [] seperated = numbers.split(",|\n");
            int sum = 0;
            for (int i = 0; i < seperated.length; i++) {
                sum = sum + Integer.parseInt(seperated[i]);
            }
            return sum;
        }
        else if(numbers.startsWith("/")){

        }
        else
            return Integer.parseInt(numbers);
    }
}
