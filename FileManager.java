/**
	 * Class FileManager
 	 * author : Kunal Saxena
	 * created: 11/01/2022
	 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {
	/**
	 * Reads a file and creates and returns a list of Entrees.
	 * @param String the name of the file
	 * @return ArrayList<Entree> is the list of Entrees from the file.
	 */
	public static ArrayList<Entree> readEntrees(String filename) {
		ArrayList<Entree> entreeList = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] characteristics = line.split("@@");
				entreeList.add(new Entree(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return entreeList;
	}
	/**
	 * Reads a file and creates and returns a list of Sides.
	 * @param String the name of the file
	 * @return ArrayList<Side> is the list of Sides from the file.
	 */
	public static ArrayList<Side> readSides(String filename) {
		ArrayList<Side> sideList = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] characteristics = line.split("@@");
				sideList.add(new Side(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sideList;
	}
	/**
	 * Reads a file and creates and returns a list of Salads.
	 * @param String the name of the file
	 * @return ArrayList<Salad> is the list of Salad from the file.
	 */
	public static ArrayList<Salad> readSalads(String filename) {
		ArrayList<Salad> saladList = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] characteristics = line.split("@@");
				saladList.add(new Salad(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return saladList;
	}
	/**
	 * Reads a file and creates and returns a list of Desserts.
	 * @param String the name of the file
	 * @return ArrayList<Dessert> is the list of Desserts from the file.
	 */
	public static ArrayList<Dessert> readDesserts(String filename) {
		ArrayList<Dessert> dessertList = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] characteristics = line.split("@@");
				dessertList.add(new Dessert(characteristics[0], characteristics[1], Integer.parseInt(characteristics[2])));
			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return dessertList;
	}
}
