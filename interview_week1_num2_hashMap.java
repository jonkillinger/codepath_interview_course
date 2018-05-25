// package whatever; // don't place package name!

import java.io.*;

class MyCode {
  public static void main (String[] args) {
    System.out.println("Hello Javak");
    myMap<Integer, Integer> test = new myMap<>();
    test.put(3,5);
    System.out.println(test.get(3));
    test.remove(3);
    System.out.println(test.get(3));
  }
  
  
  
  
  
  
  //TODO bonus
  public static class myMap<K,V>  {
    int DEFAULT_CAPACITY = 16;
    int size = 0;
    anEntry<K,V> [] [] myArr;
    
    @SuppressWarnings("unchecked")
    public myMap(){
      myArr = new anEntry[DEFAULT_CAPACITY] [DEFAULT_CAPACITY];

    }
    
    
    
    public V put(K key, V value){
      int idx = key.hashCode() % myArr.length;
      
      if(idx >= 0 && idx < myArr.length){
        int i = 0;
        for(; i < myArr[idx].length && myArr[idx][i] != null; i++){
          if(myArr[idx][i].myKey.equals(key)){
            myArr[idx][i].myVal = value;
            return myArr[idx][i].myVal;
          }
        }
        
        size++;
        myArr[idx][i] = new anEntry<K,V>(key, value);
        
        if((1.0 * size)/DEFAULT_CAPACITY >= 0.7){
          anEntry<K,V> newArr [] [] = new anEntry[DEFAULT_CAPACITY * 2] [DEFAULT_CAPACITY * 2];
          for(i = 0; i < myArr.length && myArr[i] != null; i++){
            for(int ii = 0; ii < myArr[i].length && myArr[i][ii] != null; ii++){
              newArr[i][ii] = myArr[i][ii];
            }
          }
        }
        
        
      }
      
      
      return null;
    }
    
    public V get(K key){
      int idx = key.hashCode() % myArr.length;
      if(idx >= 0 && idx < myArr.length){
        int i = 0;
        for(; (i < myArr[idx].length && myArr[idx][i] != null); i++){
          if(myArr[idx][i].myKey.equals(key)){
            return myArr[idx][i].myVal;
          }
        }
      }
      return null;
    }
    
    
    public class anEntry<K,V> {
      public K myKey;
      public V myVal;
      
      public anEntry(K k, V v){
        myKey = k;
        myVal = v;
      }
    }
    
    
    public boolean isEmpty(){
      return myArr.length == 0;
    }
    
    public int size(){
      return size;
    }
    
    public V remove(K key){
      V toRet = null;
      int idx = key.hashCode() % DEFAULT_CAPACITY;
      int i = 0;
      for(; i < myArr[idx].length && myArr[idx][i] != null; i++){
        if(myArr[idx][i].myKey.equals(key)){
          toRet = myArr[idx][i].myVal;
          myArr[idx][i] = null;
          for(i = i + 1; i < myArr[idx].length && myArr[idx][i] != null; i++){
            myArr[idx][i - 1] = myArr[idx][i];
          }
          myArr[idx][i - 1] = null;
        }
      }
      size--;
      return toRet;
    }
    
    public void clear(){
      DEFAULT_CAPACITY = 16;
      myArr = new anEntry[DEFAULT_CAPACITY] [DEFAULT_CAPACITY];
      size = 0;
    }
    
    
      
  
    
    
    
    
    
    

    
  }
}
