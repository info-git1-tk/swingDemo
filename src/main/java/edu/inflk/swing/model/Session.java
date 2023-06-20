package edu.inflk.swing.model;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Session {

    protected static HashMap<String, String> post = new HashMap<>();

    private static final Charset UTF_8 = StandardCharsets.UTF_8;
    private static final String OUTPUT_FORMAT = "%-20s:%s";

    public static void set(String key, String value){
        post.put(key,value);
    }

    public static String get(String key){
        if(post.containsKey(key)){
            String string = post.get(key);
            post.remove(key);
            return string;
        }
        return null;
    }

    public static String copy(String key){
        if(post.containsKey(key)){
            return post.get(key);
        }
        return null;
    }

    public static void destroySession(){
        Session.post = new HashMap<>();
    }

}
