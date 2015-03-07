package vista1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.bignerdranch.android.geoquiz.R;
import controlador1.IQuizController;
import mediador1.IQuizMediator;

/**
 * Created by JuanPablo on 07/03/2015.
 */
public class QuizViewActivity extends Activity implements IQuizView {

    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private Button previousButton;
    private Button cheatButton;
    private TextView questionTextView;

    private IQuizMediator mediator;
    private IQuizController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mediator = (IQuizMediator) getApplication();
        controller = mediator.getQuizController(this);

        setContentView(R.layout.activity_quiz);

        questionTextView = (TextView)findViewById(R.id.question_text_view);

        trueButton = (Button)findViewById(R.id.true_button);
        trueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickTrueButton();
            }
        });

        falseButton = (Button)findViewById(R.id.false_button);
        falseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickFalseButton();
            }
        });

        nextButton = (Button)findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickNextButton();
            }
        });

        previousButton = (Button)findViewById(R.id.prev_button);
        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickPreviousButton();
            }
        });

        cheatButton = (Button)findViewById(R.id.cheat_button);
        cheatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickCheatButton(); //Falta por implementar el clickCheatButton(); del controlador.
            }
        });

        controller.startQuiz();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_quiz, menu);
        return true;
    }

    @Override
    public void setAnswer(int answer) {
        Toast.makeText(QuizViewActivity.this, answer, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setQuestion(int question) {
        questionTextView.setText(question);
    }

}
