/**
	 * Class FileManager
 	 * author : Kunal Saxena
	 * created: 11/01/2022
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	/**
	 * Reads a file and creates and returns a list of MenuItems.
	 * @param String the name of the file
	 * @return ArrayList<Entree> is the list of MenuItems from the file.
	 */
	public static ArrayList<MenuItem> readItems(String filename) {
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] characteristics = line.split("@@");
				if(characteristics[1].equalsIgnoreCase("Entree"))
					menuItems.add(new Entree(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				else if(characteristics[1].equalsIgnoreCase("Side"))
					menuItems.add(new Side(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				else if(characteristics[1].equalsIgnoreCase("Salad"))
					menuItems.add(new Salad(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
				else if(characteristics[1].equalsIgnoreCase("Dessert"))
					menuItems.add(new Dessert(characteristics[0], characteristics[2], Integer.parseInt(characteristics[3]), Double.parseDouble(characteristics[4])));
			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return menuItems;
	}
	/**
	 * Writes a menu to a file.
	 * @param String the name of the file to write to.
	 * @param ArrayList<Menu> is the list of Menus to write to the file.
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Menu menu : menus) {
				bw.write(menu.description());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
