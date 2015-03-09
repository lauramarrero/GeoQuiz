package modeloQuiz;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class TrueFalse {
    private int question;
    private boolean trueQuestion;

    public TrueFalse(int q, boolean tq) {
        setQuestion(q);
        setTrueQuestion(tq);
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int q) {
        question = q;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setTrueQuestion(boolean tq) {
        trueQuestion = tq;
    }


}
