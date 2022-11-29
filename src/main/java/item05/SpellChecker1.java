package item05;

import java.util.List;

public class SpellChecker1 {

    private final Lexicon dictionary = new KoreanDicationry();

    private SpellChecker1() {
    }

    public static final SpellChecker1 INSTANCE = new SpellChecker1() {};

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }


    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

}

