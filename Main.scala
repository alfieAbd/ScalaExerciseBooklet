/**
  * Created by alfie on 13/06/2017.
  */

object Main {

  def main(args: Array[String]): Unit = {

    val garageBuf = scala.collection.mutable.ListBuffer.empty[Vehicle]
    val garagePeeps = scala.collection.mutable.ListBuffer.empty[Person]

    val garage1 = new Garage(garageBuf, garagePeeps)

    val vehicle1 = new Vehicle("Corsa", "Vauxhall", "Grey", 12, 50000)
    val vehicle2 = new Vehicle("Vectra", "Vauxhall", "White", 16, 50000)

    garage1.addVehicle(vehicle1)
    garage1.addVehicle(vehicle2)

    val garageList = garage1.toString

   // println(garageList)

   // garage1.removeVehicle("Corsa")

    garage1.fixingVehicles(vehicle1)

  }
}
