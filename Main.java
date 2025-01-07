public class Main {
    public static void main(String[] args) {


        //N1

        String name ="Amir";
        System.out.println(name);
//N2

        String FirstName = "Amir ";
        String LastName = "Shuxratov ";
        String DadName = "Furqatovich";
        System.out.println(LastName+FirstName+DadName);

    //    N3
            for(int i = 46; i<=56; i++){
                System.out.println(i);
            }
  //      N4

        for(int i = 34; i<=78; i++) {
            System.out.println(i+""+""+"");
        }

//Format

        String firstNAme="Amir";
        String country = "uzbekistan";
       String lastName = "Shuxartov";
        int age= 15;
        String company = "Solo";
        char percentSign = '%';

        String formatString = String.format("my name is %s. I am from %s. I am %s. years old. I am work %s;",
        firstNAme,country,age,company,percentSign);

        System.out.println(formatString);


//Uppercase and Lowercase
        String Amir = "Amir Shuxratov";
        System.out.println(Amir.toUpperCase());
        System.out.println(Amir.toLowerCase());

      //  Tengliklar
        String string1 = "amir";
        String string2 = "amir";
        System.out.println(string1 == string2);
    }
}
