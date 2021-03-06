/*
 * Copyright 2017 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates

sealed trait ServiceIdentifier extends Product with Serializable {
  def name: String
}
object ServiceIdentifier {
  case object Agent extends ServiceIdentifier { override val name = "agent" }
  case object AgentOptInExclude extends ServiceIdentifier { override val name = "agent-optin-exclude" }
  case object AgentOptInRejoin extends ServiceIdentifier { override val name = "agent-optin-rejoin" }
  case object AlcoholWholesalerRegistrationScheme extends ServiceIdentifier { override val name = "awrs" }
  case object AntiMoneyLaunderingSupervision extends ServiceIdentifier { override val name = "amls" }
  case object AnnualTaxSummary extends ServiceIdentifier { override val name = "ats" }
  case object ApiDeveloperHub extends ServiceIdentifier { override val name = "api" }
  case object BusinessRates extends ServiceIdentifier { override val name = "bars" }
  case object Childcare extends ServiceIdentifier { override val name = "cc" }
  case object CompanyAccountsTaxOnline extends ServiceIdentifier { override val name = "cato" }
  case object DigitalFormsService extends ServiceIdentifier { override val name = "dfs" }
  case object FriendsAndFamily extends ServiceIdentifier { override val name = "fandf" }
  case object GovernmentGateway extends ServiceIdentifier { override val name = "gg" }
  case object GuaranteedMinimumPension extends ServiceIdentifier { override val name = "gmp" }
  case object Generic extends ServiceIdentifier { override val name = "generic" }
  case object InheritanceTax extends ServiceIdentifier { override val name = "iht" }
  case object PayAsYouEarn extends ServiceIdentifier { override val name = "paye" }
  case object RegisterYourCompany extends ServiceIdentifier { override val name = "register-your-company" }
  case object RentalAndLeaseDetails extends ServiceIdentifier { override val name = "rald" }
  case object SelfAssessment extends ServiceIdentifier { override val name  = "sa" }
  case object TaxAllowanceForMarriedCouples extends ServiceIdentifier { override val name = "tamc" }
  case object TaxCreditsService extends ServiceIdentifier { override val name = "tcs" }
  case object Mandate extends ServiceIdentifier { override val name = "agent-client-mandate" }
  case object OffPayroll extends ServiceIdentifier { override val name = "off-payroll" }


}
