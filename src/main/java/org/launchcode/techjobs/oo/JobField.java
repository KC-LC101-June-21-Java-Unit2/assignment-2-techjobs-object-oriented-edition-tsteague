package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField
{
    private static int nextId = 1;
    private String value;
    private int id;

    public JobField()
    {
      id = nextId;
      nextId++;
    }

    public int getId()
    {
      return id;
    }

    public int hashCode()
    {
      return Objects.hash(getId());
    }

    public abstract boolean equals(Object o);

    public String toString()
    {
      return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
