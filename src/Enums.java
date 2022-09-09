import javax.swing.*;

public class Enums {
    enum ElementosLab {
        FICHAS("Ensamble A1"), PIEZAS_METAL("Ensamble B1"), ESFERAS("Movimiento C1"),RUEDAS("Movimiento C1");
        private final String componentes;

        ElementosLab(String componentes) {
            this.componentes = componentes;
        }

        public String getComponentes() {
            return componentes;
        }
    }
    public static void main(String[] args) {
        ElementosLab[] elementosLab = ElementosLab.values();
        for (ElementosLab elemento : elementosLab) {
            JOptionPane.showMessageDialog(null,"Elemento : " + elemento.name() +" | " + elemento.getComponentes());
        }
    }
}
