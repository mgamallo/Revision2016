import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class VentanaNombres extends javax.swing.JFrame {

    /**
     * Creates new form Nombres
     */
    public VentanaNombres() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollServicio = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHabituales1 = new javax.swing.JList();
        jScrollServicio1 = new javax.swing.JScrollPane();
        jList3 = new JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListHabituales2 = new javax.swing.JList();
        jScrollNombresDoc = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(200, 800));
        setTitle("Nombres");
        
        
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 800));

        
        Inicio.jLServicios.setFont(new java.awt.Font("Tahoma", 1, 18));
        jScrollServicio.setViewportView(Inicio.jLServicios);
        
        
        /*
        Inicio.jLServicios.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				listaServiciosMouseClicked(evt);
			}
		});
		*/

        
        jListHabituales1.setBackground(new java.awt.Color(255, 241, 182));
        jListHabituales1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        if(Inicio.documentacionDeUrgencias){
        	jListHabituales1.setModel(Inicio.excel.listaHabitualesUrg);
        }else{
        	jListHabituales1.setModel(Inicio.excel.listaHabituales1);
        }
        jListHabituales1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListHabituales1);

        
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollServicio1.setViewportView(jList3);


        jListHabituales2.setFont(new java.awt.Font("Tahoma", 1, 16));
        jListHabituales2.setModel(Inicio.excel.listaHabituales2);
        jListHabituales2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListHabituales2);


        Inicio.jLNombresDoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Inicio.jLNombresDoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        jScrollNombresDoc.setViewportView(Inicio.jLNombresDoc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollServicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addComponent(jScrollNombresDoc)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollServicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jScrollServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollNombresDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        



	
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
            java.util.logging.Logger.getLogger(VentanaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JList jList1;
    private javax.swing.JList jList3;
    private javax.swing.JList jList5;
    private javax.swing.JList jListHabituales1;
    private javax.swing.JList jListHabituales2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollNombresDoc;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollServicio;
    private javax.swing.JScrollPane jScrollServicio1;
    // End of variables declaration                   
}