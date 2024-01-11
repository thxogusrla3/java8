package hash;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        HashMap<String, String> hash1 = new HashMap<>();

        hash.put("test", hash.getOrDefault("1", "qqq"));
        hash.put("test1", hash.getOrDefault("2", "qqq"));
        hash.put("test", "zzz");

        hash1.put("test", hash1.getOrDefault("1", "qqq"));
        hash1.put("test1", hash1.getOrDefault("2", "qqq"));
        hash1.put("test", "zzz");


        System.out.println(hash.get("test"));
    }
}
