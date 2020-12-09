/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingca;

/**
 *
 * @author cassi
 */
public class Controller {
    private final Model model;
    private final View view;
    public Controller(){
    this.model = new Model(this);
    this.view = new View(this);
    }
}
