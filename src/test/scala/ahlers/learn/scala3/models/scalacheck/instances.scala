package ahlers.learn.scala3.models.scalacheck

import ahlers.learn.scala3.models.PersonName
import ahlers.learn.scala3.models.GivenName
import ahlers.learn.scala3.models.MiddleName
import ahlers.learn.scala3.models.FamilyName
import org.scalacheck.Arbitrary
import org.scalacheck.Arbitrary.arbitrary

/**
 * @todo Replace with [[https://github.com/spotify/magnolify Magnolify]] once it supports Scala 3.
 * @since April 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object instances {

  given Arbitrary[GivenName] = Arbitrary(arbitrary[String].map(GivenName(_)))

  given Arbitrary[MiddleName] = Arbitrary(arbitrary[String].map(MiddleName(_)))

  given  Arbitrary[FamilyName] = Arbitrary(arbitrary[String].map(FamilyName(_)))

  given Arbitrary[PersonName] =
    Arbitrary(
      for {
        givenName <- arbitrary[Option[GivenName]]
        middleName <- arbitrary[Option[MiddleName]]
        familyName <- arbitrary[Option[FamilyName]]
      } yield PersonName(
        givenName,
        middleName,
        familyName))

}
