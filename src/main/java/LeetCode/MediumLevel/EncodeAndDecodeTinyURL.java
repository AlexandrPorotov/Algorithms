package LeetCode.MediumLevel;

import java.util.HashMap;

//TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and
// it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.
//
//There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a
// URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
//
//Implement the Solution class:
//
//Solution() Initializes the object of the system.
//String encode(String longUrl) Returns a tiny URL for the given longUrl.
//String decode(String shortUrl) Returns the original long URL for the given shortUrl.
// It is guaranteed that the given shortUrl was encoded by the same object.
//https://leetcode.com/problems/encode-and-decode-tinyurl/
public class EncodeAndDecodeTinyURL {

    private static final HashMap<String, String> tokenMapForUrl = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        EncodeAndDecodeTinyURL encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();
        String one = encodeAndDecodeTinyURL.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println(one);
        String two = encodeAndDecodeTinyURL.decode(one);
        System.out.println(two);

    }


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        char[] code = new char[6];
        for(int i = 0; i <= code.length-1; i++){
            code[i] = chars.charAt((int) (Math.random() * 62));
        }

        String token = String.valueOf(code);

        tokenMapForUrl.put(token,longUrl);

        return "https://tinyurl.com/" + token;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        String token = shortUrl.replace("https://tinyurl.com/", "");
        if(tokenMapForUrl.containsKey(token)) {
            return tokenMapForUrl.get(token);
        }
        return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
