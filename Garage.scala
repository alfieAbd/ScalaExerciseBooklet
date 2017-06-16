import scala.collection.mutable.ListBuffer
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

class Garage(laborCharge: Int, hoursWork: Int) {

  var allVehicles: ListBuffer[Vehicle] = ListBuffer.empty
  var allPersonelle: ListBuffer[Person] = ListBuffer.empty
  var isOpen = false
  var workAvailable:Boolean = false

  /**
    * Method to add vehicles to a garage. It will add all relevant details as specified in
    * Vehicle class. Vehicle object will be added to garageState ListBuffer[Vehicle]
    *
    * Will use: vehicleID, model, color, engine size, mileage, 'door' (Cars), 'isManual' (Car), 'sideCar' (Bike)
    *
    */

  def addVehicle(vehicle: Vehicle): Unit = vehicle match {

    case a if vehicle != null && isOpen == true  => allVehicles += vehicle; workAvailable = true; println("Vehicle successfully added.")
    case _ => println("Vehicle not added")
  }

  /**
    * Method to remove vehicles to a garage. It will remove vehicles from the Collection. It should use either
    * vehicleID OR model as arguments to search the collection and perform the removal.
    *
    * Will use: vehicleID, model, color, engine size, mileage, 'door' (Cars), 'isManual' (Car), 'sideCar' (Bike)
    *
    */

  def removeVehicle(vehicleID: String): Unit = {
    def iterator(i: Int, vehicleID: String): Unit = i match {
        // Check if the vehicle is in the garage
      case a if i == allVehicles.size => println(s"The vehicle $vehicleID cannot be found in the garage")
        // Check if vehicle ID matches ID in list
      case b if allVehicles(i).getVID == vehicleID => allVehicles(i) == null;  allVehicles.remove(i); println(s"Vehicle $vehicleID has been removed from the garage")
        // If neither condition is met, check the next index of the list.
      case _ => iterator(i+1, vehicleID)
      }
    }

  /**
    * Method to register new Employees that will be added to the Collection.
    *
    * Will use all parameters from the Person class as well as the parameters from the Employee class.
    * Data will be inserted into the allPeople Collection.
    *
    */

  def registerEmployee(employee: Employee): Unit = employee match {

    case a if employee != null && !allPersonelle.contains(employee) => allPersonelle += employee; workAvailable = true; println("Employee successfully registered")
    case _ => println("Employee registration unsuccessful")
  }

  /**
    * Method to change Vehicles from toFix state to fixed state. Will require Boolean value to check
    * whether the vehicle requires fixing. Once the vehicle has been fixed the Boolean value will be changed.
    *
    * Will need a isFixed Boolean value that will switch depending on state of Vehicle.
    *
    */

  def fixingVehicles(vehicle: Vehicle): Unit = {

    var i = 0

    while(allVehicles.nonEmpty) {

      vehicle match {

        case a if vehicle.getisBroken() => println(s"$vehicle is currently being repaired"); !vehicle.getisBroken(); allVehicles.remove(i); i += 1
        case b if !vehicle.getisBroken() => println(s"$vehicle is ready for collection"); i += 1
        case _ => println("Vehicle does not exist in the system")
      }
    }
  }

  /**
    * Method that will calculate the total cost to be billed to the customer once the job has been completed.
    *
    * Will take parts cost and labor costs into account.
    *
    */

  def calculateBills(laborHours: Int, part: Part): Int ={

    // Check to see if the vehicle is broken.
       // If vehicle is broken, see what parts are broken and get total cost. (From part class)
          // Add cost of parts to cost of labor (labor is calculated by multiplying laborHours by 20 which is base hourly charge

    val laborCost = laborHours * 20
    val totalCost = laborCost + part.getCost()

    totalCost
  }

  /**
    * Method that will print the current status of the garage. This will include which vehicles are being
    * worked on at the current moment and which employees are working on which vehicle.
    *
    */

  def outputGarageContents: Unit ={

    println(allVehicles,allPersonelle)

  }

  /**
    * Method to start the garage working day.
    *
    */


  def openGarage{ isOpen = true }

  /**
    * Method to close the garage working day, will have same operations as openGarage, but in reverse order.
    *
    */

  def closeGarage{ isOpen = false }

  override def toString: String = s"The following vehicles are currently in the garage: $allVehicles" + s"\nThe following " +
    s"persons are currently at the garage: $allPersonelle"

}
