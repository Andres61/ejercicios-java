package chatGpt;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaReservasVuelos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vuelo> vuelos = new ArrayList<>();

        // Ingreso del número de vuelos disponibles
        System.out.print("Ingrese el número de vuelos disponibles: ");
        int numeroVuelos = scanner.nextInt();

        // Ingreso de datos de cada vuelo
        for (int i = 1; i <= numeroVuelos; i++) {
            System.out.println("\nIngrese los datos del vuelo " + i + ":");

            System.out.print("Origen: ");
            String origen = scanner.next();

            System.out.print("Destino: ");
            String destino = scanner.next();

            System.out.print("Fecha (DD/MM/AAAA): ");
            String fecha = scanner.next();

            System.out.print("Hora (HH:MM): ");
            String hora = scanner.next();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Asientos disponibles: ");
            int asientosDisponibles = scanner.nextInt();

            Vuelo vuelo = new Vuelo(origen, destino, fecha, hora, precio, asientosDisponibles);
            vuelos.add(vuelo);
        }

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Buscar vuelos por origen");
            System.out.println("2. Buscar vuelos por destino");
            System.out.println("3. Buscar vuelos por fecha");
            System.out.println("4. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            // Opción 1: Buscar vuelos por origen
            if (opcion == 1) {
                System.out.print("Ingrese el origen: ");
                String origenBusqueda = scanner.next();

                ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();

                for (Vuelo vuelo : vuelos) {
                    if (vuelo.getOrigen().equalsIgnoreCase(origenBusqueda)) {
                        vuelosEncontrados.add(vuelo);
                    }
                }

                if (vuelosEncontrados.isEmpty()) {
                    System.out.println("\nNo se encontraron vuelos con origen en " + origenBusqueda);
                } else {
                    System.out.println("\nVuelos encontrados:");
                    for (Vuelo vuelo : vuelosEncontrados) {
                        System.out.println(vuelo);
                    }

                    // Reserva de vuelo
                    System.out.print("\nIngrese el ID del vuelo a reservar: ");
                    int idVueloReserva = scanner.nextInt();

                    boolean encontrado = false;
                    for (Vuelo vuelo : vuelosEncontrados) {
                        if (vuelo.getId() == idVueloReserva) {
                            encontrado = true;

                            if (vuelo.getAsientosDisponibles() > 0) {
                                vuelo.reservarAsiento();
                                System.out.println("\nReserva exitosa. Asiento reservado en el vuelo con ID " + vuelo.getId());
                            } else {
                                System.out.println("\nNo se puede realizar la reserva. No hay asientos disponibles en el vuelo con ID " + vuelo.getId());
                            }

                            break;
                        }
                    }
                }
            }

            if (!encontrado) {
                System.out.println("\nNo se encontró ningún vuelo con ID " + idVueloReserva);
            }

            // Opción 2: Buscar vuelos por destino
            else if (opcion == 2) {
                System.out.print("Ingrese el destino: ");
                String destinoBusqueda = scanner.next();

                ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();

                for (Vuelo vuelo : vuelos) {
                    if (vuelo.getDestino().equalsIgnoreCase(destinoBusqueda)) {
                        vuelosEncontrados.add(vuelo);
                    }
                }

                if (vuelosEncontrados.isEmpty()) {
                    System.out.println("\nNo se encontraron vuelos con destino en " + destinoBusqueda);
                } else {
                    System.out.println("\nVuelos encontrados:");
                    for (Vuelo vuelo : vuelosEncontrados) {
                        System.out.println(vuelo);
                    }

                    // Reserva de vuelo
                    System.out.print("\nIngrese el ID del vuelo a reservar: ");
                    int idVueloReserva = scanner.nextInt();

                    boolean encontrado = false;
                    for (Vuelo vuelo : vuelosEncontrados) {
                        if (vuelo.getId() == idVueloReserva) {
                            encontrado = true;

                            if (vuelo.getAsientosDisponibles() > 0) {
                                vuelo.reservarAsiento();
                                System.out.println("\nReserva exitosa. Asiento reservado en el vuelo con ID " + vuelo.getId());
                            } else {
                                System.out.println("\nNo se puede realizar la reserva. No hay asientos disponibles en el vuelo con ID " + vuelo.getId());
                            }

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\nNo se encontró ningún vuelo con ID " + idVueloReserva);
                    }
                }

                // Opción 3: Buscar vuelos por fecha
            } else if (opcion == 3) {
                System.out.print("Ingrese la fecha (DD/MM/AAAA): ");
                String fechaBusqueda = scanner.next();

                ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();

                for (Vuelo vuelo : vuelos) {
                    if (vuelo.getFecha().equalsIgnoreCase(fechaBusqueda)) {
                        vuelosEncontrados.add(vuelo);
                    }
                }

                if (vuelosEncontrados.isEmpty()) {
                    System.out.println("\nNo se encontraron vuelos en la fecha " + fechaBusqueda);
                } else {
                    System.out.println("\nVuelos encontrados:");
                    for (Vuelo vuelo : vuelosEncontrados) {
                        System.out.println(vuelo);
                    }

                    // Reserva de vuelo
                    System.out.print("\nIngrese el ID del vuelo a reservar: ");
                    int idVueloReserva = scanner.nextInt();

                    boolean encontrado = false;
                    for (Vuelo vuelo : vuelosEncontrados) {
                        if (vuelo.getId() == idVueloReserva) {
                            encontrado = true;

                            if (vuelo.getAsientosDisponibles() > 0) {
                                vuelo.reservarAsiento();





