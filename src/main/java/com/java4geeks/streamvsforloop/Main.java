package com.java4geeks.streamvsforloop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

import org.apache.commons.lang3.time.StopWatch;

public class Main {
    static List<Order> orders = new ArrayList<Order>();
    static List<Order> filteredOrders = new ArrayList<Order>();
    static StopWatch watch = new StopWatch();
    static Random random;
    static long firstTimer;
    static long secondTimer;
    static long thirdTimer;
    static long fourthTimer;
    static long fifthTimer;
    static long sixthTimer;
    static long times= 10;
		// TODO Auto-generated method stub
		public static void main(String []args){
			random = new Random();
			for(int i = 0; i < times; i++) {
				initOrders();
				firstTimer += simpleFilteringWithFor();
		        watch.reset();
		        secondTimer += simpleFilteringWithLambda();
				watch.reset();
				thirdTimer += complexFilteringWithFor();
				watch.reset();
				fourthTimer += complexFilteringWithLambda();
				watch.reset();
				fifthTimer += veryComplexFilteringWithFor();
				watch.reset();
				sixthTimer += veryComplexFilteringWithLambda();
		        watch.reset();
		        orders.clear();
		        filteredOrders.clear();
			}
			System.out.println("First timer media is: " + firstTimer/times);
			System.out.println("Second timer media is: " + secondTimer/times);
			System.out.println("Third timer media is: " + thirdTimer/times);
			System.out.println("Fourth timer media is: " + fourthTimer/times);
			System.out.println("Fifth timer media is: " + fifthTimer/times);
			System.out.println("Sixth timer media is: " + sixthTimer/times);


	}
		
		static void initOrders() {
	        for(int i = 0; i <2500000; i++){
	            orders.add(new Order());
	        }
	        System.out.println("Order size is: " + orders.size());
		}
		
		static long simpleFilteringWithFor() {
	        watch.start();	        
	        for(int i = 0; i < orders.size(); i++){
	            if(orders.get(i).getAmount() > 4300){
	                filteredOrders.add(orders.get(i));
	            }
	        }
	        watch.stop();
			//System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}
		
		static long complexFilteringWithFor() {
	        watch.start();	        
	        for(int i = 0; i < orders.size(); i++){
	            if(orders.get(i).getAmount() > 36378 && orders.get(i).getEvenOrOdd().equals("Even")){
	                filteredOrders.add(orders.get(i));
	            }
	        }
	        watch.stop();
	        //System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}
		
		static long veryComplexFilteringWithFor() {
	        watch.start();	        
	        for(int i = 0; i < orders.size(); i++){
	            if(orders.get(i).getAmount() > random.nextInt(100000) && orders.get(i).getEvenOrOdd().equals("Even") && orders.get(i).getFirstOrSecondPartOfStreet().equals("Second")){
	                filteredOrders.add(orders.get(i));
	            }
	        }
	        watch.stop();
	        //System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}
		
		static long simpleFilteringWithLambda() {
	        watch.start();	        
	        orders
	        .stream()
	        .filter(c -> c.getAmount() > 4300)
	        .collect(Collectors.toList());
	        watch.stop();
	        //System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}

		static long complexFilteringWithLambda() {
	        watch.start();	        
	        orders
	        .stream()
	        .filter(c -> c.getAmount() > 36378 && c.getEvenOrOdd().equals("Even"))
	        .collect(Collectors.toList());
	        watch.stop();
	        //System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}
		
		static long veryComplexFilteringWithLambda() {
	        watch.start();	        
	        orders
	        .stream()
	        .filter(c -> c.getAmount() > random.nextInt(100000) && c.getEvenOrOdd().equals("Even") && c.getFirstOrSecondPartOfStreet().equals("Second"))
	        .collect(Collectors.toList());
	        watch.stop();
	        //System.out.println("Time Elapsed: " + watch.getTime());
			return watch.getTime();
		}
		

}
