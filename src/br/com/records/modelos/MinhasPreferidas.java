package br.com.records.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificao() > 9){
            System.out.println(audio.getTitulo() + " É considerado sucesso absoludo e preferido por todos!!");
        }else {
            System.out.println(audio.getTitulo()+ " Também é um dos que todo está curtindo");
        }

    }

}
