import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees : ");
		int n = sc.nextInt();
		sc.nextLine();
		int i = 0;

		while (i < n) 
		{
			Employee e = null;
			System.out.print("\nNew Employee\nPlease enter employee first name, number and hiredate with spaces separating each entry: ");
			String line = sc.nextLine();
			String[] words = line.split("\\s");
			int type = 0;
			while (type != 1 && type != 2) 
			{
				System.out.print("Press 1 for Shift Supervisor and press 2 for Production Worker: ");
				type = sc.nextInt();
			}
			if (type == 1) 
			{
				System.out.print("Enter annual salary : ");
				double sal = sc.nextDouble();
				System.out.print("Enter annual bonus : ");
				double bonus = sc.nextDouble();
				e = new ShiftSupervisor(words[0], Integer.parseInt(words[1]), words[2], sal, bonus);
				employees.add(e);
			} 
			else 
			{
				int shift = 0;
				while (shift != 1 && shift != 2) 
				{
					System.out.print("Enter 1 for day shift and 2 for night shift: ");
					shift = sc.nextInt();
				}
				System.out.print("Enter number of hours worked : ");
				
				
				int hrs = sc.nextInt();
				System.out.print("Enter hourly payment : ");
				double hrsPay = sc.nextDouble();
				e = new ProductionWorker(words[0], Integer.parseInt(words[1]), words[2], shift, hrs, hrsPay);
				employees.add(e);

			}
			sc.nextLine();
			i++;
		}

		String output = "";
		for (Employee e : employees) 
		{
			output = output + e.toString() + "\n";
			if (e instanceof ShiftSupervisor)
				output = output + "Employee Type : Shift Supervisor\n";
			else
				output = output + "Employee Type : Production Worker\n";
			output = output + "Total Pay : " + e.calculatePay()+"\n";
		}
		
		System.out.println("Do you want print ouput to File(y/n)");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("y")){
			System.out.println("please enter the file name : ");
			String out = sc.nextLine();
			File f = new File(out);
			if(!f.exists())
			{
				f.createNewFile();
				FileWriter fw = new FileWriter(f);
				fw.append(output);
				fw.close();
			}
		}
		else
		{
			System.out.println(output);
		}
		sc.close();
	}
}