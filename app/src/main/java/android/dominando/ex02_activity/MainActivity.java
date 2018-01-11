package android.dominando.ex02_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando com XML
        edtTexto = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        // Setando evento onclick
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String texto = edtTexto.getText().toString();
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
    }
}
