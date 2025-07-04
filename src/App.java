import controller.ejercicios;

public class App {
    public static void main(String[] args) {
       // ContactoController contactoController = new ContactoController();
        ejercicios ejercicios = new ejercicios();

        System.out.println( ejercicios.tieneduplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println( ejercicios.tieneduplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println( ejercicios.esIsograma("Murcielago"));
        System.out.println( ejercicios.esIsograma("Camaleon"));
        System.out.println("Palabras unicas: " + ejercicios.contarPalabrasUnicas( """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."""));
        System.out.println("Palabras unicas: " + ejercicios.contarPalabrasUnicas(" ¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos."));
        System.out.println("Palabras unicas: " + ejercicios.contarPalabrasUnicas("Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante."));
        ejercicios.compararTexto(" ¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.",
                                 "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.");
    }   
        }
