package LAB.LAB_6;
public class VowelChecker {
    public static void main(String[] args) throws NoVowelsException {
        System.out.println("Kaki Lahari Rohith 23WU0102103");
        String str = "Hello";
        checkForVowels(str);
    }

    public static void checkForVowels(String str) throws NoVowelsException {
        if (str.matches(".*[aeiouAEIOU].*")) {
            System.out.println("String contains vowels.");
        } else {
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
