//import java.util.Scanner;
//
//public class Accenture{
//    public static Abhi getTicketDetails(){
//        Scanner sc = new Scanner(System.in);
//        Abhi tc = new Abhi();
//        System.out.println("Enter the ticketid:");
//        tc.setTicketid(sc.nextInt());
//        System.out.println("Enter the price:");
//        tc.setPrice(sc.nextInt());
//        return tc;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of bookings:");
//        int booking = sc.nextInt();
//        System.out.println("Enter the available tickets:");
//        Abhi avail = new Abhi();
//        avail.setAvailableTickets(sc.nextInt());
//        for(int i = 0; i < booking; i++){
//        	Abhi t = new Abhi();
//            t = getTicketDetails();
//            System.out.println("Enter the no of tickets:");
//            int nooftickets = sc.nextInt();
//            if(t.getAvailableTickets()>nooftickets) {
//            System.out.println("Available ticket:"+t.getAvailableTickets());
//            int cost = t.calculateTicketCost(nooftickets);
//            if(cost != -1){
//                System.out.println("Total amount:"+cost);
//                System.out.println("Available ticket after booking:"+t.getAvailableTickets());
//                System.out.println();
//            }
//            }
//            else {
//            	System.out.println("fail");
//            }
//        }
//    }
//}