
package ProyectoIntegrador;

import Frames.Login;

/**
 *
 * @author Daniel
 */
public class ProyectoIntegrador {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
                
            }
        });
    }
    
}
