import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import es.mgamallo.firma.VentanaDialogoSinFileChooser;

/**
 *
 * @author Manuel
 */
public class VentanaPrincipal extends javax.swing.JFrame {


	private JScrollPane jScrollPaneComunes;
	private JList jListComunes;
	private JLabel jLDocumentosComunes;
	private JLabel jLDocumentosServicio;
	private JButton jBExtraer;
	public JButton jBFechas;
	/**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jPanelNorteBotones = new javax.swing.JPanel();
        Inicio.jBNHC = new javax.swing.JButton();
        Inicio.jBServicio = new javax.swing.JButton();
        Inicio.jBNombreDoc = new javax.swing.JButton();
        
		Inicio.jBDeshabilitar = new javax.swing.JButton();
        
        jLNHC = new javax.swing.JLabel();
        jLNombreDoc = new javax.swing.JLabel();
        jPanelBotonesAuxiliares = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jBFijarServicio = new javax.swing.JButton();
        jBFijarNombres = new javax.swing.JButton();

        jPanel1 = new javax.swing.JPanel();
        jScrollServicio = new javax.swing.JScrollPane();
        // jLServicios = new javax.swing.JList();
        jScrollNombresDoc = new javax.swing.JScrollPane();
        // Inicio.jLNombresDoc = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHabituales1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListHabituales2 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jBEliminar = new javax.swing.JButton();
        jBApartar = new javax.swing.JButton();
        jBCarpeta = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jBFirmar = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        
        
        jScrollPaneComunes = new JScrollPane();
        jListComunes = new JList();
        jLDocumentosComunes = new JLabel();
        jLDocumentosServicio = new JLabel();
        
        jBExtraer = new javax.swing.JButton();
        jBFechas = new JButton("F");

        setTitle("Panel Principal");
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
 //       setPreferredSize(new java.awt.Dimension(720, 680));
        setPreferredSize(new java.awt.Dimension(720, 1000));
        setMinimumSize(new Dimension(720,680));
        setResizable(true);

        jPanelNorteBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNorteBotones.setPreferredSize(new java.awt.Dimension(750, 110));

        Inicio.jBNHC.setFont(new java.awt.Font("Serif", 1, 32)); // NOI18N
        Inicio.jBNHC.setMaximumSize(new java.awt.Dimension(150, 75));
        Inicio.jBNHC.setMinimumSize(new java.awt.Dimension(150, 75));
        Inicio.jBNHC.setPreferredSize(new java.awt.Dimension(150, 75));
        Inicio.jBNHC.setEnabled(false);
        
		Inicio.jBNHC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccion = JOptionPane.showConfirmDialog(Inicio.jBNHC, "�Es un separador?");
				if(seleccion == 0){
					Inicio.listaDocumentos[Inicio.numeroPdf].nhc = "Separador";
					Inicio.jBNHC.setText("Separador");
					Inicio.jBNHCp.setText("Separador");
					Inicio.jBServicio.setText("X");
					Inicio.jBServiciop.setText("X");
				}
				new FocalAdobe(100);
			}
		});

		
        Inicio.jBServicio.setBackground(new Color(233,0,0));
        Inicio.jBServicio.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        //Inicio.jBServicio.setText("jButton2");
        Inicio.jBServicio.setMaximumSize(new java.awt.Dimension(145, 75));
        Inicio.jBServicio.setMinimumSize(new java.awt.Dimension(145, 75));
        Inicio.jBServicio.setPreferredSize(new java.awt.Dimension(145, 75));
		Inicio.jBServicio.setEnabled(false);
		
		Inicio.jBServicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//Icon icono = new ImageIcon(getClass().getResource("/iconos/maletin48x48.png"));
				new FocalAdobe(100);
				Inicio.utiles.ventanaRenombrarServicios();
			}

		});

		
        Inicio.jBNombreDoc.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        //Inicio.jBNombreDoc.setText("jButton3");
        Inicio.jBNombreDoc.setMaximumSize(new java.awt.Dimension(370, 75));
        Inicio.jBNombreDoc.setMinimumSize(new java.awt.Dimension(370, 75));
        Inicio.jBNombreDoc.setPreferredSize(new java.awt.Dimension(370, 75));
        Inicio.jBNombreDoc.setEnabled(false);
        
		Inicio.jBNombreDoc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Inicio.utiles.ventanaRenombrarNombres();
				new FocalAdobe(100);
			}

		});

        jLNHC.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLNHC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNHC.setText("Selecc. Separador");

        Inicio.jLServicio.setFont(new java.awt.	Font("Tahoma", 1, 18)); // NOI18N
        Inicio.jLServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inicio.jLServicio.setForeground(Color.red);
        Inicio.jLServicio.setText("Sin fecha");

        jLNombreDoc.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLNombreDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreDoc.setText("Fijar el nombre del Documento");

        /*
		if(Inicio.separadores.get(0) == -1){
			Inicio.jBServicio.setBackground(Color.pink);
			//ventanaRenombrarServicios();
		}
		*/

