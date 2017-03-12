package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NuseryFile {

	private String fileName;	
	
	public NuseryFile(String path){
		this.fileName = path;		
	}
	
	//reading
	public ArrayList<Child> getChild() {
		ArrayList<Child> child = new ArrayList<Child>();		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);			
			if (fis.available() > 0){
				child = (ArrayList<Child>) ois.readObject();
				return child;
			}				
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File Is Empty...");
		}		
		return child;
	}
	
	//writing
	public void addChild (ArrayList<Child> child){
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(child);
			oos.flush();
			oos.close();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
}
