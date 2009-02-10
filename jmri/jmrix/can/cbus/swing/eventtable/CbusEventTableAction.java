// CbusEventTableAction.java

package jmri.jmrix.can.cbus.swing.eventtable;

import jmri.jmrix.can.CanMessage;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 * Swing action to create and register a
 * CbusEventTableFrame object
 *
 * @author	Andrew Crosland           (C) 2009
 *
 * @version     $Revision: 1.1 $
 */

public class CbusEventTableAction extends AbstractAction {

    public CbusEventTableAction(String s) { super(s);}
    public CbusEventTableAction() { this("CBUS Event Table");}

    public void actionPerformed(ActionEvent e) {
        CbusEventTableFrame f = new CbusEventTableFrame();
        try {
            f.initComponents();
        }
        catch (Exception ex) {
            log.error("Exception: "+ex.toString());
        }
        f.setVisible(true);
    }

    static org.apache.log4j.Category log = org.apache.log4j.Category.getInstance(CbusEventTableFrame.class.getName());
}


/* @(#)CbusEventTableAction.java */