        javax.swing.GroupLayout jPanelNorteBotonesLayout = new javax.swing.GroupLayout(jPanelNorteBotones);
        jPanelNorteBotones.setLayout(jPanelNorteBotonesLayout);
        jPanelNorteBotonesLayout.setHorizontalGroup(
            jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLNHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inicio.jBNHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inicio.jBServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inicio.jLServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inicio.jBNombreDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLNombreDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelNorteBotonesLayout.setVerticalGroup(
            jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteBotonesLayout.createSequentialGroup()
                .addGroup(jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNHC)
                    .addComponent(Inicio.jLServicio)
                    .addComponent(jLNombreDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorteBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inicio.jBNHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inicio.jBServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inicio.jBNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jButton1.setText(Inicio.HOSP);
        jButton1.setBackground(new Color(80,200,120));
        jButton1.addActionListener(new ActionListener() {
			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				
   				Inicio.jLServicios.setSelectedValue(Inicio.HOSP, true);
   				Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.HOSP));
   				Inicio.utiles.actualizaServicio();
   			}
   		});

        jButton2.setText(Inicio.CIA);
        jButton2.setBackground(new Color(80,200,120));
        jButton2.addActionListener(new ActionListener() {
			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				
   				Inicio.jLServicios.setSelectedValue(Inicio.CIA, true);
   				Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.CIA));
   				Inicio.utiles.actualizaServicio();
   			}
   		});

        jButton3.setText(Inicio.DES);
        jButton3.addActionListener(new ActionListener() {
			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				
   				Inicio.jLServicios.setSelectedValue(Inicio.DES, true);
   				Inicio.utiles.actualizaServicio();
   			}
   		});

        jButton4.setText(Inicio.ANRC);
        jButton4.setBackground(Color.yellow);
        jButton4.addActionListener(new ActionListener() {
			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				
   				Inicio.jLServicios.setSelectedValue(Inicio.ANRC, true);
   				Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.ANRC));
   				Inicio.utiles.actualizaServicio();
   			}
   		});

        jButton5.setText(Inicio.CARC);
        jButton5.setBackground(Color.yellow);
        jButton5.addActionListener(new ActionListener() {
			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				
   				Inicio.jLServicios.setSelectedValue(Inicio.CARC, true);
   				Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.CARC));
   				Inicio.utiles.actualizaServicio();
   			}
   		});

        jBFijarServicio.setText("Fija Servicio");
        jBFijarServicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!Inicio.jBServicio.equals("X") && !Inicio.jBServicio.equals(Inicio.DES)){
					Inicio.utiles.renombraServicios();	
					Inicio.jLServicios.setSelectedValue(Inicio.jBServicio.getText(), true);
					Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.jBServicio.getText()));
				}

			}
		});


        jBFijarNombres.setText("Fija Nombre");
        jBFijarNombres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Inicio.utiles.renombraNombres();
			}
		});

        Inicio.jCheckBox1.setText("Todos");
        Inicio.jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio.utiles.jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesAuxiliaresLayout = new javax.swing.GroupLayout(jPanelBotonesAuxiliares);
        jPanelBotonesAuxiliares.setLayout(jPanelBotonesAuxiliaresLayout);
        jPanelBotonesAuxiliaresLayout.setHorizontalGroup(
            jPanelBotonesAuxiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesAuxiliaresLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFijarServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFijarNombres)
                .addGap(57, 57, 57)
                .addComponent(Inicio.jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanelBotonesAuxiliaresLayout.setVerticalGroup(
            jPanelBotonesAuxiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesAuxiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addComponent(jButton3)
                .addComponent(jButton4)
                .addComponent(jButton5)
                .addComponent(jBFijarServicio)
                .addComponent(jBFijarNombres)
                .addComponent(Inicio.jCheckBox1))
        );

        jPanel1.setBackground(new java.awt.Color(212, 237, 248));
 
        DefaultListModel dLM = new DefaultListModel();
		dLM.removeAllElements();
		dLM = Inicio.excel.listaServiciosLista;

		while(dLM.get(dLM.size()-1).equals("")){
			dLM.remove(dLM.getSize()-1);
		}
		
		dLM.addElement(Inicio.DES);
		
		for(int i=dLM.size()-1;i>= 0;i--){
			System.out.println(dLM.get(i).toString());
		}
		
        Inicio.jLServicios.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        
        
  /*      
        jLServicios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
   */     
        Inicio.jLServicios.setModel(dLM);
        Inicio.jLServicios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Inicio.jLServicios.setSelectedIndex(0);
        jScrollServicio.setViewportView(Inicio.jLServicios);
        
		Inicio.jLServicios.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				listaServiciosMouseClicked(evt);
			}
		});

        Inicio.jLNombresDoc.setBackground(new java.awt.Color(255, 255, 204));
        Inicio.jLNombresDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		if(Inicio.documentacionDeUrgencias){
	        Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio("URG"));
		}
		else{
	        Inicio.jLNombresDoc.setModel(Inicio.excel.getDocServicio(Inicio.jLServicios.getSelectedValue().toString()));
		}
        Inicio.jLNombresDoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Inicio.jLNombresDoc.setBackground(new java.awt.Color(255, 255, 204));
        jScrollNombresDoc.setViewportView(Inicio.jLNombresDoc);
        
        Inicio.jLNombresDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNombresDocMouseClicked(evt);
            }
        });
   
        
        
        jListHabituales1.setBackground(new java.awt.Color(255, 241, 182));
        jListHabituales1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        if(Inicio.documentacionDeUrgencias){
        	jListHabituales1.setModel(Inicio.excel.listaHabitualesUrg);
        }else{
        	jListHabituales1.setModel(Inicio.excel.listaHabituales1);
        }
        jListHabituales1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListHabituales1);
        
        jListHabituales1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	listaHabituales1DocMouseClicked(evt);
            }
        });

        
        jListHabituales2.setBackground(new java.awt.Color(255, 241, 182));
        jListHabituales2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jListHabituales2.setModel(Inicio.excel.listaHabituales2);
        jListHabituales2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListHabituales2);
        
        jListHabituales2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	listaHabituales2DocMouseClicked(evt);
            }
        });

        
        jListComunes.setModel(Inicio.excel.listaComunes);
        jListComunes.setBackground(new java.awt.Color(255, 241, 182));
        jListComunes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jListComunes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneComunes.setViewportView(jListComunes);
        
        jListComunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	listaNombresComunesMouseClicked(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                		.addComponent(jScrollNombresDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                		.addComponent(jScrollPane3,javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneComunes, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneComunes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE))
                    .addGap(18,18,18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollNombresDoc,javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    	.addGap(18,18,18)
                     	.addComponent(jScrollPane3,javax.swing.GroupLayout.PREFERRED_SIZE,250,javax.swing.GroupLayout.PREFERRED_SIZE))
                   	
                   // .addComponent(jScrollServicio, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jScrollServicio, javax.swing.GroupLayout.Alignment.TRAILING,javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                .addContainerGap())
        );

        
        
		Inicio.jBDeshabilitar.setText("Teclas On");
		Inicio.jBDeshabilitar.setBackground(Color.pink);
		Inicio.jBDeshabilitar.setToolTipText("Habilita/Deshabilita las teclas");
		Inicio.jBDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// jBEliminarActionPerformed(evt);
				Inicio.utiles.habilitarTeclas(Inicio.jBDeshabilitar.getText(),Inicio.visualizacion);
				jPanel1.requestFocus();
			}
		});
        
        
    //    jBEliminar.setIcon(new ImageIcon("Iconos/Cubo Basura32x32.png"));
        jBEliminar.setText("Eliminar");
        jBEliminar.setToolTipText("Elimina el documento");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // jBEliminarActionPerformed(evt);
            	
            	Inicio.jBNHC.setText("Eliminar");
				Inicio.jBNHCp.setText("Eliminar");
				Inicio.jBServicio.setText("Eliminar");
				Inicio.jBServiciop.setText("Eliminar");
				Inicio.jBNombreDoc.setText("Eliminar");
				Inicio.jBNombreDocp.setText("Eliminar");
				Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
				Inicio.utiles.encajarNombreNormalizado();
				
				Inicio.jBNHC.setBackground(Color.gray);
				Inicio.jBNHCp.setBackground(Color.gray);
				Inicio.jBServicio.setBackground(Color.gray);
				Inicio.jBServiciop.setBackground(Color.gray);
				Inicio.jBNombreDoc.setBackground(Color.gray);
				Inicio.jBNombreDocp.setBackground(Color.gray);
            	
            }
        });

       // jBApartar.setIcon(new ImageIcon("iconos/Clip32x32.png"));
        jBApartar.setText("Apartar");
        jBApartar.setToolTipText("Aparta el documento");
        
        jBApartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio.utiles.jBApartarActionPerformed(evt);
            }
        });

      //  jBCarpeta.setIcon(new ImageIcon("iconos/carpeta 32.png"));
        jBCarpeta.setText("Carpeta");
        jBCarpeta.setToolTipText("Abre la carpeta actual");
        
        jBCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Inicio.utiles.jBCarpetaActionPerformed(evt);
                //jPanel1.requestFocus();
            }
        });

        
		jBExtraer.setEnabled(true);
		// jBExtraer.setIcon(new javax.swing.ImageIcon("iconos/accept-32.png")); // NOI18N
		jBExtraer.setText("Extraer");
		jBExtraer
				.setToolTipText("Obtiene la ruta y nombre del nuevo archivo, y lo coloca en el portapapeles");
		jBExtraer.setBackground(Color.green);
		jBExtraer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// jBExtraerActionPerformed(evt);
				
				Inicio.utiles.habilitarTeclas(Inicio.jBDeshabilitar.getText(),Inicio.visualizacion);
				
				if(Inicio.ventanaExtraer != null){
					Inicio.ventanaExtraer.dispose();
				}
				
				Inicio.ventanaExtraer = new VentanaExtraer();
				jPanel1.requestFocus();
			}
		});
        
		jBFechas.setBackground(Color.gray);
		jBFechas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Boolean visible = Inicio.ventanaFechas.isVisible();
				if(visible){
					jBFechas.setBackground(Color.gray);
				}
				else{
					jBFechas.setBackground(Color.green);
				}
				
				Inicio.ventanaFechas.setVisible(!visible);

			}
		});
        
        jButton9.setText("Vacio");
        jButton9.setVisible(false);

        jButton10.setText("Vacio");
        jButton10.setVisible(false);

      //  jBFirmar.setIcon(new ImageIcon("iconos/drawing_pen 32.png"));
        jBFirmar.setText("Firmar");
        jBFirmar.setEnabled(false);
        jBFirmar.setVisible(false);
        jBFirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

					
					String usuarioUrgencias = "documentacion";
					
					if(Inicio.documentacionDeUrgencias){
						usuarioUrgencias = "urgencias";
					}
					
					String comando = "java -jar FirmaArchivo.jar " + Inicio.usuario 
							+ " " + usuarioUrgencias;
					
					try {
						Runtime.getRuntime().exec(comando);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				//	new VentanaDialogoSinFileChooser(Inicio.usuario, Inicio.documentacionDeUrgencias,new File(Inicio.carpetaActualRevisando));

			}
		});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
            		
                .addContainerGap()
                .addComponent(Inicio.jBDeshabilitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminar,90,90,90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBApartar,90,90,90)
                .addGap(30, 30, 30)
                .addComponent(jBFechas,40,40,40)
                .addGap(30, 30, 30)
                .addComponent(jBCarpeta,90,90,90)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jBExtraer,90,90,90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9,90,90,90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10,90,90,90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFirmar,90,90,90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    //.addComponent(jBEliminar)
                    //.addComponent(jBApartar)
                	.addComponent(Inicio.jBDeshabilitar,javax.swing.GroupLayout.PREFERRED_SIZE,29,javax.swing.GroupLayout.PREFERRED_SIZE)	
                	.addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBApartar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFechas,29,29,29)
                    .addComponent(jBExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jBFirmar)
                    //.addComponent(jBFirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jBGrabar.setIcon(new ImageIcon("iconos/accept-32.png"));
        jBGrabar.setText("Registrar");
        jBGrabar.setToolTipText("Graba todos los cambios de la carpeta");
        jBGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // jBGrabarActionPerformed(evt);
            	Inicio.utiles.registraCambiosFinales();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotonesAuxiliares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNorteBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGrabar,130,130,130)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNorteBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotonesAuxiliares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGrabar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>                        


	protected void listaHabituales2DocMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		Inicio.jBNombreDoc.setText(jListHabituales2.getSelectedValue().toString());
		Inicio.jBNombreDocp.setText(jListHabituales2.getSelectedValue().toString());
		Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
		Inicio.utiles.encajarNombreNormalizado();
		Inicio.jBNombreDoc.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDocp.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDoc.setIcon(null);
		Inicio.jBNombreDocp.setIcon(null);
		jListHabituales1.clearSelection();
		Inicio.jLNombresDoc.clearSelection();
		jListComunes.clearSelection();
		
		Inicio.listaDocumentos[Inicio.numeroPdf].modificado = true;
		
		new FocalAdobe(100);
	}

    
	protected void listaHabituales1DocMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		Inicio.jBNombreDoc.setText(jListHabituales1.getSelectedValue()
				.toString());
		Inicio.jBNombreDocp.setText(jListHabituales1.getSelectedValue()
				.toString());
		Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
		Inicio.utiles.encajarNombreNormalizado();
		Inicio.jBNombreDoc
				.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDocp
				.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDoc.setIcon(null);
		Inicio.jBNombreDocp.setIcon(null);
		Inicio.jLNombresDoc.clearSelection();
		jListHabituales2.clearSelection();
		jListComunes.clearSelection();
		
		Inicio.listaDocumentos[Inicio.numeroPdf].modificado = true;
		
		new FocalAdobe(100);
	}

	protected void listaNombresDocMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		Inicio.jBNombreDoc.setText(Inicio.jLNombresDoc.getSelectedValue().toString());
		Inicio.jBNombreDocp.setText(Inicio.jLNombresDoc.getSelectedValue().toString());
		Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
		Inicio.utiles.encajarNombreNormalizado();
		Inicio.jBNombreDoc.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDocp.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDoc.setIcon(null);
		Inicio.jBNombreDocp.setIcon(null);
		jListHabituales1.clearSelection();
		jListHabituales2.clearSelection();
		jListComunes.clearSelection();
		
		Inicio.listaDocumentos[Inicio.numeroPdf].modificado = true;
		
		new FocalAdobe(100);
	}

	protected void listaNombresComunesMouseClicked(MouseEvent evt){
		Inicio.jBNombreDoc.setText(jListComunes.getSelectedValue().toString());
		Inicio.jBNombreDocp.setText(jListComunes.getSelectedValue().toString());
		Inicio.jBNombreDocp.setToolTipText(Inicio.jBNombreDocp.getText());
		Inicio.utiles.encajarNombreNormalizado();
		Inicio.jBNombreDoc.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDocp.setBackground(new java.awt.Color(153, 255, 153));
		Inicio.jBNombreDoc.setIcon(null);
		Inicio.jBNombreDocp.setIcon(null);
		jListHabituales1.clearSelection();
		jListHabituales2.clearSelection();
		Inicio.jLNombresDoc.clearSelection();
		
		Inicio.listaDocumentos[Inicio.numeroPdf].modificado = true;
		
		new FocalAdobe(100);
	}
    
	protected void listaServiciosMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		Inicio.utiles.actualizaServicio();
	}
	

	



    




    // Variables declaration - do not modify                     
    private javax.swing.JButton jBApartar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBFirmar;
    private javax.swing.JButton jBGrabar;
   // private javax.swing.JButton jBNHC;
   // private javax.swing.JButton jBNombreDoc;
   // private javax.swing.JButton jBServicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jBFijarServicio;
    private javax.swing.JButton jBFijarNombres;
    private javax.swing.JButton jBCarpeta;
    private javax.swing.JButton jButton9;

    private javax.swing.JLabel jLNHC;
    // private javax.swing.JList jLNombresDoc;
    // private javax.swing.JList jLServicios;

    private javax.swing.JLabel jLNombreDoc;
    private javax.swing.JList jListHabituales1;
    private javax.swing.JList jListHabituales2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBotonesAuxiliares;
    private javax.swing.JPanel jPanelNorteBotones;
    private javax.swing.JScrollPane jScrollNombresDoc;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollServicio;
    // End of variables declaration                   
}
