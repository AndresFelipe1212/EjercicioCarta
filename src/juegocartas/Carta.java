package juegocartas;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carta {

    private int indice;

    public Carta(Random r) {
        indice = r.nextInt(52) + 1;
    }
    
    public Carta(int elemento){
      indice = elemento;  
    }

    public void mostrar(JPanel pn1, int x, int y) {
        //Obtener el nombre del archivo de la carta
        String nombreImagen = "/imagenes/CARTA" + String.valueOf(indice) + ".JPG";

        //Cargar la imagen en memoria
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));

        //Crear la instancia del objeto JLabel
        JLabel lbl = new JLabel(imagen);

        //Definir coordenas de despliegue y el ancho y alto
        lbl.setBounds(x, y, imagen.getIconWidth(), imagen.getIconHeight());

        //Agregar la etiqueta al panel
        pn1.add(lbl);
    }

    public Pinta getPinta() {
        if (indice <= 13) {
            return Pinta.TREBOL;
        } else if (indice <= 26) {
            return Pinta.PICA;
        } else if (indice <= 39) {
            return Pinta.CORAZON;
        } else {
            return Pinta.DIAMANTE;
        }
    }

    public NombreCarta getNombre() {
        int residuo = indice % 13;
        if (residuo == 0) {
            residuo = 13;
        }
        return NombreCarta.values()[residuo - 1]; //Value porque un Enum se comporta como un vector
    }

    @Override
    public String toString() {
        return "" + indice + "";
    }

}
