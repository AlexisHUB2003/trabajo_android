package fabian.stomas.aplicacion;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import fabian.stomas.aplicacion.databinding.ApuntesBinding;
import fabian.stomas.aplicacion.databinding.UserEditBinding;


public class Apuntes extends AppCompatActivity {
     ApuntesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ApuntesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
