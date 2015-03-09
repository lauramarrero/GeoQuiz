package modeloQuiz;

import com.bignerdranch.android.geoquiz.R;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class QuizModel implements IQuizModel {

    private int currentIndex;
    private Answer answer;
    private TrueFalse[] answerKey;

    public QuizModel() {
        currentIndex = 0;
        answer = new Answer();
        answerKey = new TrueFalse[] {
                new TrueFalse(R.string.question_oceans, true),
                new TrueFalse(R.string.question_mideast, false),
                new TrueFalse(R.string.question_africa, false),
                new TrueFalse(R.string.question_americas, true),
                new TrueFalse(R.string.question_asia, true)
        };
    }

    public TrueFalse[] getAnswerKey(){
        return this.answerKey;
    }

    @Override
    public boolean isTrueQuestion() {
        return answerKey[currentIndex].isTrueQuestion();
    }


    @Override
    public int getAnswer(boolean questionIsCorrect) {
        if(questionIsCorrect) {
            return answer.getCorrect();
        } else {
            return answer.getIncorrect();
        }
    }

    @Override
    public void setNextQuestion() {
        currentIndex = (currentIndex + 1) % answerKey.length;
    }

    @Override
    public void setPreviousQuestion() {
        if(currentIndex==0){
            currentIndex = answerKey.length - 1;
        }else{
            currentIndex = (currentIndex - 1) % answerKey.length;
        }
    }

    @Override
    public void setCheat(){
       //Falta por implementar.
    }

    @Override
    public int getCurrentQuestion() {
        return answerKey[currentIndex].getQuestion();
    }
}

