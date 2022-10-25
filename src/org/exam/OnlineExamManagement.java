package org.exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class OnlineExamManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 10;
		String[] Ques = new String[n];
		Ques[0] = "1)Which of the following is not a Java features? \n1.Dynamic,2.Architecture Neutral,3.Use of pointers,4.Object-oriented";
		Ques[1] = "2)what is used to find and fix bugs in the Java programs?\n1.JVM,2.JRE,3.JDK,4.JDB";
		Ques[2] = "3)What is the return type of the hashCode() method in the Object class?\n1.Object,2.int,3.long,4.void";
		Ques[3] = "4)Which of these classes are the direct subclasses of the Throwable class?\n 1. RuntimeException and Error class, 2. Exception and VirtualMachineError class,3.Error and Exception class, 4. IOException and VirtualMachineError class";
		Ques[4] = "5) Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?\n1.javap tool,2.javaw command,3.Javadoc tool,4.javah command";
		Ques[5] = "6) Which of the following for loop declaration is not valid?\n1.for ( int i = 99; i >= 0; i / 9 ),2.for ( int i = 7; i <= 77; i += 7 ),3.for ( int i = 20; i >= 2; - -i ),4.for ( int i = 2; i <= 20; i = 2* i )";
		Ques[6] = "7)In which process, a local variable has the same name as one of the instance variables?\n1.Serialization,2.Variable Shadowing,3.Abstraction,4.Multi-threading";
		Ques[7] = "8)Which package contains the Random class?\n1.java.util package,2.java.lang package,3.java.awt package,4.java.io package";
		Ques[8] = "9)An interface with no fields or methods is known as ?\n1.Runnable Interface,2.Marker Interface,3.Abstract Interface,4.CharSequence Interface";
		Ques[9] = "10) Which option is false about the final keyword?\n1.A final method cannot be overridden in its subclasses,2.A final class cannot be extended,3.A final class cannot extend other classes,4.A final method can be inherited";

		int[] ans = { 3, 4, 2, 3, 3, 1, 2, 1, 2, 3 };
		System.out.println("Enter the no of users");
		int t = sc.nextInt();
		while (t > 0) {
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			hm.put(101, "ram");
			hm.put(102, "subash");
			hm.put(103, "vignesh");
			hm.put(104, "deepika");
			hm.put(105, "ilakiya");
			hm.put(106, "joy");
			hm.put(107, "vasu");
			hm.put(108, "gokul");
			hm.put(109, "kalees");
			hm.put(110, "anish");
			System.out.println("\nEnter the User Name:");
			String user = sc.next();
			System.out.println("\nEnter the Password: ");
			Integer pass = sc.nextInt();

			if (hm.containsKey(pass) && hm.get(pass).equals(user)) {
				user(Ques, ans, n);
				t--;
				
			} else {
				System.err.println("\nInvalid Credentials");
				
				System.out.println("\nPlease enter Valid Details");
				
			}

		}

	}

	public static void user(String[] Ques, int[] ans, int n) {
		System.out.println("\n\n\t-------- Start QUIZ ----------");
		int[] reference = new int[n];
		int[] myAns = new int[n];
		Random rand = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		int k = 0;
		while (hs.size() < n) {
			int index = rand.nextInt(n);
			if (!hs.contains(index)) {
				System.out.println("\n" + (k + 1) + "). " + Ques[index] + "\n");
				reference[k] = index;
				hs.add(index);
				System.out.print("Choose correct Option  :");
				myAns[k++] = sc.nextInt();
			}
		}
		int score = 0;
		for (int i = 0; i < n; i++) {
			if (myAns[i] == ans[reference[i]]) {
				score += 10;
			}
		}
		System.out.println("Your Score : " + score + "\n------------------------------");
	}


}
