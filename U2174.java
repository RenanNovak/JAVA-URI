package UriOnline; 

import java.util.*; 

public class Uri2174 { 

    public static void main(String[] args) { 

        Scanner NumeroPokemom = new Scanner(System.in); 

        System.out.print("Digite a quantidade de pokemons capturados"); 

        int ValorNumeroPokemom = NumeroPokemom.nextInt(); 

        int TotalPokemom = 151; 

        ArrayList <String> ListaPokemons = new ArrayList <String> (); 

        for (int i = 0; i < ValorNumeroPokemom; i++) { 

            String NomePokemom = NumeroPokemom.next(); 

            if (!ListaPokemons.contains(NomePokemom)) { 

                ListaPokemons.add(NomePokemom); 

            } 

        } 

        System.out.println(TotalPokemom - ListaPokemons.size()); 

    } 

} 