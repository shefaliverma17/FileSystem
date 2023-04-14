import java.io.*;
import java.util.*;
public class final_project {
    public static void main(String[] args) {
        char ch = 'a';
        String fileName;
		String[] fileNames = null;
        File directory = new File("C:\\Users\\ravi8\\Desktop\\shefali java\\Project1");
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("******* COURSE 1 END PROJECT ********");
		System.out.println("*************************************");
		System.out.println("********LockedMe.com************");
        System.out.println("*************************************");
        System.out.println("******* Shefali Verma  **************");
        System.out.println("*************************************");
        System.out.println("******* Full Stack Developer  *******");
        System.out.println();

        do {
			//1st display on app - main menu
            System.out.println("Select one of the following options: ");
            System.out.println("1. Display File Names in Ascending Order");
            System.out.println("2. Business level operations");
			System.out.println("3. Close the application");
			
            System.out.println("Enter the number of your choice: ");
            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1: //Display
				
					

					// Creating object of File 
					File file = new File("C:\\Users\\ravi8\\Desktop\\shefali java\\Project1");

					// Populates the array with names of files
					fileNames = file.list();

					Arrays.sort(fileNames);//to sort file names
					
					//for-each loop to print file names
					for (String fName : fileNames) {
						System.out.println(fName);
					}//end of for loop
					
					break;
					
				case 2: //business level operations
						System.out.println("Select one of the following options: ");
						System.out.println("1. Add a file");
						System.out.println("2. Delete a file");
						System.out.println("3. Search a file");
						System.out.println("4. Return to Main Menu");
						String pathname = null;
						int choice2 = sc.nextInt();
						switch (choice2){
							
							case 1://add a file
					
								System.out.println("Enter pathname of the file");
								sc.nextLine();
								pathname = sc.nextLine();
								
								File addfile = new File(pathname);
								try{
									addfile.createNewFile();
									System.out.println("File is added successfully");
								} catch (IOException e){
									System.out.println("Unable to create this file");
									e.printStackTrace();
								}
								break;
		
						

							
							case 2://delete
								System.out.println("Enter path of file to be deleted");
								sc.nextLine();
								pathname =sc.nextLine();
								File delFile = new File(pathname);
								if(delFile.delete()){
									System.out.println("File is deleted");
								}else{
									System.out.println("File could not be deleted");
								}
								break;
							
							
						
							case 3://search a file
								System.out.println("Enter the file name you want to search");
								sc = new Scanner(System.in);
								
								//take file name as input by user
								fileName = sc.nextLine();
								
         						// Creating object of File 
								//C:\Users\ravi8\Desktop\shefali java\Project1
					 file = new File("C:\\Users\\ravi8\\Desktop\\shefali java\\Project1");

					// Populates the array with names of files
					fileNames = file.list();

					Arrays.sort(fileNames);//to sort file names
								
								int flag = 0;
								if(fileNames==null){
								   System.out.println("No files in directory");
								}else{
									  // Linear search in the array
									for (int i = 0; i < fileNames.length; i++){
										 String search_file = fileNames[i];
										 if (search_file.equals(fileName)) {
											 System.out.println(search_file + " found");
											 flag = 1;
											 break;
										}//end of if
									}//end of for
								}//end of else
								if (flag == 0) {
											System.out.println("File Not Found");
								}

							
							
							case 4://return to main menu
								continue;

						}//end of switch choice 2
						break;
				case 3: //close the application
					System.exit(0);
					
						
			}//end of swich main menu 
			sc.nextLine();
			ch = sc.next().charAt(0);
        } while(ch=='Y' || ch=='y');

	}//end of psvm
}//end of public class