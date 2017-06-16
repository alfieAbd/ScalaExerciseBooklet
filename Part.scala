import sun.jvm.hotspot.ui.tree.BooleanTreeNodeAdapter

import scala.collection.mutable.ListBuffer

/**
  * Created by alfie on 15/06/2017.
  */

class Part(partName: String, partCost: Int, isBroke: Boolean, repairTime: Int) {

  var name:String = partName
  var cost:Int = partCost
  var broken:Boolean = isBroke
  var timeToRepair = repairTime

  def getCost():Int = { cost }
  def getRepairTime() { timeToRepair }
  def getIsBroken() { broken }

  /**
    *  Will take a part and calculate the total cost of broken parts. Will return total cost of repair to get all
    *  parts to stage when isBroke is false or none for each part.
    *
    *  @param hours
    */

  def timeToRepair(hours: Int): Int = {

    timeToRepair += hours
    timeToRepair

  }

  override def toString: String = s"Part Name: $partName" + s" Part Cost: $partCost" + s" Is part broken? + $isBroke" + s"Repair time? (hours) $repairTime"

}
