package com.design.pattern;
public interface IteratorInterface {
public boolean hasNext();
public Object next();
}
 interface Container {
public IteratorInterface getIterator();
}
 class NameRepositoryContainer implements Container{
String names[]= {"Janu","Sonu","Samir"};

	@Override
	public IteratorInterface getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	class NameIterator implements IteratorInterface{
		int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }

	} 
	 
 }