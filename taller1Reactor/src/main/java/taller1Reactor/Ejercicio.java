package taller1Reactor;

import java.util.function.Consumer;

import reactor.core.publisher.Flux;

public class Ejercicio {
	public static void main(String[] args) {
		Flux<String> publisher1 = Flux.just("Mensaje 1", "Mensaje 2");

		Consumer<String> consumer1 = System.out::println;

		Consumer<String> consumer2 = System.out::println;

		System.out.println("consumer1");
		publisher1.subscribe(consumer1);

		System.out.println("consumer2");
		publisher1.subscribe(consumer2);
	}
}
