package org.csu.async;

public interface Callee<T> {

  void onCompleted();

  void onError(Throwable throwable);

  void onReceive(T t);

}
