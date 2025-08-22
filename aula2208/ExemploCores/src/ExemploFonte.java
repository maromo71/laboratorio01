import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;

public class ExemploFonte extends Frame{
    public ExemploFonte(){
        setTitle("Trabalhando Com Fontes");
        setSize(new Dimension(600, 400));
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
        FontMetrics metrics = g.getFontMetrics();
        //Colocar em italico e negrito na fonte corrente
        g.drawString("Fonte corrente: " + g.getFont(), 10, 40);
        g.drawString("Ascent" + metrics.getAscent() , 10, 65);
        g.drawString("Descent" + metrics.getDescent() , 10, 90);
        g.drawString("Height" + metrics.getHeight() , 10, 115); // Altura da Fonte
        g.drawString("Leading" + metrics.getLeading() , 10, 140); // Leading da Fonte
        

    }
    public static void main(String[] args) {
        ExemploFonte tela = new ExemploFonte();
        tela.setVisible(true);
    }
}
