package IGU;

/**
 *
 * @author Martin Conte
 */
public class AgendaElectronica extends javax.swing.JFrame {
    
    // Declaracion de variables globales
    int indices = 0;
    String dnis [] = new String [10];
    String nombres [] = new String [10];
    String apellidos [] = new String [10];
    String direcciones [] = new String [10];
    String telefonos [] = new String [10];
    String fechas [] = new String [10];

    public AgendaElectronica() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        dniText = new javax.swing.JTextField();
        encabezado = new javax.swing.JSeparator();
        nombreText = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        apellidoText = new javax.swing.JTextField();
        direccionText = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        indiceText = new javax.swing.JTextField();
        fechaText = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        pie = new javax.swing.JSeparator();
        guardar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        indice = new javax.swing.JLabel();
        telefonoText = new javax.swing.JTextField();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        titulo.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 51, 51));
        titulo.setText("Agenda Electronica");

        dni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dni.setForeground(new java.awt.Color(255, 51, 51));
        dni.setText("DNI:");

        dniText.setBackground(new java.awt.Color(102, 0, 0));
        dniText.setForeground(new java.awt.Color(255, 255, 255));
        dniText.setCaretColor(new java.awt.Color(255, 255, 255));
        dniText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dniText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        dniText.setSelectionColor(new java.awt.Color(255, 51, 51));

        encabezado.setBackground(new java.awt.Color(153, 0, 0));
        encabezado.setForeground(new java.awt.Color(153, 0, 0));

        nombreText.setBackground(new java.awt.Color(102, 0, 0));
        nombreText.setForeground(new java.awt.Color(255, 255, 255));
        nombreText.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        nombreText.setSelectionColor(new java.awt.Color(255, 51, 51));

        nombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 51, 51));
        nombre.setText("Nombre:");

        apellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 51, 51));
        apellido.setText("Apellido");

        apellidoText.setBackground(new java.awt.Color(102, 0, 0));
        apellidoText.setForeground(new java.awt.Color(255, 255, 255));
        apellidoText.setCaretColor(new java.awt.Color(255, 255, 255));
        apellidoText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellidoText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        apellidoText.setSelectionColor(new java.awt.Color(255, 51, 51));

        direccionText.setBackground(new java.awt.Color(102, 0, 0));
        direccionText.setForeground(new java.awt.Color(255, 255, 255));
        direccionText.setCaretColor(new java.awt.Color(255, 255, 255));
        direccionText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        direccionText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        direccionText.setSelectionColor(new java.awt.Color(255, 51, 51));

        direccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(255, 51, 51));
        direccion.setText("Direccion:");

        telefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 51, 51));
        telefono.setText("Telefono:");

        indiceText.setEditable(false);
        indiceText.setBackground(new java.awt.Color(102, 0, 0));
        indiceText.setForeground(new java.awt.Color(255, 51, 51));
        indiceText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        indiceText.setText("0");

        fechaText.setBackground(new java.awt.Color(102, 0, 0));
        fechaText.setForeground(new java.awt.Color(255, 255, 255));
        fechaText.setCaretColor(new java.awt.Color(255, 255, 255));
        fechaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fechaText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        fechaText.setSelectionColor(new java.awt.Color(255, 51, 51));

        fecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 51, 51));
        fecha.setText("F. Nac:");

        pie.setBackground(new java.awt.Color(153, 0, 0));
        pie.setForeground(new java.awt.Color(153, 0, 0));

        guardar.setBackground(new java.awt.Color(102, 0, 0));
        guardar.setForeground(new java.awt.Color(255, 51, 51));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        siguiente.setBackground(new java.awt.Color(102, 0, 0));
        siguiente.setForeground(new java.awt.Color(255, 51, 51));
        siguiente.setText("►");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(102, 0, 0));
        anterior.setForeground(new java.awt.Color(255, 51, 51));
        anterior.setText("◄");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        indice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        indice.setForeground(new java.awt.Color(255, 51, 51));
        indice.setText("Indice:");

        telefonoText.setBackground(new java.awt.Color(102, 0, 0));
        telefonoText.setForeground(new java.awt.Color(255, 255, 255));
        telefonoText.setCaretColor(new java.awt.Color(255, 255, 255));
        telefonoText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telefonoText.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        telefonoText.setSelectionColor(new java.awt.Color(255, 51, 51));

        titulo1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 51, 51));
        titulo1.setText("Alumno: Conte Martin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pie)
                            .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dniText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indice))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(indiceText))
                        .addGap(18, 18, 18)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indiceText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        //Guardo mi indice. 
        indices = Integer.parseInt(indiceText.getText());
       
        //limito a un maximo de 9 columnas
        if (indices <9) {
            indices++; 
        }
        
        //Seteo mi indice y hago cambio de valor int a string.
        indiceText.setText(Integer.toString(indices));
        
        //Seteo los valores guardados de cada vector.
        dniText.setText(dnis[indices]);
        nombreText.setText(nombres[indices]);
        apellidoText.setText(apellidos[indices]);
        direccionText.setText(direcciones[indices]);
        telefonoText.setText(telefonos[indices]);
        fechaText.setText(fechas[indices]);
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        
        //Guardo mi indice. 
        indices = Integer.parseInt(indiceText.getText());
       
        //limito a un minimo de 0 columnas
        if (indices >0) {
            indices--; 
        }
        
        //Seteo mi indice y hago cambio de valor int a string.
        indiceText.setText(Integer.toString(indices));
        
        //Seteo los valores guardados de cada vector.
        dniText.setText(dnis[indices]);
        nombreText.setText(nombres[indices]);
        apellidoText.setText(apellidos[indices]);
        direccionText.setText(direcciones[indices]);
        telefonoText.setText(telefonos[indices]);
        fechaText.setText(fechas[indices]);      
    }//GEN-LAST:event_anteriorActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        //Guardo mi indice.
        indices = Integer.parseInt(indiceText.getText());
        
        //Obtengo los valores de los vectores.
        dnis [indices] = dniText.getText();
        nombres [indices] = nombreText.getText();
        apellidos [indices] = apellidoText.getText();
        direcciones [indices] = direccionText.getText();
        telefonos [indices] = telefonoText.getText();
        fechas [indices] = fechaText.getText();
    }//GEN-LAST:event_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direccionText;
    private javax.swing.JLabel dni;
    private javax.swing.JTextField dniText;
    private javax.swing.JSeparator encabezado;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaText;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel indice;
    private javax.swing.JTextField indiceText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreText;
    private javax.swing.JSeparator pie;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
