package businessLogic;

import java.util.List;

import services.DbHandler;

public class AdoptionCatalog {
	
	List<Adoption> adoptionlist;
	
	public Boolean MakeNewAdoption(String pcnic, String ccnic) {
		
		// Insert All adoptions from db to adoption list
		/*Boolean flag=false;
		for(int i=0;i<adoptionlist.size();i++)
		{
			flag=false;
			if(p.getCnic().equalsIgnoreCase(adoptionlist.get(i).getParent().getCnic()))
			{
				flag=true;
				break;
			}
		}
		if(flag==false)*/
//			p.setParentId(adoptionlist.size()+1);
		
		Adoption a=new Adoption();
		a.CreateNewAdoption(pcnic, ccnic);
		/*if(flag == true)
		 * p.addchild(c);
		 * 
		 * */
		  
		return true;  
		
	}

	public String getParent(String CNIC) {
		 
		        DbHandler db = new DbHandler();
		        Parent parent = db.getParent(CNIC);
		        String s = null;
		        if (parent == null) {
		            s=new String("Couldn't get Parent");
		        }
		        else {
		            s=new String(parent.toString());
		        }
				return s;
		    }
	
	
}
