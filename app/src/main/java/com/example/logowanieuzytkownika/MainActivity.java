package com.example.logowanieuzytkownika;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.editTextText);
        Button zaloguj = findViewById(R.id.button);
        EditText haslo = findViewById(R.id.editTextTextPassword);
        TextView tekst = findViewById(R.id.textView3);
         zaloguj.setOnClickListener(v -> {
            String smail = email.getText().toString().trim();
            String shaslo = haslo.getText().toString().trim();
            String mail = "admin@example.com";
            String password = "secret123";
             if (smail.isEmpty()) {
                 tekst.setText("Wpisz E-mail");
             } else if (!Patterns.EMAIL_ADDRESS.matcher(smail).matches()) {
                 tekst.setText("Nieprawidłowy format loginu (e-mail)");
             } else if (shaslo.isEmpty()) {
                 tekst.setText("Prosze Wpisać Hasło");
             } else if (!smail.equals(mail)) {
                 tekst.setText("Brak użytkownika o podanym loginie.");
             } else if (!shaslo.equals(password)) {
                 tekst.setText("Błędne hasło");
             } else {
                 tekst.setText("Zalogowano pomyślnie!");
             }

         });
    };

}


