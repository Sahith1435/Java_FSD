package Com_Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

public class EmployeeController {
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
	            BindingResult result, SessionStatus status) 
	{
	  //Validation code start
	  boolean error = false;
	   
	  System.out.println(employeeVO); //Verifying if information is same as input by user
	   
	  if(employeeVO.getFirstName().isEmpty()){
	    result.rejectValue("firstName", "error.firstName");
	    error = true;
	  }
	   
	  if(employeeVO.getLastName().isEmpty()){
	    result.rejectValue("lastName", "error.lastName");
	    error = true;
	  }
	   
	  if(employeeVO.getEmail().isEmpty()){
	    result.rejectValue("email", "error.email");
	    error = true;
	  }
	   
	  if(error) {
	    return "addEmployee";
	  }
	  //validation code ends
	   
	  //Store the employee information in database
	  //manager.createNewRecord(employeeVO);
	   
	  //Mark Session Complete
	  status.setComplete();
	  return "redirect:addNew/success";
	}
}