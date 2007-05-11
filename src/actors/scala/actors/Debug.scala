/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2005-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: Debug.scala 8192 2006-07-19 09:52:31Z dubochet $

package scala.actors

/**
 * @author Philipp Haller
 */
object Debug {
  private var lev = 2

  def level = lev
  def level_= (lev: int) = { this.lev = lev }

  def info(s: String) =
    if (lev > 2) System.out.println("Info: " + s)

  def warning(s: String) =
    if (lev > 1) System.err.println("Warning: " + s)

  def error(s: String) =
    if (lev > 0) System.err.println("Error: " + s)
}

class Debug(tag: String) {
  private var lev = 2

  def level = lev
  def level_= (lev: int) = { this.lev = lev }

  def info(s: String) =
    if (lev > 2) System.out.println(tag + " (info): " + s)

  def warning(s: String) =
    if (lev > 1) System.err.println(tag + " (warn): " + s)

  def error(s: String) =
    if (lev > 0) System.err.println(tag + " (erro): " + s)
}
