package au.edu.jcu.cp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view) {

        EditText text = findViewById(R.id.editText2);
        String textValue = text.getText().toString();

        int guess = Integer.parseInt(textValue);

        if (game.check(guess)) {
            Context context = getApplicationContext();
            CharSequence correctText = "You Guessed Correctly!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, correctText, duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            Context context = getApplicationContext();
            CharSequence incorrectText = "Your Guess was Incorrect!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, incorrectText, duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}
