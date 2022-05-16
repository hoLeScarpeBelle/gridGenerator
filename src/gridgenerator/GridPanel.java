package gridgenerator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GridPanel extends JPanel implements MouseListener
{
    private Image canvas;
    private Graphics2D g2;
    private int cas_X,cas_Y;
    private ArrayList rects;
    
    public GridPanel(int width , int height , int cas_X ,int cas_Y)
    {
        this.cas_X = cas_X;
        this.cas_Y = cas_Y;
        addMouseListener(this);
        setSize(new Dimension(width,height));
        setBackground(Color.BLUE);
        repaint();
    }
    
    @Override//ricordati di guardare se é presente l'override
    public void paintComponent(Graphics g)
    {
        
        //super.paint(g);
        super.paintComponent(g);
        int c_wid = getWidth() / this.cas_X;
        int c_hei = getHeight() / this.cas_Y;
        //g.fillRect(0,0,c_wid,c_hei);
        
        boolean draw = true;
        /*if(this.cas_X % 2 == 0)
            draw = false;
        else{       
            draw = true;
            System.out.println("flase");
        }*/
        
        for(int i = 0; i < this.cas_Y ; i++)
        {
            for(int v = 0; v < this.cas_X ; v++)
            {   
                if(draw == true)
                    g.fillRect( v * c_wid, i * c_hei , c_wid , c_hei);
                draw =! draw;
            }
            if(cas_X % 2 == 0)
                draw =! draw;
        }
        
        /*
        if(canvas == null)
        {
            canvas = createImage(getWidth(),getHeight());
            g2 = (Graphics2D)canvas.getGraphics();
            g2.fillRect(0, 0, 30, 30);
        }
        else
        {
            System.out.println("sd");
        }
        g.drawImage(canvas,0, 0, null);
        */
    }
    
    public void clear()
    {
        g2.setPaint(Color.WHITE);
        g2.fillRect( 0, 0 ,getWidth() ,getHeight());
        g2.setColor(Color.BLACK);
        repaint();
    }
    
    public void recreate(int cas_X , int cas_Y )//, int width , int height)
    {
        this.cas_X = cas_X;
        this.cas_Y = cas_Y;
        //setSize(width,height);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
