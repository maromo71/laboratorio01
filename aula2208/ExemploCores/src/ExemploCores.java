import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ExemploCores extends Frame {

    // Construtor da Janela Principal
    public ExemploCores(){
        this.setTitle("Trabalhando com Cores");
        this.setSize(new Dimension(600,400 ));
        
        this.setLocationRelativeTo(null); //centraliza a janela
    }

    @Override
    public void paint(Graphics g) {
        //Definir um cor para o componente grafico que iremos
        //desenhar, no caso vermelho, para um retangulo
        g.setColor(Color.RED);
        g.fillRect(25, 50, 100, 20);
        g.drawString("Cor: " + g.getColor(), 130, 65);

        g.setColor(new Color(0, 255, 0));
        g.fillRect(25, 75, 100, 20);
        g.drawString("Cor: " + g.getColor(), 130, 90);

        g.setColor(new Color(0.0f, 0.0f, 0.0f));
        g.fillRect(25, 100, 100, 20);
        g.drawString("Cor: " + g.getColor(), 130, 115);
    }
    public static void main(String[] args) throws Exception {
        ExemploCores janela = new ExemploCores();
        janela.setVisible(true);
    }
}
