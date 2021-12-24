package businessLogic;

import java.util.List;

import services.DbHandler;

public class ChildrenCatalogue {
	List<Child> childrenlist;

	public void getAllchildren() {
		
		//store all available children from db in childrenlist
		// ready for adoption
		
	}

	public String getChild(String CNIC) {
		
		        DbHandler db = new DbHandler();
		        Child child = db.getChild(CNIC);
		        String s = null;
		        if (child == null) {
		            s=new String("Couldn't get donor");
		        }
		        else {
		            s=new String(child.toString());
		        }
				return s;
		    
	}
	
	

}
