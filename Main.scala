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

    val person1 = new Employee("Smith", "John", "12.03.1987", "123 MiddleOfNowhere",12345,1257,"Mechanic")
 //   val person2 = new Employee("Smith", "John", "12.03.1987", "123 MiddleOfNowhere",12345,1257,"Mechanic")

    garage1.addVehicle(vehicle1)
    garage1.addVehicle(vehicle2)



 //   println(garage1.fixingVehicles(vehicle1,false))

 //   garage1.registerEmployee(person1)
 //   garage1.registerEmployee(person2)

  //  println(garage1.outputGarageContents)

    val garageList = garage1.toString

   garage1.calculateBills(30,vehicle1,vehicle1.getPartList())

 //   println(garageList)

 //   garage1.removeVehicle(vehicle1)

    //garage1.fixingVehicles(vehicle1)

  }
}
