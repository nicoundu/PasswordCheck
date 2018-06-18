package cl.pingon.passwordcheck;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PasswordCallback {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.inputEt);

        textView = findViewById(R.id.validationTv);

        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = editText.getText().toString();

                new PasswordValidator(MainActivity.this).validation(pass);

            }
        });

    }


    @Override
    public void correct(String pass) {
        textView.setText(pass);

    }

    @Override
    public void incorrect() {

        Toast.makeText(this, "El password debe tener minimo 8 caracteres", Toast.LENGTH_SHORT).show();

    }
}
