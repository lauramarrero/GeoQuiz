package mediador1;

import controlador1.IQuizController;
import vista1.IQuizView;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public interface IQuizMediator {
    public IQuizController getQuizController(IQuizView view);

}
