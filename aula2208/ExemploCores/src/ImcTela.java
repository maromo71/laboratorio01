import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ImcTela extends JFrame {
    //Atributos da Janela
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton btnCalcular;
    private JLabel lblResultado;

    //Construtor da Tela do IMC
    public ImcTela(){
        //Tela de 400 x 300
        setTitle("Calculo do IMC");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Painel Principal usando o grid layout
        setLayout(new GridLayout(4, 2, 10,10));
        ((JPanel)getContentPane()).setBorder(BorderFactory.
            createEmptyBorder(10, 10, 10, 10));
        //Adicionar um label "Peso em KG"
        add(new JLabel("Peso em KG"));
        //Adicionar a caixa de texto para o peso
        txtPeso = new JTextField();
        add(txtPeso);
        //Adicionar um label "Altura em cm: "
        add(new JLabel("Altura em cm: "));
        //Adicionar a caixa de texto para a altura
        txtAltura = new JTextField();
        add(txtAltura);
        //Botao para Calcular o imc
        btnCalcular = new JButton("Calcular IMC");
        add(btnCalcular);
        //Label para apresentar o resultado na tela
        lblResultado = new JLabel();
        add(lblResultado);

        //Adicionar um Listener para o botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                efetuarCalculoImc();
            }
        });
    }
    private void efetuarCalculoImc(){
        double peso = Double.parseDouble(txtPeso.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double imc = peso / (altura * altura);
        lblResultado.setText("IMC: " + imc);
    }

}
