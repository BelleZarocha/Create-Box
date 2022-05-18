/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.awt.*;
import javax.swing.*;

public class TestBox {
    public static void main(String[] args){
        JFrame frame = new JFrame("Box");
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.add(new Box());
    }
} 
