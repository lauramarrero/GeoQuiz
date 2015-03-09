package controladorQuiz;

import modeloQuiz.IQuizModel;
import vistaQuiz.IQuizView;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class QuizController implements IQuizController {


    private IQuizView view;
    private IQuizModel model;

    public QuizController(IQuizView v, IQuizModel m) {
        view = v;
        model = m;
    }

    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = model.isTrueQuestion();
        view.setAnswer(model.getAnswer(userPressedTrue == answerIsTrue));
    }

    @Override
    public void clickTrueButton() {
        checkAnswer(true);
    }

    @Override
    public void clickFalseButton() {
        checkAnswer(false);
    }

    @Override
    public void clickNextButton() {
        model.setNextQuestion();
        view.setQuestion(model.getCurrentQuestion());
    }

    @Override
    public void clickPreviousButton() {
        model.setPreviousQuestion();
        view.setQuestion(model.getCurrentQuestion());
    }

    @Override
    public void clickCheatButton() {
        model.setCheat(); //Falta por implementar setCheat() de la clase modelo.

    }

    @Override
    public void startQuiz() {
        view.setQuestion(model.getCurrentQuestion());
    }
}

