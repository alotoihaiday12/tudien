public class main {

    public static void main(String[] args){
        Word word = new Word();
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromCommandline();
        for (int i = 0 ; i <= dictionary.n;  i++){
            System.out.println(dictionary.words[i].word_target);
        }
    }
}
