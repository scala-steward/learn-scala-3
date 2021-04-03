package ahlers.learn.scala3.models

/**
 * @since April 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
enum Node[T] derives CanEqual:
  case Leaf(x: T)

  /** @todo Can I specify a companion object with convenience constructors? */
  case Tree(nodes: Seq[Node[T]])

object Node:
  import Node.*
  def apply[T](x:T):Leaf[T] = Leaf(x)
  def apply[T](nodes: Seq[Node[T]]):Tree[T] = Tree(nodes)
  def apply[T](node: Node[T], nodes:Node[T]*):Tree[T] = Tree(node+:nodes)
