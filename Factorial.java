import javax.swing.JOptionPane;
import javax.swing.*;

public class Factorial{

    String opcion;
    int numero;

    public static void main (String []args){
        
    }
}


public int getNumero(){
    opcion = JOptionPane.showInputDialog(
        null,
        "Digite el número para calcular el factorial: ",
        "Factorial",
        JOptionPane.PLAIN_MESSAGE
    );
    int numero = Integer.parseInt(opcion);
    return numero;
}  

public int getFactorial(){
    int numero = this.numero;
    int contador = 0;
        if (contador != numero){
            numero = numero * numero - contador;
            contador ++;
        }

    }
}     