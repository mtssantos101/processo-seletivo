package src;

public class number5 {
    public static void main(String[] args) {
        String original = "exemplo";
        String invertida = inverterString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida = invertida + str.charAt(i);
        }

        return invertida;
    }
}
