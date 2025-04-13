package data;

import Interface.clientRepository;
import Interface.commandeRepository;

import data.persistance.ProduitJsonRepository;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProduitJsonRepository("produits.Json");
        commandeRepository commandeRepo = new commandeJsonRepository("commandes.json");
        clientRepository clientRepo = new ClientJsonRepository("clients.json");


        Produit produit1 = new Produit(1, "Ordinateur Portable", 799.99f,"en bon etat" ,5);
        Produit produit2 = new Produit(2, "Téléphone", 499.99f,"tres bien", 10);

        ProduitJsonRepository ProduitRepo = null;
        ProduitRepo.save(produit1);
        ProduitRepo.save(produit2);


        System.out.println("Liste des produits : ");
        List<Produit> produits = ProduitRepo.load();
        for (Produit p : produits) {
            System.out.println(p);
        }


        client client1 = new client(1, "John Doe", "john@example.com", "0789001234");
        clientRepo.save(client1);


        System.out.println("\nListe des clients : ");
        List<client> clients = clientRepo.load();
        for (client c : clients) {
            System.out.println(c);
        }


        employe employe1 = new employe(1, "Jane Smith", "Manager", "jane@company.com");


        System.out.println("\nListe des employés : ");
        clientRepository employeRepo;
        List<employe> employes = employeRepo.load();
        for (employe e : employes) {
            System.out.println(e);
        }


        commande commande1 = new commande(1, "2025-03-30","data.telephone");
        commandeRepo.save(commande1);


        System.out.println("\nListe des commandes : ");
        List<commande> commandes = commandeRepo.load();
        for (commande cmd : commandes) {
            System.out.println(cmd);
        }
    }

    private static void ProduitJsonRepository(String s) {
    }
}