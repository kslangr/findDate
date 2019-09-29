package com.tbsm.projectla;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.tbsm.projectla.models.Dates;

public class FindDates {
	private Map<String, String> foundStuff;
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	private String generalDocumentDetailsInceptionDate = null; // Inception (Execution) Date
	private String generalDocumentDetailsEffectiveDate = null; // Effective Date
	private String generalCriticalDatesCommencementDate = "Lease Commencement Date"; // Commencement Date
	private String generalCriticalDatesConstructionStartDate = null; // Construction Start Date
	private String generalCriticalDatesBaseLeaseExpirationDate = null; // Base Lease Expiration Date
	private String generalCriticalDatesConstructionEndDate = null; // Construction End Date
	private String generalCriticalDatesRentCommencementDate = null; // Rent Commencement Date
	private String generalCriticalDatesOccupancyDate = null; // Occupancy Date
	private String generalCriticalDatesLegalNoticeDate = null; // Legal Notice Date
	private String generalPremiseLocationEffectiveFrom = null; // Effective From
	private String generalPremiseLocationEffectiveTo = null; // Effective To
	private String generalOtherDatesDate = null; // Date
	private String generalAbstractNotificationsTargetDate = null; // Target Date
	private String generalLeaseAbstractExceptionsIssueReported = null; // Issue Reported
	private String generalLeaseAbstractExceptionsIssueResolved = null; // Issue Resolved
	
	private String rentRentSchedulesStartDate = null; // Start Date
	private String rentRentSchedulesEndDate = null; // End Date
	private String rentIndexAdjustmentsBaseIndexDate = null; // Base Index Date
	private String rentIndexAdjustmentsFirstAdjustmentDate = ""; // First Adjustment Date
	private String rentFairMarketRateValueCurrentRateDate = ""; // Current Rate Date
	private String rentFairMarketRateValueOriginalRateDate = ""; // Original Rate Date
	private String rentFairMarketRateValueFirstAdjustmentDate = ""; // First Adjustment Date
	private String rentPercentRentSetupFirstReportingPeriodStartDate = ""; // First Reporting Period Start Date
	private String rentSalesReportingDetailsEffectiveFrom = ""; // Effective From
	private String rentSalesReportingDetailsEffectiveTo = ""; // Effective To
	private String rentPercentRentSchedulesStartDate = ""; // Start Date
	private String rentPercentRentSchedulesEndDate = ""; // End Date
	private String rentCommissionDetailsDueDate = ""; // Due Date
	private String rentCommissionDetailsPaidDate = ""; // Paid Date
	private String rentCommissionDetailsReceiptDate = ""; // Receipt Date
	private String rentCommissionSchedulesStartDate = ""; // Start Date
	private String rentCommissionSchedulesEndDate = ""; // End Date
	
	private String securityDepositDepositDetailsDepositDate = ""; // Deposit Date
	private String securityDepositDepositDetailsExpectedReturnedDate = ""; // Expected Returned Date
	private String securityDepositDepositDetailsLetterOfCreditEffectiveDate = ""; // Letter of Credit Effective Date
	private String securityDepositDepositDetailsLetterOfCreditExpirationDate = ""; // Letter of Credit Expiration Date
		
	private String optionsTenantRenewalAndOtherOptionsEffectiveDate = ""; // Effective Date
	private String optionsTenantRenewalAndOtherOptionsExerciseDate = ""; // Exercise Date
	
	private String rightsOtherRightsEffectiveFrom = ""; // Effective From
	private String rightsOtherRightsEffectiveTo = ""; // Effective To
	
	private String allowancesImprovementClauseDetailsFundsAvailableFrom = ""; // Funds Available From
	private String allowancesImprovementClauseDetailsFundsAvailableTo = "";// Funds Available To
	private String allowancesImprovementClauseDetailsRequestDate = ""; // Request Date
	private String allowancesImprovementClauseDetailsDueDate = ""; // Due Date
	private String allowancesImprovementClauseDetailsReceivedDate = ""; // Received Date
	private String allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease = ""; // Completion of Landlord Work Date per lease (if applicable)
	private String allowancesImprovementClauseDetailsActualCompletionOfLandlordWork = ""; // Actual Completion of Landlord Work
	private String allowancesImprovementClauseDetailsCompletionOfTenantWork = ""; // Completion of Tenant Work
	private String allowancesImprovementClauseDetailsActualCompletionOfTenantWork = ""; // Actual Completion of Tenant Work
	
	private String opexCamAuditSetupReconciliationStart = ""; // Reconciliation Start
	private String opexCamAuditSetupFirstBillingEndDate = ""; // First Billing End Date
	private String opexCamSchedulesStartDate = ""; // Start Date
	private String opexCamSchedulesEndDate = ""; // End Date
	
