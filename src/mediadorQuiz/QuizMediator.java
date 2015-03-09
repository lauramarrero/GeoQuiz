package mediadorQuiz;

import android.app.Application;
import controladorQuiz.IQuizController;
import controladorQuiz.QuizController;
import modeloQuiz.QuizModel;
import vistaQuiz.IQuizView;
import vistaQuiz.QuizViewActivity;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class QuizMediator extends Application implements IQuizMediator {


    @Override
    public IQuizController getQuizController(IQuizView view) {

        if(view instanceof QuizViewActivity) { //todo
            //return new QuizController(view);
            return new QuizController(view, new QuizModel());
        }
        return null;
    }

}
