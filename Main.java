import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
		  public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			  
			  int c = 0;
		

				Scanner sc = new Scanner(System.in);

		Quarto quarto1 = new Quarto(1, "Individual", 30);
		Quarto quarto2 = new Quarto(2, "Casal", 50);
		Quarto quarto3 = new Quarto(3, "Criança", 80);
		Hotel hotel = new Hotel();
		Cliente cliente = new Cliente(0, null);	
		
		
		System.out.println("BEM-VINDO AO HOTEL");


		while (c != 4) { 
		System.out.println("Para check-in, digite 1");
		System.out.println("Para check-out, digite 2");
		System.out.println("Para adicionar consumaçao, digite 3");
		System.out.println("Para sair, digite 4");
		

			c = sc.nextInt();
			

	
			switch (c){
			case 1: 			

				cliente.id += 1;

				System.out.println("Digite o nome do cliente: ");
				cliente.nome = sc.next();
				System.out.println(cliente.id);

				System.out.println("O valor do Quarto "+ quarto1.numero + ", " + quarto1.descricao + ", é: " + quarto1.valor);
				System.out.println("O valor do Quarto "+ quarto2.numero + ", " + quarto2.descricao + ", é: " + quarto2.valor);
				System.out.println("O valor do Quarto "+ quarto3.numero + ", " + quarto3.descricao + ", é: " + quarto3.valor);
				System.out.println("Escolha o quarto: 1, 2 ou 3");
				hotel.quarto = sc.nextInt();

				System.out.println("Agora digite a data de entrada (dd/mm/yyyy)");
				String entrada = sc.next();
				System.out.println("Agora digite a data de saída (dd/mm/yyyy)");
				String saida = sc.next();
				
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				Date formatentrada = f.parse(entrada);
				Date formatsaida = f.parse(saida);
				
				Reserva reservatemp = new Reserva (cliente.id, cliente.nome, hotel.quarto, formatentrada, formatsaida);
		
				System.out.println("Olá, cliente " + cliente.id + ", seu ID é o " + cliente.id + ", voce está hospedado no quarto " + hotel.quarto + ", sua entrada será dia " + formatentrada + "e sua saída será dia " + formatsaida);
				System.out.println(reservatemp);
				if (hotel.quarto == 1) {
					System.out.println("o valor da diária do Quarto " + quarto1.descricao + " é " + quarto1.valor);
				} if (hotel.quarto == 2) {
					System.out.println("o valor da diária do Quarto " + quarto2.descricao + " é " + quarto3.valor);
				} if (hotel.quarto == 3) {
					System.out.println("o valor da diária do Quarto " + quarto2.descricao + " é " + quarto3.valor);
				}
				hotel.quartos.add(reservatemp);
				System.out.println(hotel.quartos);
				break;
				
			case 2:
				System.out.println("B");
				break;
				
			case 3:
				System.out.println("C");
				break;
			}
			
			}

			  sc.close();
		  }
	
}