import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    Random rando = new Random();
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomTen = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            randomTen.add(rando.nextInt(20)+ 1);
        }
        return randomTen;
    }
    public String getRandomLetter(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for(int i = 0; i < 26; i++){
            alphabet[i] = String.valueOf(letters.charAt(i));
        }
        return alphabet[rando.nextInt(26)];
    }
    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}