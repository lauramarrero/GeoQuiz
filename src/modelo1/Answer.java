package modelo1;

import com.bignerdranch.android.geoquiz.R;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class Answer {
    private int incorrect;
    private int correct;

    public Answer() {
        setCorrect(R.string.correct_toast);
        setIncorrect(R.string.incorrect_toast);
    }

    public int getIncorrect() {
        return incorrect;
    }

    private void setIncorrect(int answer) {
        incorrect = answer;
    }

    public int getCorrect() {
        return correct;
    }

    private void setCorrect(int answer) {
        correct = answer;
    }

}
