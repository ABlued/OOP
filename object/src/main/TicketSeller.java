package main;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
       ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
    /**
     * ticketOffice의 가시성이 private이고 접근 가능한 퍼블릭 메서드가 더 이상 존재하지 않기 때문에
     * 외부에서는 ticketOffice에 직접 접근할 수 없다. 결과적으로 ticketOffice에 대한 접근은 오직 TicketOffice에 대한
     * 접근은 오직 TicketSeller 안에만 존재하게 된다. 따라서 TicketSeller는 ticketOffice에서 티겟을 꺼내거나
     * 판매 요금을 적립하는 일을 스스로 수행할 수 밖에 없다.
     *
     * 이처럼 개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 캡슐화라고 부르다.
     * 캡슐화의 목적은 변경하기 쉬운 객체를 만드는 것이다.
     * 캡슐화를 통해 객체 내부로의 접근을 제한하면 객체와 객체 사이의 결합도를 낮출 수 있기 때문에 설계를 좀 더 쉽게 변경할 수 있게 된다.
     */
}
