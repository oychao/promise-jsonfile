
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modify_Scope0 {
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

class modify extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /* modify Template File */
  def apply/*2.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form action='/user/modify' method='post'>
<input type='hidden' name='id' value='"""),_display_(/*10.40*/user/*10.44*/.id),format.raw/*10.47*/("""'>
<input type='text' name='username' placeholder='Username' value='"""),_display_(/*11.67*/user/*11.71*/.username),format.raw/*11.80*/("""' /><br/>
<input type='text' name='email' placeholder='Email' value='"""),_display_(/*12.61*/user/*12.65*/.email),format.raw/*12.71*/("""' /><br />
<input type='number' name='age' placeholder='Age' value='"""),_display_(/*13.59*/user/*13.63*/.age),format.raw/*13.67*/("""' /><br />
<input type='submit'>
</form>
</body>
</html>"""))
      }
    }
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/* modify Template File */
object modify extends modify_Scope0.modify
              /*
                  -- GENERATED --
                  DATE: Fri Jul 29 13:39:32 JST 2016
                  SOURCE: /Users/ouyangcharles/git/DemoPlay/app/views/modify.scala.html
                  HASH: 2fa9cdaa6f571faa7d633cc8235bea2450f4fba9
                  MATRIX: 774->28|888->47|916->49|1070->176|1083->180|1107->183|1203->252|1216->256|1246->265|1343->335|1356->339|1383->345|1479->414|1492->418|1517->422
                  LINES: 27->2|32->2|34->4|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13
                  -- GENERATED --
              */
          