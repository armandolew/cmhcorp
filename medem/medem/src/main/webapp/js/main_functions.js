/**
 * MEDEM consultores medicos
 * main_functions.js
 * Developers: Miriam Paola Reyes Garcia, Armando Lew Tamayo
 * Indigo Smart Software Development
 * 2015
 */

/**
 * showMessage.
 * Shows a modal dialog with a custom message.
 * @param String message - Message to be displayed.
 * @param String type - Type of the header (danger, success, info). 
 * @param String modalId - ID of the modal form.
 * 
 */

var MAX_FILE_SIZE = 8192;
var FILE_TYPES = ["jpg", "jpeg", "gif", "png"];
var ALPHANUMERIC_PATTER = /^[a-zA-Z0-9]+/;
var ALLOWED_AGE = 18;

/**
 * showMessage.
 * Uses a bootstrap modal dialog to show a message to the user.
 * @param message - Text to display
 * @param type - This will give the modal the look and feel.
 * @param modalId - To target the modal we require.
 */

showMessage = function(message, type, modalId){
	if(document.querySelector(modalId) != null){
	  $(modalId).find(".modal-body").html(message);
	  $(modalId).find(".modal-header").addClass("modal-header-" + type);
	  $(modalId).modal("toggle");
    }
	else console.log("Modal not found.");
}


/**
 * getEmployeeAge.
 * returns the age of the employee.
 * @param dateOfBirth
 * @returns age.
 */

getEmployeeAge = function(dateOfBirth){
	var birthdate = new Date(dateOfBirth);
	var cur = new Date();
	var diff = cur-birthdate; 
	var age = Math.floor(diff/(1000 * 60 * 24 * 365));
	
	return age;
}

/**
 * validateForm.
 * validates the required fields of an specific form.
 * @param formId - ID of the form to be validated.
 * @returns {Boolean}
 * 
 */

validateForm = function(formId){
	var validationResult = false;
	var errorMessagesList = "";
	var formInputsText;
	var formInputsSelect;
	var formInputsCheck;

	/** First, we need to verify that the form actually exists. **/
	
	if(document.querySelector(formId) != null){
		formInputsText = $(formId).find(".required-text");
		formInputsSelect = $(formId).find(".required-select");
		
		/** We get the text fields and the select fields **/
		formInputsText.each(function(){
			
		  /** For each text input field, we verify that their value is not null or empty **/	
		  if($(this).val() == "" || $(this).val() == null){
			  $(this).closest("div").addClass('has-error');
			  var message = "<b>" + $(this).attr("placeholder") + "</b> requerido <br/>";
			  errorMessagesList += message;
		  }
		  else{
			  /** Otherwise, we need to check that the values are ONLY alphanumeric **/
			  if(!($(this).val()).match(ALPHANUMERIC_PATTER)){
				  $(this).closest("div").addClass('has-error');
				  var message = "<b>" + $(this).attr("placeholder") + "</b>  no tiene formato alfanum&eacute;rico <br/>";
				  errorMessagesList += message;
			  }
			  
			  /** Also, we need to make sure that the new employee is old enough to work **/
			  if($(this).attr("name") == "dateOfBirth"){
				  if(getEmployeeAge($(this).val()) < ALLOWED_AGE){
					  $(this).closest("div").addClass('has-error');
					  $(this).val("");
					  var message = "El empleado no puede ser menor de <b>" + ALLOWED_AGE + " a&ntilde;os</b><br/>";
					  errorMessagesList += message;
				  }
			  }
		  }
		});
		
		
		/** Here we check that the values are set for each required dropdown **/ 
		formInputsSelect.each(function(){
			if($(this).val() == "" || $(this).val() == null){
			  $(this).closest("div").addClass('has-error');
			  var message = "<b>" + $(this).attr("data-name") + "</b> requerido <br/>";
			  errorMessagesList += message;			  
			}
		});
		
		/** The form has errors so we display them to the user **/
		if(errorMessagesList.length > 0){
			showMessage(errorMessagesList, "danger", "#myModal");
		}
		/** Otherwise, we are able to submit the form **/
		else{
			$("div.form-group").removeClass("has-error").addClass("has-success");
			validationResult = true;
		}
		
		return validationResult;
	}
	
}

/**
 * validateUploadForm.
 * validates the image upload form.
 * @param formId
 * @returns {Boolean}
 */

