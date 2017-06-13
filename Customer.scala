/**
  * Created by alfie on 12/06/2017.
  *
  * Subclass of Person superclass.
  *
  */

class Customer(surname: String, firstName: String, dateOfBirth: String, address: String, contactNumber: Int, receiptNumber: Int, customerID: Int)
extends Person(surname, firstName, dateOfBirth, address, contactNumber) {

  private val cID: Int = customerID
  var receiptNo: Int = receiptNumber

  def printCustomerID { println(cID) }

  def printReceipt{ println( receiptNo) }

  override def toString(): String = super.toString() + s"\nReceipt Number: $receiptNo"

}
