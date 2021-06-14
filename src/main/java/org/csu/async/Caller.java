package org.csu.async;

public class Caller<T> {

  final OnCall<T> onCall;

  public Caller(OnCall<T> onCall) {
    this.onCall = onCall;
  }

  public Calling call(Receiver<T> receiver) {
    this.onCall.call(receiver);
    return receiver;
  }

  public interface OnCall<T> extends Action1<Receiver<T>> {

  }
}
