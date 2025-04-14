import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secret = 245;
        String name;

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Please enter the secret number:");
        int number = GetIntSafe(scanner);

        while (number != secret) {
            System.out.println("Wrong, try again:");
            number = GetIntSafe(scanner);
        }

        System.out.println("Correct, welcome to the Caesar Cipher");
        RunCaesar(scanner);
        System.out.println("Thank you for your time taken!");

        scanner.close();
    }

    public static void RunCaesar(Scanner s) {
        int key;
        System.out.println("Please enter your desired key for the cipher:");
        key = GetIntSafe(s);
        RunDecryptEncryptPipeline(s, key);
    }

    public static void RunDecryptEncryptPipeline(Scanner s, int key){
        System.out.println("Please enter whether you want to encrypt/decrypt your message:");
        System.out.println("(allowed Values: [Encrypt] [Decrypt], case insensitive )");
        
        String choice = s.nextLine();

        if(choice.equalsIgnoreCase("encrypt")){
            EncryptMSG(s, key);
        }
        else if (choice.equalsIgnoreCase("decrypt")){
            DecryptMSG(s, key);
        }
        else{
            System.out.println("Wrong value!");
            RunDecryptEncryptPipeline(s, key);
        }
    }

    public static void EncryptMSG(Scanner s, int key ){
        String message;
        System.out.println("Thank you. Please enter your desired message to return encrypted:");
        message = s.nextLine();
        System.out.println("Thank you for your cooperation, your encrypted value is:");
        System.out.println(GetEncryptedMessage(key, message));
    }
    public static void DecryptMSG(Scanner s, int key ){
        String message;
        System.out.println("Thank you. Please enter your desired message to return decrypted:");
        message = s.nextLine();
        System.out.println("Thank you for your cooperation, your decrypted value is:");
        System.out.println(GetDecryptedMessage(key, message));
    }
    public static String GetEncryptedMessage(int key, String message) {
        StringBuilder res = new StringBuilder();
        char buffer;
        for (int i = 0; i < message.length(); i++) {
            buffer = (char) ((int) message.charAt(i) + key);
            res.append(buffer);
        }
        return res.toString();
    }
    public static String GetDecryptedMessage(int key, String message) {
        StringBuilder res = new StringBuilder();
        char buffer;
        for (int i = 0; i < message.length(); i++) {
            buffer = (char) ((int) message.charAt(i) - key);
            res.append(buffer);
        }
        return res.toString();
    }

    public static int GetIntSafe(Scanner s) {

        try {
            int number = Integer.parseInt(s.nextLine());
            return number;
        } catch (Exception e) {
            System.out.println("Incorrect. Please enter a valid integer value:");
            return GetIntSafe(s);
        }
    }
}