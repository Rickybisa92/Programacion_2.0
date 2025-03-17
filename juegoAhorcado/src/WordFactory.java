public interface WordFactory {
    Word makeWord();

}

class DefaultWordFactory implements WordFactory {
    public Word makeWord() {
        Word word = new Word("LICEU");
        return word;
    }
}


class DictWordFactory implements WordFactory {
    static String[] words = {
            "LICEU",
            "CARROSSA",
            "TAULA",
            "ESTERNOCLEIDOMASTOIDEO",
            "ASFALT",
            "VERMELL"
    };
    @Override
    public Word makeWord() {
        int index = (int) (Math.random() * words.length);
        Word word = new Word(words[index]);
        return word;
    }
}