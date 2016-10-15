
package funcionalidad;

import javax.swing.JFileChooser;


public class Funcionalidad {
    
    
    public void Salir(){
    
        System.exit(0);
    }
    
    public void Abrir(){
    
        JFileChooser SelectorA = new JFileChooser();
        SelectorA.showOpenDialog(SelectorA);
        String ruta = SelectorA.getSelectedFile().getAbsolutePath();
    }
    
}
