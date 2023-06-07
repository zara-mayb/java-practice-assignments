import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("happy birthday", "to you");
        songMap.put("alphabet", "abcdefghijklmnop");
        songMap.put("twinkle twinkle", "little star");
        songMap.put("ring around", "the rosey");
        System.out.println(songMap.get("alphabet"));
        for(String key: songMap.keySet()){
            System.out.println(String.format("track: %s, lyrics: %s", key, songMap.get(key)));
        }
    }
}