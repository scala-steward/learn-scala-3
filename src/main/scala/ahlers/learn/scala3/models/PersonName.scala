package ahlers.learn.scala3.models

/**
 * @since March 28, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
opaque type GivenName = String
object GivenName:
  def apply(givenName: String): GivenName = givenName

opaque type MiddleName = String
object MiddleName:
  def apply(middleName: String): MiddleName = middleName

opaque type FamilyName = String
object FamilyName:
  def apply(familyName: String): FamilyName = familyName

case class PersonName(
  givenName: Option[GivenName],
  middleName: Option[MiddleName],
  familyName: Option[FamilyName])
