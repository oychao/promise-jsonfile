
package user.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object save_Scope0 {
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

class save extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* save Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
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

/* save Template File */
object save extends save_Scope0.save
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 18:28:01 JST 2016
                  SOURCE: /Users/ouyangcharles/git/DemoPlay/app/user/views/save.scala.html
                  HASH: 978b2e25d0e45d743ac42a4323afa73ce3254cfd
                  MATRIX: 765->26|872->38|900->40
                  LINES: 27->2|32->2|34->4
                  -- GENERATED --
              */
          