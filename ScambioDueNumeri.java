public class ScambioDueNumeri {
    public static void main(String[] args) {
        int temperaturaCorrente = 30;
        int temperaturaDesiderata = 22;

        System.out.println("Prima dello scambio: Temperatura Corrente = " + temperaturaCorrente + ", Temperatura Desiderata = " + temperaturaDesiderata);

        // Scambio dei valori senza utilizzare una terza variabile
        temperaturaCorrente = temperaturaCorrente + temperaturaDesiderata;
        temperaturaDesiderata = temperaturaCorrente - temperaturaDesiderata;
        temperaturaCorrente = temperaturaCorrente - temperaturaDesiderata;

        System.out.println("Dopo lo scambio: Temperatura Corrente = " + temperaturaCorrente + ", Temperatura Desiderata = " + temperaturaDesiderata);
    }
}
