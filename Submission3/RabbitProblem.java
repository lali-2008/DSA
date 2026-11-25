import java.util.Scanner;
public class RabbitProblem {
// Calculate rabbit pairs
long calculateRabbits(int months) {
if (months <= 0) {
return 0;
}
if (months == 1 || months == 2) {
return 1;
}
long previous = 1;
long current = 1;
for (int i = 3; i <= months; i++) {
long next = previous + current;
previous = current;
current = next;
}
return current;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
RabbitProblem rabbit = new RabbitProblem();
System.out.print("Enter the number of months: ");
int months = input.nextInt();
long result = rabbit.calculateRabbits(months);
System.out.println("Rabbit pairs: " + result);
input.close();
}
}