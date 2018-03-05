package br.com.android.altech.exemploretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView respostaCep;
    EditText cepInformado;
    Button btnBuscarCEP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respostaCep = findViewById(R.id.respostaCEP);
        cepInformado = findViewById(R.id.cep_informado);

        btnBuscarCEP = findViewById(R.id.buscar_cep);
        btnBuscarCEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call<Cep> call =  new RetrofitConfig().getCepService()
                        .buscarCep(cepInformado.getText().toString());

                call.enqueue(new Callback<Cep>() {
                    @Override
                    public void onResponse(Call<Cep> call, Response<Cep> response) {
                        Cep cep = response.body();
                        respostaCep.setText(cep.toString());
                    }

                    @Override
                    public void onFailure(Call<Cep> call, Throwable t) {
                        Log.e("CepService ", "Erro ao buscar CEP " + t.getMessage());

                    }
                });
            }
        });
    }
}
