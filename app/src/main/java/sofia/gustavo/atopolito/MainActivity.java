package sofia.gustavo.atopolito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroi interface grafica do arquivo principal

        Button btn_enviar = findViewById(R.id.btn_enviar); //obtem dados do botao enviar
        btn_enviar.setOnClickListener(new View.OnClickListener() {//configura botao, define o que acontece ao clicar
            @Override
            public void onClick(View v) { //quando houver clique, é executado; v = botãohhhhhhhhhhwqwwwww
                EditText et_digitealgo = findViewById(R.id.et_digitealgo); //obtem dados da caixa de texto e guarda na variavel
                String textoDigitado = et_digitealgo.getText().toString(); //seleciona tipo string pra uma nova variavel dos dados da caixa de texto

                // Intent i = new Intent(MainActivity.this, NextActivity.class);//começa a carregar a proxima pagina
                //   startActivity(i);//carrega prox pagina     0
            }
        });

    }
}