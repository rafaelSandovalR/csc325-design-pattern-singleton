
package com.mycompany.csc325_singleton;

public class DriverClass {
    
    public static void main(String[] args) throws InterruptedException {
        
        // two threads to get instance of AppController
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                AppController app1= AppController.getInstance();
            }
            
        });
        
        
          Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                AppController app2= AppController.getInstance();
            }
            
        });

         // sleep method to add delay
         thread1.start();
         //Thread.sleep(1);
         thread2.start();
          
   
    }
    
}
