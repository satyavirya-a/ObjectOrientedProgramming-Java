package main;

import models.*;


public class Main {

	public static void main(String[] args) { 
        // Airport(nama, jumlah pendapatan awal) 
        Airport arradiusAirport = new Airport("Arradius National Airport", 0); 
 
       // Promo(nama promo, promo untuk jenis penerbangan, sisa/jumlah promo yang tersedia, jenis promo, nilai promo) 
        Promo promo1 = new Promo("DISC20%", "Business", 1, "diskon-persen", 20); 
        Promo promo2 = new Promo("POTONG100K", "First Class", 10, "potongan-uang", 100_000); 
 
        // Flight(nama penerbangan, keberangkatan, destinasi, jam keberangkatan, waktu penerbangan dalam menit, harga ekonomi, harga bisnis, harga first class) 
      Flight flight1 = new Flight("GA123", "Jakarta", "Bali", "10:00 AM", 150, 500_000, 1_000_000, 1_500_000); 
      Flight flight2 = new Flight("SQ456", "Jakarta", "Singapore", "02:30 PM", 200, 700_000, 1_300_000, 1_800_000); 
      Flight flight3 = new Flight("LO190", "Sentul", "Pontianak", "12:00 PM", 180, 900_000, 1_000_000, 1_400_000); 
 
        System.out.println("--------------------------------------------------------------"); 
        // airport.addFlight(penerbangan) 
        arradiusAirport.addFlight(flight1); 
        arradiusAirport.addFlight(flight2); 
        System.out.println("--------------------------------------------------------------"); 
 
        // Customer(nama, email, saldo dalam ribuan rupiah) 
        Customer matthew = new Customer("Matthew Anderson", "matthewanderson@email.com", 2_000_000); 
        Customer edwin = new Customer("Edwin Hendly", "edwinhendly@email.com", 500_000); 
        Customer lidya = new Customer("Lidya Laura", "lidyalaura@email.com", 10_000_000); 
 
        // customer.bookTicket(airport, penerbangan, jumlah tiket, jenis penerbangan, promo) 
        matthew.bookTicket(arradiusAirport, flight3, 1, "First Class", promo1); 
        matthew.bookTicket(arradiusAirport, flight2, 1, "First Class", promo1); 
        Transaction tr1 = matthew.bookTicket(arradiusAirport, flight1, 1, "Business", promo1); 
        edwin.bookTicket(arradiusAirport, flight2, 1, "Business", null); 
        lidya.bookTicket(arradiusAirport, flight1, 1, "Business", promo1); 
        Transaction tr2 = lidya.bookTicket(arradiusAirport, flight1, 2, "First Class", promo2); 
        System.out.println("--------------------------------------------------------------"); 
 
        flight1.displayFlightInfo(); 
 
        // customer.addBalance(jumlah uang dalam ribuan rupiah) 
        edwin.addBalance(1_000_000); 
        edwin.bookTicket(arradiusAirport, flight2, 1, "Business", null); 
        lidya.bookTicket(arradiusAirport, flight2, 1, "First Class", promo2); 
        // promo.addPromoAvailibility(jumlah promo yang ingin ditambahkan) 
        promo1.addPromoAvailibility(1); 
        lidya.bookTicket(arradiusAirport, flight1, 1, "Business", promo1); 
        System.out.println("--------------------------------------------------------------");

	}
}
