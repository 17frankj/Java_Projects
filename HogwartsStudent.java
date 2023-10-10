public class HogwartsStudent 
{
    // Implement instance variables, a constructor, getters, and setters
    private String name;
    private String gender;
    private int year;
    private String house;
    private String favoriteSpell;

    // Constructer
    public HogwartsStudent(String name, String gender, int year, String house, String favoriteSpell)
    {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.house = house;
        this.favoriteSpell = favoriteSpell;
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public int getYear()
    {
        return year;
    }
    public String getHouse()
    {
        return house;
    }
    public String getFavoriteSpell()
    {
        return favoriteSpell;
    }

    // Setters
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setGender(String newGender)
    {
        this.gender = newGender;
    }
    public void setYear(int newYear)
    {
        this.year = newYear;
    }
    public void sethouse(String newHouse)
    {
        this.house = newHouse;
    }
    public void setFavoriteSpell(String newfavoirteSpell)
    {
        this.favoriteSpell = newfavoirteSpell;
    }

    // Implement a toString method:
  
    public String toString(String name, String gender)
    {
        if(this.gender.equalsIgnoreCase("female"))
        {
            return "Witch name: " + this.name;
        }
        else if(this.gender.equalsIgnoreCase("male"))
        {
            return "Wizard name: " + this.name;
        }
        else
        {
            return "Magical Being name: " + this.name;
        }
    }
}
