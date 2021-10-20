package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job()
    {
        id = nextId;
        nextId++;
    }

    public Job( String name, Employer employer, Location location, PositionType positionType,
                CoreCompetency coreCompetency )
    {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job( String name, String employer, String location, String positionType,
                String coreCompetency )
    {
       this();
       this.name = name;
       this.employer = new Employer( employer );
       this.location = new Location( location );
       this.positionType = new PositionType( positionType );
       this.coreCompetency = new CoreCompetency( coreCompetency );
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId()
    {
      return id;
    }

    public void setName( String name )
    {
      this.name = name;
    }
    public String getName()
    {
      return name;
    }

    public void setEmployer( Employer employer )
    {
      this.employer = employer;
    }
    public Employer getEmployer()
    {
      return employer;
    }

    public void setLocation( Location location )
    {
      this.location = location;
    }
    public Location getLocation()
    {
      return location;
    }

    public void setPositionType( PositionType positionType )
    {
      this.positionType = positionType;
    }
    public PositionType getPositionType()
    {
      return positionType;
    }

    public void setCoreCompetency( CoreCompetency coreCompetency )
    {
      this.coreCompetency = coreCompetency;
    }
    public CoreCompetency getCoreCompetency()
    {
      return coreCompetency;
    }

    @Override
    public String toString()
    {
        String noJobMessage = "OOPS! This job does not seem to exist.";

        StringBuilder descriptor = new StringBuilder( "\nID: " + getId() + "\n" );
        descriptor.append( "Name: " );
        descriptor.append( getName() == null || getName().length() == 0 ?
          "Data not available\n" : getName() + "\n" );

        descriptor.append( "Employer: " );
        descriptor.append( getEmployer() == null || getEmployer().getValue() == null || getEmployer().getValue().trim().length() == 0 ?
          "Data not available\n" : getEmployer().getValue() + "\n" );

        descriptor.append( "Location: " );
        descriptor.append( getLocation() == null || getLocation().getValue() == null || getLocation().getValue().trim().length() == 0 ?
                "Data not available\n" : getLocation().getValue() + "\n" );

        descriptor.append( "Position Type: " );
        descriptor.append( getPositionType() == null || getPositionType().getValue() == null || getPositionType().getValue().trim().length() == 0 ?
                "Data not available\n" : getPositionType().getValue() + "\n" );

        descriptor.append( "Core Competency: " );
        descriptor.append( getCoreCompetency() == null || getCoreCompetency().getValue() == null || getCoreCompetency().getValue().trim().length() == 0 ?
                "Data not available\n" : getCoreCompetency().getValue() + "\n" );

        String[] availCount = descriptor.toString().split( "Data not available" );
        if ( availCount.length == 6 )
        {
            return noJobMessage;
        }

        return descriptor.toString();
    }
}
