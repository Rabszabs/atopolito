package sofia.gustavo.atopolito;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); //obtem intent que criou segunda tela

        String textoDigitado = i.getStringExtra("texto"); //obtem texto da primeira tela

        TextView tvTexto = findViewById(R.id.tv_texto); //
        tvTexto.setText(textoDigitado); //aparece o texto no tv_texto

    }
}