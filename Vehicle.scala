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

class Vehicle(vehicleID: String, carModel: String, vehicleColor: String, engineSize: Int, mileAge: Int, partList: ListBuffer[Part]) {

  var vID: String = vehicleID
  var model: String = carModel
  var color: String = vehicleColor
  var engSize: Double = engineSize
  var mileage: Int = mileAge
  var isBroken: Boolean = true
  var partList2: ListBuffer[Part] = partList

  /*val part1 = new Part(20,None)
  val part2 = new Part(20,Some(true))
  val part3 = new Part(20,None)
  val part4 = new Part(20,Some(true))
  val part5 = new Part(20,None)
  val part6 = new Part(20,Some(true))
  val part7 = new Part(20,None)
  val part8 = new Part(20,Some(true))
  val part9 = new Part(20,Some(true))
  val part10 = new Part(20,Some(true))

  partList += part1, part2, part3, part4, part5, part6, part7, part8, part9, part10*/

  def getVID() = vID

  def getModel() = model

  def getColor() = color

  def getEngSize() = engSize

  def getMileage() = mileage

  def getisBroken() = isBroken

  def getPartList() = partList2

  override def toString: String = s"\n{{{ Vehicle ID: $vehicleID" + ", " + s"Vehicle Model: $carModel" + ", " + s"Vehicle Color: $vehicleColor" + ", " + s"Vehicle Engine Size = $engineSize" +
  ", " + s"Current Vehicle Mileage: $mileAge }}}"

}
