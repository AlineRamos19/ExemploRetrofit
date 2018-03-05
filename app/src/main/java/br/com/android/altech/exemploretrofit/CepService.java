package br.com.android.altech.exemploretrofit;

/*
1- criar servico, precisa de uma interface
2 - criar metodo de requisição
3 - Definir o verbo - get, post, delete, update
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CepService {

    @GET("{cep}/json")
    Call <Cep> buscarCep(@Path("cep") String cep);
}
