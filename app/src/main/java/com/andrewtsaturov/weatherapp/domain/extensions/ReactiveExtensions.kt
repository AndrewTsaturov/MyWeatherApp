import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Extension function to subscribe on the background thread and observe on the menu_home thread for a [Completable]
 * */
fun Completable.performOnBackgroundOutOnMain(): Completable {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

/**
 * Extension function to subscribe on the background thread and observe on the menu_home thread for a [Flowable]
 * */
fun <T> Flowable<T>.performOnBackgroundOutOnMain(): Flowable<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

/**
 * Extension function to subscribe on the background thread and observe on the menu_home thread  for a [Single]
 * */
fun <T> Single<T>.performOnBackgroundOutOnMain(): Single<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

fun <T> Single<T>.performOnComuputationOutOnMain(): Single<T> {
    return this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())
}


/**
 * Extension function to subscribe on the background thread and observe on the menu_home thread  for a [Maybe]
 * */
fun <T> Maybe<T>.performOnBackgroundOutOnMain(): Maybe<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

/**
 * Extension function to subscribe on the background thread and observe on the menu_home thread for a [Observable]
 * */
fun <T> Observable<T>.performOnBackgroundOutOnMain(): Observable<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

/**
 * Extension function to add a Disposable to a CompositeDisposable
 */
@Deprecated("Use rxkotlin", ReplaceWith("compositeDisposable += this"))
fun Disposable.call(compositeDisposable: CompositeDisposable) {
    compositeDisposable.add(this)
}

/**
 * Extension function to subscribe on the background thread for a Flowable
 * */
fun <T> Flowable<T>.performOnBackground(): Flowable<T> {
    return this.subscribeOn(Schedulers.io())
}

/**
 * Extension function to subscribe on the background thread for a Maybe
 * */
fun <T> Maybe<T>.performOnBackground(): Maybe<T> {
    return this.subscribeOn(Schedulers.io())
}

/**
 * Extension function to subscribe on the background thread for a Completable
 * */
fun Completable.performOnBackground(): Completable {
    return this.subscribeOn(Schedulers.io())
}

/**
 * Extension function to subscribe on the background thread for a Observable
 * */
fun <T> Observable<T>.performOnBackground(): Observable<T> {
    return this.subscribeOn(Schedulers.io())
}

/**
 * Extension function to subscribe on the menu_home thread for a Observable
 * */
fun <T> Observable<T>.performOnMain(): Observable<T> {
    return this.subscribeOn(AndroidSchedulers.mainThread())
}