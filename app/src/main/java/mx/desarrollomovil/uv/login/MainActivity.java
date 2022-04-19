package mx.desarrollomovil.uv.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUser;
    EditText etPass;
    EditText etApo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        etApo = findViewById(R.id.etApo);

    }

    public void entrar(View view){
        String user = etUser.getText().toString();
        String pass = etPass.getText().toString();
        String apo = etApo.getText().toString();

        if(user.equals("Manuel") && pass.equals("1234")) {
            Intent intent = new Intent(MainActivity.this, Bienvenido.class);
            intent.putExtra("apodo", apo);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Datos Incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}