import javax.swing.JOptionPane;

public class PedirNumeros {

   
    
    public static void main(String[] args) {
        Operacion op = new Operacion();

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero, por favor"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero, por favor"));


        System.out.println("El resultado de la suma es" +op.SumaDeNumeros(numero1, numero2));       
        System.out.println("El resultado de la resta es " + op.RestaDeNumeros(numero1, numero2));
        System.out.print("El resultado de la multiplicacion es " +op.MultiplicacionDeNumeros(numero1, numero2));
        System.out.println("El resultado de la division es " +op.DivisionDeNumeros(numero1, numero2));


    }
}
