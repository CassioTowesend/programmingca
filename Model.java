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
public class Model {

    private final Controller controller;
    
    private final String dbServer;
    private final String dbUser;
    private final String dbPass;

    public Model(Controller controller) {
        this.dbServer = "jdbc:mysql://apontejaj.com:3306/Cassio_2019236?useSSL=false";
        this.dbUser = "Cassio_2019236";
        this.dbPass = "2019236";
        this.controller = controller;
    }
}
