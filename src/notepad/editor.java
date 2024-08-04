package notepad;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * editor
 */
public class editor {

    JFrame f;
    JMenuBar menubar;
    JMenu menu1=new JMenu("File");
    JMenu menu2=new JMenu("Edit");
    JMenu menu3=new JMenu("Format");
    JMenu menu4=new JMenu("View");
    JMenuItem Fileitem1=new JMenuItem("New");
    JMenuItem Fileitem2=new JMenuItem("Open");
    JMenuItem Fileitem3=new JMenuItem("Save");
    JMenuItem Fileitem4=new JMenuItem("Close");
    JMenuItem Edititem1=new JMenuItem("Cut");
    JMenuItem Edititem2=new JMenuItem("Copy");
    JMenuItem Edititem3=new JMenuItem("Paste");
    JMenuItem Edititem4=new JMenuItem("Select All");
    JCheckBoxMenuItem Formateitem1=new JCheckBoxMenuItem("Wrap");
    JTextArea tx=new JTextArea();


    public editor()
    {
        f=new JFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(1200,650);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(new BorderLayout());

    Container c=f.getContentPane();  
    menubar=new JMenuBar();
    menu1.add(Fileitem1);
    menu1.add(Fileitem2);
    menu1.add(Fileitem3);
    menu1.add(Fileitem4);
    menu2.add(Edititem1);
    menu2.add(Edititem2);
    menu2.add(Edititem3);
    menu2.add(Edititem4);
    menu3.add(Formateitem1);
    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(menu3);
    menubar.add(menu4);
    tx.setFont(new Font("Cambria Math", Font.PLAIN, 22));
    // tx.setLayout(new FlowLayout());
    c.add(menubar,BorderLayout.NORTH);
    c.add(tx);
    JScrollPane scrl=new JScrollPane(tx,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    c.add(scrl);
Actions act=new Actions(this);
Wrap wrap=new Wrap(this);
 Fileitem1.addActionListener(act);
 Fileitem2.addActionListener(act);
 Fileitem3.addActionListener(act);
 Fileitem4.addActionListener(act);
 Edititem1.addActionListener(act);
 Edititem2.addActionListener(act);
 Edititem3.addActionListener(act);
 Edititem4.addActionListener(act);
 Formateitem1.addItemListener(wrap);
}
    public static void main(String ar[])
    {
       
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new editor();  }
        catch(Exception e){}
    }
}
