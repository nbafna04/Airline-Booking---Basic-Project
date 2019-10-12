public class trial extends javax.swing.JFrame{
    public trial() {
        a = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        a.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\All Users\\Documents\\My Pictures\\Sample Pictures\\A320 Plane with Sky1.jpg"));
        add(a);
        pack();
    }
    
    public static void main(String args[]){
final trial y=new trial();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                y.setVisible(true);
            }
        });
    }
    
    private javax.swing.JLabel a;
}