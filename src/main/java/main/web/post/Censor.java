package main.web.post;

public class Censor {
    public static final String[] BAD_WORDS = {"cholera", "motyla noga", "kurczaki", "niech to dunder świśnie"};

    public static String doCensor(String toBeCensored){
        String result = toBeCensored; //cholera, znowu ta JAVA
        for(String word : BAD_WORDS){
            result = result.replaceAll(word, "*".repeat(word.length()));
        }
        return result;
    }
}
