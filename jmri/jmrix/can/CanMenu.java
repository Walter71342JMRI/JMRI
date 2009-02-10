// CanMenu.java

package jmri.jmrix.can;

import java.util.ResourceBundle;

import javax.swing.JMenu;

/**
 * Create a menu containing the Jmri CAN-specific tools
 *
 * @author	Bob Jacobsen   Copyright 2003, 2008
 * @author      Andrew Crosland 2008
 * @version     $Revision: 1.3 $
 */
public class CanMenu extends JMenu {
    public CanMenu(String name) {
        this();
        setText(name);
    }

    public CanMenu() {

        super();

        ResourceBundle rb = ResourceBundle.getBundle("jmri.jmrix.JmrixSystemsBundle");

        setText(rb.getString("MenuItemCAN"));

        add(new jmri.jmrix.can.cbus.swing.console.CbusConsoleAction(rb.getString("MenuItemConsole")));
        add(new jmri.jmrix.can.swing.send.CanSendAction(rb.getString("MenuItemSendFrame")));
        add(new jmri.jmrix.can.cbus.swing.configtool.ConfigToolAction(rb.getString("MenuItemConfigTool")));
        add(new jmri.jmrix.can.cbus.swing.eventtable.CbusEventTableAction(rb.getString("MenuItemEventTable")));

    }

}