	private String insuranceInsuranceClauseDetailsEffectiveFrom = ""; // Effective From
	private String insuranceInsuranceClauseDetailsEffectiveTo = ""; // Effective To
	private String insuranceInsuranceSchedulesStartDate = ""; // Start Date
	private String insuranceInsuranceSchedulesEndDate = ""; // End Date
	
	private String taxTaxSchedulesStartDate = ""; // Start Date
	private String taxTaxSchedulesEndDate = ""; // End Date
	
	private String coTenancyItemEffectiveFrom = ""; // Effective From
	private String coTenancyItemffectiveTo = ""; // Effective To
	private String coTenancyItemRemodelDate = ""; // Remodel Date
	
	private String greenLeaseProvisionsCredentialsValidUntil = ""; // Valid Until
	
	private String otherClausesEffectiveFrom = ""; // Effective From
	private String otherClausesEffectiveEnd = ""; // Effective End
	
	private String accountingStartDate = ""; // Accounting Start Date
	private String accountingEndDate = ""; // Accounting End Date
	private String accountingLikelyTermEndDate = ""; // Likely Term End Date 
	
	public FindDates(Map<String, String> foundStuff) {
		this.foundStuff = foundStuff;
	}
	
	
	public Dates processDates() {		
		Dates dates = new Dates();

		dates.setGeneralAbstractDetailsAbstractedDate(new Date()); // Abstracted Date		
		dates.setGeneralDocumentDetailsInceptionDate( search( generalDocumentDetailsInceptionDate ) ); // Inception (Execution) Date
		dates.setGeneralDocumentDetailsEffectiveDate( search( generalDocumentDetailsEffectiveDate ) ); // Effective Date		
		dates.setGeneralCriticalDatesCommencementDate( search( generalCriticalDatesCommencementDate ) ); // Commencement Date
		dates.setGeneralCriticalDatesConstructionStartDate( search( generalCriticalDatesConstructionStartDate ) ); // Construction Start Date
		dates.setGeneralCriticalDatesBaseLeaseExpirationDate( search( generalCriticalDatesBaseLeaseExpirationDate ) ); // Base Lease Expiration Date
		dates.setGeneralCriticalDatesConstructionEndDate( search( generalCriticalDatesConstructionEndDate ) ); // Construction End Date
		dates.setGeneralCriticalDatesRentCommencementDate( search( generalCriticalDatesRentCommencementDate ) ); // Rent Commencement Date
		dates.setGeneralCriticalDatesOccupancyDate( search( generalCriticalDatesOccupancyDate ) ); // Occupancy Date
		dates.setGeneralCriticalDatesLegalNoticeDate( search( generalCriticalDatesLegalNoticeDate ) ); // Legal Notice Date
		dates.setGeneralPremiseLocationEffectiveFrom( search( generalPremiseLocationEffectiveFrom ) ); // Effective From
		dates.setGeneralPremiseLocationEffectiveTo( search( generalPremiseLocationEffectiveTo ) ); // Effective To
		dates.setGeneralOtherDatesDate( search( generalOtherDatesDate ) ); // Date
		dates.setGeneralAbstractNotificationsTargetDate( search( generalAbstractNotificationsTargetDate ) ); // Target Date
		dates.setGeneralLeaseAbstractExceptionsIssueReported( search( generalLeaseAbstractExceptionsIssueReported ) ); // Issue Reported
		dates.setGeneralLeaseAbstractExceptionsIssueResolved( search( generalLeaseAbstractExceptionsIssueResolved ) ); // Issue Resolved
		
		dates.setRentRentSchedulesStartDate( search( rentRentSchedulesStartDate ) ); // Start Date
		dates.setRentRentSchedulesEndDate( search( rentRentSchedulesEndDate ) ); // End Date
		dates.setRentIndexAdjustmentsBaseIndexDate( search( rentIndexAdjustmentsBaseIndexDate ) ); // Base Index Date
		dates.setRentIndexAdjustmentsFirstAdjustmentDate( search( rentIndexAdjustmentsFirstAdjustmentDate ) ); // First Adjustment Date
		dates.setRentFairMarketRateValueCurrentRateDate( search( rentFairMarketRateValueCurrentRateDate ) ); // Current Rate Date
		dates.setRentFairMarketRateValueOriginalRateDate( search( rentFairMarketRateValueOriginalRateDate ) ); // Original Rate Date
		dates.setRentFairMarketRateValueFirstAdjustmentDate( search( rentFairMarketRateValueFirstAdjustmentDate ) ); // First Adjustment Date
		dates.setRentPercentRentSetupFirstReportingPeriodStartDate( search( rentPercentRentSetupFirstReportingPeriodStartDate ) ); // First Reporting Period Start Date
		dates.setRentSalesReportingDetailsEffectiveFrom( search( rentSalesReportingDetailsEffectiveFrom ) ); // Effective From
		dates.setRentSalesReportingDetailsEffectiveTo( search( rentSalesReportingDetailsEffectiveTo ) ); // Effective To
		dates.setRentPercentRentSchedulesStartDate( search( rentPercentRentSchedulesStartDate ) ); // Start Date
		dates.setRentPercentRentSchedulesEndDate( search( rentPercentRentSchedulesEndDate ) ); // End Date
		dates.setRentCommissionDetailsDueDate( search( rentCommissionDetailsDueDate ) ); // Due Date
		dates.setRentCommissionDetailsPaidDate( search( rentCommissionDetailsPaidDate ) ); // Paid Date
		dates.setRentCommissionDetailsReceiptDate( search( rentCommissionDetailsReceiptDate ) ); // Receipt Date
		dates.setRentCommissionSchedulesStartDate( search( rentCommissionSchedulesStartDate ) ); // Start Date
		dates.setRentCommissionSchedulesEndDate( search( rentCommissionSchedulesEndDate ) ); // End Date
		
		dates.setSecurityDepositDepositDetailsDepositDate( search( securityDepositDepositDetailsDepositDate ) ); // Deposit Date
		dates.setSecurityDepositDepositDetailsExpectedReturnedDate( search( securityDepositDepositDetailsExpectedReturnedDate ) ); // Expected Returned Date
		dates.setSecurityDepositDepositDetailsLetterOfCreditEffectiveDate( search( securityDepositDepositDetailsLetterOfCreditEffectiveDate ) ); // Letter of Credit Effective Date
		dates.setSecurityDepositDepositDetailsLetterOfCreditExpirationDate( search( securityDepositDepositDetailsLetterOfCreditExpirationDate ) ); // Letter of Credit Expiration Date
			
		dates.setOptionsTenantRenewalAndOtherOptionsEffectiveDate( search( optionsTenantRenewalAndOtherOptionsEffectiveDate ) ); // Effective Date
		dates.setOptionsTenantRenewalAndOtherOptionsExerciseDate( search( optionsTenantRenewalAndOtherOptionsExerciseDate ) ); // Exercise Date
		
		dates.setRightsOtherRightsEffectiveFrom( search( rightsOtherRightsEffectiveFrom ) ); // Effective From
		dates.setRightsOtherRightsEffectiveTo( search( rightsOtherRightsEffectiveTo ) ); // Effective To
		
		dates.setAllowancesImprovementClauseDetailsFundsAvailableFrom( search( allowancesImprovementClauseDetailsFundsAvailableFrom ) ); // Funds Available From
		dates.setAllowancesImprovementClauseDetailsFundsAvailableTo( search( allowancesImprovementClauseDetailsFundsAvailableTo ) ); // Funds Available To
		dates.setAllowancesImprovementClauseDetailsRequestDate( search( allowancesImprovementClauseDetailsRequestDate ) ); // Request Date
		dates.setAllowancesImprovementClauseDetailsDueDate( search( allowancesImprovementClauseDetailsDueDate ) ); // Due Date
		dates.setAllowancesImprovementClauseDetailsReceivedDate( search( allowancesImprovementClauseDetailsReceivedDate ) ); // Received Date
		dates.setAllowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease( search( allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease ) ); // Completion of Landlord Work Date per lease (if applicable)
		dates.setAllowancesImprovementClauseDetailsActualCompletionOfLandlordWork( search( allowancesImprovementClauseDetailsActualCompletionOfLandlordWork ) ); // Actual Completion of Landlord Work
		dates.setAllowancesImprovementClauseDetailsCompletionOfTenantWork( search( allowancesImprovementClauseDetailsCompletionOfTenantWork ) ); // Completion of Tenant Work
		dates.setAllowancesImprovementClauseDetailsActualCompletionOfTenantWork( search( allowancesImprovementClauseDetailsActualCompletionOfTenantWork ) ); // Actual Completion of Tenant Work
		
		dates.setOpexCamAuditSetupReconciliationStart( search( opexCamAuditSetupReconciliationStart ) ); // Reconciliation Start
		dates.setOpexCamAuditSetupFirstBillingEndDate( search( opexCamAuditSetupFirstBillingEndDate ) ); // First Billing End Date
		dates.setOpexCamSchedulesStartDate( search( opexCamSchedulesStartDate ) ); // Start Date
		dates.setOpexCamSchedulesEndDate( search( opexCamSchedulesEndDate ) ); // End Date
		
		dates.setInsuranceInsuranceClauseDetailsEffectiveFrom( search( insuranceInsuranceClauseDetailsEffectiveFrom ) ); // Effective From
		dates.setInsuranceInsuranceClauseDetailsEffectiveTo( search( insuranceInsuranceClauseDetailsEffectiveTo ) ); // Effective To
		dates.setInsuranceInsuranceSchedulesStartDate( search( insuranceInsuranceSchedulesStartDate ) ); // Start Date
		dates.setInsuranceInsuranceSchedulesEndDate( search( insuranceInsuranceSchedulesEndDate ) ); // End Date
		
		dates.setTaxTaxSchedulesStartDate( search( taxTaxSchedulesStartDate ) ); // Start Date
		dates.setTaxTaxSchedulesEndDate( search( taxTaxSchedulesEndDate ) ); // End Date
		
		dates.setCoTenancyItemEffectiveFrom( search( coTenancyItemEffectiveFrom ) ); // Effective From
		dates.setCoTenancyItemffectiveTo( search( coTenancyItemffectiveTo ) ); // Effective To
		dates.setCoTenancyItemRemodelDate( search( coTenancyItemRemodelDate ) ); // Remodel Date
		
		dates.setGreenLeaseProvisionsCredentialsValidUntil( search( greenLeaseProvisionsCredentialsValidUntil ) ); // Valid Until
		
		dates.setOtherClausesEffectiveFrom( search( otherClausesEffectiveFrom ) ); // Effective From
		dates.setOtherClausesEffectiveEnd( search( otherClausesEffectiveEnd ) ); // Effective End
		
		dates.setAccountingStartDate( search( accountingStartDate ) ); // Accounting Start Date
		dates.setAccountingEndDate( search( accountingEndDate ) ); // Accounting End Date
		dates.setAccountingLikelyTermEndDate( search( accountingLikelyTermEndDate ) ); // Likely Term End Date
		
		return dates;		
	}
	
