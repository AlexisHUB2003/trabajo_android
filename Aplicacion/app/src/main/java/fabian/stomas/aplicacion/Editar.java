package fabian.stomas.aplicacion;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fabian.stomas.aplicacion.databinding.EditarBinding;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Editar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        EditarBinding binding;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.editar);
        binding = EditarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.usereditBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Editar.this, editarUsuario.class);
                startActivity(intent);
            }
        });
        binding.returnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Editar.this, Menu.class);
                startActivity(intent);
            }
        });
    }

}
