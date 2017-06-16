import scala.collection.mutable.ListBuffer

/**
  * Created by alfie on 12/06/2017.
  *
  * Superclass to Car and Bike.
  * Contains data for all Vehicles.
  *
  * * Possible variables:
  * * Registration number
  * * Engine size
  * * Labor (hours)
  * * Part cost
  * * Mileage
  *
  */

class Vehicle(vehicleID: String, carModel: String, vehicleColor: String, engineSize: Double, mileAge: Int, parts: ListBuffer[Part]) {

  var vID: String = vehicleID
  var model: String = carModel
  var color: String = vehicleColor
  var engSize: Double = engineSize
  var mileage: Int = mileAge
  var isBroken: Boolean = true
  var partList: ListBuffer[Part] = parts

  def getVID() = vID

  def getModel() = model

  def getColor() = color

  def getEngSize() = engSize

  def getMileage() = mileage

  def getisBroken() = isBroken

  def getPartList() = partList

  override def toString: String = s"\n{{{ Vehicle ID: $vehicleID" + ", " + s"Vehicle Model: $carModel" + ", " + s"Vehicle Color: $vehicleColor" + ", " + s"Vehicle Engine Size = $engineSize" +
  ", " + s"Current Vehicle Mileage: $mileAge }}}"

}
