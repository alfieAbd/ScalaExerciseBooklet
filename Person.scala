
/**
  * Created by Alfie on 12/06/2017.
  *
  * Superclass to Employee and Customer.
  * Contains all data for Persons.
  *
  *
  */


abstract class Person(surname: String, firstName: String, dateOfBirth: String, address: String, contactNumber: Int) {

  def sName: String = surname
  def fName: String = firstName
  def dOB: String = dateOfBirth
  def addr: String = address
  def contactNo: Int = contactNumber

  val fullName = fName + "" + sName

  def printFullName{ println(fullName) }

  def printDateOfBirth{ println(dOB) }

  def printAddress{ println(addr) }

  def printContactNumber{ println(contactNo) }

  override def toString(): String = s"Surname: $sName" + s"\nFirst Name: $fName" + s"\nDate of Birth: $dOB" +
  s"\nAddress: $addr" + s"\nContact Number: $contactNo"



}
