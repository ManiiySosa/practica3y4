package mx.desarrollomovil.uv.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    TextView tvBienvenida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        String apo = (String) getIntent().getExtras().getSerializable("apodo");
        tvBienvenida = findViewById(R.id.tvBienvenida);
        tvBienvenida.append(" "+apo);
    }
}