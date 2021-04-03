package ahlers.learn.scala3.features.contextualAbstractions

import ahlers.learn.scala3.features.contextualAbstractions.PersonNameExtension._
import ahlers.learn.scala3.models.{ FamilyName, GivenName, MiddleName, PersonName }
import ahlers.learn.scala3.models.scalacheck.instances.{ given_Arbitrary_FamilyName, given_Arbitrary_MiddleName, given_Arbitrary_GivenName, given_Arbitrary_PersonName }
import org.scalacheck.Arbitrary
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

/**
 * @since April 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
class ExtensionMethodsSpec extends AnyWordSpec {

  "Person name extensions" should {

    "replace given name" in {
      import ScalaCheckPropertyChecks._
      forAll { (personName: PersonName, givenName: GivenName) =>
        personName
          .withGivenName(givenName)
          .should(equal(personName
            .copy(givenName = Some(givenName))))
      }
    }

    "replace middle name" in {
      import ScalaCheckPropertyChecks._
      forAll { (personName: PersonName, middleName: MiddleName) =>
        personName
          .withMiddleName(middleName)
          .should(equal(personName
            .copy(middleName = Some(middleName))))
      }
    }

    "replace family name" in {
      import ScalaCheckPropertyChecks._
      forAll { (personName: PersonName, familyName: FamilyName) =>
        personName
          .withFamilyName(familyName)
          .should(equal(personName
            .copy(familyName = Some(familyName))))
      }
    }

  }

}
