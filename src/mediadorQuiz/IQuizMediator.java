package mediadorQuiz;

import controladorQuiz.IQuizController;
import vistaQuiz.IQuizView;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public interface IQuizMediator {
    public IQuizController getQuizController(IQuizView view);

}