validateUploadForm = function(formId){
	var validationResult = false;
	var errorMessagesList = "";	
	if(document.querySelector(formId) != null){
		var selectedFile = $(formId).find("input:file")[0].files[0];
		if(selectedFile == "" || selectedFile == null || selectedFileSize < 1){
			errorMessagesList += "<b>Archivo</b> requerido";
		}
		else{
			var selectedFileSize = selectedFile.size;
			var selectedFileExtension = selectedFile.type.substr(selectedFile.type.lastIndexOf("/") + 1);
			
			if(selectedFile > MAX_FILE_SIZE){
				errorMessagesList += "<b>Archivo</b> excede el máximo permitido."
			}
			
			else if($.inArray(selectedFileExtension, FILE_TYPES) == -1){
				errorMessagesList += "<b>Extensi&oacute;n de archivo</b> inv&aacute;lida. (" + FILE_TYPES + ")";
			}
		}
		
		if(errorMessagesList.length > 0){
			$("#fileUpload .modal-body .alert .error-message").html(errorMessagesList);
			$("#fileUpload .modal-body .alert").show();
		}
		else{
			$("#fileUpload .modal-body .alert").hide();
			validationResult = true;
		}
		return validationResult;
	}
}


/**
 * logoutFormSubmit.
 * logs the user out of MEDEM app.
 */

logoutFormSubmit = function(){
	document.getElementById("logoutForm").submit();
}

/**
 * loadEmployeeInformation.
 * loads the employee's information via ajax.
 * @param employeeId
 */

loadEmployeeInformation = function(employeeId){
	console.log(employeeId);
	showMessage("Cargando informaci&oacute;n ...", "info", "#myModal");
	$.ajax({
		dataType: "json",
		url: "/medem/employeeInformation",
		type: "GET",
		data: {id: employeeId},
		success: function(data){
			if(data){
			  $.each(data, function(key, value){
			    $("input[name='"+key+"']").val(value);
			  });
			}
			$(".profile-usertitle-name").html(data.name + " " + data.lastName1 + " " + data.lastName2);
			$(".profile-usertitle-job").html(data.areaName);
			if(data.avatar != ""){
				$(".profile-userpic img").attr("src",data.avatar);
			}
			$("#employeeShow .container .employeeInfo").fadeIn("slow");
			$("#myModal").modal("hide");
		},
		error: function(){
			console.log("error");
		}
	});	
}


$(document).ready(function(){
	console.log($("body").attr("id") + " done.");
	
	// newEmployeeForm validation.
	$("#newEmployeeForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateForm("#newEmployeeForm");
		
		if(formValidation){
			console.log("ready to send");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("newEmployeeForm").submit();
		}
		
	});
	// newEmployeeForm validation.
	
	// editEmployeeForm validation.
	$("#editEmployeeForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateForm("#editEmployeeForm");
		
		if(formValidation){
			console.log("ready to send");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("editEmployeeForm").submit();
		}
		
	});
	// editEmployeeForm validation.	
	
	// fileUploadForm validation.
	$("#fileUploadForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateUploadForm("#fileUploadForm");
		
		if(formValidation){
			console.log("ready to send");
			$("#fileUpload").modal("hide");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("fileUploadForm").submit();
		}
		
	});
	// fileUploadForm validation.
	
	// newAreaForm validation
	$("#newAreaForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateForm("#newAreaForm");
		
		if(formValidation){
			console.log("ready to send");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("newAreaForm").submit();
		}
		
	});	
	// newAreaForm validation
	
	// newCompanyForm validation
	$("#newCompanyForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateForm("#newCompanyForm");
		
		if(formValidation){
			console.log("ready to send");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("newCompanyForm").submit();
		}
		
	});	
	// newCompanyForm validation	
	
	// editCompanyForm validation
	$("#editCompanyForm").on("submit", function(event){
		event.preventDefault();
		var formValidation = validateForm("#editCompanyForm");
		
		if(formValidation){
			console.log("ready to send");
			showMessage("Procesando ...", "success", "#myModal");
			document.getElementById("editCompanyForm").submit();
		}
		
	});	
	// editCompanyForm validation	
	
	// confirm-delete
	$("#confirm-delete").on("show.bs.modal", function(e) {
	  $(this).find(".btn-ok").attr("href", $(e.relatedTarget).data("href"));
	});
	// confirm-delete	
	
});