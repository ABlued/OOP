package main;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
/**
 * 이 코드들은 정상적으로 동작한다.
 * 하지만 모든 클래스들은 변경에 취약한 구조를 갖고 있다.
 * Ticket, TicketSellerm Bag, Aundience 구조가 바뀌면 enter 메소드가 변경을 해야한다.
 * 즉 Theater은 다른 클래스들간의 결합도가 너무 높다.
 *
 * 또한 관람객과 판매원이 소극장의 통제를 받는 수동적인 존재이다.
 * 소극장이 관람객의 허락도 없이 가방에 접근할 수 있고 매표소에 보관 중인 티겟과 현금에 마음대로 접근할 수 있다.
 * 즉 예상을 빗나가는 코드이다.
 */
