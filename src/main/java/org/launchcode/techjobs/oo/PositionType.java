package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField
{
    public PositionType()
    {
      super();
    }

    public PositionType(String value)
    {
      this();
      this.setValue( value );
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o)
    {  // Two objects are equal if they have the same id.
      if (this == o) return true;
      if (!(o instanceof PositionType)) return false;
      PositionType positionType = (PositionType) o;
      return getId() == positionType.getId();
    }

}
