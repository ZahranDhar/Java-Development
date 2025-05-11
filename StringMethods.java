public class StringMethods {

    public static void main(String[] args)
    {
        String name= "Zahran";
        String fruit= "Cherry";

        int length= name.length();   // return length

        char ch=name.charAt(5);  //return char at index

        int firstIndex=name.indexOf(" ");   //return first index of char
        int lastIndex=name.lastIndexOf("ah");   //return last index of char

        name=name.toUpperCase();    //return with uppercase
        name=name.toLowerCase();   //return with lower case
        name=name.trim();   //return with no spaces at start
        name=name.replace("ah","om");   //return with replaced characters

        boolean isEmpty=name.isEmpty();   //return true if empty(pointer)
        boolean contains=name.contains("an");   //return true if contains substring
        boolean isEqual=name.equals(fruit);   //return true if strings equal (case-sensitive)
        boolean isEqualCaseInsensitive=name.equalsIgnoreCase("zomran");   //return true if strings equal (Not case-sensitive)

        String substring=name.substring(0,3);   //return substring with start(inclusive) and end(exclusive) indices


        System.out.println(firstIndex);

        return;
    }
}
