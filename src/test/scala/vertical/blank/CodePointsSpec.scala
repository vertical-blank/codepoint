package vertical.blank

import org.scalacheck.Prop.forAll
import org.scalacheck.{Prop, Properties}

object BasicFunctionalitySpec extends Properties("Test") {
  import CodePoint._

  property("vals") = Prop.secure {
    val s = "髙𣘺"
    List("髙","𣘺") == s.codePointStrings
  }

  property("1") = Prop.secure {
    val s = "1"
    List(s) == s.codePointStrings
  }

  property("zero") = Prop.secure {
    val s = ""
    List("") == s.codePointStrings
  }

}
