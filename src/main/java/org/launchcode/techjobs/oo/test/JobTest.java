package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testJobConstructorSetsAllFields()
    {
        Employer emp = new Employer();
        emp.setValue( "employer" );

        Location loc = new Location();
        loc.setValue( "location" );

        PositionType posType = new PositionType();
        posType.setValue( "positiontype" );

        CoreCompetency cc = new CoreCompetency();
        cc.setValue( "corecompetency" );

        Job job = new Job();
        job.setName( "Name" );
        job.setEmployer( emp );
        job.setLocation( loc );
        job.setPositionType( posType );
        job.setCoreCompetency( cc );

        assertEquals( "Name", job.getName() );
        assertEquals( job.getEmployer().getValue(), "employer" );
        assertEquals( job.getLocation().getValue(), "location" );
        assertEquals( job.getPositionType().getValue(), "positiontype" );
        assertEquals( job.getCoreCompetency().getValue(), "corecompetency" );
        assertTrue( job.getName().equals("Name") );
        assertTrue( job.getEmployer().equals(emp) );
        assertTrue( job.getLocation().equals(loc) );
        assertTrue( job.getPositionType().equals(posType) );
        assertTrue( job.getCoreCompetency().equals(cc) );
    }

    @Test
    public void testJobsForEquality()
    {
        Job job = new Job();
        assertFalse( job.equals(new Job()) );
    }

    @Test
    public void testSettingJobId()
    {
        Job job = new Job();
        Job job2 = new Job();
        assertNotEquals( job.getId(), job2.getId() );
    }

    @Test
    public int testSettingId( int id )
    {
        Job job = new Job();
        return job.getId();
    }

    @Test
    public void testToStringHandlesEmptyField()
    {
        String jobName = "name";
        String notAvail = "Data Not Available";

        Job job = new Job();
        job.setName( jobName );

        StringBuilder sb = new StringBuilder( "\n" );
        sb.append( "ID: " + job.getId() + "\n" );
        sb.append( "Name: " + jobName + "\n" );
        sb.append( "Employer: " + notAvail + "\n" );
        sb.append( "Location: " + notAvail + "\n" );
        sb.append( "Position: " + notAvail + "\n" );
        sb.append( "Core: " + notAvail + "\n" );

        assertEquals( sb.toString(), job.toString() );
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine()
    {
        Job job = new Job();
        job.setName( "name" );
        assertEquals( '\n', job.toString().charAt(0) );
        assertEquals( '\n', job.toString().charAt( job.toString().length() - 1) );
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData()
    {
      String jobName = "name";
      String employer = "DST";
      String location = "Kansas City, MO";
      String position = "Senior Software Engineer";
      String core = "Java";

      Job job = new Job( jobName, employer, location, position, core );

      StringBuilder sb = new StringBuilder( "\n" );
      sb.append( "ID: " + job.getId() + "\n" );
      sb.append( "Name: " + jobName + "\n" );
      sb.append( "Employer: " + employer + "\n" );
      sb.append( "Location: " + location + "\n" );
      sb.append( "Position: " + position + "\n" );
      sb.append( "Core: " + core + "\n" );


      assertEquals( sb.toString(), job.toString() );
    }
}
