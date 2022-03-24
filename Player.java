/**
 * A class that 
 *
 * @author Andrew DeSimone
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Player implements CompetitorInterface
{
	
	private String name, team;
	List<String> weapons;
	private String implement;
	
	//default constructor
	public Player()
	{
		this.name = "name";
		this.team = "team";
		weapons = new ArrayList<String>();
	}
	
	//constructor which allows client to input the name and team
	public Player(String name, String team)
	{
		this.name = name;
		this.team = team;
		this.weapons = new ArrayList<String>();
	}
	
	//adds rock, paper, or scissor to the weapon list
	public void addImplement(String temp)
	{
		weapons.add(temp);
	}
	
	//gets name of player
	@Override
	public String getName() 
	{
		return name;
	}

	//gets name of team
	@Override
	public String getTeam() 
	{
		return team;
	}

	//returns true if defeats opponent
	@Override
	public boolean defeats(CompetitorInterface opponent) 
	{
		Player temp = (Player) opponent;
		this.retrieveImplement();
		temp.retrieveImplement();
		if(this.getImplement().equals("rock"))
		{
			if(temp.getImplement().equals("scissors"))
			{
				return true;
			}
		}
		else if(this.getImplement().equals("paper"))
		{
			if(temp.getImplement().equals("rock"))
			{
				return true;
			}
		}
		else
		{
			if(temp.getImplement().equals("paper"))
			{
				return true;
			}
		}
		
		return false;
	}

	
	//returns player as a string
	public String toString()
	{
		return "Team: " + team + " Name: " + name;
	}

	//returns the current weapon
	public String getImplement() 
	{
		return implement;
	}
	
	//replaces the current weapon with the next weapon
	public void retrieveImplement()
	{
		implement = weapons.remove(0);
	}
	
}