public class Switchcase
{
    public static void main(String[] args)
    {
        int num1 = 20;   
        int num2 = 10;   
        char operator = '/'; 

        double result;

        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                 result = num1 / num2;
                 System.out.println("Result: " + result);
                 break;
            default:
                System.out.println("Invalid operator!");
 }
}
}