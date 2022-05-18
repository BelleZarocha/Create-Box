/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.awt.*;
import javax.swing.*;

public class Box extends JPanel {
    Box() {

    }

    protected void paintComponent(Graphics g) {
        super.paintComponents(g);

        // Rectangle size 40 * 20
        g.drawRect(50, 50, 40, 20);

        // Draw line for create Box
        g.drawLine(50, 50, 60, 35); // left line 
        g.drawLine(60, 35, 100, 35); // top line
        g.drawLine(100, 35, 90, 50); // right line
        g.drawLine(100, 35, 100, 55); // side line
        g.drawLine(100, 55, 90, 70); // bottom line

        // Set front (before is so big)
        g.setFont(new Font("Roboto",Font.PLAIN, 6));
        
        // Add String in Box 
        g.drawString("3 Kgs", 60, 65);

        // Add String out Box (Scale)
        g.drawString("(60,35)", 35, 35);
        g.drawString("(50,50)", 25, 52);
        g.drawString(("30"), 45, 44);
        g.drawString(("20"), 40, 65);
        g.drawString(("40"), 75, 32);
    }    
}