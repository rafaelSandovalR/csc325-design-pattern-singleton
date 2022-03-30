
package com.mycompany.csc325_singleton;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) throws InterruptedException {
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

         thread1.start();
         //Thread.sleep(1);
         thread2.start();
          
   
    }
    
}
