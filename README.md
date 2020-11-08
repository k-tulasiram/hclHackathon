# hclHackathon

	table for customer
	Object for Customer
	Plan entity
	Application Entity
	Customer Entity
	Document Entity
	Status ENUM
	Status

 	Customer: 
	Name: 		Email:		Contact Number:		Address(String):

	Plan:
	Name: 		Cost: 		Description: 

	Application:
	ApplicationID
	Status ENUM
	Comments
	customerID
	PlanID
	DocumentID
	Assigned Phone Number

	Document:
	DocumentID: 	DocumentName: 		URI: 
	
	Endpoints:
		
		Request from customer:
		
			Post Method
			Customer Information
			Document Information 
			Plan Selection
			
			
			Returns: Request ID : Application ID
			
		Retrieve Application Status by Customer
			Get Method
			getApplication/{id}
			
		
		Get the List of new connection requests (Inprogress, Referback)
		
		Get the details of selected application {applicationID}
		
		Get the document details {documentID}
		
		Update the application Status {applicationID + StatusID + Comments)
		
		Get the list of all available phone numbers
		
		Update the Assigned phone number to the applicationID {Assigned phone number + Applicaiton ID}
			
	
Batch job to call the 
Get the List of new connection requests{Approved}
update the application status Approved status to Connection Enabled

