/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fieo.gouttesdeluxe.model;

import java.sql.Blob;
import java.util.logging.Logger;


/**
 *
 * @author juliana
 */
public class Perfume {

    private static Logger logger = Logger.getLogger("br.com.fieo.gouttesdeluxe.model.Perfume");
    
    private String name;
    private Float value;
    private Blob image;

    public Perfume() {
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {

        try{

            // verificar se o nome é vazio
            if(name == null || name.length() == 0) throw new Exception("nome vazio");

            // verificar se o nome é menor que 100 caracteres
            if(name.length() >= 50) throw new Exception("nome maior que 100 caracteres");

            this.name = name;

        }catch(Exception e){
           logger.warning(e.toString());
           logger.severe("FODEU");
           throw e;
        }

    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public static Perfume getPerfume(Integer id){
        Perfume p = new Perfume();

        // TODO : realizar conexao com banco obtendo o perfume do id x

        return p;
    }

}
