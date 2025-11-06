import java.util.*;

public class TicketSystem {
    public static void main(String[] args) {
        LinkedList<String> ticketQueue = new LinkedList<>();

     
        ticketQueue.add("Ticket #101");
        ticketQueue.add("Ticket #102");

        
        ticketQueue.addFirst("Urgent Ticket #U1");

       
        String nextTicket = ticketQueue.poll();
        System.out.println("Processing: " + nextTicket);

        
        System.out.println("Remaining Queue: " + ticketQueue);
    }
}
