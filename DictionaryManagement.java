import java.util.Scanner;

public class DictionaryManagement {

    public DictionaryManagement() {
    }

    public void insertFromCommandline() {

        Word word = new Word();
        System.out.print("Nhap vao ban phim so tu muon dich: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        System.out.print("Nhap vao " + n + " tu ban muon dich: ");
        for (int i = 0; i <= n; i++) {
            String word_target;
            word_target = sc.nextLine();
            word.setWord_target(word_target);



        }


    }
}