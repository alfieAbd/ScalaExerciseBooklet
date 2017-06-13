/**
  * Created by alfie on 12/06/2017.
  *
  * Superclass to Car and Bike.
  * Contains data for all Vehicles.
  *
  * Possible variables:
  * * Registration number
  * * Engine size
  * * Labor (hours)
  * * Part cost
  * * Mileage
  *
  */

class Vehicle(vehicleID: String, carModel: String, vehicleColor: String, engineSize: Int, mileAge: Int) {

  var vID: String = vehicleID
  var model: String = carModel
  var color: String = vehicleColor
  var engSize: Double = engineSize
  var mileage: Int = mileAge

  def printVehicleID { println(vID) }

  def printModel { println(model) }

  def printColor { println(color) }

  def printEngineSize { println(engSize) }

  def printMileage { println(mileage) }

  override def toString: String = s"Vehicle ID: $vID" + s"\nVehicle Model: $carModel" + s"\nVehicle Color: $vehicleColor" + s"\nVehicle Engine Size = $engineSize" +
  s"\nCurrent Vehicle Mileage: $mileAge"

}
