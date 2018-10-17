import javax.swing.JOptionPane;

public class GetInputJOptionPane {
    
    public static void main (String [] args ) {
        String nama;

        nama = JOptionPane.showInputDialog("Inputkan nama Anda :" );
        String msg = " Hallo " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}