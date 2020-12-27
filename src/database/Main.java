package database;

import Model.Report;
import user.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseConnection.createNewUser("ucuncu", "ucuncu@gmail.com", "ucuncu", 0,0,0,0,0,1,"","","superUser1",0);
        //DatabaseConnection.changePassword("newbie","newChallenger","challenger123");
        //DatabaseConnection.completeChallenge("superUser1",12);
        //DatabaseConnection.updateData("newbie", 56,74,421, 142);
        //DatabaseConnection.changeEmail("newbie", "newChallenger","newChallenger@gmail.com");
//        if( DatabaseConnection.login( "newbie", "newChallenger" ) )
//           System.out.println("succesfly logged in");
        //DatabaseConnection.forgotPassword("newbie");
        try{
            NormalUser user = Login.NormalLogin("cagribilkent", "zaaxdxd");/*
            for( Report r: user.getReports() ){
                System.out.println(r.getUser());
                System.out.println(r.getScore());
            }*/
            System.out.println( user.getCurrentReport().getUser() );
            System.out.println( user.getCurrentReport().getScore() );
            System.out.println( user.getPreviousReport().getUser() );
            System.out.println( user.getPreviousReport().getScore() );
        }catch (Exception e){
            e.printStackTrace();
        }

        //Login.forgotMyPassword("newbie");
        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
        for(int j = 0; j<arrayList.size();j++ ) {
            Object[] arr = arrayList.get(j);
            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                System.out.print(arr[i] + "\t");
            }System.out.println("");
        }
    }
}
