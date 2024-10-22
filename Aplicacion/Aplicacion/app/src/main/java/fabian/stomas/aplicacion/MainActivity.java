package fabian.stomas.aplicacion;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import fabian.stomas.aplicacion.databinding.ActivityMainBinding;

import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Usuario usuario = new Usuario();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityMainBinding binding;


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name;
                String last_name;
                String phone;
                String email;
                String Password;
                name = binding.inputNombre.getText().toString();
                last_name = binding.inputApellido.getText().toString();
                phone = binding.inputPhone.getText().toString();
                email = binding.inputemail.getText().toString();
                Password = binding.inputPass.getText().toString();
                usuario.setNombre(name);
                usuario.setApellido(last_name);
                usuario.setTelefono(phone);
                usuario.setCorreo(email);
                usuario.setPass(Password);
                usuarios.add(usuario);
                Toast.makeText(MainActivity.this, "Usuario creado: "+ usuario.Nombre, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ventana_2.class);
                startActivity(intent);
            }

        });

    }
}