package modeloQuiz;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public interface IQuizModel {
    public boolean isTrueQuestion();
    public int getAnswer(boolean trueQuestion);
    public void setNextQuestion();
    public void setPreviousQuestion();
    public int getCurrentQuestion();
}
