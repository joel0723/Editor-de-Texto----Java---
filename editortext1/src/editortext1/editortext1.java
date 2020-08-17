
package editortext1;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class editortext1 extends javax.swing.JFrame {
    
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    /**
     * Creates new form editortext1
     */
    public editortext1() {
        initComponents();
        setLocationRelativeTo(null); 
    }

    public String abrirarchivo (File archivo){
        String documento ="";
        try{
            entrada= new FileInputStream (archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter= (char)ascci;
                documento+=caracter;
            
            
            }
        
        
        }
        catch (Exception e){
        
        }
        return documento;
    
    }
         
    
    public String guardararchivo(File archivo,String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream (archivo);
            byte [] bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje= "Archivo Guardado";  
        
        }catch (Exception e){
        
        }
        
      return mensaje;
    
    
    }
            
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        colordialog = new javax.swing.JDialog();
        colorchooser = new javax.swing.JColorChooser();
        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatext = new javax.swing.JTextArea();
        barramenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuitem1 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuitem3 = new javax.swing.JMenuItem();
        menuitem4 = new javax.swing.JMenuItem();
        menuitem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout colordialogLayout = new javax.swing.GroupLayout(colordialog.getContentPane());
        colordialog.getContentPane().setLayout(colordialogLayout);
        colordialogLayout.setHorizontalGroup(
            colordialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorchooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        colordialogLayout.setVerticalGroup(
            colordialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorchooser, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blog de notas");

        areatext.setColumns(20);
        areatext.setRows(5);
        jScrollPane1.setViewportView(areatext);

        menu1.setText("File");

        menuitem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuitem1.setText("New");
        menuitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem1ActionPerformed(evt);
            }
        });
        menu1.add(menuitem1);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Open");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menu1.add(jMenuItem11);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Save");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menu1.add(jMenuItem13);

        barramenu.add(menu1);

        menu2.setText("Edit");

        menuitem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuitem3.setText("Copy");
        menuitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem3ActionPerformed(evt);
            }
        });
        menu2.add(menuitem3);

        menuitem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuitem4.setText("Cut");
        menuitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem4ActionPerformed(evt);
            }
        });
        menu2.add(menuitem4);

        menuitem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuitem5.setText("Paste");
        menuitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem5ActionPerformed(evt);
            }
        });
        menu2.add(menuitem5);

        barramenu.add(menu2);

        jMenu1.setText("Font");

        jMenuItem3.setText("Arial");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Serif");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Calibri");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        barramenu.add(jMenu1);

        jMenu2.setText("Format");

        jMenuItem5.setText("Normal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Bold");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem4.setText("Italic");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        barramenu.add(jMenu2);

        jMenu3.setText("Size");

        jMenuItem7.setText("12");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("16");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("20");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("24");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        barramenu.add(jMenu3);

        jMenu5.setText("Color");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Colors");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Background");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        barramenu.add(jMenu5);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void menuitem1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       areatext.setText("");
    }                                         

    private void menuitem3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        areatext.copy();
    }                                         

    private void menuitem4ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        areatext.cut();
    }                                         

    private void menuitem5ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        areatext.paste();
    }                                         

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        tipo_letra="Arial";
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       tipo_letra="Serif";
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        tipo_letra="Calibri";
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        formato_letra=Font.PLAIN;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        formato_letra=Font.BOLD;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        formato_letra=Font.ITALIC;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       tamaño_letra=12;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));// TODO add your handling code here:
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        tamaño_letra=16;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        tamaño_letra=20;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                          

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        tamaño_letra=24;
        areatext.setFont(new Font(tipo_letra,formato_letra,tamaño_letra));
    }                                           

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Color c= null;
        c=colorchooser.showDialog(null,"colordialog",c);
        areatext.setForeground(c);
    }                                           

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
             
        if (seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if (archivo.canRead()){
                if (archivo.getName().endsWith("txt")){
                    String documento= abrirarchivo(archivo);
                    areatext.setText(documento);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                
                }
            
            }
                    
        }
    }                                           

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")){
                String documento= areatext.getText();
                String mensaje =guardararchivo(archivo,documento);
                if (mensaje != null);
                JOptionPane.showMessageDialog(null, mensaje);
            
            
            }else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            
            }
            
        
        }else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
        }
        
    }                                           

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
         Color n= null;
        n=colorchooser.showDialog(null,"colordialog",n);
        areatext.setBackground(n);
    }                                           

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editortext1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editortext1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editortext1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editortext1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editortext1().setVisible(true);
                
            }
        });
    
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea areatext;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JColorChooser colorchooser;
    private javax.swing.JDialog colordialog;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuItem menuitem1;
    private javax.swing.JMenuItem menuitem3;
    private javax.swing.JMenuItem menuitem4;
    private javax.swing.JMenuItem menuitem5;
    // End of variables declaration                   

    public String tipo_letra="Arial";
    public int formato_letra=Font.PLAIN;
    public int tamaño_letra=12;

    
}
