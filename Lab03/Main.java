public class Main {
    public static void main(String[] args) {
        // Create a UserStory without dependencies
        UserStory story1 = new UserStory(1, "User Registration", 5, null);

        // Create another UserStory that depends on story1
        UserStory story2 = new UserStory(2, "User Login", 3, new UserStory[]{story1});

        // Create a sprint with 10 hours capacity and a max of 5 tickets
        Sprint sprint = new Sprint(10, 5);

        // Try to add story2 to the sprint
        System.out.println("Adding story2 to sprint: " + sprint.addUserStory(story2));

        // Add story1 to sprint
        System.out.println("Adding story1 to sprint: " + sprint.addUserStory(story1));

        // Complete story1
        story1.complete();
        System.out.println("Completed story1: " + story1.isCompleted());

        // Try to complete story2 (now possible since dependency is done)
        story2.complete();
        System.out.println("Is story2 completed: " + story2.isCompleted());

        // Try to create a bug for completed story2
        Bug bug1 = Bug.createBug(3, "Captcha not checked", 2, story2);
        System.out.println("Created bug1: " + bug1);

        // Try to add bug to sprint
        System.out.println("Adding bug1 to sprint: " + sprint.addBug(bug1));

        // Print all tickets in sprint
        System.out.println("\nTickets in the sprint:");
        for (Ticket ticket : sprint.getTickets()) {
            System.out.println(ticket);
        }

        // Print total time estimate
        System.out.println("\nTotal sprint estimate: " + sprint.getTotalEstimate() + " hours");
    }
}
