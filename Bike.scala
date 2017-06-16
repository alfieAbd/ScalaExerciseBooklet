import scala.collection.mutable.ListBuffer

/**
  * Created by alfie on 12/06/2017.
  *
  *  Subclass of Vehicle superclass.
  *
  */

class Bike(vehicleID: String, carModel: String, vehicleColor: String, engineSize: Int, mileAge: Int, parts: ListBuffer[Part], hasSideCar: Boolean)
  extends Vehicle(vehicleID, carModel, vehicleColor, engineSize, mileAge, parts){

  var sideCar: Boolean = hasSideCar

  def printSideCarStatus{ println(sideCar) }

  override def toString: String = super.toString + s"\nDoes bike have a sidecar? $sideCar"

}
