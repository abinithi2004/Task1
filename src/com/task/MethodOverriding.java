package com.task;
class Forest {
 void describe(String season) {
     System.out.println("generic forest in :"+season+".");
 }
}
class Rainforest extends Forest {
 @Override
 void describe(String season) {
     System.out.println("rainforest with diverse wildlife in: "+season+".");
 }
}
class ConiferousForest extends Forest {
 @Override
 void describe(String season) {
 System.out.println("coniferous forest in: "+season+".");
 }
}
public class MethodOverriding{
 public static void main(String[] args) {
     Forest f1 = new Forest();
     Forest f2 = new Rainforest();
     Forest f3 = new ConiferousForest();
     f1.describe("summer");  
     f2.describe("monsoon");  
     f3.describe("winter");  
}
}


