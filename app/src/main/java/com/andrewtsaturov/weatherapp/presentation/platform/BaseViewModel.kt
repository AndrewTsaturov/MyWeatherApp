package com.begeton.presentation.platform

import androidx.lifecycle.*
import com.andrewtsaturov.weatherapp.presentation.extensions.MessageEvent
import com.andrewtsaturov.weatherapp.presentation.extensions.NavigationEvent
import io.reactivex.*
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer


abstract class BaseViewModel : ViewModel(), LifecycleOwner {

    @Suppress("LeakingThis")
    private val lifecycle = LifecycleRegistry(this)
    protected val disposables: CompositeDisposable = CompositeDisposable()

    val navigationEvent = NavigationEvent()

    protected val responseErrorHandler = { error: Throwable ->
//        val message = when (error) {
//            is SocketTimeoutException -> R.string.connection_error_slow_internet
//            is UnknownHostException -> R.string.connection_error_no_internet
//            else -> R.string.connection_error_default
//        }
//
//        snackbarMessage.postValue(message)
//        //Timber.e(error)
    }

    val snackbarMessage by lazy { MessageEvent() }

    init {
        lifecycle.currentState = Lifecycle.State.RESUMED
    }

    override fun getLifecycle() = lifecycle

    override fun onCleared() {
        disposables.clear()
        lifecycle.currentState = Lifecycle.State.DESTROYED
    }

    private fun showProgress() {
        // TODO
    }

    private fun hideProgress() {
        // TODO
    }

    fun Completable.withLoadingProgress(): Completable {
        return this.doFinally(::hideProgress)
    }

    fun <T> Single<T>.withLoadingProgress(): Single<T> {
        return this.doFinally(::hideProgress)
    }

    fun <T> Maybe<T>.withLoadingProgress(): Maybe<T> {
        return this.doFinally(::hideProgress)
    }

    fun <T> Observable<T>.withLoadingProgress(): Observable<T> {
        return this.doFinally(::hideProgress)
    }

    fun <T> Flowable<T>.withLoadingProgress(): Flowable<T> {
        return this.doFinally(::hideProgress)
    }

    fun Completable.subscribeSimple(
    onError: (Throwable) -> Unit = responseErrorHandler,
        onComplete: () -> Unit
    ): Disposable {
        return subscribe(Action(onComplete), Consumer(onError))
    }

    fun <T> Single<T>.subscribeSimple(onError: (Throwable) -> Unit = responseErrorHandler,
        onSuccess: (T) -> Unit
    ): Disposable {
        return subscribe(Consumer(onSuccess), Consumer(onError))
    }

    fun <T> Maybe<T>.subscribeSimple(
        onError: (Throwable) -> Unit = responseErrorHandler,
        onSuccess: (T) -> Unit
    ): Disposable {
       return subscribe(Consumer(onSuccess), Consumer(onError))
    }

    fun <T> Observable<T>.subscribeSimple(
        onError: (Throwable) -> Unit = responseErrorHandler,
        onNext: (T) -> Unit
    ): Disposable {
        return subscribe(Consumer(onNext), Consumer(onError))
    }

    fun <T> Flowable<T>.subscribeSimple(
        onError: (Throwable) -> Unit = responseErrorHandler,
       onNext: (T) -> Unit
    ): Disposable {
        return subscribe(Consumer(onNext), Consumer(onError))
    }
}