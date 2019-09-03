package iuh.baitap.tk1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextA, editTextB, editTextC;
    TextView textViewResult;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a, b, c;
                try {
                    a = Double.parseDouble(editTextA.getText().toString().trim());
                } catch (Exception ex) {
                    a = 0.0d;
                }
                try {
                    b = Double.parseDouble(editTextB.getText().toString().trim());
                } catch (Exception ex) {
                    b = 0.0d;
                }
                try {
                    c = Double.parseDouble(editTextC.getText().toString().trim());
                } catch (Exception ex) {
                    c = 0.0d;
                }

                PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(a, b, c);
                textViewResult.setText(ptb2.caculate());
            }
        });
    }

    private void addControls() {
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        editTextC = findViewById(R.id.editTextC);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);
    }
}
