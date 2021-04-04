package ahlers.learn.scala3.reference.contextualAbstractions

import ahlers.learn.scala3.models.Node
import ahlers.learn.scala3.models.Node.Tree
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import ahlers.learn.scala3.models.scalacheck.instances.given
import org.scalatest.matchers.should.Matchers.*
import scala.language.strictEquality
import scala.language.postfixOps

/**
 * @since April 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
class MultiversalEqualitySpec extends AnyWordSpec:

  "Nodes" should {
    "respect multiversal equality" in {
      def nodeInt:Node[Int] = ???
      def nodeString:Node[Int] = ???
      "nodeInt == nodeInt".should(compile)
      "nodeInt == nodeSting".shouldNot(compile)
    }
  }
