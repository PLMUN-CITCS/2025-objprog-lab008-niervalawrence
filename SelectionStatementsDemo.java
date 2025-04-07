public class SelectionStatementsDemo {
    public static void main(String[] args) {
        int studentScore = 82;
        
        // First check: Is the student passing?
        if (studentScore >= 60) {
            System.out.println("You passed the exam!");
            
            // Second check: Is the student excellent?
            if (studentScore >= 90) {
                System.out.println("Excellent performance!");
                System.out.println("Grade: A");
            } else {
                System.out.println("Keep improving!");
                
                // Third check: Grading based on score
                if (studentScore >= 75) {
                    System.out.println("Grade: B");
                } else {
                    System.out.println("Grade: C");
                }
            }
        } else {
            // If student score is below 60
            System.out.println("You did not pass the exam.");
            System.out.println("Grade: F");
        }
        
        // Multi-way grade check (using else-if)
        if (studentScore >= 90) {
            System.out.println("Multi-way Grade: A");
        } else if (studentScore >= 80) {
            System.out.println("Multi-way Grade: B");
        } else if (studentScore >= 70) {
            System.out.println("Multi-way Grade: C");
        } else if (studentScore >= 60) {
            System.out.println("Multi-way Grade: D");
        } else {
            System.out.println("Multi-way Grade: F");
        }
    }
}
