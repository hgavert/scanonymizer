package gavert.scanonymizer

import org.scalatest.FunSuite
import org.scalatest.prop.PropertyChecks
import org.scalatest.Matchers._

class strAnon_test extends FunSuite with PropertyChecks {
  import strAnon._

  test(testName = "test1") {
    test1("foobar") shouldBe "fooba"
    test1("fooba") shouldBe "fooba"
    test1("foob") shouldBe "foob"
    test1("") shouldBe ""
  }
}
