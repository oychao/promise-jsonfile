
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object demo_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class demo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* demo Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form action='/user/save' method='post'>
<input type='text' name='username' placeholder='Username' /><br/>
<input type='text' name='email' placeholder='Email' /><br />
<input type='number' name='age' placeholder='Age' /><br />
<input type='submit'>
</form>
</body>
</html>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* demo Template File */
object demo extends demo_Scope0.demo
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 15:54:15 JST 2016
                  SOURCE: /Users/ouyangcharles/git/DemoPlay/app/views/demo.scala.html
                  HASH: c0c1f28a0eae06d3eda55aa442a675627d95ca0d
                  MATRIX: 760->26|882->38|910->57|937->58
                  LINES: 27->2|32->2|34->5|35->6
                  -- GENERATED --
              */
          