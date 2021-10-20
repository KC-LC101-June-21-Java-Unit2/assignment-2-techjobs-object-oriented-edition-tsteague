package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    public void testJobsForEquality()
    {
        Job job = new Job();
        assertFalse( job.equals(new Job()) );
    }

    public void testSettingJobId()
    {
        Job job = new Job();
        Job job2 = new Job();
    }

    public int testSettingId( int id )
    {
        Job job = new Job();
        return job.getId();
    }

    public void testToStringHandlesEmptyField()
    {
        Job job = new Job();
        assertEquals( "", job.toString() );
    }

    public void testToStringStartsAndEndsWithNewLine()
    {
        Job job = new Job();
        job.setName( "name" );
        assertEquals( "\n", job.toString().charAt(0) );
        assertEquals( "\n", job.toString().substring( job.toString().length() - 1) );
    }

    public void testToStringContainsCorrectLabelsAndData()
    {
      Job job = new Job();
      job.setName( "name" );

      assertEquals( "\nID: 1\nName: name\n", job.toString() );
    }
}
