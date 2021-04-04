package ahlers.learn.scala3.models.extensions

import ahlers.learn.scala3.models.{FamilyName, GivenName, MiddleName, PersonName}

import scala.annotation.targetName

/**
 * @since March 28, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
trait PersonNameExtension:

  extension(personName: PersonName)

    def withGivenName(givenName: Option[GivenName]): PersonName = personName.copy(givenName = givenName)
    def withGivenName(givenName: GivenName): PersonName = withGivenName(Some(givenName))

    def withMiddleName(middleName: Option[MiddleName]): PersonName = personName.copy(middleName = middleName)
    def withMiddleName(middleName: MiddleName): PersonName = withMiddleName(Some(middleName))

    def withFamilyName(familyName: Option[FamilyName]): PersonName = personName.copy(familyName = familyName)
    def withFamilyName(familyName: FamilyName): PersonName = withFamilyName(Some(familyName))

object personNames extends PersonNameExtension