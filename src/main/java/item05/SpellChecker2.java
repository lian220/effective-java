package item05;

import java.util.List;
import java.util.Objects;

public class SpellChecker2 {

    private final Lexicon2 dictionary;

    public SpellChecker2(Lexicon2 dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

}

class Lexicon2 {}
