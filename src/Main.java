import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean decision = true;
        double resultado = 0;
        while (decision){
            try{
                int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                //no se puede dividir por cero ni poner numeros decimales
                int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                int operation = Integer.parseInt(JOptionPane.showInputDialog("que operacion desea realisar"));
                switch (operation){
                    case 1:
                        resultado = num1 + num2;
                        JOptionPane.showMessageDialog(null,"la suma es: "+resultado);
                        break;
                    case 2:
                        try {
                            rango(resultado);
                            resultado = num1 - num2;
                            JOptionPane.showMessageDialog(null,"la resta es: "+resultado);

                        }
                        catch ( NewExeccion e){
                            JOptionPane.showMessageDialog(null,"hpta");
                        }
                        break;
                    case 3:
                        try{
                            resultado = num1/num2;
                            JOptionPane.showMessageDialog(null,"la divicion es: "+resultado);

                        }
                        catch (ArithmeticException e){
                            JOptionPane.showMessageDialog(null,"no se puede dividir por cero error:  "+ e);
                        }
                        break;
                    default:JOptionPane.showMessageDialog(null,"elija una opcion valida");
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"ingrese valores validos error: "+e);
                break;
            }

        }
    }
    static void rango (double resultado) throws NewExeccion{
        if (resultado<0){
            throw new NewExeccion("no se pueden hacer operaciones por numeros negativos");
        }
    }
}
