/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingca;

import javax.swing.JFrame;

/**
 *
 * @author cassi
 */
public class View extends JFrame {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
        startFrame();
    }

    public void startFrame() {
        this.setVisible(true);
        this.setSize(800, 500);
        this.setTitle("Programming CA");

        this.validate();
        this.repaint();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
