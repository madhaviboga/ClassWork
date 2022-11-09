import java.util.Random;
	class Thread1 extends Thread{
	    public void run() {
	        Random r=new Random();
	        int n=r.nextInt(10);
	        System.out.println("number generated+"+n);
	        if(n%2==0){
	            Thread2 t2=new Thread2(n);
	            t2.start();
	        }
	        else if(n%2!=0)  {
	            Thread3 t3=new Thread3(n);
	            t3.start();
	        }
	    }
	}
	class Thread2 extends Thread{
	    int x;
	    Thread2(int n) {
	        x=n;
	    }
	    public void run(){
	        System.out.println("square of random int generated is:"+(x*x));
	    }
	}
	class Thread3 extends Thread {
	    int x;
	    Thread3(int n) {
	        x=n;
	    }
	    public void run() {
	        System.out.println("cube of random int generated is:"+(x*x*x));
	    }
	}

public class Main{
		public static void main(String[] args) {
			Thread1 t1=new Thread1();
			t1.start();
		}


}



	
