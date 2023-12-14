package flowable;

import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class CallExternalSystemDelegate implements JavaDelegate {

	public void execute(DelegateExecution execution) {

		Logger logger = Logger.getLogger(HolidayRequest.class);
		logger.info("Calling the external system for employee " + execution.getVariable("employee"));
	}

}