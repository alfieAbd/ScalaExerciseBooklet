/**
  * Created by alfie on 12/06/2017.
  *
  * Subclass of Person superclass.
  *
  */

class Employee(surname: String, firstName: String, dateOfBirth: String, address: String, contactNumber: Int, employeeID: Int, jobTitle: String)
  extends Person(surname, firstName, dateOfBirth, address, contactNumber) {

  var eID: Int = employeeID
  var title: String = jobTitle
  var isAvailable:Boolean = true

  def printEmployeeID { println(eID) }

  def printJobTitle { println(title) }

  def getIsAvailable() { isAvailable }

  override def toString(): String = super.toString() + s"\nEmployee ID: $eID" + s"\nJob Title: $title"

}

