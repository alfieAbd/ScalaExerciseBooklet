/**
  * Created by alfie on 12/06/2017.
  *
  * Garage class that will hold Collections (ListBuffer[Any]) that will store the data.
  * One collection will store the status of vehicles in the garage.
  * One collection will store the details of all persons involved with the garage.
  * The class will have various functions to simulate the functionalities of a garage workshop.
  *
  * Will include labor and parts as variables as these are required for fixing cars.
  *
  */

class Garage(allVehicles: scala.collection.mutable.ListBuffer[Vehicle],
             allPersonelle: scala.collection.mutable.ListBuffer[Person]) {

//  var parts: String = vehicleParts
//  var labor: Int = laborHours
  var garageState: scala.collection.mutable.ListBuffer[Vehicle] = allVehicles
  var allPeople: scala.collection.mutable.ListBuffer[Person] = allPersonelle
  var toFix: Boolean = true


//  def printParts{ println(parts) }

//  def printLabor{ println(labor) }

  /**
    * Method to add vehicles to a garage. It will add all relevant details as specified in
    * Vehicle class.
    *
    * Will use: vehicleID, model, color, engine size, mileage, 'door' (Cars), 'isManual' (Car), 'sideCar' (Bike)
    *
    */

  def addVehicle(vehicle: Vehicle): Unit ={

    //Add vehicle to garage

    garageState += vehicle

  }


  /**
    * Method to remove vehicles to a garage. It will remove vehicles from the Collection. It should use either
    * vehicleID OR model as arguments to search the collection and perform the removal.
    *
    * Will use: vehicleID, model, color, engine size, mileage, 'door' (Cars), 'isManual' (Car), 'sideCar' (Bike)
    *
    */

  def removeVehicle(vehicleID: String): Unit = {

    // Remove vehicle from garageState using vehicleID as identifier.
      // Check through ListBuffer for match in vehicleID.
        // If there is a match, remove vehicle that contains that ID. (Use filter as List is immutable)

 //   garageState.foreach(garageState.map())


  }

  /**
    * Method to register new Employees that will be added to the Collection.
    *
    * Will use all parameters from the Person class as well as the parameters from the Employee class.
    * Data will be inserted into the allPeople Collection.
    *
    */


  def registerEmployee(employee: Employee): Unit ={

    // Check if employee already exists in the system
      // Print a message
    // Add employee to the allPersonelle Collection

    if(allPersonelle.contains(employee)) {
      println("Employee is already registered")
    } else {
      allPersonelle += employee
    }

  }

  /**
    * Method to change Vehicles from toFix state to fixed state. Will require Boolean value to check
    * whether the vehicle requires fixing. Once the vehicle has been fixed the Boolean value will be changed.
    *
    * Will need a isFixed Boolean value that will switch depending on state of Vehicle.
    *
    */

  def fixingVehicles(vehicle: Vehicle): Unit = vehicle match {

      // If toFix is true then the vehicle is still undergoing repairs and the system will state this.
      // If toFix is false then the vehicle is ready for collection for the customer.

    case vehicleBroken if toFix == true => println(s"$vehicle is currently being repaired")
    case vehicleFixed if toFix == false => println(s"$vehicle is ready for collection")
    case _ => println("Vehicle does not exist in the system")

  }

  /**
    * Method that will calculate the total cost to be billed to the customer once the job has been completed.
    *
    * Will take parts cost and labor costs into account.
    *
    */

  def calculateBills(labor: Int, parts: String){}

  /**
    * Method that will print the current status of the garage. This will include which vehicles are being
    * worked on at the current moment and which employees are working on which vehicle.
    *
    */

  def outputGarageContents{}

  /**
    * Method to start the garage working day.
    *
    */


  def openGarage{}

  /**
    * Method to close the garage working day, will have same operations as openGarage, but in reverse order.
    *
    */

  def closeGarage{}

  override def toString: String = s"The following vehicles are currently in the garage: $allVehicles" + s"\nThe following " +
    s"persons are currently at the garage: $allPersonelle"

}
