package android.dominando.ex02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Button buttonTela2 = (Button) findViewById(R.id.button2);
        Button buttonTela3 = (Button) findViewById(R.id.button3);

        // Setando evento onclick
        button.setOnClickListener(this);
        buttonTela2.setOnClickListener(this);
        buttonTela3.setOnClickListener(this);

        Log.i("NGVL", "Tela1:onCreate");

    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("NGVL", "Tela1:onPause");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("NGVL", "Tela1:onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i("NGVL", "Tela1:onStop");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("NGVL", "Tela1:onRestart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("NGVL", "Tela1:onDestroy");
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button:
                String texto = edtTexto.getText().toString();
                Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Intent it = new Intent(this, Tela2Activity.class);
                it.putExtra("nome", "Paulo");
                it.putExtra("idade", 29);
                startActivity(it);
                break;
            case R.id.button3:
                Cliente cliente = new Cliente(1,"Paulo Edson");
                Intent it2 = new Intent(this, Tela2Activity.class);
                it2.putExtra("cliente", cliente);
                startActivity(it2);
                break;
        }
    }
}
