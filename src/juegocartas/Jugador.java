package juegocartas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jugador {

    private int TOTAL_CARTAS = 10;
    private int MARGEN = 20;
    private int DISTANCIA = 50;
    private Carta cartas[] = new Carta[TOTAL_CARTAS];

    private Random r = new Random();

    public void repartir() {
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pn1) {
        pn1.removeAll();
        int x = MARGEN;

//Recorrido objetual por una lista de objetos
        for (Carta c : cartas) { //Para cada instancia de la colección
            c.mostrar(pn1, x, MARGEN);
            x += DISTANCIA;
        }
        pn1.repaint();
    }

    public String getGrupos() {
        String mensaje = "No se encontraron grupos";
        int[] contadores = new int[NombreCarta.values().length];
        for (Carta c : cartas) {
            contadores[c.getNombre().ordinal()]++;
        }

        int totalGrupos = 0;
        for (int c : contadores) {
            if (c >= 2) {
                totalGrupos++;
            }
        }

        if (totalGrupos > 0) {
            mensaje = "Los grupos encontrados fueron:\n";
            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                }
            }
        }

        return mensaje;
    }
//Obtener el puntaje    

    public int getPuntaje() {

        int contador = 0;
        int contador_2 = 0;
        int contador_3 = 0;
        int contador_4 = 0;
        int contador_5 = 0;
        int contador_6 = 0;
        int contador_7 = 0;
        int contador_8 = 0;
        int contador_9 = 0;
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int posicion;
        int aux4;

        String aux[] = new String[10];
        int aux3[] = new int[10];
        int aux2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            aux[i] = String.valueOf(cartas[i]);
        }

        for (int i = 0; i < 10; i++) {
            aux3[i] = Integer.parseInt(aux[i]);
        }

        for (int i = 0; i < 10; i++) {
            posicion = i;
            aux4 = aux3[i];
            while ((posicion > 0 && aux3[posicion - 1] > aux4)) {
                aux3[posicion] = aux3[posicion - 1];
                posicion--;
            }
            aux3[posicion] = aux4;
        }

        for (int j = 0; j < 10; j++) {

            if (aux3[j] == 1 || aux3[j] == 14 || aux3[j] == 27 || aux3[j] == 40) { //1
                contador++;
            }
            if (aux3[j] == 2 || aux3[j] == 15 || aux3[j] == 28 || aux3[j] == 41) { //2
                contador_2++;
            }
            if (aux3[j] == 3 || aux3[j] == 16 || aux3[j] == 29 || aux3[j] == 42) { //3
                contador_3++;
            }
            if (aux3[j] == 4 || aux3[j] == 17 || aux3[j] == 30 || aux3[j] == 43) { //4
                contador_4++;
            }
            if (aux3[j] == 5 || aux3[j] == 18 || aux3[j] == 31 || aux3[j] == 44) { //5
                contador_5++;
            }
            if (aux3[j] == 6 || aux3[j] == 19 || aux3[j] == 32 || aux3[j] == 45) { //6
                contador_6++;
            }
            if (aux3[j] == 7 || aux3[j] == 20 || aux3[j] == 33 || aux3[j] == 46) { //7
                contador_7++;
            }
            if (aux3[j] == 8 || aux3[j] == 21 || aux3[j] == 34 || aux3[j] == 47) { //8
                contador_8++;
            }
            if (aux3[j] == 9 || aux3[j] == 22 || aux3[j] == 35 || aux3[j] == 48) { //9
                contador_9++;
            }
            if (aux3[j] == 10 || aux3[j] == 23 || aux3[j] == 36 || aux3[j] == 49) { //12
                contador0++;
            }
            if (aux3[j] == 11 || aux3[j] == 24 || aux3[j] == 37 || aux3[j] == 50) { //11
                contador1++;
            }
            if (aux3[j] == 12 || aux3[j] == 25 || aux3[j] == 38 || aux3[j] == 51) { //12
                contador2++;
            }
            if (aux3[j] == 13 || aux3[j] == 26 || aux3[j] == 39 || aux3[j] == 52) { //13
                contador3++;
            }
        }

        for (int h = 0; h < 10; h++) {

            if (contador == 1) { //1

                if (aux3[h] == 1 || aux3[h] == 14 || aux3[h] == 27 || aux3[h] == 40) { //1
                    contador++;
                    aux2[h] = aux3[h];
                }

            }
            if (contador_2 == 1) { //2

                if (aux3[h] == 2 || aux3[h] == 15 || aux3[h] == 28 || aux3[h] == 41) { //2
                    contador_2++;
                    aux2[h] = aux3[h];
                }

            }
            if (contador_3 == 1) { //3
                if (aux3[h] == 3 || aux3[h] == 16 || aux3[h] == 29 || aux3[h] == 42) { //3
                    contador_3++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_4 == 1) { //4
                if (aux3[h] == 4 || aux3[h] == 17 || aux3[h] == 30 || aux3[h] == 43) { //4
                    contador_4++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_5 == 1) { //5
                if (aux3[h] == 5 || aux3[h] == 18 || aux3[h] == 31 || aux3[h] == 44) { //5
                    contador_5++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_6 == 1) { //6
                if (aux3[h] == 6 || aux3[h] == 19 || aux3[h] == 32 || aux3[h] == 45) { //6
                    contador_6++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_7 == 1) { //7
                if (aux3[h] == 7 || aux3[h] == 20 || aux3[h] == 33 || aux3[h] == 46) { //7
                    contador_7++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_8 == 1) { //8
                if (aux3[h] == 8 || aux3[h] == 21 || aux3[h] == 34 || aux3[h] == 47) { //8
                    contador_8++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador_9 == 1) { //9
                if (aux3[h] == 9 || aux3[h] == 22 || aux3[h] == 35 || aux3[h] == 48) { //9
                    contador_9++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador0 == 1) { //12
                if (aux3[h] == 10 || aux3[h] == 23 || aux3[h] == 36 || aux3[h] == 49) { //10
                    contador0++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador1 == 1) { //11
                if (aux3[h] == 11 || aux3[h] == 24 || aux3[h] == 37 || aux3[h] == 50) { //11
                    contador1++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador2 == 1) { //12
                if (aux3[h] == 12 || aux3[h] == 25 || aux3[h] == 38 || aux3[h] == 51) { //12
                    contador2++;
                    aux2[h] = aux3[h];
                }
            }
            if (contador3 == 1) { //13
                if (aux3[h] == 13 || aux3[h] == 26 || aux3[h] == 39 || aux3[h] == 52) { //13
                    contador3++;
                    aux2[h] = aux3[h];
                }
            }
        }

        int suma = 0;

        for (int i = 0; i < 10; i++) {
            if (aux2[i] == 0) {
                suma += 0;
            } else if ((aux2[i] % 13 > 0) && (aux2[i] % 13) <= 10) {
                suma += aux2[i] % 13;
            } else if (aux2[i] % 13 == 0 || aux2[i] % 13 > 10) {
                suma += 10;
            }
        }
        return suma;
    }

    public void escalera() {

        String vector1[] = new String[10];
        int vector2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            vector1[i] = String.valueOf(cartas[i]);
        }

        for (int i = 0; i < 10; i++) {
            vector2[i] = Integer.parseInt(vector1[i]);
        }

        int posicion;
        int aux;

//Ordenamiento por insercción        
        for (int i = 0; i < 10; i++) {
            posicion = i;
            aux = vector2[i];
            while ((posicion > 0 && vector2[posicion - 1] > aux)) {
                vector2[posicion] = vector2[posicion - 1];
                posicion--;
            }
            vector2[posicion] = aux;
        }

        String mensajeTrebol = "Escalera de TREBOL: ";
        String mensajePica = "Escalera de PICA: ";
        String mensajeCorazon = "Escalera de CORAZÓN: ";
        String mensajeDiamante = "Escalera de DIAMANTE: ";

        int trebol = 0;
        int pica = 0;
        int corazon = 0;
        int diamante = 0;
        int vT[] = new int[10];
        int vP[] = new int[10];
        int vC[] = new int[10];
        int vD[] = new int[10];
        boolean dos = false;
        boolean tres = false;
        boolean cuatro = false;

//LLenado        
        try {
            for (int i = 0; i < vector2.length; i++) {
                if (i + 1 <= vector2.length && vector2[i] >= 1 && vector2[i] <= 13) {
                    if (vector2[i] + 1 == vector2[i + 1]) {
                        vT[i] = vector2[i];
                        vT[i + 1] = vector2[i + 1];
                    }

                } else {
                    vT[i] = 0;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (i + 1 <= vector2.length && vector2[i] >= 14 && vector2[i] <= 26) {
                    if (vector2[i] + 1 == vector2[i + 1]) {
                        vP[i] = vector2[i];
                        vP[i + 1] = vector2[i + 1];
                    }

                } else {
                    vP[i] = 0;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (i + 1 <= vector2.length && vector2[i] >= 27 && vector2[i] <= 39) {
                    if (vector2[i] + 1 == vector2[i + 1]) {
                        vC[i] = vector2[i];
                        vC[i + 1] = vector2[i + 1];
                    }
                } else {
                    vC[i] = 0;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (i + 1 <= vector2.length && vector2[i] >= 40 && vector2[i] <= 52) {
                    if (vector2[i] + 1 == vector2[i + 1]) {
                        vD[i] = vector2[i];
                        vD[i + 1] = vector2[i + 1];
                    }

                } else {
                    vD[i] = 0;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
        for(int i = 0; i < vector2.length; i++){
            if(vP[i] == 26){
            dos = true;    
            }
            if(vC[i] == 39){
            tres = true;    
            }
            if(vD[i] == 52){
            cuatro = true;    
            }
        }
        
        for(int i = 0; i < vector2.length; i++){
           if(vT[i] == 13){
              if(i-1>=0 && vT[i]-1 != vT[i-1]){
               vT[i] = 0;   
              }  
           } 
        }
        

//Concatenar
        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vT[i] != 0 && i + 1 < vector2.length && vT[i] != vT[i + 1]) {
                    mensajeTrebol += NombreCarta.values()[vT[i] - 1] + " ";
                    trebol++;
                }
                if (i == 9 && vT[i] != 0) {
                    mensajeTrebol += NombreCarta.values()[vT[i]% 13 - 1] + " ";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vP[i] != 0 && i + 1 < vector2.length && vP[i] != vP[i + 1]) {
                    mensajePica += NombreCarta.values()[vP[i]%13 - 1] + " "; 
                    pica++;
                }
                if (i == 9 && vP[i] != 0) {
                    mensajePica += NombreCarta.values()[vP[i]% 13 - 1] + " ";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vC[i] != 0 && i + 1 < vector2.length && vC[i] != vC[i + 1]) {
                    mensajeCorazon += NombreCarta.values()[vC[i]%13 - 1] + " ";
                    corazon++;
                }
                if (i == 9 && vC[i] != 0) {
                    mensajeCorazon += NombreCarta.values()[vC[i]% 13 - 1] + " ";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vD[i] != 0 && i + 1 < vector2.length && vD[i] != vD[i + 1]) {
                    mensajeDiamante += NombreCarta.values()[vD[i]%13 - 1] + " ";
                    diamante++;
                }
                if (i == 9 && vD[i] != 0) {
                    mensajeDiamante += NombreCarta.values()[vD[i]% 13 - 1] + " ";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
        if(dos == true){
            mensajePica += "KING" + " ";
        }
        if(tres == true){
            mensajeCorazon += "KING" + " ";
        }
        if(cuatro==true){
            mensajeDiamante += "KING" + " ";
        }
        
        if (trebol == 0) {
            mensajeTrebol = "Escalera de "+Pinta.values()[0]+": " + null;
        }
        if (pica == 0) {
            mensajePica = "Escalera de "+Pinta.values()[1]+": " + null;
        }
        if (corazon == 0) {
            mensajeCorazon = "Escalera de "+Pinta.values()[2]+": " + null;
        }
        if (diamante == 0) {
            mensajeDiamante = "Escalera de "+Pinta.values()[3]+": " + null;
        }

        
        int contadorT[] = new int[10];
        int contadorP[] = new int[10];
        int contadorC[] = new int[10];
        int contadorD[] = new int[10];
        int contador = 1;
        int help_1 = 0;
        int help_2 = 0;
        int help_3 = 0;
        int help_4 = 0;
        String t = "Grupos de TREBOL: ";
        String p = "Grupos de PICA: ";
        String c = "Grupos de CORAZÓN: ";
        String d = "Grupos de DIAMANTE: ";

        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vT[i] != 0 && i + 1 < vector2.length && vT[i] + 1 == vT[i + 1]) {
                    contador++;
                    help_1++;
                }

                if (i + 1 < vector2.length && vT[i] + 1 != vT[i + 1] && contador >= 2) {
                    t += Grupo.values()[contador] + " ";
                    contador = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        contador = 1;
        int contador_1=0;
        int resultado_1 [] = new int[10];
        for (int i = 0; i < 10; i++) {
            if(vP[i]!=0){
            resultado_1[contador_1] = vP[i];
            contador_1++;
           } 
        }
        
        for (int i = 0; i < 10; i++) {
            if(vP[i]==0){
            resultado_1[contador_1] = vP[i];
            contador_1++;
           } 
        }

        for(int i = 0; i < vector2.length; i++){
           vP[i] = resultado_1[i];     
        }
        
        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vP[i] != 0 && i + 1 < vector2.length && vP[i] + 1 == vP[i + 1]) {
                    contador++;
                    help_2++;
                }

                if (i + 1 < vector2.length && vP[i] + 1 != vP[i + 1] && contador >= 2) {
                    p += Grupo.values()[contador] + " ";
                    contador = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
        contador = 1;
        contador_1=0;
        int resultado_2 [] = new int[10];
        for (int i = 0; i < 10; i++) {
            if(vC[i]!=0){
            resultado_2[contador_1] = vC[i];
            contador_1++;
           } 
        }
        
        for (int i = 0; i < 10; i++) {
            if(vC[i]==0){
            resultado_2[contador_1] = vC[i];
            contador_1++;
           } 
        }

        for(int i = 0; i < vector2.length; i++){
           vC[i] = resultado_2[i];     
        }
        
        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vC[i] != 0 && i + 1 < vector2.length && vC[i] + 1 == vC[i + 1]) {
                    contador++;
                    help_3++;
                }

                if (i + 1 < vector2.length && vC[i] + 1 != vC[i + 1] && contador >= 2) {
                    c += Grupo.values()[contador] + " ";
                    contador = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
        contador = 1;
        contador_1=0;
        int resultado_3 [] = new int[10]; 
        for (int i = 0; i < 10; i++) {
            if(vD[i]!=0){
            resultado_3[contador_1] = vD[i];
            contador_1++;
           } 
        }
        
        for (int i = 0; i < 10; i++) {
            if(vD[i]==0){
            resultado_3[contador_1] = vD[i];
            contador_1++;
           } 
        }

        for(int i = 0; i < vector2.length; i++){
           vD[i] = resultado_3[i];     
        }
        
        try {
            for (int i = 0; i < vector2.length; i++) {
                if (vD[i] != 0 && i + 1 < vector2.length && vD[i] + 1 == vD[i + 1]) {
                    contador++;
                    help_4++;
                }

                if (i + 1 < vector2.length && vD[i] + 1 != vD[i + 1] && contador >= 2) {
                    d += Grupo.values()[contador] + " ";
                    contador = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
        if(help_1 == 0){
        t = "Grupos de TREBOL: "+null;    
        }
        if(help_2 == 0){
        p = "Grupos de PICA: "+null;    
        }
        if(help_3 == 0){
        c = "Grupos de CORAZÓN: "+null;    
        }
        if(help_4 == 0){
        d = "Grupos de DIAMANTE: "+null;    
        }
          
        JOptionPane.showMessageDialog(null, "ESCALERAS Y GRUPOS\n\n" + mensajeTrebol + "\n" + mensajePica + "\n" + mensajeCorazon + "\n" + mensajeDiamante
                + "\n\n" + t + "\n" + p + "\n" + c + "\n" + d);
    }
    
    public void organizar(){
        
        String aux1[] = new String[10];       
        int aux2[] = new int[10];
        int aux3;
        int posicion;

        for (int i = 0; i < 10; i++) {
            aux1[i] = String.valueOf(cartas[i]);
        }

        for (int i = 0; i < 10; i++) {
            aux2[i] = Integer.parseInt(aux1[i]);
        }

        for (int i = 0; i < 10; i++) {
            posicion = i;
            aux3 = aux2[i];
            while ((posicion > 0 && aux2[posicion - 1] > aux3)) {
                aux2[posicion] = aux2[posicion - 1];
                posicion--;
            }
            aux2[posicion] = aux3;
        }        
        
        for(int i = 0; i < 10; i++){
        cartas[i] = new Carta(aux2[i]);    
        }       
    }
}
   
