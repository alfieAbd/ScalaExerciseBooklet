import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
  * Created by alfie on 13/06/2017.
  */

object Main {

  // Need people to work in the garage.

  def hireWorkers(garage: Garage): Unit = {

    garage.registerEmployee(new Employee("Smith","John","16.06.1989","123 MiddleOfNowhere",12345678,1,"Mechanic"))
    garage.registerEmployee(new Employee("West","Susan","23.06.1999","34 East Drive",12345678,2,"Mechanic"))
    garage.registerEmployee(new Employee("Monkey","Grease","03.11.2002","420 SmokeSome",12345678,3,"Mechanic"))

  }

  // Generate parts and assign random to Boolean value for broken status

  def generateParts(iter: Int, part: ListBuffer[Part], random: Random): ListBuffer[Part] = iter match {

    case 1 => part+=new Part("Engine",200,random.nextBoolean(),10)
    case 2 => part+=new Part("Front Driver Wheel",25,random.nextBoolean(),1)
    case 3 => part+=new Part("Exhaust",60,random.nextBoolean(),3)
    case 4 => part+=new Part("Gear Box",150,random.nextBoolean(),5)
    case 5 => part+=new Part("Clutch",100,random.nextBoolean(),6)
    case 6 => part+=new Part("Reverse Light",5,random.nextBoolean(),1)
    case 7 => part+=new Part("Windscreen Wipers",10,random.nextBoolean(),2)
    case 8 => part+=new Part("Passenger Door Lock",40,random.nextBoolean(),3)
    case 9 => part+=new Part("Chassis",180,random.nextBoolean(),9)
    case 10 => part+=new Part("Bumper",40,random.nextBoolean(),4)
    case _ => part
  }

  // Create some vehicles to be put into the garage

  def generateVehicles(iter: Int, random: Random): Vehicle = {

    // need parts and vehicle

    val parts: ListBuffer[Part] = generateParts(0,new ListBuffer[Part],random)
    var veh: Vehicle = null

    iter match {

      case 1 => veh = new Car("1","Corsa","Gray",1.2,50000,parts,5,true)
      case 2 => veh = new Car("2","307","Blue",1.2,66000,parts,5,true)
      case 3 => veh = new Car("3","Micra","Silver",1.2,120000,parts,3,true)
      case 4 => veh = new Car("4","M3","Blue",1.2,86000,parts,3,true)
      case 5 => veh = new Car("5","Juke","White",1.2,160000,parts,5,true)
      case 6 => veh = new Car("6","Vitara","Black",1.2,90000,parts,5,true)
      case 7 => veh = new Car("7","Clio","Red",1.2,23000,parts,3,true)
      case 8 => veh = new Bike("8","Ninja","Green",649,33000,parts,false)
      case 9 => veh = new Bike("9","Spitfire","Red",654,90000,parts,false)
      case 10 => veh = new Bike("10","X-75 Hurricane","Gray",740,75000,parts,false)
      case _ => println("Invalid")

    }
    veh
  }

  def addVehicles(garage: Garage) : Unit ={

    val random : Random = new Random()

    for(i<-0 to 10) garage.addVehicle(generateVehicles(i, random))

  }

  def main(args: Array[String]): Unit = {

    val QAGarage = new Garage(25,10)
    val random = new Random()

    hireWorkers(QAGarage)
    QAGarage.openGarage
    addVehicles(QAGarage)

    QAGarage.fixingVehicles(generateVehicles(0,random))

  }
}
