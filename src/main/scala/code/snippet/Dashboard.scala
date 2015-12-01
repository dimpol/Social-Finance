/**
Open Bank Project - Transparency / Social Finance Web Application
Copyright (C) 2011 - 2015, TESOBE  Ltd.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

Email: contact@tesobe.com
TESOBE Ltd.
Osloer Str. 16/17
Berlin 13359, Germany

  This product includes software developed at
  TESOBE (http://www.tesobe.com/)
  by
  Simon Redfern : simon AT tesobe DOT com
  Stefan Bethge : stefan AT tesobe DOT com
  Everett Sochowski : everett AT tesobe DOT com
  Ayoub Benali: ayoub AT tesobe DOT com

 */
package code.snippet

import net.liftweb.common.{Box, Failure, Empty, Full}
import code.lib.ObpJson._
import code.lib._

class OBPDashboardLeftSnippet (params : (TransactionsJson, AccountJson, TransactionsListURLParams, TransactionsJson, AccountJson, TransactionsListURLParams)) extends OBPTransactionSnippet ((params._1, params._2, params._3)) {
}

class OBPDashboardRightSnippet (params : (TransactionsJson, AccountJson, TransactionsListURLParams, TransactionsJson, AccountJson, TransactionsListURLParams)) extends OBPTransactionSnippet ((params._4, params._5, params._6)) {
}

