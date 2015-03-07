package mediador1;

import android.app.Application;
import controlador1.IQuizController;
import controlador1.QuizController;
import modelo1.QuizModel;
import vista1.IQuizView;
import vista1.QuizViewActivity;

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
