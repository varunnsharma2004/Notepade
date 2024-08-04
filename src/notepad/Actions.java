package notepad;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import notepad.editor;

public class Actions implements ActionListener {
    editor ed;

    Actions(editor ed) {
        this.ed = ed;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ed.Fileitem1) {
            ed.tx.setText(null);
        }
        if (e.getSource() == ed.Fileitem2) {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Only Save .txt", "txt");
            file.setAcceptAllFileFilterUsed(false);
            file.addChoosableFileFilter(filter);
            int openFile = file.showOpenDialog(null);
            if (openFile != JFileChooser.APPROVE_OPTION) {
                return;
            } else {
                try {
                    BufferedReader read = new BufferedReader(new FileReader(file.getSelectedFile()));
                    ed.tx.read(read, null);
                } catch (Exception ec) {
                    // TODO: handle exception
                }
            }
        }

        if(e.getSource()==ed.Fileitem3){
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Only Save .txt", "txt");
            file.setAcceptAllFileFilterUsed(false);
            file.addChoosableFileFilter(filter);
            int saveFile=file.showSaveDialog(null);
            if(saveFile!=JFileChooser.APPROVE_OPTION){
                return;
            } 
            else{
                String save=file.getSelectedFile().getAbsolutePath().toString();
                if(!save.contains(".txt"))
                {
                    save=save+".txt";
                }
                else{
                try {
                    BufferedWriter writer=new BufferedWriter(new FileWriter(save));
                    ed.tx.write(writer);
                } catch (Exception es) {
                    // TODO: handle exception
                }
                }
            }
        }
        if(e.getSource()==ed.Fileitem4){
            System.exit(0);
        }
        if(e.getSource()==ed.Edititem1);
        {
            ed.tx.cut();
        }
        if(e.getSource()==ed.Edititem2);
        {
            ed.tx.copy();
        }
        if(e.getSource()==ed.Edititem4);
        {
            ed.tx.paste();
        }
        if(e.getSource()==ed.Edititem4);
        {
          ed.tx.selectAll();
        }
       
    }

}
