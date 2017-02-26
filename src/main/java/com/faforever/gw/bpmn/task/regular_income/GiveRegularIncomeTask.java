package com.faforever.gw.bpmn.task.regular_income;


import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class GiveRegularIncomeTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("select all active characters tasks");

//        execution.setVariable("activeCharacters", Arrays.asList(new Character("alfons"), new Character("bernd"), new Character("christian")));
    }

    public List<Object> getChars() {
        return Arrays.asList("dieter", "erich", "franz");
    }
}