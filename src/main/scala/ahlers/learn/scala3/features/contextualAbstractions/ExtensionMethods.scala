package ahlers.learn.scala3.features.contextualAbstractions

import ahlers.learn.scala3.models.PersonName
import ahlers.learn.scala3.models.FamilyName
import ahlers.learn.scala3.models.MiddleName
import ahlers.learn.scala3.models.GivenName

import scala.annotation.targetName

/**
 * @since March 28, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object PersonNameExtension:

  extension(personName: PersonName)

    def withGivenName(givenName: Option[GivenName]): PersonName = personName.copy(givenName = givenName)
    def withGivenName(givenName: GivenName): PersonName = withGivenName(Some(givenName))

    def withMiddleName(middleName: Option[MiddleName]): PersonName = personName.copy(middleName = middleName)
    def withMiddleName(middleName: MiddleName): PersonName = withMiddleName(Some(middleName))

    def withFamilyName(familyName: Option[FamilyName]): PersonName = personName.copy(familyName = familyName)
    def withFamilyName(familyName: FamilyName): PersonName = withFamilyName(Some(familyName))