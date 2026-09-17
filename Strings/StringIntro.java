
//? What is a string ?
//? String is a sequence of characters and  its non primitive 
//? Strings are immutable in nature 
public class StringIntro {
    public static void main(String[] args) {
        //? creation of String 
        String firstname="Samridh";
        String lastname="Kumar";
        //? creation of string using new keyword
        String str=new String("Sam");

        System.out.println( str);
        System.out.println("Full Name: "+firstname+" "+ lastname);
        System.out.println( "Length of the String  firstname: "+firstname.length()); //? gives the length of the string 
        System.out.println("The Char present in the index number 2 is : "+lastname.charAt(2)); //? gives the element at given index 
      


        
    }


    
}
