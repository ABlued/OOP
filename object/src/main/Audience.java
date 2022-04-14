package main;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}

/**
 * 코드를 수정한 결과, TicketSeller와 Audience 사이의 결합도가 낮아졌다. 또한 내부 구현이 캡슐화됐으므로 Audience와
 * TicketSeller가 내부 구현을 외부에 노출하지 않고 자신의 문제를 스스로 책임지고 해결한다는 것이다.
 * 즉 자율적인 존재가 된 것이다.
 */
