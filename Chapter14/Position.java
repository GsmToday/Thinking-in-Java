package typeinfo;

public class Position {
	private String title;
	private Person person;
	public Position(String jobTitle, Person employee){
		title = jobTitle;
		person = employee;
		if (person == null){
			person = Person.Null;
		}
	}
	public Position(String jobTitle){
		title = jobTitle;
		person = Person.Null;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String newTitle){
		this.setTitle(newTitle);
	}
	public Person getPerson(){
		return person;
	}
	
	public void setPerson(Person newPerson){
		person = newPerson.Null;
	}
	public String toString(){
		return "Position: "+ title + " " + person;
	}
	
}
