import java.awt.Color;
import java.awt.MenuItem;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaMicro extends javax.swing.JFrame implements MouseListener {

    private JPanel panelMover;
	private Point coordenadasRaton = new Point();

	public KeyListener listener;

	
	/**
     * Creates new form VentanaMicro
     */
    public VentanaMicro() {
        initComponents();
        
        setMaximumSize(new java.awt.Dimension(700, 60));
        setPreferredSize(new java.awt.Dimension(700, 60));
         
        setVisible(true);
        setAlwaysOnTop(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	setTitle("VentanaNHC");
    	
     	panelMover = new JPanel();
        jPanel1 = new javax.swing.JPanel();
        Inicio.jBNHCp = new javax.swing.JButton();
        Inicio.jBServiciop = new javax.swing.JButton();
        Inicio.jBNombreDocp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 60));

        Inicio.jBNHCp.setText("");
        Inicio.jBNHCp.setMaximumSize(new java.awt.Dimension(180, 60));
        Inicio.jBNHCp.setMinimumSize(new java.awt.Dimension(180, 60));
        Inicio.jBNHCp.setPreferredSize(new java.awt.Dimension(180, 60));
        Inicio.jBNHCp.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N

        Inicio.jBServiciop.setText("");
        Inicio.jBServiciop.setPreferredSize(new java.awt.Dimension(70, 60));
        Inicio.jBServiciop.setMaximumSize(new java.awt.Dimension(70, 60));
        Inicio.jBServiciop.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Inicio.jBServiciop.setBackground(new java.awt.Color(233, 0, 0));

        Inicio.jBNombreDocp.setText("");
        Inicio.jBNombreDocp.setPreferredSize(new java.awt.Dimension(360, 60));
        Inicio.jBNombreDocp.setMinimumSize(new java.awt.Dimension(360, 60));
        Inicio.jBNombreDocp.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
        Inicio.utiles.encajarNombreNormalizado(Inicio.jBNombreDoc.getText());
        
                
        
        listener = new KeyListener() {
    		@Override
    		public void keyTyped(KeyEvent e) {
    			System.out.println("keyTyped="
    					+ KeyEvent.getKeyText(e.getKeyCode()));
    		}

    		@Override
    		public void keyPressed(KeyEvent e) {
    			System.out.println("keyPressed="
    					+ KeyEvent.getKeyText(e.getKeyCode()));
    		}

    		@Override
    		public void keyReleased(KeyEvent e) {

    			System.out.println(e.getKeyText(e.getKeyCode()));
    			System.out.println(e.getKeyCode());
    			
    			
    			switch (e.getKeyCode()) {
    			
    			case KeyEvent.VK_F:
    			case KeyEvent.VK_W:
    				
    				if(Inicio.ventanaIntroducirNHC != null){
            			Inicio.ventanaIntroducirNHC.dispose();
            		}

    				Inicio.utiles.jBGrabarPagina(); 
    	 	   			

    				break;
    			case KeyEvent.VK_R:
    				
    				// System.out.println("Hola estoy pulsando la r en la ventana compacta");
    				
    				new Acrobat().rotarPagina();
    				if ((Inicio.jBServicio.getText().equals(Inicio.CARC) || Inicio.jBServicio
    						.getText().equals(Inicio.ANRC) || Inicio.destinoDocumentacion == 0)
    						&& Inicio.jBNombreDoc.getText().equals("X")) {
    					// if(Inicio.listaDocumentos[Inicio.numeroPdf].fisica.numPaginas
    					// <= 2){
    					Inicio.jBNombreDocp.setText(Inicio.EKG);
    					Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
    					Inicio.utiles.encajarNombreNormalizado(Inicio.jBNombreDoc.getText());
    					Inicio.jBNombreDoc.setText(Inicio.EKG);
    					if(Inicio.destinoDocumentacion == 0){
    						Inicio.jBServiciop.setText(Inicio.URG);
    						Inicio.jBServicio.setText(Inicio.URG);
    					}else{
    						Inicio.jBServiciop.setText(Inicio.CARC);
    						Inicio.jBServicio.setText(Inicio.CARC);
    					}

    					Inicio.jBNombreDocp.setBackground(Color.green);
    					Inicio.jBNombreDoc.setBackground(Color.green);
    					// }
    				}
    				break;
    			case KeyEvent.VK_E:
    				new Acrobat().eliminarPagina();
    				break;
    			case KeyEvent.VK_Q:
    				
    				System.out.println("Hola estoy pulsando la q en la ventana compacta");
    				
    				if(Inicio.ventanaIntroducirNHC != null){
    					Inicio.ventanaIntroducirNHC.dispose();
    				}
    				
    				
    				Inicio.ventanaIntroducirNHC = new InterfazIntroducirNHC(null,true, Inicio.jBNHCp);
    				Inicio.ventanaIntroducirNHC.setVisible(true);
    				break;
    				
      			case KeyEvent.VK_SPACE:  
      				System.out.println("Hola estoy pulsando la barra espaciadora en la ventana compacta");
      				
      				if(Inicio.ventanaIntroducirNHC != null){
      	  				Inicio.ventanaIntroducirNHC.validarNHC(Inicio.ventanaIntroducirNHC.jBNHCAnterior.getText());
      	  				Inicio.ventanaIntroducirNHC.dispose();
      	  				new FocalAdobe(100);
      	  				break;	
      				}

    			case KeyEvent.VK_ESCAPE: /* cerrarAutoHotKey() */
    				;
    				break;
    			}

    		}
    	};
    	
    	
    	panelMover.addKeyListener(listener);
    	panelMover.setFocusable(true);
        
    	Inicio.jBServiciop.setFocusable(false);
    	Inicio.jBNombreDocp.setFocusable(false);
    	Inicio.jBNHCp.setToolTipText("Tambien pulsando q");
    	
    	
		Inicio.jBNHCp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.ventanaIntroducirNHC= new InterfazIntroducirNHC(null,false, Inicio.jBNHCp);
				Inicio.ventanaIntroducirNHC.setVisible(true);
				Inicio.jBNHCp.setFocusable(false);
				panelMover.requestFocus();
				Inicio.ventanaIntroducirNHC.setAlwaysOnTop(true);
				new Acrobat().getFocus();
			}
		});
        
		
		Inicio.jBNombreDocp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio.utiles.habilitarTeclas(Inicio.jBDeshabilitar.getText(),Inicio.visualizacion);
				
				String seleccion = JOptionPane.showInputDialog(Inicio.jBNombreDocp,
						   "Escribe el nombre del documento", "",
						   JOptionPane.QUESTION_MESSAGE); 
				
				if(seleccion != null){
					Inicio.jBNombreDoc.setText(seleccion);
					Inicio.jBNombreDocp.setText(seleccion);
					Inicio.listaDocumentos[Inicio.numeroPdf].nombreNormalizado = seleccion;
				}
				
				Inicio.utiles.habilitarTeclas(Inicio.jBDeshabilitar.getText(),Inicio.visualizacion);
			}
		});
		

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            	.addComponent(panelMover,25,25,25)	
                .addComponent(Inicio.jBNHCp)
                //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio.jBServiciop)
                //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio.jBNombreDocp, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(panelMover)
            .addComponent(Inicio.jBNHCp)
            .addComponent(Inicio.jBServiciop)
            .addComponent(Inicio.jBNombreDocp)
        );

        /*
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1)
        );
        */
        
        getContentPane().add(jPanel1);

        this.setUndecorated(true);
        
		panelMover.addMouseListener(this);

		panelMover.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				Point punto = MouseInfo.getPointerInfo().getLocation();
				setLocation(punto.x - coordenadasRaton.x, punto.y - coordenadasRaton.y);
			}
		});

        setBackground(Color.black);
        panelMover.setBackground(Color.orange);
        jPanel1.setBackground(Color.pink);
		
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
            java.util.logging.Logger.getLogger(VentanaMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMicro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     

    private javax.swing.JPanel jPanel1;
    // End of variables declaration       

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getComponent() == panelMover){
			coordenadasRaton = e.getPoint();
			System.out.println("Pinche en el panel");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

    
    
    
    
}

