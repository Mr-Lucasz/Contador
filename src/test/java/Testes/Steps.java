package Testes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Steps {

     private int contador = 0;

     @Dado("^que o valor do contador é (\\d+)$")
     public void que_o_valor_do_contador_é(int arg1) {
          contador = arg1;

     }
     @Quando("eu incrementar em (\\d+)$")
     public void eu_incrementar_em(int arg1) {
          contador+=arg1;

     }
     @Entao("o valor do contador sera (\\d+)$")
     public void o_valor_do_contador_sera(int arg1) throws Throwable{
          System.out.println(arg1);
          System.out.println(contador);

     }

}
