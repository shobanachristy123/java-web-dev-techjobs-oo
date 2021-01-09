package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;
    Job test_job8;
    Job test_job9;
    Job test_job10;
    Job test_job11;
    @Before
    public void createJobObject(){
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        test_job4 = new Job("Front-End Developer",
                new Employer("Citi"),
                new Location("JAX"),
                new PositionType("Senior Developer"),
                new CoreCompetency("Persistence"));
        test_job5 = new Job("Front-End Developer",
                new Employer("Citi"),
                new Location("JAX"),
                new PositionType("Senior Developer"),
                new CoreCompetency("Persistence"));
        test_job6 = new Job("Front-End Developer",
                new Employer("Citi"),
                new Location("JAX"),
                new PositionType("Senior Developer"),
                null);

        test_job7 = new Job(null,
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        test_job8 = new Job("Product tester",
                null,
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        test_job9 = new Job("Product tester",
                new Employer("ACME"),
                null,
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        test_job10 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                null,
                new CoreCompetency("Persistence"));

        test_job11 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                null);
    }

    @Test
    public void testSettingJobId(){
        assertFalse(test_job1.getId() == test_job2.getId());  //testing that the Ids are not same
        assertTrue(test_job1.getId() + 1 == test_job2.getId()); // differs by 1
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertNotNull(test_job3.getName());     //testing whether it is null or not
        assertNotNull(test_job3.getEmployer());
        assertNotNull(test_job3.getLocation());
        assertNotNull(test_job3.getPositionType());
        assertNotNull(test_job3.getCoreCompetency());
        assertTrue(test_job3.getName() instanceof String);   //testing that constructor assigns the class
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job3.getName(),"Product tester");  // testing the value of each field
        assertEquals(test_job3.getEmployer().getValue(),"ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertEquals(test_job3.getPositionType().getValue(),"Quality control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void testToStringBlankLines(){
        /**
         * 1) get job information using job's toString
         * 2) check the job information string for blank lines
         * 3) assert the result
         */
        String jobInfo = this.test_job5.toString();
        assertTrue(jobInfo.startsWith("\n") && jobInfo.endsWith("\n"));
    }

    @Test
    public void testToStringContainsLabelDataStored(){   //testing
        String jobInfo = this.test_job5.toString();
        assertTrue(jobInfo.contains("Name:" + this.test_job5.getName() + "\n"));
        assertTrue(jobInfo.contains("Employer:"+ this.test_job5.getEmployer().getValue() +"\n"));
        assertTrue(jobInfo.contains("Location:" + this.test_job5.getLocation().getValue() + "\n"));
        assertTrue(jobInfo.contains("Position Type:" + this.test_job5.getPositionType().getValue() +"\n"));
        assertTrue(jobInfo.contains("Core Competency:" + this.test_job5.getCoreCompetency().getValue() + "\n"));
    }

    @Test
    public void testToStringEmptyFields(){
        String jobInfo = this.test_job7.toString();
        assertTrue(jobInfo.contains("Name:" + "Data not available"));
        jobInfo = this.test_job8.toString();
        assertTrue(jobInfo.contains("Employer:" + "Data not available"));
        jobInfo = this.test_job9.toString();
        assertTrue(jobInfo.contains("Location:" + "Data not available"));
        jobInfo = this.test_job10.toString();
        assertTrue(jobInfo.contains("Position Type:" + "Data not available"));
        jobInfo = this.test_job11.toString();
        assertTrue(jobInfo.contains("Core Competency:" + "Data not available"));
    }

    @Test
    public void testToStringThatHasOnlyId(){
        String jobInfo = this.test_job1.toString();
        assertEquals(jobInfo, "OOPS! This job does not seem to exist.");
    }
}
