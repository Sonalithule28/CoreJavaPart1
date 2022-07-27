package com.thread;

public class FinalizedEx {
	protected void finalize() throws Throwable
    {
        try {
 
            System.out.println("inside this finalize()");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class");
 
            // Calling finalize() of Object class
            super.finalize();
        }
    }
 
    // Driver code
    public static void main(String[] args) throws Throwable
    {
    	 
        // Creating demo's object
        FinalizedEx d = new FinalizedEx();
 
        // Calling finalize of demo
        d.finalize();
    }

}
