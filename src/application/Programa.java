package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.Cliente;
import classes.ItemPedido;
import classes.Pedido;
import classes.Produto;
import classes.enums.Status;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Data de nascimento (dd/MM/yyyy): ");
		Date dtaNasc = sdf.parse(sc.next());

		System.out.println("Dados do pedido:");
		System.out.print("Data do pedido: ");
		Date dataPedido = sdf.parse(sc.next());
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine().toUpperCase();
		System.out.print("Digite a quantidade de itens do pedido: ");
		Integer n = sc.nextInt();

		Pedido pedido = new Pedido(dataPedido, Status.valueOf(status), new Cliente(nomeCliente, email, dtaNasc));

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do item " + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();

			ItemPedido item = new ItemPedido(quantidade, preco, new Produto(nomeProd, preco));
			pedido.addItem(item);
		}
		System.out.println("Lista do Pedido: ");
		System.out.print(pedido);

		sc.close();

	}

}
