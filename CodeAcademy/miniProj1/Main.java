
public class Main{
  public static void main(String[] args) {    
    String myString = "peter";

    System.out.println(myString.compareToIgnoreCase("peter"));
    System.out.println(myString.equals("peter"));

    System.out.println(Math.cos(Math.PI));

    System.out.println(Math.asin(0.5));

    System.out.println(Math.rint(3.6));

    char c = 'b';
    System.out.println(c);

    String Select = "Select";

    char f = Select.charAt(myString.length());
    System.out.println(f);
    
    System.out.println(Math.rint(3.5));

    Character x = new Character('a');
    System.out.println(x);

    
    System.out.println(x.equals(new Character('a')));

    
    System.out.println(x.equals("a"));

    System.out.println("AbA".compareToIgnoreCase("abC"));


    System.out.println((char)4);
}
}