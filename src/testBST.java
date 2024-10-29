import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class testBST implements Runnable{

	public static void main(String[] args)  {
		Thread t1 = new Thread(new testBST());
		RedBlackTree tree1, tree2;
		int[] intArray = {9,8,7,6,5,4,3,2,1};

		//Creating the special tree1 as shown in the figure provided in the assignment
		tree1 = new RedBlackTree(intArray);
		tree2 = new RedBlackTree(intArray);
		//tree2.delete(4);

		//System.out.print("InOrder : ");  tree1.inorder();System.out.print("\n");
		//System.out.print("postOrder : ");  tree1.postorder();System.out.print("\n");
		//System.out.print("PreOrder : ");  tree1.preorder();System.out.print("\n");

		System.out.println("Tree1: ");
		tree1.print();


		int userChoice;
		do {
			DisplayMenu();
			userChoice = UserMenuChoice();
			switch (userChoice) {
				case 1:  break;
				case 2:  break;
				case 3:  break;
				case 4:  break;
				case 5:  break;
				case 6: break;

				default:  System.out.println("Thank You for Using CSC301's Emergency Medical Response System (AidTrack), See You Again.");
			}
		}while (userChoice != 0);

	}

	public static void DisplayMenu() {
		System.out.println("\n\n------------------------------------------------------------");
		System.out.println("Personal Finance Manager System (BudgetMaster™), Fall 24-25");
		System.out.println("------------------------------------------------------------");
		System.out.println("1. Log a new transaction (Income, Expense, Transfer, etc.)");
		System.out.println("2. Update transaction details (amount, category, date, notes, etc.)");
		System.out.println("3. Set or update budget limits for various categories.");
		System.out.println("4. Track progress towards budget goals and financial objectives.");
		System.out.println("5. Generate financial reports (monthly, quarterly, annual, etc.)");
		System.out.println("6. NEW extra functionality of your choice. BE INNOVATIVE.");
		System.out.println("0. Exit");
		System.out.println("------------------------------------------------------------");
	}

	public static int UserMenuChoice(){
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Your Choice (0, 1, 2, 3, 4, 5, 6):");
			choice = input.nextInt();
		} while(choice > 6);
		return choice;
	}

	public void run(){
		try{
			IncomingCall();
		} catch (Exception e) {
			System.out.println("Thread Exception");
			throw new RuntimeException(e);
		}
	}

	public static void IncomingCall(){
		try{

			File callers = new File("C:\\Users\\user\\Desktop\\Callers.txt");
			Scanner scanner = new Scanner(callers);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println("Incoming call: " + line);
				Thread.sleep(2000);
			}

		} catch (FileNotFoundException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
