package taller1Reactor;

import java.util.function.Consumer;

import reactor.core.publisher.Flux;

public class Ejercicio {
	public static void main(String[] args) {
		Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");

		publisher.subscribe(m -> System.out.println("Consumer 1. Received: " + m),

				e -> System.out.println("Consumer 1. Error: " + e),

				() -> System.out.println("Consumer 1. Completed: "));

		publisher.subscribe(m -> System.out.println("Consumer 2. Received: " + m),

				e -> System.out.println("Consumer 2. Error: " + e),
				() -> System.out.println("Consumer 2. Completed: "));
	}
}
