
package com.mycompany.csc325_singleton;

public class AppController {
    
    private static AppController instance;
    
   
    private AppController(){
        System.out.println("Instance created");
    }
    
    public static AppController getInstance(){
  
        // makes it thread safe
        synchronized(AppController.class){
            if( instance == null)
                instance = new AppController();
        }

        return instance;
    }
    
}
