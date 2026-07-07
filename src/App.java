import java.util.ArrayList;
import java.util.List;

import controllers.TicketControlador;
import models.TicketsSoporte;

public class App {
    public static void main(String[] args) throws Exception {
        List<TicketsSoporte> ticket = new ArrayList<>();
        ticket.add(new TicketsSoporte("TK-104", "Ana Torres",5 ));
        ticket.add(new TicketsSoporte("TK-101", "Luis Mora",2 ));
        ticket.add(new TicketsSoporte("TK-108", "Karol Poma",4 ));
        ticket.add(new TicketsSoporte("TK-104", "Luis Andrade",3 ));
        ticket.add(new TicketsSoporte("TK-103", "Anahi Cardenas",2 ));
        ticket.add(new TicketsSoporte("TK-107", "Carlos Mendez",4 ));
        ticket.add(new TicketsSoporte("TK-102", "Maria Nieves",1 ));

        TicketControlador ticketUno = new TicketControlador();
        ticketUno.agruparCodigoPorPrioridad(ticket);
        System.out.println(ticketUno);
        ticketUno.filtrarYOrdernarTickets(ticket, 1);
        System.out.println(ticketUno);
    }
}
