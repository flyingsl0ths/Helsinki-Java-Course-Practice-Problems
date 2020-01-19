// Exercise 90: Team and Players

import java.util.ArrayList;

public class Team
{
    private String name;
    private int playerLimit = 16;
    private int teamGoals = 0;
    private ArrayList<Player> playerList;
    
    public Team(String name)
    {
        this.name = name;
        this.playerList = new ArrayList<Player>();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void addPlayer(Player plyr)
    {
        if(this.playerList.size() < this.playerLimit)
        {
            playerList.add(plyr);
        }
    }
    
    public void printPlayers()
    {
        for(Player p : this.playerList)
        {
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int maxSize)
    {
        this.playerLimit = maxSize;
    }
    
    public int size()
    {
        return this.playerLimit;
    }
    
    public int goals()
    {   
        for(Player  p : playerList)
        {
            this.teamGoals += p.goals();
        }
        
        return this.teamGoals;
    }
    
    public static class Player
    {
        private String playerName;
        private int amountOfGoals = 0;
        
        public Player(String playerName)
        {
            this.playerName = playerName;
        }
        
        public Player(String playerName, int amountOfGoals)
        {
            this.playerName = playerName;
            this.amountOfGoals = amountOfGoals;
        }
        
        public String getName()
        {
            return this.playerName;
        }
        
        public int goals()
        {
            return this.amountOfGoals;
        }
        
        public String toString()
        {
            return this.getName() + ", goals " + this.goals();
        }
    }
    
    public static void main(String[] args) 
    {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
