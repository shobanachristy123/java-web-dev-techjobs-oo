package org.launchcode.techjobs_oo;

public class Main {

//    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
//    }


    Job job1 = new Job("job1", "Mastercard");
    Job job2 = new Job("job2", "mastercard");
    Job job3 = new Job("job3", "mastercard");

    Employer mastercard = new Employer(
            "Mastercard"
    );
    Job job1 = new Job("job1", mastercard);
    Job job2 = new Job("job2", mastercard);
    Job job3 = new Job("job3", mastercard);

}
