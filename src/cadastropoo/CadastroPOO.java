/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import cadastropoo.model.PessoaFisica;
import cadastropoo.model.PessoaFisicaRepo;
import cadastropoo.model.PessoaJuridica;
import cadastropoo.model.PessoaJuridicaRepo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Walber
 */
public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        PessoaFisicaRepo repo01=new PessoaFisicaRepo();
        PessoaFisica pessoa01=new PessoaFisica("123456789", 41,"Walber",1 );
        PessoaFisica pessoa02=new PessoaFisica("789456123", 7, "Lucca", 2);
        repo01.inserir(pessoa01);
        repo01.inserir(pessoa02);
        repo01.persistir("pessoasfisicas.bin");
        PessoaFisicaRepo repo02=new PessoaFisicaRepo();
        repo02.recuperar("pessoasfisicas.bin");
        ArrayList<PessoaFisica> pessoasFisicas=new ArrayList();
        pessoasFisicas=repo02.obterTodos();
        for(int i=0;i<pessoasFisicas.size();i++){
          pessoasFisicas.get(i).exibir();
            
        }
        PessoaJuridicaRepo repo03=new PessoaJuridicaRepo();
        PessoaJuridica empresa01=new PessoaJuridica("1011121314", "Fintech Lucca Finance", 1);
        PessoaJuridica empresa02=new PessoaJuridica("7845128956", "Trader Elite", 2);
        repo03.inserir(empresa01);
        repo03.inserir(empresa02);
        repo03.persistir("pessoasjuridicas.bin");
        PessoaJuridicaRepo repo04=new PessoaJuridicaRepo();
        repo04.recuperar("pessoasjuridicas.bin");
        ArrayList<PessoaJuridica>pessoasJuridicas=new ArrayList();
        pessoasJuridicas=repo04.obterTodos();
        for(int i=0; i<pessoasJuridicas.size();i++){
            pessoasJuridicas.get(i).exibir();
        }
                
    }
    
}
