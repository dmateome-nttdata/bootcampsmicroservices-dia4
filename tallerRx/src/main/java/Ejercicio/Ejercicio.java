package Ejercicio;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Ejercicio {

	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Mi", "nombre", "es", "David");

		Observer<String> observer1 = new Observer<String>() {

			public void onSubscribe(Disposable d) {
			}

			public void onNext(String message) {
				System.out.println("Observer 1: " + message);
			}

			public void onError(Throwable e) {
			}

			public void onComplete() {
			}
		};
		Observer<String> observer2 = new Observer<String>() {

			public void onSubscribe(Disposable d) {
			}

			public void onNext(String message) {
				System.out.println("Observer 2: " + message);
			}

			public void onError(Throwable e) {
			}

			public void onComplete() {
			}
		};

		observable.subscribe(observer1);
		observable.subscribe(observer2);
	}
}
