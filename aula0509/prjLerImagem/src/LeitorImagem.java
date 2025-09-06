import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;

public class LeitorImagem extends JFrame {
    private JLabel labelImagem;

    public LeitorImagem(){
        setTitle("Leitor de Imagem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        labelImagem = new JLabel("Nenhuma imagem carregada...");
        labelImagem.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelImagem.setHorizontalAlignment(JLabel.CENTER);
        labelImagem.setVerticalAlignment(JLabel.CENTER);
        add(labelImagem, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        JButton btnAbrir = new JButton("Abrir Imagem");
        JButton btnLimpar = new JButton("Limpar Imagem");
        painelBotoes.add(btnAbrir);
        painelBotoes.add(btnLimpar);

        add(painelBotoes, BorderLayout.SOUTH);
        btnAbrir.addActionListener(e -> abrirImagem());
        btnLimpar.addActionListener(e -> limparImagem());


    }

    private void limparImagem() {
        labelImagem.setIcon(null);
        labelImagem.setText("Nenhuma imagem carregada...");
    }

    private void abrirImagem() {
        JFileChooser fileChooser = new JFileChooser();  
        int resultado = fileChooser.showOpenDialog(this);
        if(resultado == JFileChooser.APPROVE_OPTION){
            File arquivo = fileChooser.getSelectedFile();
            exibirImagem(arquivo.getAbsolutePath());
        }
    }

    private void exibirImagem(String absolutePath) {
        if(absolutePath == null || absolutePath.isEmpty()){
            limparImagem();
            return;
        }
        ImageIcon icon = new ImageIcon(absolutePath);
        labelImagem.setIcon(icon);
        labelImagem.setText(null);
        Image imagem = icon.getImage();
        int largura = labelImagem.getWidth();
        int altura = labelImagem.getHeight();
        if(largura > 0 && altura > 0){
            Image imgRedimensionada = 
            imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(imgRedimensionada));
            labelImagem.setText(null);
        }else{
            labelImagem.setIcon(icon);
            labelImagem.setText(null);
        }

    }
}
