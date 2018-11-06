package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobSequence1 {

    public static class Job {
        String name;
        int profit;
        int deadline;

        Job(String name, int profit, int deadline) {
            this.name = name;
            this.profit = profit;
            this.deadline = deadline;
        }

    }

    public static void schedule(ArrayList<Job> jobs) {
        Collections.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit-o1.profit;
            }
        });
        int cum_deadline=0;
        for (Job job:jobs) {
            if(job.deadline>cum_deadline){
                System.out.println(job.name);
                cum_deadline+=1;
            }
        }

    }

    public static void PrintJobs(ArrayList<Job> jobs) {
        for (Job job : jobs) {
            System.out.println(job.deadline + " " + job.profit + " " + job.name);
        }
    }

    public static void main(String[] args) {

        ArrayList<Job> jobs = new ArrayList<Job>(5);
        jobs.add(new Job("a", 100, 2));
        jobs.add(new Job("b", 19, 1));
        jobs.add(new Job("c", 27, 2));
        jobs.add(new Job("d", 25, 1));
        jobs.add(new Job("e", 15, 3));

        schedule(jobs);
        PrintJobs(jobs);

    }
}
