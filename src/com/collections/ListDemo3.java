package com.collections;
import java.time.LocalTime;
public class ListDemo3 {
	public static void main(String[] args) {
LocalTime lt=LocalTime.now();
  System.out.println(lt);
  System.out.println(lt.getHour());
  System.out.println(lt.getMinute());
  System.out.println(lt.getSecond());
  System.out.println(lt.minusHours(30));
}
}
