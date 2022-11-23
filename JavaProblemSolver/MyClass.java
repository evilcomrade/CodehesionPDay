public class MyClass {
    public static void main(String args[]) {
      Letter a = new Letter("a");
      Letter b = a.getNext();
      Letter z = a.getPrev();

      //System.out.println("a" + a.getLetter() + "b" + b.getLetter() + "z" +z.getLetter());
      
      spinner mySpinner = new spinner();
      System.out.println(mySpinner.getTime("deez"));
    }
}