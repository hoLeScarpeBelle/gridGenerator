package gridgenerator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class Window extends JFrame
{
    private int topPanelHeight = 30;
    private int N_cas_x ,N_cas_y;
    
    
    public Window(String Name) 
    {
        setTitle(Name);
        setVisible(true);
        setSize(new Dimension(500,300));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        N_cas_x = 3;
        N_cas_y = 3;
        GridPanel grid  = new GridPanel(this.getWidth() , this.getHeight() - topPanelHeight , N_cas_x , N_cas_y);
        
        
        //JMenu topMenu = new JMenu();
        JPanel topPanel = new JPanel(new FlowLayout());
        //topPanel.setPreferredSize(new Dimension(this.getWidth(),50));
        add(topPanel,BorderLayout.NORTH);
        
        JPanel ja = new JPanel(new FlowLayout());
        ja.setPreferredSize(new Dimension(this.getWidth(),topPanelHeight));
        topPanel.add(ja);
        
        JLabel Num_cas = new JLabel("num caselle");
        ja.add(Num_cas);
        JComboBox<Integer> select_cas_x = new JComboBox<>();
        select_cas_x.setPreferredSize(new Dimension(50,20));
        for(int i =0 ; i <= getWidth() ; i++)
            select_cas_x.addItem(i);
        select_cas_x.setSelectedItem(N_cas_x);
        select_cas_x.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                if(e.getStateChange() == ItemEvent.SELECTED) 
                {
                    Object item = e.getItem();
                    try
                    {
                        N_cas_x = (int) item;
                        grid.recreate(N_cas_x,N_cas_y);
                        //System.out.print("" + x);
                    }
                    catch(Exception Ex)
                    {
                        System.out.print("no va");
                    }
                    // do something with object
                }
            }
        });
        ja.add(select_cas_x);
        
        ja.add(new JLabel("x"));
        
        JComboBox<Integer> select_cas_y = new JComboBox<>();
        select_cas_y.setPreferredSize(new Dimension(50,20));
        for(int i = 0 ; i<getHeight() ; i++)
            select_cas_y.addItem(i);
        select_cas_y.setSelectedItem(N_cas_y);
        select_cas_y.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    try{
                        N_cas_y = (int)e.getItem();
                        grid.recreate(N_cas_x, N_cas_y);
                    }
                    catch(Exception ex)
                    {
                        System.out.println("" + ex.toString());
                    }
                }
            }
        });
        ja.add(select_cas_y);
        
        /*
        JPanel sd = new JPanel(new FlowLayout());
        sd.add(new JLabel("width"));
        JTextField win_width = new JTextField(5);
        sd.add(win_width);
        sd.add(new JLabel("height"));
        JTextField win_height = new JTextField(5);
        sd.add(win_height);
        ja.add(sd);
        */
        add(grid,BorderLayout.CENTER);
        System.out.print("x" + grid.getWidth() + " y" + grid.getHeight() + " winX = " + this.getWidth() +" winY = " + getHeight());
        
        
    }
    
    public GridPanel createGridPanel()
    {
        GridPanel x = null;
        
        return x;
    }
    
    public int TextBoxReturnInt(JTextField tx)
    {
        int x = 0;
        return x;
    }

}
