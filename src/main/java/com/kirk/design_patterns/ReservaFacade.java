package com.kirk.design_patterns;

public class ReservaFacade {
    
    private Carro carro;
    private Hotel hotel;
    private Voo voo;

    public ReservaFacade() {
        carro = new Carro();
        hotel = new Hotel();
        voo = new Voo();
    }

    public String reservaCompletada(){
        String carroMsg = carro.reservarCarro();
        String hotelMsg = hotel.reservarHotel();
        String vooMsg = voo.reservarVoo();
        return carroMsg + "\n" + hotelMsg + "\n" + vooMsg + "\n" + "Reserva completada.";
    }
}
