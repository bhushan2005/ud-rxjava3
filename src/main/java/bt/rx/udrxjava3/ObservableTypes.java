package bt.rx.udrxjava3;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class ObservableTypes {

    public static void main (String[] args) {

        Observable<String> source = Observable.just("Alex", "Justin","Jack");
        Observable<String> emptySource = Observable.empty();


        Single<String> single =  source.first("Default emit");
        single.subscribe(System.out::println);

        Single<String> singleForEmpty = emptySource.first("Default emit");
        singleForEmpty.subscribe(System.out::println);


        Single.just("Dave").subscribe(System.out::println);

        Maybe<String> maybe = emptySource.firstElement();
        maybe.subscribe(a -> System.out.println("Now here"),
                e -> e.printStackTrace(),
                () -> System.out.println("Now Completed"));

        Completable completable = Completable.complete();
        completable.subscribe(() -> System.out.println("Completed"));


        //The subscribe starts the execution of the Runnable process.
        Completable.fromRunnable( () -> System.out.println("Some process executing"))
                .subscribe(() -> System.out.println("The process executed successfully"));





    }


}
