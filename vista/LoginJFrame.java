/* LOGIN - INGRESAR
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.*;
import entidad.*;
import javax.swing.JOptionPane;
/**
 * Universidad Tecnológica del Perú
 * @author Jhoel RN MH
 * U17106156@utp.edu.pe
 */
public class LoginJFrame extends javax.swing.JFrame {
    
    
    public static Administrador admin = null; // publico para usarlo despues en ventana Principal
    
    ColeccionPersonas coleccion;
    ColeccionRegistros colregistros;
    boolean estado = true;
    /*
    variable estado. Sirve para reconocer: 
        estado = TRUE  -→ NUEVO             (estamos agregando nuevo)
        estado = FALSE -→ ACTUALIZAR        (modificando uno que ya existe)
    */
    
    int indiceSeleccionado = -1;// para mi significa que no se ha buiscado aun el indice
    
    
    

    /**
     * Creates new form Login
     */
    public LoginJFrame() {
        initComponents();
        this.setLocationRelativeTo(null); //esto es para centrar al medio
    }
    
    
    
    //ESTE ES UN METODO PRIVADO
    private void mensaje (String msj){ // METODO PRIVADO PARA MENSAJES
        JOptionPane.showMessageDialog(null,msj);
    }
    
    
    

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(251, 252, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconoContrasena.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 240, 34, 30);

        btnRegistrarse.setBackground(new java.awt.Color(135, 164, 195));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setToolTipText("");
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse);
        btnRegistrarse.setBounds(630, 340, 130, 30);

        txtCorreo.setBackground(new java.awt.Color(251, 252, 253));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingresar Correo");
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 219, 228)));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(470, 150, 280, 30);

        txtContrasena.setBackground(new java.awt.Color(251, 252, 253));
        txtContrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasena.setText("jPasswordField1");
        txtContrasena.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 219, 228)));
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        jPanel1.add(txtContrasena);
        txtContrasena.setBounds(470, 240, 280, 30);

        jLabel2.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¿Ha olvidado Contraseña?");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 390, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 210, 140, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("E-MAIL");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 120, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconoMail.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 150, 34, 30);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Mantener Conectado");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setOpaque(false);
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(460, 290, 180, 23);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(135, 164, 195));
        jLabel6.setText("Iniciar Sesión");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 50, 140, 40);

        jLabel7.setBackground(new java.awt.Color(135, 164, 195));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Bienvenido.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 380, 460);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconoMinimize.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(730, 10, 30, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconoExit.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(770, 10, 30, 30);

        btnIngresar.setBackground(new java.awt.Color(135, 164, 195));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setToolTipText("");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(460, 340, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
       txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseClicked
       txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaMouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
      System.exit(0);//sale de la aplicación
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       this.setState(LoginJFrame.ICONIFIED);// minimiza la aplicación
    }//GEN-LAST:event_jLabel8MousePressed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
        AdministradorController controlador = new AdministradorController(); //este objeto permite hacer las operaciones que tengo
        String correoLeido = txtCorreo.getText();//lectura de la caja txtCorreo
        String passLeido = txtContrasena.getText();//lectura de la caja txtContrasena
        
        
        //Buscamos según el correo y password leido
        admin = (Administrador) controlador.MostrarUno(coleccion, correoLeido,passLeido);//busqueda por el correo y pass . . retorna el objeto encontrado
        
        if (admin != null) { // si existe el admin con el correo ingresado BUSCADO
            //GUARDAMOS el indice del auto encontrado
            this.indiceSeleccionado = controlador.BuscarIndice(coleccion, admin);
            
            //CREAMOS OBJETO REGISTRO
            //RegistroGeneralController controllerGral = new RegistroGeneralController();//este objeto permite hacer las operaciones generales que tengo
            //RegistroGeneral registro = new RegistroGeneral(admin, null, null);//objeto leido
            //controllerGral.Registrar(colregistros, admin, null, null);//registro el admin a la coleccion de registros
            /*
            //guardamos tambien sus datos
            int dniGuardado = admin.getDni();
            String nombreGuardado = admin.getNombre();
            String apellidoGuardado = admin.getApellido();
            String usernameGuardado = admin.getUsername();
            String correoGuardado = admin.getCorreo();
            String passwordGuardado = admin.getPassword();
            int accesibilidadGuardado = admin.getAccesibilidad();
            */
            
            // Cambiamos interfaz porque SI existe el usuario
            PrincipalJFrame Principal = new PrincipalJFrame();
            Principal.setVisible(true); // abre ventana principal
            
            dispose();//sale del formulario inicio sesion
            
        }
        else{
            mensaje("**** E-mail o contraseña incorrecta . . .****  \n Inténtelo de nuevo");
        }
        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        // CLICK en REGISTRARSE
        RegisterJFrame registro = new RegisterJFrame();
        registro.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}