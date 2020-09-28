import java.util.Scanner;// Package to use scanner class
import java.util.concurrent.TimeUnit;// package used to pause the execution

class Assignment1{
    static Scanner input = new Scanner(System.in);
    // 1. WAP to find the nth term of fibonacci series
    public static void Fibonacci(){
        System.out.println("Enter the nth term of the fibonacci series");
        int nTerm = input.nextInt();
        int term1 = 0;
        int term2 = 1;
        for(int i=1;i<nTerm;i++){
            term2 = term1 + term2;
            term1 = term2 - term1;
        }
        System.out.println("The "+nTerm+" term of the fibonacci series is "+term1);
    }
    // 2. Wap to find x^y
    // Alternatively Math.pow() can be used
    public static void power(){
        System.out.println("Enter the number");
        int numX = input.nextInt();
        System.out.println("Enter its power");
        int numY = input.nextInt();
        double numValue = 1.0;
        if(numY>0){
            for(int i=1;i<=numY;i++) {
                numValue *= numX;
            }
            System.out.println(numX+" to the power of "+numY+" is "+numValue);
        }else if(numY<0){
            numY = numY * -1;// Alternatively Math.abs() can be used
            for(int i=1;i<=numY;i++){
                numValue *= numX;
            }
            System.out.println(numX+" to the power of "+numY+" is "+(1.0/numValue));
        }else{
            System.out.println(numX+" to the power of "+numY+" is 1");
        }
    }
    // 3. WAP to find the nth prime no. starting after x
    public static void nthPrimeNumber(){
        System.out.println("Enter the starting number");
        int startX = input.nextInt();
        System.out.println("Enter the position");
        int positionN = input.nextInt();
        int primePositionCounter = 0;
        int primeCounter = 0;
        while(primePositionCounter!=positionN){
            startX++;
            for(int i=2;i<=startX;i++){
                if(startX%i==0){
                    primeCounter++;
                }
            }
            if(primeCounter==1){
                primePositionCounter++;
            }
            primeCounter = 0;
        }
        System.out.println("The prime number is "+(startX));
    }
    // 4. WAP to print table of x starting from 1 to y.
    public static void multiplierTable(){
        System.out.println("Enter the number");
        int numX = input.nextInt();
        System.out.println("Enter the numbers of times to be multiplied from 1");
        int numY = input.nextInt();
        for(int i=1;i<=numY;i++){
            System.out.println(numX+" x "+i+" = "+(numX*i));
        }
    }
    // 5. WAP to find the sum of digits of a given number
    public static void digitSum(){
        System.out.println("Enter the number to find the sum of its digits");
        int number = input.nextInt();
        int displayNumber = number;
        int sum = 0;
        while(number!=0){
            sum = sum +(number%10);
            number /=10;
        }
        System.out.println("The sum of the digits in "+displayNumber+" is "+sum);
    }
    // 6. WAP to find whether a given no is prime or not
    public static void primeOrNot(){
        System.out.println("Enter a number to find whether it is prime or not");
        int checkNum = input.nextInt();
        int primeCounter = 0;
        for(int i=2;i<=checkNum;i++){
            if(checkNum%i==0){
                primeCounter++;
            }
        }
        if(primeCounter==1){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    /*7. WAP that divide a given no. as follows
        Eg: input is 1234567
        First no 1357
        Second no 246
        And find which no is large */
    public static void oddEvenDigits(){
        System.out.println("Enter the number");
        int number = input.nextInt();
        int oddDigits = 0,evenDigits = 0;
        int storeNumber = number;
        int revNumber = 0;
        int count = 0;
        while(number!=0){
            revNumber = revNumber*10 + (number%10);
            number /= 10;
            count++;
        }
        number = storeNumber;
        while(count!=0){
            if((count%2)==0){
                oddDigits = oddDigits*10 + (revNumber%10);
            }else{
                evenDigits = evenDigits*10 + (revNumber%10);
            }
            revNumber /=10;
            count--;
        }
        System.out.println("First no. "+oddDigits);
        System.out.println("Second no. "+evenDigits);
        if(oddDigits>evenDigits)
            System.out.println("The highest number is "+oddDigits);
        else if(evenDigits>oddDigits)
            System.out.println("The highest number is "+evenDigits);
        else
            System.out.println("Both are equal");
    }
    // 8. WAP to convert Fahrenheit to celsius and vice versa
    public static void fahrenheitAndCelsius(){
        System.out.println("Select the options given below: ");
        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");
        byte option = input.nextByte();
        double temp;
        switch(option){
            case 1: System.out.println("Enter Fahrenheit temperature");
                    temp = input.nextDouble();
                    System.out.println("Celsius temperature is "+((temp-32)*5/9));
                    break;

            case 2: System.out.println("Enter Celsius temperature");
                    temp = input.nextDouble();
                    System.out.println("Fahrenheit temperature is "+(((9*temp)/5)+32));
                    break;

            default: System.out.println("Invalid option");
                    break;
        }
    }
    // 9. WAP to display grade based on number obtain using if-else-if ladder
    public static void gradeDisplay(){
        System.out.println("Enter your marks to display the grade");
        int marks = input.nextInt();
        if(marks>=90){
            System.out.println("Grade: A+");
        }else if(marks>=80&&marks<90){
            System.out.println("Grade: A");
        }else if(marks>=70&&marks<80){
            System.out.println("Grade: B");
        }else if(marks>=60&&marks<70){
            System.out.println("Grade: C");
        }else if(marks>=50&&marks<60){
            System.out.println("Grade: D");
        }else if(marks>=40&&marks<50){
            System.out.println("Grade: E");
        }else if(marks<40){
            System.out.println("Grade: F");
        }else{
            System.out.println("Invalid marks");
        }
    }
    // 10. WAP to find a given number is even or odd
    public static void evenOdd(){
        System.out.println("Enter the number to find if it is even or odd");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("The number "+number+" is even");
        }else{
            System.out.println("The number "+number+" is odd");
        }
    }
    // 11. WAP to find a given no is palindrome or not
    public static void palindromeCheck(){
        System.out.println("Enter a number to check if it is a palindrome or not");
        int number = input.nextInt();
        int storeNumber = number;
        int revNumber = 0;
        while(number!=0){
            revNumber = revNumber*10 + (number%10);
            number /= 10;
        }
        if(storeNumber==revNumber){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    // 12. WAP to find a given no is armstrong or not
    public static void armstrongCheck(){
        System.out.println("Enter a number to check if it a armstrong");
        int number = input.nextInt();
        int storeNumber = number;
        int digitCounter = 0, sum = 0;
        while(number!=0){
            number /= 10;
            digitCounter++;
        }
        number = storeNumber;
        if(digitCounter==1){
            System.out.println("It's not Armstrong\nAll single digit numbers are Armstrong numbers");
        }else if(digitCounter==2){
            System.out.println("It's not Armstrong\nThere are no 2-digit Armstrong numbers");
        }else{
            while(number!=0){
                int digit = number%10;
                int product = 1;
                // Alternatively Math.pow can be used
                for(int i = 1;i<=digitCounter;i++){
                    product *= digit;
                }
                sum += product;
                number /= 10;
            }
            if(sum==storeNumber)
                System.out.println("It is Armstrong");
            else
                System.out.println("It is not Armstrong");
        }
    }
    // 13. WAP to perform arithmetic operation on 2 number based on user choice by using switch case
    public static void arithmeticOperations(){
        System.out.println("Select the options given below");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for Division");
        byte choice = input.nextByte();
        double num1,num2;
        switch(choice){
            case 1: System.out.println("Enter the first number");
                    num1 = input.nextDouble();
                    System.out.println("Enter the second number");
                    num2 = input.nextDouble();
                    System.out.println(num1+" + "+num2+ " = "+(num1+num2));
                    break;

            case 2: System.out.println("Enter the first number");
                    num1 = input.nextDouble();
                    System.out.println("Enter the second number");
                    num2 = input.nextDouble();
                    System.out.println(num1+" - "+num2+" = "+(num1 - num2));
                    break;

            case 3: System.out.println("Enter the first factor");
                    num1 = input.nextDouble();
                    System.out.println("Enter the second factor");
                    num2 = input.nextDouble();
                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                    break;
            
            case 4: System.out.println("Enter the dividend");
                    num1 = input.nextDouble();
                    System.out.println("Enter the divisor");
                    num2 = input.nextDouble();
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    break;

            default: System.out.println("Invalid option");
        }
    }
    public static void delay3Sec(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static void delay6Sec(){
        try{
            TimeUnit.SECONDS.sleep(6);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    // 14. WAP to demonstrate the use of break and continue with label.
    public static void breakContinue(){
        int counter = 0;
        System.out.println("We are demonstrating break with and without labels now");
        delay3Sec();
        outerLoop:
        while(true){
            System.out.println("We are in the outer loop");
            delay3Sec();
            System.out.println("We will be entering the inner loop");
            delay3Sec();
            innerLoop:
            while(true){
                System.out.println("We are in the inner loop");
                delay3Sec();
                if(counter==0){
                    System.out.println("In 6 seconds we will see where does break without label take us");
                    delay6Sec();
                    counter++;
                    break;
                }
                else{
                    System.out.println("In 6 seconds we will see where does break with label take us");
                    delay6Sec();
                    counter++;
                    break outerLoop;
                }
            }
        }
        counter=0;
        System.out.println("We are no longer in a loop");
        delay3Sec();
        System.out.println("We are demonstrating continue with and without labels");
        delay3Sec();
        outer:
        while(true){
            System.out.println("We are in outer loop");
            delay3Sec();
            System.out.println("We will be entering the inner loop");
            delay3Sec();
            inner:
            while(true){
                System.out.println("We are in inner loop");
                delay3Sec();
                if(counter==0){
                    System.out.println("In 6 seconds we will see where does continue without label take us");
                    counter++;
                    delay6Sec();
                    continue;
                }
                else if(counter==1){
                    System.out.println("In 6 seconds we will see where does contine with label take us");
                    counter++;
                    delay6Sec();
                    continue outer;
                }else{
                    System.out.println("Exiting the loop. End of demonstration");
                    break outer;
                }
            }
        }
    }
    // 15. WAP to execute expressions
    public static void expressionsTest(){
        byte a = 10;
        a = (byte)(a+10); //casting the whole expression to byte
        
        short b = 15;
        int c = b/(int)3.0;//casting the 3.0 to int

        double  d = 12.9;
        float e =(float)(d/3.5);//casting the whole expression to float
    }
    public static void main(String[] args){
        System.out.println("Select the options below");
        System.out.println("Press 1 to find the nth term of fibonacci series");
        System.out.println("Press 2 to find x^y");
        System.out.println("Press 3 to find the nth prime no. starting after x");
        System.out.println("Press 4 to print table of x starting from 1 to y");
        System.out.println("Press 5 to find the sum of digits of a given number");
        System.out.println("Press 6 to find whether a given no is prime or not");
        System.out.println("Press 7 that divide the digits to odd and even");
        System.out.println("Press 8 to convert Fahrenheit to celsius and vice versa");
        System.out.println("Press 9 to display grade based on number obtain using if-else-if ladder");
        System.out.println("Press 10 to find a given number is even or odd");
        System.out.println("Press 11 to find a given no is palindrome or not");
        System.out.println("Press 12 to find a given no is armstrong or not");
        System.out.println("Press 13 to perform arithmetic operation on 2 number based on user choice by using switch case");
        System.out.println("Press 14 to demonstrate the use of break and continue with label.");
        System.out.println("Press 15 to execute expressions");
        byte choice = input.nextByte();
        switch(choice){
            case 1: Fibonacci();
                    break;
            
            case 2: power();
                    break;
            
            case 3: nthPrimeNumber();
                    break;

            case 4: multiplierTable();
                    break;

            case 5: digitSum();
                    break;

            case 6: primeOrNot();
                    break;

            case 7: oddEvenDigits();
                    break;

            case 8: fahrenheitAndCelsius();
                    break;

            case 9: gradeDisplay();
                    break;

            case 10:evenOdd();
                    break;

            case 11:palindromeCheck();
                    break;

            case 12:armstrongCheck();
                    break;

            case 13:arithmeticOperations();
                    break;

            case 14:breakContinue();
                    break;

            case 15:expressionsTest();
                    System.out.println("Expressions resolved");
                    break;
            
            default:System.out.println("Invalid option");
        }
    }
}