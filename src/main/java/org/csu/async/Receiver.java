package org.csu.async;

public abstract class Receiver<T> implements Callee<T>, Calling {

  private volatile boolean unCalled;

  @Override
  public void unCall() {
    unCalled = true;
  }

  @Override
  public boolean isUnCalled() {
    return unCalled;
  }
}
