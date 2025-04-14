public class FunWithThreads2 extends Thread{
    

    //Constructor of FunWithThreads2WithThreads
    public FunWithThreads2(){
        
        System.out.println("MAIN START");
        Thread t1 = new Thread(new MyThread2("1"));
        Thread t2 = new Thread(new MyThread2("2"));
        t1.start();
        t2.start();
       
        System.out.println("MAIN END");
    }

    public static void main(String[] args) throws Exception {
        
        new FunWithThreads2();

    }

    class MyThread2 implements Runnable {
        
        private String name;
        
        public MyThread2(String name){
            this.name = name;
        }


        @Override
        public void run() {
            System.out.println("Thread " + name);
            for(int i = 0; i<10 ;i++){
                System.out.println("Thread " + name + " " + i);
            }
            
        }

    }}

/*
 * 
 * 
 * Main Thread START
Thread start:Thread 1
Thread 1 0
Thread 1 1
Thread 1 2
Thread 1 3
Thread start:Thread 2
Thread 1 4
Thread 2 0
Thread 1 5
Thread 2 1
Thread 2 2
Thread 1 7
Thread 2 3
Thread 1 8
Thread 2 4
Thread 1 9
Thread end:Thread 1
Main Thread END
Thread 2 5
Thread 2 6
Thread 2 7
Thread 2 8
Thread 2 9
Thread end:Thread 2
 */