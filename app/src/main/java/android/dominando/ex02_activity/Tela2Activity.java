package android.dominando.ex02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView txtTexto = (TextView) findViewById(R.id.txtTexto);

        Intent it = getIntent();

        Cliente cliente = it.getParcelableExtra("cliente");

        if (cliente != null) {
            String texto = String.format("Nome: %s / Codigo: %d", cliente.nome, cliente.codigo);
            txtTexto.setText(texto);

        } else {
            String nome = it.getStringExtra("nome");
            int idade = it.getIntExtra("idade", -1);

            txtTexto.setText(String.format("Nome: %s / Idade: %d", nome, idade));
        }

        Log.i("NGVL", "Tela2:onCreate");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("NGVL", "Tela2:onPause");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("NGVL", "Tela2:onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i("NGVL", "Tela2:onStop");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("NGVL", "Tela2:onRestart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("NGVL", "Tela2:onDestroy");
    }
}
