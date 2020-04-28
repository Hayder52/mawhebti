/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawhebtii;

/**
 *
 * @author bureau
 */
public class Session {
    private static Abonne loggedInUser = null;
    private static String ip = "127.0.0.1";
    private static int IdThisSujet=0;
    public static String addImage = "";
   

    public static Abonne getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(Abonne loggedInUser) {
        Session.loggedInUser = loggedInUser;
    }

    public static String getIp() {
        return ip;
    } 
}
