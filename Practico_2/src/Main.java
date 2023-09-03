import AgendaCelular.Celular;
import AgendaCelular.Contacto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Contacto c = new Contacto("jose","2494283336","joegoico@gmail.com",22,"montevideo 765","Tandil");
    ArrayList<Contacto> listaContactos= new ArrayList<>();
    Celular cel = new Celular(listaContactos);
    cel.agregarContatco(c);
        System.out.println(cel.listarContactos());
    }
}