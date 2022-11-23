public class Letter{
    private String letter;
    private Letter next;
    private Letter prev;

    public Letter(String in) {
        letter = in;
    }

    public Letter getNext(){
        if(letter.equals("a")) {
            return new Letter("b");
        }else if (letter.equals("b")) {
            return new Letter("c");
        }else if (letter.equals("c")) {
            return new Letter("d");
        }else if (letter.equals("d")) {
            return new Letter("e");
        }else if (letter.equals("e")) {
            return new Letter("f");
        }else if (letter.equals("f")) {
            return new Letter("g");
        }else if (letter.equals("g")) {
            return new Letter("h");
        }else if (letter.equals("h")) {
            return new Letter("i");
        }else if (letter.equals("i")) {
            return new Letter("j");
        }else if (letter.equals("j")) {
            return new Letter("k");
        }else if (letter.equals("k")) {
            return new Letter("l");
        }else if (letter.equals("l")) {
            return new Letter("m");
        }else if (letter.equals("m")) {
            return new Letter("n");
        }else if (letter.equals("n")) {
            return new Letter("o");
        }else if (letter.equals("o")) {
            return new Letter("p");
        }else if (letter.equals("p")) {
            return new Letter("q");
        }else if (letter.equals("q")) {
            return new Letter("r");
        }else if (letter.equals("r")) {
            return new Letter("s");
        }else if (letter.equals("s")) {
            return new Letter("t");
        }else if (letter.equals("t")) {
            return new Letter("u");
        }else if (letter.equals("u")) {
            return new Letter("v");
        }else if (letter.equals("v")) {
            return new Letter("w");
        }else if (letter.equals("w")) {
            return new Letter("x");
        }else if (letter.equals("x")) {
            return new Letter("y");
        }else if (letter.equals("y")) {
            return new Letter("z");
        }else if (letter.equals("z")) {
            return new Letter("a");
        } else {
            System.out.println("Enter a valid char");
            return null;
        }
    }

    public Letter getPrev(){
        if(letter.equals("a")) {
            return new Letter("z");
        }else if (letter.equals("b")) {
            return new Letter("a");
        }else if (letter.equals("c")) {
            return new Letter("b");
        }else if (letter.equals("d")) {
            return new Letter("c");
        }else if (letter.equals("e")) {
            return new Letter("d");
        }else if (letter.equals("f")) {
            return new Letter("e");
        }else if (letter.equals("g")) {
            return new Letter("f");
        }else if (letter.equals("h")) {
            return new Letter("g");
        }else if (letter.equals("i")) {
            return new Letter("h");
        }else if (letter.equals("j")) {
            return new Letter("i");
        }else if (letter.equals("k")) {
            return new Letter("j");
        }else if (letter.equals("l")) {
            return new Letter("k");
        }else if (letter.equals("m")) {
            return new Letter("l");
        }else if (letter.equals("n")) {
            return new Letter("m");
        }else if (letter.equals("o")) {
            return new Letter("n");
        }else if (letter.equals("p")) {
            return new Letter("o");
        }else if (letter.equals("q")) {
            return new Letter("p");
        }else if (letter.equals("r")) {
            return new Letter("q");
        }else if (letter.equals("s")) {
            return new Letter("r");
        }else if (letter.equals("t")) {
            return new Letter("s");
        }else if (letter.equals("u")) {
            return new Letter("t");
        }else if (letter.equals("v")) {
            return new Letter("u");
        }else if (letter.equals("w")) {
            return new Letter("v");
        }else if (letter.equals("x")) {
            return new Letter("w");
        }else if (letter.equals("y")) {
            return new Letter("x");
        }else if (letter.equals("z")) {
            return new Letter("y");
        } else {
            System.out.println("Enter a valdi char");
            return null;
        }
    }
    
    public String getLetter(){
        return letter;
    }
}