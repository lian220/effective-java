package act1.item05;

import java.util.List;
import java.util.Objects;

public class SpellChecker3 {

    private final Lexicon dictornary;


    public SpellChecker3(Lexicon dictornary) {
        this.dictornary = Objects.requireNonNull(dictornary);
    }

    public boolean isValid(String word) {throw new UnsupportedOperationException();};

    public List<String> suggestions(String typo) {throw new UnsupportedOperationException();};

    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDicationry();
        SpellChecker3 spellChecker3 = new SpellChecker3(lexicon);
        spellChecker3.isValid("hello");
    }
}
