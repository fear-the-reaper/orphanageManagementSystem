package businessLogic;

import java.time.LocalDate;
import java.util.List;

public class Adoption {

	private List<Child> child;
	private Parent parent;
	private LocalDate Adoption_date;
	public Adoption() {
		
		
	}
	public Boolean CreateNewAdoption(String pcnic, String ccnic) {
		
		/*
		// search in db for parent (already aparent or not)
		//if null return then
		parent=new Parent(pcnic);
		for(int i=0;i<c.size();i++)
		{
			child.add(c.get(i));
		}
		//insert new adoption if parent is new*/
		return true;
		
	}
	public List<Child> getChild() {
		return child;
	}
	public void setChild(List<Child> child) {
		this.child = child;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public LocalDate getAdoption_date() {
		return Adoption_date;
	}
	public void setAdoption_date(LocalDate adoption_date) {
		Adoption_date = adoption_date;
	}
	public void addchild(List<Child> c)
	{
		for(int i=0;i<c.size();i++)
		{
			child.add(c.get(i));
		}
	}

}
