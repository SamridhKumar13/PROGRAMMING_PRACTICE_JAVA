public class StringFunctions {
    

    public static void main(){

String str = "Samridh";
System.out.println( str.length());
System.out.println(str.charAt(0));
String name = "SAMRIDH";
System.out.println(str.equals(name));
System.out.println(str.equalsIgnoreCase(name));
 

//? Empty -> length=0
//? blank -> empty or sirf Spaces hai String me

String abc= "";
System.out.println(abc.length());
System.out.println(abc.isEmpty());
System.out.println(abc.isBlank());


String xyz= "  Samridh  ";
System.out.println( xyz.trim());
System.out.println(xyz.toUpperCase());
System.out.println(xyz.toLowerCase());


//? Substring 
String  bcd =" My name is Samridh Kumar ";
//?  SubString is used to print a new string from an existing string 
System.out.println(bcd.substring(3,8));

//?  .contains()  ->  check that the given character is belonging or not 
System.out.println(bcd.contains("i"));

int number = 10;
String test= String.valueOf(number);//? String.valueof() is used to change the data type 
System.out.println(number +1);
System.out.println(test + 1); //? now its a string so it will be concatinated.

}
}
