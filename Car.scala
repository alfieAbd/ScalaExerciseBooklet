/**
  * Created by alfie on 12/06/2017.
  *
  * Subclass of Vehicle superclass.
  *
  */

class Car(vehicleID: String, carModel: String, vehicleColor: String, engineSize: Int, mileAge: Int, numberOfDoors: Int, isManual: Boolean)
  extends Vehicle(vehicleID, carModel, vehicleColor, engineSize, mileAge){

  var doors: Int = numberOfDoors
  var manual: Boolean = isManual

  def printNumberOfDoors { println(doors) }

  def printManualOrNot { println(manual) }

  override def toString: String = super.toString + s"\nThis vehicle has $doors number of doors" + s"\nIs vehicle manual? $manual"

}
