
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.api.Play.current
/*2.2*/import models.shopping._
/*3.2*/import models.products._
/*4.2*/import models.users._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(customer: models.users.Customer, orders: List[ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.60*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("View Orders", customer)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""

	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
          """),_display_(/*11.12*/flash/*11.17*/.get("success")),format.raw/*11.32*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

"""),_display_(/*15.2*/for(o<-orders) yield /*15.16*/{_display_(Seq[Any](format.raw/*15.17*/("""
	"""),format.raw/*16.2*/("""<label>Order Number: """),_display_(/*16.24*/o/*16.25*/.getId),format.raw/*16.31*/("""</label>
	<br>
	<label>Order Date: """),_display_(/*18.22*/o/*18.23*/.getDateString),format.raw/*18.37*/("""</label>
<div class="row">
	<div class="col-md-12">
		

		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Id</th>
				<th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
				<th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getBasket() != null)/*35.50*/ {_display_(Seq[Any](format.raw/*35.52*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*37.22*/for(i <- o.getItems()) yield /*37.44*/ {_display_(Seq[Any](format.raw/*37.46*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getId),format.raw/*39.48*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getName),format.raw/*40.50*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getQuantity()),format.raw/*41.45*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getPrice))),format.raw/*42.64*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getItemTotal))),format.raw/*43.68*/("""</td>                        
                    </tr>
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*51.68*/("%.2f".format(o.getTotal()))),format.raw/*51.97*/("""</strong></p>
            </div>  
		</div>
		<div class="form-group">
				<a href=""""),_display_(/*55.15*/routes/*55.21*/.ShoppingCtrl.cancelOrder(o.getId)),format.raw/*55.55*/("""" class="btn btn-primary" onclick="return confirmDel();">Cancel Order</a>
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
		"""),format.raw/*63.3*/("""return confirm('Are you sure?');
	"""),format.raw/*64.2*/("""}"""),format.raw/*64.3*/("""
"""),format.raw/*65.1*/("""</script>
""")))}),format.raw/*66.2*/("""
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 16:08:08 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/viewOrders.scala.html
                  HASH: 0b7a052f596adefabe4205f5f3ce48d66437b99e
                  MATRIX: 651->1|687->31|719->57|751->83|1113->106|1266->164|1293->165|1364->211|1401->240|1440->242|1469->246|1509->278|1548->280|1584->289|1656->334|1670->339|1706->354|1736->357|1775->366|1804->369|1834->383|1873->384|1902->386|1951->408|1961->409|1988->415|2051->451|2061->452|2096->466|2458->801|2499->833|2539->835|2588->856|2698->939|2736->961|2776->963|2825->984|2886->1018|2896->1019|2934->1036|2996->1071|3006->1072|3046->1091|3108->1126|3118->1127|3153->1141|3222->1183|3270->1210|3339->1252|3391->1283|3499->1360|3570->1400|3601->1404|3777->1553|3827->1582|3939->1667|3954->1673|4009->1707|4251->1921|4280->1922|4310->1925|4371->1959|4399->1960|4427->1961|4468->1972
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|47->15|47->15|48->16|48->16|48->16|48->16|50->18|50->18|50->18|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|75->43|75->43|77->45|78->46|79->47|83->51|83->51|87->55|87->55|87->55|94->62|94->62|95->63|96->64|96->64|97->65|98->66
                  -- GENERATED --
              */
          