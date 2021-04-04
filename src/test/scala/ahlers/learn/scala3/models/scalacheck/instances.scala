package ahlers.learn.scala3.models.scalacheck

import ahlers.learn.scala3.models.PersonName
import ahlers.learn.scala3.models.Node
import ahlers.learn.scala3.models.Node.Tree
import ahlers.learn.scala3.models.Node.Leaf
import ahlers.learn.scala3.models.GivenName
import ahlers.learn.scala3.models.MiddleName
import ahlers.learn.scala3.models.FamilyName
import org.scalacheck.Arbitrary
import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.Gen.oneOf

/**
 * @todo Replace with [[https://github.com/spotify/magnolify Magnolify]] once it supports Scala 3.
 * @since April 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object instances:

  given [T:Arbitrary]: Arbitrary[Leaf[T]] = Arbitrary(arbitrary[T].map(Leaf(_)))

  given [T:Arbitrary]:Arbitrary[Tree[T]] = Arbitrary(arbitrary[Seq[Node[T]]].map(Tree(_)))

  given [T:Arbitrary]: Arbitrary[Node[T]] = Arbitrary(oneOf(arbitrary[Leaf[T]],arbitrary[Tree[T]]))

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

