package bt.rx.udrxjava3;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObserver {

    public static void main (String[] args) {

        Observable<Integer> source = Observable.just(10, 11, 12);

        source.subscribe(System.out::println);
        source.subscribe(System.out::println, Throwable::printStackTrace);
        source.subscribe(System.out::println, Throwable::printStackTrace, System.out::println);
    }


}
