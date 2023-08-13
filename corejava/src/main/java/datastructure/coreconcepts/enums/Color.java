package datastructure.coreconcepts.enums;

public enum Color {
    RED, GREEN, BLUE, BLACK;
    Color(){
        System.out.println("Constructor called for "+this.toString());
    }

    public static void main(String[] args) {
        for (Color c:Color.values()) {
            System.out.println(c+" at i ndex : "+ c.ordinal());
        }
    }
}
