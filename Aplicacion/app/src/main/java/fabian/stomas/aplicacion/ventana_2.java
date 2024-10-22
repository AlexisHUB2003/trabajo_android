package fabian.stomas.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import fabian.stomas.aplicacion.databinding.Ventana2Binding;

public class ventana_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Ventana2Binding binding;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ventana2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ventana2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding = Ventana2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ventana_2.this, Menu.class);
                startActivity(intent);
            }
        });
        binding.enlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ventana_2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        binding.contra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ventana_2.this, Password.class);
                startActivity(intent);
            }
        });

    }
}
