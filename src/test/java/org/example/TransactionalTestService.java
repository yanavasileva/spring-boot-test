package org.example;

import org.camunda.bpm.engine.runtime.ProcessInstance;

public interface TransactionalTestService {

  ProcessInstance doOk();

  void doThrowing();

}
