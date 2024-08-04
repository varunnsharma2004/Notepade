package notepad;


import java.awt.event.*;
import notepad.editor;

public class Wrap implements ItemListener {

    editor ed;

    Wrap(editor ed) {
        this.ed = ed;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            ed.tx.setLineWrap(true);
            ed.tx.setWrapStyleWord(true);
        }else
        {
        ed.tx.setLineWrap(false);
            ed.tx.setWrapStyleWord(false);
        }            
    }

}
