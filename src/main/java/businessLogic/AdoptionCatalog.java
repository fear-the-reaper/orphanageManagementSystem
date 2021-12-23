package businessLogic;

import java.util.List;

public class AdoptionCatalog {
	
	List<Adoption> adoptionlist;
	
	public Boolean MakeNewAdoption(Parent p, List<Child> c) {
		
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
		a.CreateNewAdoption(p, c);
		/*if(flag == true)
		 * p.addchild(c);
		 * 
		 * */
		  
		return true;  
		
	}

	
}
