class Spell 
{
    //instance variables
    private String spell;
    private String description;

    Spell(String spell)
    {
        if(spell.equalsIgnoreCase("expelliarmus"))
        {
            this.spell = spell;
            this.description = "Disarming charm, knocks the victim's weapon out of their hands.";
        }
        else if(spell.equalsIgnoreCase("stupefy"))
        {
            this.spell = spell;
            this.description = "Stunning spell, renders its target unconscious.";
        }
        else if(spell.equalsIgnoreCase("levicorpus"))
        {
            this.spell = spell;
            this.description = "Dangles the target person upside-down by the ankle in mid-air.";
        }
    }

    //Getters

    public String getSpell()
    {
        return this.spell;
    }
    public String getDescription()
    {
        return this.description;
    }

    // Setters 

    public void setSpell(String spell)
    {
        this.spell = spell;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String toString(String spell)
    {
        if(spell.equalsIgnoreCase("expelliarmus"))
        {
            return this.spell;
        }
        else if(spell.equalsIgnoreCase("Stupefy"))
        {
            return this.spell;
        }
        else if(spell.equalsIgnoreCase("Levicorpus"))
        {
            return this.spell;
        }
        else
        {
            return "try again";
        }
    }
}


