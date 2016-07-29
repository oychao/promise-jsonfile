
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ws_Scope0 {
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

class ws extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* ws Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
   <head>
   <script src=""""),_display_(/*6.18*/routes/*6.24*/.Assets.versioned("javascripts/ws.js")),format.raw/*6.62*/(""""></script>
   </head>
   <body>
   
      <div id="sse">
         <a href="javascript:WebSocketTest()">Run WebSocket</a>
      </div>
      
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

/* ws Template File */
object ws extends ws_Scope0.ws
              /*
                  -- GENERATED --
                  DATE: Fri Jul 29 13:39:32 JST 2016
                  SOURCE: /Users/ouyangcharles/git/DemoPlay/app/views/ws.scala.html
                  HASH: f11698032b9b62d3be61aa89d5f00bfec96061d4
                  MATRIX: 754->24|861->36|888->37|964->87|978->93|1036->131
                  LINES: 27->2|32->2|33->3|36->6|36->6|36->6
                  -- GENERATED --
              */
          