	private Date search(String s) {
		if( s != null && s != "" ) {
			List<String> criteriaList = Arrays.asList(s.split(","));				
			for (String criteria : criteriaList) {
				Optional<Entry<String, String>> map = foundStuff.entrySet().stream()
			      .filter (e -> e.getValue().toLowerCase().contains( criteria.toLowerCase() )).findFirst();
				
				if(map.isPresent()) {
					try {
						return dateFormatter.parse( map.get().getKey() );
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return null;		
	}
	
	//Found: 2016-03-31 --- Term of this Lease: Period commencing on the Lease Commencement Date and expiring at noon, March 31, 2016 
	//Found: 2019-01-28 --- Landlord's Address: c/o The Smith Company, 1134 South Street #300, Boston, Ma. 02111-2837 
	//Found: 2015-04-01,2015-04-01 --- April 2015 -March 2016 to be paid  at a  rate of$30.50  PSF  as  adjusted 
	//Found: 2019-01-02 --- rate equal to one and one half (1 & 1/2) times the then adjusted Base Rent plus payment pro rata of Escalation Charges and other charges due hereunder 
	//Found: 2014-06-30 --- Taxes assessed to Property for the fiscal 2014 tax year ending June 30, 2014. 
	//Found: 2019-09-23 --- Today's Date: _
	//Found: 2014-04-01 --- prohibits the payment of such tax by Tenant,  but in no case shall  such a charge  be assessed  to Tenant for the period  prior to April 1, 2014. 
	//Found: 2019-07-01 --- Tax Year: The twelve-month period commencing on July 1, and ending on June 30th of the following year. 
	//Found: 2019-05-01 --- Landlord within thirty (30) days after the termination of such period (as such as may have  been extended  above).  Upon the giving of such notice, 
	//Found: 2019-09-30,2019-09-28 --- so by Tenant, water to the demised Premises on an all-year-round basis, during such hours on Mondays through Saturdays as Landlord shall, from 
	//Found: 2019-04-01 --- of the second and at the beginning of each successive Lease Year (i.e., April I, 2014 and each April  1st thereafter)  as set forth  in Section 1.1 of this 
	//Found: 2013-03-01 --- Base CPI: The CPI as of March 2013 
	//Found: 2013-04-01 --- Rent Commencement  Date:    April 1, 2013 
	//Found: 2019-09-29 --- shall exclude Sundays. Tenant shall, however, be entitled to any services provided to the Building in the normal course. 
	//Found: 2013-04-01,2013-04-01 --- April 2013 -March 2014 to be paid at a rate of$29.50 PSF; $93,780.50 per annum; $7,815.04 per month. 
	//Found: 2016-09-01 --- Sep 01, 2016 '18 55 
}