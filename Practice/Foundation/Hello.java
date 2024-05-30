package Foundation;

class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Integer variables
        int num1 = 2;
        int num2 = 4;
        System.out.println(num1+num2);
        
        
        // Primitive Data
        float percentage = 83.5f;
        double precentile = 86.2322323;
        System.out.println(percentage);
        System.out.println(precentile);

        boolean isLogedIn = true;
        System.out.println("isLogedIN :- "+isLogedIn);

        byte c = 127;
        int a = c;
        System.out.println("c :- "+c);

        int b  = 257;
        byte v = (byte)b;  // 257 % 256 = 1 
        System.out.println("v :- "+v);

        int d = 300;
        byte g = (byte)d;   // 300 % 256 =  44
        System.out.println("g :- "+g);
        

        // Switch 

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not valid Input");
                break;
        }
        

        // Updated Switch

        String week_day = "Sunday";
        
        switch(week_day){
            case "Sunday","Saturday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        // updated switch

        String e = "Sunday";
        String result = "";        
        
        result = switch(e){
            case "Sunday","Saturday" : yield  "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };
        
        System.out.println(result);

        // LOOPS

        // While loop

        int counter = 0;
        while (counter < 5) {
            System.out.println("Hi" + counter);
            counter++;
        }
    }

    

}