
package interfaz;

import javax.swing.DefaultComboBoxModel;

public class FigurasGUI extends javax.swing.JFrame {
    
    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    Figura f; 

    public FigurasGUI() {
        initComponents();
       
       
        cmbFigura.addItem("Cuadrado");
        cmbFigura.addItem("Rectangulo");
        cmbFigura.addItem("Triangulo");
        cmbFigura.addItem("Circulo");
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbFigura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelCuadrado = new javax.swing.JPanel();
        jblLadoCuadrado = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        jblLadoCuadrado1 = new javax.swing.JLabel();
        jblLadoCuadrado2 = new javax.swing.JLabel();
        txtAreaCuadrado = new javax.swing.JTextField();
        txtPerimetroCuadrado = new javax.swing.JTextField();
        btnCalcularCuadrado = new javax.swing.JButton();
        panelCirculo = new javax.swing.JPanel();
        txtRadio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCalcularCirculo = new javax.swing.JButton();
        txtAreaCirculo = new javax.swing.JTextField();
        txtPerimetroCirculo = new javax.swing.JTextField();
        jblLadoCuadrado3 = new javax.swing.JLabel();
        jblLadoCuadrado4 = new javax.swing.JLabel();
        panelRectangulo = new javax.swing.JPanel();
        jblLadoCuadrado12 = new javax.swing.JLabel();
        jblLadoCuadrado13 = new javax.swing.JLabel();
        txtBaseRectangulo = new javax.swing.JTextField();
        txtAlturaRectangulo = new javax.swing.JTextField();
        jblLadoCuadrado14 = new javax.swing.JLabel();
        jblLadoCuadrado15 = new javax.swing.JLabel();
        txtAreaRectangulo = new javax.swing.JTextField();
        txtPerimetroRectangulo = new javax.swing.JTextField();
        btnCalcularRwctangulo = new javax.swing.JButton();
        panelTriangulo = new javax.swing.JPanel();
        jblLadoCuadrado5 = new javax.swing.JLabel();
        jblLadoCuadrado6 = new javax.swing.JLabel();
        jblLadoCuadrado7 = new javax.swing.JLabel();
        txtLado1Triangulo = new javax.swing.JTextField();
        txtLado2Triangulo = new javax.swing.JTextField();
        txtLado3Triangulo = new javax.swing.JTextField();
        jblLadoCuadrado8 = new javax.swing.JLabel();
        jblLadoCuadrado9 = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtAlturaTriangulo = new javax.swing.JTextField();
        jblLadoCuadrado10 = new javax.swing.JLabel();
        jblLadoCuadrado11 = new javax.swing.JLabel();
        txtAreaTriangulo = new javax.swing.JTextField();
        txtPerimetroTriangulo = new javax.swing.JTextField();
        btnCalcularTriangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiguraActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Figura");

        jblLadoCuadrado.setText("Lado");

        txtLadoCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoCuadradoActionPerformed(evt);
            }
        });

        jblLadoCuadrado1.setText("Area");

        jblLadoCuadrado2.setText("Perimetro");

        txtPerimetroCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimetroCuadradoActionPerformed(evt);
            }
        });

        btnCalcularCuadrado.setText("Calcular");
        btnCalcularCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCuadradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuadradoLayout = new javax.swing.GroupLayout(panelCuadrado);
        panelCuadrado.setLayout(panelCuadradoLayout);
        panelCuadradoLayout.setHorizontalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuadradoLayout.createSequentialGroup()
                        .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblLadoCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCuadradoLayout.createSequentialGroup()
                        .addComponent(jblLadoCuadrado2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(62, 62, 62)))
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txtAreaCuadrado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPerimetroCuadrado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addComponent(btnCalcularCuadrado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCuadradoLayout.setVerticalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado1)
                    .addComponent(txtAreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado2)
                    .addComponent(txtPerimetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularCuadrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Radio");

        btnCalcularCirculo.setText("Calcular");
        btnCalcularCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCirculoActionPerformed(evt);
            }
        });

        txtAreaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaCirculoActionPerformed(evt);
            }
        });

        jblLadoCuadrado3.setText("Area");

        jblLadoCuadrado4.setText("Perimetro");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addComponent(btnCalcularCirculo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jblLadoCuadrado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblLadoCuadrado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAreaCirculo)
                    .addComponent(txtRadio)
                    .addComponent(txtPerimetroCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblLadoCuadrado3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerimetroCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblLadoCuadrado4))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularCirculo)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jblLadoCuadrado12.setText("Base");

        jblLadoCuadrado13.setText("Altura");

        jblLadoCuadrado14.setText("Area");

        jblLadoCuadrado15.setText("Perimetro");

        btnCalcularRwctangulo.setText("Calcular");
        btnCalcularRwctangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRwctanguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblLadoCuadrado13, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138)
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaRectangulo)
                            .addComponent(txtBaseRectangulo)))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jblLadoCuadrado14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(131, 131, 131)
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(txtPerimetroRectangulo)))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addComponent(btnCalcularRwctangulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado12)
                    .addComponent(txtBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado13)
                    .addComponent(txtAlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblLadoCuadrado14)
                    .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblLadoCuadrado15)
                    .addComponent(txtPerimetroRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcularRwctangulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jblLadoCuadrado5.setText("Lado 1");

        jblLadoCuadrado6.setText("Lado 2");

        jblLadoCuadrado7.setText("Lado 3");

        jblLadoCuadrado8.setText("Base");

        jblLadoCuadrado9.setText("Altura");

        jblLadoCuadrado10.setText("Area");

        jblLadoCuadrado11.setText("Perimetro");

        btnCalcularTriangulo.setText("Calcular");
        btnCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblLadoCuadrado9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblLadoCuadrado11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addComponent(jblLadoCuadrado8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addComponent(jblLadoCuadrado10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLado3Triangulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlturaTriangulo)
                    .addComponent(txtPerimetroTriangulo))
                .addGap(37, 37, 37))
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addComponent(btnCalcularTriangulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado5)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado6)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado7)
                    .addComponent(txtLado3Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado8)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado9)
                    .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado10)
                    .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblLadoCuadrado11)
                    .addComponent(txtPerimetroTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCalcularTriangulo)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiguraActionPerformed
        // TODO add your handling code here:
        
        String figuraSlc = (String)cmbFigura.getSelectedItem();
        
        if(figuraSlc.equals("Circulo")){
        panelCirculo.setVisible(true);
        panelCuadrado.setVisible(false);
        panelTriangulo.setVisible(false);
        panelRectangulo.setVisible(false);
       
        
        }
        else if(figuraSlc.equals("Cuadrado")){
        panelCirculo.setVisible(false);
        panelCuadrado.setVisible(true);
        panelTriangulo.setVisible(false);
        panelRectangulo.setVisible(false);
        
        }
        else if(figuraSlc.equals("Rectangulo")){
        panelCirculo.setVisible(false);
        panelCuadrado.setVisible(false);
        panelTriangulo.setVisible(false);
        panelRectangulo.setVisible(true);
       
        
        }
        else if(figuraSlc.equals("Triangulo")){
        panelCirculo.setVisible(false);
        panelCuadrado.setVisible(false);
        panelTriangulo.setVisible(true);
        panelRectangulo.setVisible(false);
       
        
        }else{
        }
        
        
        
    }//GEN-LAST:event_cmbFiguraActionPerformed

    private void txtAreaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaCirculoActionPerformed

    private void txtLadoCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoCuadradoActionPerformed

    private void txtPerimetroCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimetroCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerimetroCuadradoActionPerformed

    private void btnCalcularCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCirculoActionPerformed
        // TODO add your handling code here:

      
        double radio= Double.parseDouble(txtRadio.getText());
        f = new Circulo(radio);
        double a =f.calcularArea();
        double b= f.calcularPerimetro();
        String areaCirculo= String.valueOf(a);
        String perimetroCirculo=String.valueOf(b);
        txtAreaCirculo.setText(areaCirculo);
        txtPerimetroCirculo.setText(perimetroCirculo);
        
        txtRadio.setText(" ");
       
        
        
    }//GEN-LAST:event_btnCalcularCirculoActionPerformed

    private void btnCalcularCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCuadradoActionPerformed
        // TODO add your handling code here:
        double lado= Double.parseDouble(txtLadoCuadrado.getText());
        f = new Cuadrado(lado);
        double a =f.calcularArea();
        double b= f.calcularPerimetro();
        String areaCu= String.valueOf(a);
        String perimetroCu=String.valueOf(b);
        txtAreaCuadrado.setText(areaCu);
        txtPerimetroCuadrado.setText(perimetroCu);
        
        txtLadoCuadrado.setText(" ");
        
        
    }//GEN-LAST:event_btnCalcularCuadradoActionPerformed

    private void btnCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloActionPerformed
        // TODO add your handling code here:
        double lado1= Double.parseDouble(txtLado1Triangulo.getText());
        double lado2= Double.parseDouble(txtLado2Triangulo.getText());
        double lado3= Double.parseDouble(txtLado3Triangulo.getText());
        double base= Double.parseDouble(txtBaseTriangulo.getText());
        double altura= Double.parseDouble(txtAlturaTriangulo.getText());
        f = new Triangulo(lado1,lado2,lado3,base,altura);
        double a =f.calcularArea();
        double b= f.calcularPerimetro();
        String areaTri= String.valueOf(a);
        String perimetroTri=String.valueOf(b);
        txtAreaTriangulo.setText(areaTri);
        txtPerimetroTriangulo.setText(perimetroTri);
        
        txtLado1Triangulo.setText(" ");
        txtLado2Triangulo.setText(" ");
        txtLado3Triangulo.setText(" ");
        txtBaseTriangulo.setText(" ");
        txtAlturaTriangulo.setText(" ");
    }//GEN-LAST:event_btnCalcularTrianguloActionPerformed

    private void btnCalcularRwctanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRwctanguloActionPerformed
        // TODO add your handling code here:
        
        double base= Double.parseDouble(txtBaseRectangulo.getText());
        double altura= Double.parseDouble(txtAlturaRectangulo.getText());
        f = new Rectangulo(base,altura);
        double a =f.calcularArea();
        double b= f.calcularPerimetro();
        String areaRec= String.valueOf(a);
        String perimetroRec=String.valueOf(b);
        txtAreaRectangulo.setText(areaRec);
        txtPerimetroRectangulo.setText(perimetroRec);
        
        txtBaseRectangulo.setText(" ");
        txtAlturaRectangulo.setText(" ");
    }//GEN-LAST:event_btnCalcularRwctanguloActionPerformed

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
            java.util.logging.Logger.getLogger(FigurasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FigurasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FigurasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigurasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FigurasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCirculo;
    private javax.swing.JButton btnCalcularCuadrado;
    private javax.swing.JButton btnCalcularRwctangulo;
    private javax.swing.JButton btnCalcularTriangulo;
    protected javax.swing.JComboBox<String> cmbFigura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblLadoCuadrado;
    private javax.swing.JLabel jblLadoCuadrado1;
    private javax.swing.JLabel jblLadoCuadrado10;
    private javax.swing.JLabel jblLadoCuadrado11;
    private javax.swing.JLabel jblLadoCuadrado12;
    private javax.swing.JLabel jblLadoCuadrado13;
    private javax.swing.JLabel jblLadoCuadrado14;
    private javax.swing.JLabel jblLadoCuadrado15;
    private javax.swing.JLabel jblLadoCuadrado2;
    private javax.swing.JLabel jblLadoCuadrado3;
    private javax.swing.JLabel jblLadoCuadrado4;
    private javax.swing.JLabel jblLadoCuadrado5;
    private javax.swing.JLabel jblLadoCuadrado6;
    private javax.swing.JLabel jblLadoCuadrado7;
    private javax.swing.JLabel jblLadoCuadrado8;
    private javax.swing.JLabel jblLadoCuadrado9;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelCuadrado;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField txtAlturaRectangulo;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtAreaCirculo;
    private javax.swing.JTextField txtAreaCuadrado;
    private javax.swing.JTextField txtAreaRectangulo;
    private javax.swing.JTextField txtAreaTriangulo;
    private javax.swing.JTextField txtBaseRectangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1Triangulo;
    private javax.swing.JTextField txtLado2Triangulo;
    private javax.swing.JTextField txtLado3Triangulo;
    private javax.swing.JTextField txtLadoCuadrado;
    private javax.swing.JTextField txtPerimetroCirculo;
    private javax.swing.JTextField txtPerimetroCuadrado;
    private javax.swing.JTextField txtPerimetroRectangulo;
    private javax.swing.JTextField txtPerimetroTriangulo;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables

}
