package com.tbsm.projectla.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	private Date generalAbstractDetailsAbstractedDate; // Abstracted Date
	private Date generalDocumentDetailsInceptionDate; // Inception (Execution) Date
	private Date generalDocumentDetailsEffectiveDate; // Effective Date
	private Date generalCriticalDatesCommencementDate; // Commencement Date
	private Date generalCriticalDatesConstructionStartDate; // Construction Start Date
	private Date generalCriticalDatesBaseLeaseExpirationDate; // Base Lease Expiration Date
	private Date generalCriticalDatesConstructionEndDate; // Construction End Date
	private Date generalCriticalDatesRentCommencementDate; // Rent Commencement Date
	private Date generalCriticalDatesOccupancyDate; // Occupancy Date
	private Date generalCriticalDatesLegalNoticeDate; // Legal Notice Date
	private Date generalPremiseLocationEffectiveFrom; // Effective From
	private Date generalPremiseLocationEffectiveTo; // Effective To
	private Date generalOtherDatesDate; // Date
	private Date generalAbstractNotificationsTargetDate; // Target Date
	private Date generalLeaseAbstractExceptionsIssueReported; // Issue Reported
	private Date generalLeaseAbstractExceptionsIssueResolved; // Issue Resolved
	
	private Date rentRentSchedulesStartDate; // Start Date
	private Date rentRentSchedulesEndDate; // End Date
	private Date rentIndexAdjustmentsBaseIndexDate; // Base Index Date
	private Date rentIndexAdjustmentsFirstAdjustmentDate; // First Adjustment Date
	private Date rentFairMarketRateValueCurrentRateDate; // Current Rate Date
	private Date rentFairMarketRateValueOriginalRateDate; // Original Rate Date
	private Date rentFairMarketRateValueFirstAdjustmentDate; // First Adjustment Date
	private Date rentPercentRentSetupFirstReportingPeriodStartDate; // First Reporting Period Start Date
	private Date rentSalesReportingDetailsEffectiveFrom; // Effective From
	private Date rentSalesReportingDetailsEffectiveTo; // Effective To
	private Date rentPercentRentSchedulesStartDate; // Start Date
	private Date rentPercentRentSchedulesEndDate; // End Date
	private Date rentCommissionDetailsDueDate; // Due Date
	private Date rentCommissionDetailsPaidDate; // Paid Date
	private Date rentCommissionDetailsReceiptDate; // Receipt Date
	private Date rentCommissionSchedulesStartDate; // Start Date
	private Date rentCommissionSchedulesEndDate; // End Date
	
	private Date securityDepositDepositDetailsDepositDate; // Deposit Date
	private Date securityDepositDepositDetailsExpectedReturnedDate; // Expected Returned Date
	private Date securityDepositDepositDetailsLetterOfCreditEffectiveDate; // Letter of Credit Effective Date
	private Date securityDepositDepositDetailsLetterOfCreditExpirationDate; // Letter of Credit Expiration Date
		
	private Date optionsTenantRenewalAndOtherOptionsEffectiveDate; // Effective Date
	private Date optionsTenantRenewalAndOtherOptionsExerciseDate; // Exercise Date
	
	private Date rightsOtherRightsEffectiveFrom; // Effective From
	private Date rightsOtherRightsEffectiveTo; // Effective To
	
	private Date allowancesImprovementClauseDetailsFundsAvailableFrom; // Funds Available From
	private Date allowancesImprovementClauseDetailsFundsAvailableTo;// Funds Available To
	private Date allowancesImprovementClauseDetailsRequestDate; // Request Date
	private Date allowancesImprovementClauseDetailsDueDate; // Due Date
	private Date allowancesImprovementClauseDetailsReceivedDate; // Received Date
	private Date allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease; // Completion of Landlord Work Date per lease (if applicable)
	private Date allowancesImprovementClauseDetailsActualCompletionOfLandlordWork; // Actual Completion of Landlord Work
	private Date allowancesImprovementClauseDetailsCompletionOfTenantWork; // Completion of Tenant Work
	private Date allowancesImprovementClauseDetailsActualCompletionOfTenantWork; // Actual Completion of Tenant Work
	
	private Date opexCamAuditSetupReconciliationStart; // Reconciliation Start
	private Date opexCamAuditSetupFirstBillingEndDate; // First Billing End Date
	private Date opexCamSchedulesStartDate; // Start Date
	private Date opexCamSchedulesEndDate; // End Date
	
	private Date insuranceInsuranceClauseDetailsEffectiveFrom; // Effective From
	private Date insuranceInsuranceClauseDetailsEffectiveTo; // Effective To
	private Date insuranceInsuranceSchedulesStartDate; // Start Date
	private Date insuranceInsuranceSchedulesEndDate; // End Date
	
	private Date taxTaxSchedulesStartDate; // Start Date
	private Date taxTaxSchedulesEndDate; // End Date
	
	private Date coTenancyItemEffectiveFrom; // Effective From
	private Date coTenancyItemffectiveTo; // Effective To
	private Date coTenancyItemRemodelDate; // Remodel Date
	
	private Date greenLeaseProvisionsCredentialsValidUntil; // Valid Until
	
	private Date otherClausesEffectiveFrom; // Effective From
	private Date otherClausesEffectiveEnd; // Effective End
	
	private Date accountingStartDate; // Accounting Start Date
	private Date accountingEndDate; // Accounting End Date
	private Date accountingLikelyTermEndDate; // Likely Term End Date


	public Dates() {
		// Default
	}


	/**
	 * @return the generalAbstractDetailsAbstractedDate
	 */
	public Date getGeneralAbstractDetailsAbstractedDate() {
		return generalAbstractDetailsAbstractedDate;
	}
	
	
	/**
	 * @param generalAbstractDetailsAbstractedDate the generalAbstractDetailsAbstractedDate to set
	 */
	public void setGeneralAbstractDetailsAbstractedDate(Date generalAbstractDetailsAbstractedDate) {
		this.generalAbstractDetailsAbstractedDate = generalAbstractDetailsAbstractedDate;
	}
	
	
	/**
	 * @return the generalDocumentDetailsInceptionDate
	 */
	public Date getGeneralDocumentDetailsInceptionDate() {
		return generalDocumentDetailsInceptionDate;
	}
	
	
	/**
	 * @param generalDocumentDetailsInceptionDate the generalDocumentDetailsInceptionDate to set
	 */
	public void setGeneralDocumentDetailsInceptionDate(Date generalDocumentDetailsInceptionDate) {
		this.generalDocumentDetailsInceptionDate = generalDocumentDetailsInceptionDate;
	}
	
	
	/**
	 * @return the generalDocumentDetailsEffectiveDate
	 */
	public Date getGeneralDocumentDetailsEffectiveDate() {
		return generalDocumentDetailsEffectiveDate;
	}
	
	
	/**
	 * @param generalDocumentDetailsEffectiveDate the generalDocumentDetailsEffectiveDate to set
	 */
	public void setGeneralDocumentDetailsEffectiveDate(Date generalDocumentDetailsEffectiveDate) {
		this.generalDocumentDetailsEffectiveDate = generalDocumentDetailsEffectiveDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesCommencementDate
	 */
	public Date getGeneralCriticalDatesCommencementDate() {
		return generalCriticalDatesCommencementDate;
	}
	
	
	/**
	 * @param generalCriticalDatesCommencementDate the generalCriticalDatesCommencementDate to set
	 */
	public void setGeneralCriticalDatesCommencementDate(Date generalCriticalDatesCommencementDate) {
		this.generalCriticalDatesCommencementDate = generalCriticalDatesCommencementDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesConstructionStartDate
	 */
	public Date getGeneralCriticalDatesConstructionStartDate() {
		return generalCriticalDatesConstructionStartDate;
	}
	
	
	/**
	 * @param generalCriticalDatesConstructionStartDate the generalCriticalDatesConstructionStartDate to set
	 */
	public void setGeneralCriticalDatesConstructionStartDate(Date generalCriticalDatesConstructionStartDate) {
		this.generalCriticalDatesConstructionStartDate = generalCriticalDatesConstructionStartDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesBaseLeaseExpirationDate
	 */
	public Date getGeneralCriticalDatesBaseLeaseExpirationDate() {
		return generalCriticalDatesBaseLeaseExpirationDate;
	}
	
	
	/**
	 * @param generalCriticalDatesBaseLeaseExpirationDate the generalCriticalDatesBaseLeaseExpirationDate to set
	 */
	public void setGeneralCriticalDatesBaseLeaseExpirationDate(Date generalCriticalDatesBaseLeaseExpirationDate) {
		this.generalCriticalDatesBaseLeaseExpirationDate = generalCriticalDatesBaseLeaseExpirationDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesConstructionEndDate
	 */
	public Date getGeneralCriticalDatesConstructionEndDate() {
		return generalCriticalDatesConstructionEndDate;
	}
	
	
	/**
	 * @param generalCriticalDatesConstructionEndDate the generalCriticalDatesConstructionEndDate to set
	 */
	public void setGeneralCriticalDatesConstructionEndDate(Date generalCriticalDatesConstructionEndDate) {
		this.generalCriticalDatesConstructionEndDate = generalCriticalDatesConstructionEndDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesRentCommencementDate
	 */
	public Date getGeneralCriticalDatesRentCommencementDate() {
		return generalCriticalDatesRentCommencementDate;
	}
	
	
	/**
	 * @param generalCriticalDatesRentCommencementDate the generalCriticalDatesRentCommencementDate to set
	 */
	public void setGeneralCriticalDatesRentCommencementDate(Date generalCriticalDatesRentCommencementDate) {
		this.generalCriticalDatesRentCommencementDate = generalCriticalDatesRentCommencementDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesOccupancyDate
	 */
	public Date getGeneralCriticalDatesOccupancyDate() {
		return generalCriticalDatesOccupancyDate;
	}
	
	
	/**
	 * @param generalCriticalDatesOccupancyDate the generalCriticalDatesOccupancyDate to set
	 */
	public void setGeneralCriticalDatesOccupancyDate(Date generalCriticalDatesOccupancyDate) {
		this.generalCriticalDatesOccupancyDate = generalCriticalDatesOccupancyDate;
	}
	
	
	/**
	 * @return the generalCriticalDatesLegalNoticeDate
	 */
	public Date getGeneralCriticalDatesLegalNoticeDate() {
		return generalCriticalDatesLegalNoticeDate;
	}
	
	
	/**
	 * @param generalCriticalDatesLegalNoticeDate the generalCriticalDatesLegalNoticeDate to set
	 */
	public void setGeneralCriticalDatesLegalNoticeDate(Date generalCriticalDatesLegalNoticeDate) {
		this.generalCriticalDatesLegalNoticeDate = generalCriticalDatesLegalNoticeDate;
	}
	
	
	/**
	 * @return the generalPremiseLocationEffectiveFrom
	 */
	public Date getGeneralPremiseLocationEffectiveFrom() {
		return generalPremiseLocationEffectiveFrom;
	}
	
	
	/**
	 * @param generalPremiseLocationEffectiveFrom the generalPremiseLocationEffectiveFrom to set
	 */
	public void setGeneralPremiseLocationEffectiveFrom(Date generalPremiseLocationEffectiveFrom) {
		this.generalPremiseLocationEffectiveFrom = generalPremiseLocationEffectiveFrom;
	}
	
	
	/**
	 * @return the generalPremiseLocationEffectiveTo
	 */
	public Date getGeneralPremiseLocationEffectiveTo() {
		return generalPremiseLocationEffectiveTo;
	}
	
	
	/**
	 * @param generalPremiseLocationEffectiveTo the generalPremiseLocationEffectiveTo to set
	 */
	public void setGeneralPremiseLocationEffectiveTo(Date generalPremiseLocationEffectiveTo) {
		this.generalPremiseLocationEffectiveTo = generalPremiseLocationEffectiveTo;
	}
	
	
	/**
	 * @return the generalOtherDatesDate
	 */
	public Date getGeneralOtherDatesDate() {
		return generalOtherDatesDate;
	}
	
	
	/**
	 * @param generalOtherDatesDate the generalOtherDatesDate to set
	 */
	public void setGeneralOtherDatesDate(Date generalOtherDatesDate) {
		this.generalOtherDatesDate = generalOtherDatesDate;
	}
	
	
	/**
	 * @return the generalAbstractNotificationsTargetDate
	 */
	public Date getGeneralAbstractNotificationsTargetDate() {
		return generalAbstractNotificationsTargetDate;
	}
	
	
	/**
	 * @param generalAbstractNotificationsTargetDate the generalAbstractNotificationsTargetDate to set
	 */
	public void setGeneralAbstractNotificationsTargetDate(Date generalAbstractNotificationsTargetDate) {
		this.generalAbstractNotificationsTargetDate = generalAbstractNotificationsTargetDate;
	}
	
	
	/**
	 * @return the generalLeaseAbstractExceptionsIssueReported
	 */
	public Date getGeneralLeaseAbstractExceptionsIssueReported() {
		return generalLeaseAbstractExceptionsIssueReported;
	}
	
	
	/**
	 * @param generalLeaseAbstractExceptionsIssueReported the generalLeaseAbstractExceptionsIssueReported to set
	 */
	public void setGeneralLeaseAbstractExceptionsIssueReported(Date generalLeaseAbstractExceptionsIssueReported) {
		this.generalLeaseAbstractExceptionsIssueReported = generalLeaseAbstractExceptionsIssueReported;
	}
	
	
	/**
	 * @return the generalLeaseAbstractExceptionsIssueResolved
	 */
	public Date getGeneralLeaseAbstractExceptionsIssueResolved() {
		return generalLeaseAbstractExceptionsIssueResolved;
	}
	
	
	/**
	 * @param generalLeaseAbstractExceptionsIssueResolved the generalLeaseAbstractExceptionsIssueResolved to set
	 */
	public void setGeneralLeaseAbstractExceptionsIssueResolved(Date generalLeaseAbstractExceptionsIssueResolved) {
		this.generalLeaseAbstractExceptionsIssueResolved = generalLeaseAbstractExceptionsIssueResolved;
	}
	
	
	/**
	 * @return the rentRentSchedulesStartDate
	 */
	public Date getRentRentSchedulesStartDate() {
		return rentRentSchedulesStartDate;
	}
	
	
	/**
	 * @param rentRentSchedulesStartDate the rentRentSchedulesStartDate to set
	 */
	public void setRentRentSchedulesStartDate(Date rentRentSchedulesStartDate) {
		this.rentRentSchedulesStartDate = rentRentSchedulesStartDate;
	}
	
	
	/**
	 * @return the rentRentSchedulesEndDate
	 */
	public Date getRentRentSchedulesEndDate() {
		return rentRentSchedulesEndDate;
	}
	
	
	/**
	 * @param rentRentSchedulesEndDate the rentRentSchedulesEndDate to set
	 */
	public void setRentRentSchedulesEndDate(Date rentRentSchedulesEndDate) {
		this.rentRentSchedulesEndDate = rentRentSchedulesEndDate;
	}
	
	
	/**
	 * @return the rentIndexAdjustmentsBaseIndexDate
	 */
	public Date getRentIndexAdjustmentsBaseIndexDate() {
		return rentIndexAdjustmentsBaseIndexDate;
	}
	
	
	/**
	 * @param rentIndexAdjustmentsBaseIndexDate the rentIndexAdjustmentsBaseIndexDate to set
	 */
	public void setRentIndexAdjustmentsBaseIndexDate(Date rentIndexAdjustmentsBaseIndexDate) {
		this.rentIndexAdjustmentsBaseIndexDate = rentIndexAdjustmentsBaseIndexDate;
	}
	
	
	/**
	 * @return the rentIndexAdjustmentsFirstAdjustmentDate
	 */
	public Date getRentIndexAdjustmentsFirstAdjustmentDate() {
		return rentIndexAdjustmentsFirstAdjustmentDate;
	}
	
	
	/**
	 * @param rentIndexAdjustmentsFirstAdjustmentDate the rentIndexAdjustmentsFirstAdjustmentDate to set
	 */
	public void setRentIndexAdjustmentsFirstAdjustmentDate(Date rentIndexAdjustmentsFirstAdjustmentDate) {
		this.rentIndexAdjustmentsFirstAdjustmentDate = rentIndexAdjustmentsFirstAdjustmentDate;
	}
	
	
	/**
	 * @return the rentFairMarketRateValueCurrentRateDate
	 */
	public Date getRentFairMarketRateValueCurrentRateDate() {
		return rentFairMarketRateValueCurrentRateDate;
	}
	
	
	/**
	 * @param rentFairMarketRateValueCurrentRateDate the rentFairMarketRateValueCurrentRateDate to set
	 */
	public void setRentFairMarketRateValueCurrentRateDate(Date rentFairMarketRateValueCurrentRateDate) {
		this.rentFairMarketRateValueCurrentRateDate = rentFairMarketRateValueCurrentRateDate;
	}
	
	
	/**
	 * @return the rentFairMarketRateValueOriginalRateDate
	 */
	public Date getRentFairMarketRateValueOriginalRateDate() {
		return rentFairMarketRateValueOriginalRateDate;
	}
	
	
	/**
	 * @param rentFairMarketRateValueOriginalRateDate the rentFairMarketRateValueOriginalRateDate to set
	 */
	public void setRentFairMarketRateValueOriginalRateDate(Date rentFairMarketRateValueOriginalRateDate) {
		this.rentFairMarketRateValueOriginalRateDate = rentFairMarketRateValueOriginalRateDate;
	}
	
	
	/**
	 * @return the rentFairMarketRateValueFirstAdjustmentDate
	 */
	public Date getRentFairMarketRateValueFirstAdjustmentDate() {
		return rentFairMarketRateValueFirstAdjustmentDate;
	}
	
	
	/**
	 * @param rentFairMarketRateValueFirstAdjustmentDate the rentFairMarketRateValueFirstAdjustmentDate to set
	 */
	public void setRentFairMarketRateValueFirstAdjustmentDate(Date rentFairMarketRateValueFirstAdjustmentDate) {
		this.rentFairMarketRateValueFirstAdjustmentDate = rentFairMarketRateValueFirstAdjustmentDate;
	}
	
	
	/**
	 * @return the rentPercentRentSetupFirstReportingPeriodStartDate
	 */
	public Date getRentPercentRentSetupFirstReportingPeriodStartDate() {
		return rentPercentRentSetupFirstReportingPeriodStartDate;
	}
	
	
	/**
	 * @param rentPercentRentSetupFirstReportingPeriodStartDate the rentPercentRentSetupFirstReportingPeriodStartDate to set
	 */
	public void setRentPercentRentSetupFirstReportingPeriodStartDate(
			Date rentPercentRentSetupFirstReportingPeriodStartDate) {
		this.rentPercentRentSetupFirstReportingPeriodStartDate = rentPercentRentSetupFirstReportingPeriodStartDate;
	}
	
	
	/**
	 * @return the rentSalesReportingDetailsEffectiveFrom
	 */
	public Date getRentSalesReportingDetailsEffectiveFrom() {
		return rentSalesReportingDetailsEffectiveFrom;
	}
	
	
	/**
	 * @param rentSalesReportingDetailsEffectiveFrom the rentSalesReportingDetailsEffectiveFrom to set
	 */
	public void setRentSalesReportingDetailsEffectiveFrom(Date rentSalesReportingDetailsEffectiveFrom) {
		this.rentSalesReportingDetailsEffectiveFrom = rentSalesReportingDetailsEffectiveFrom;
	}
	
	
	/**
	 * @return the rentSalesReportingDetailsEffectiveTo
	 */
	public Date getRentSalesReportingDetailsEffectiveTo() {
		return rentSalesReportingDetailsEffectiveTo;
	}
	
	
	/**
	 * @param rentSalesReportingDetailsEffectiveTo the rentSalesReportingDetailsEffectiveTo to set
	 */
	public void setRentSalesReportingDetailsEffectiveTo(Date rentSalesReportingDetailsEffectiveTo) {
		this.rentSalesReportingDetailsEffectiveTo = rentSalesReportingDetailsEffectiveTo;
	}
	
	
	/**
	 * @return the rentPercentRentSchedulesStartDate
	 */
	public Date getRentPercentRentSchedulesStartDate() {
		return rentPercentRentSchedulesStartDate;
	}
	
	
	/**
	 * @param rentPercentRentSchedulesStartDate the rentPercentRentSchedulesStartDate to set
	 */
	public void setRentPercentRentSchedulesStartDate(Date rentPercentRentSchedulesStartDate) {
		this.rentPercentRentSchedulesStartDate = rentPercentRentSchedulesStartDate;
	}
	
	
	/**
	 * @return the rentPercentRentSchedulesEndDate
	 */
	public Date getRentPercentRentSchedulesEndDate() {
		return rentPercentRentSchedulesEndDate;
	}
	
	
	/**
	 * @param rentPercentRentSchedulesEndDate the rentPercentRentSchedulesEndDate to set
	 */
	public void setRentPercentRentSchedulesEndDate(Date rentPercentRentSchedulesEndDate) {
		this.rentPercentRentSchedulesEndDate = rentPercentRentSchedulesEndDate;
	}
	
	
	/**
	 * @return the rentCommissionDetailsDueDate
	 */
	public Date getRentCommissionDetailsDueDate() {
		return rentCommissionDetailsDueDate;
	}
	
	
	/**
	 * @param rentCommissionDetailsDueDate the rentCommissionDetailsDueDate to set
	 */
	public void setRentCommissionDetailsDueDate(Date rentCommissionDetailsDueDate) {
		this.rentCommissionDetailsDueDate = rentCommissionDetailsDueDate;
	}
	
	
	/**
	 * @return the rentCommissionDetailsPaidDate
	 */
	public Date getRentCommissionDetailsPaidDate() {
		return rentCommissionDetailsPaidDate;
	}
	
	
	/**
	 * @param rentCommissionDetailsPaidDate the rentCommissionDetailsPaidDate to set
	 */
	public void setRentCommissionDetailsPaidDate(Date rentCommissionDetailsPaidDate) {
		this.rentCommissionDetailsPaidDate = rentCommissionDetailsPaidDate;
	}
	
	
	/**
	 * @return the rentCommissionDetailsReceiptDate
	 */
	public Date getRentCommissionDetailsReceiptDate() {
		return rentCommissionDetailsReceiptDate;
	}
	
	
	/**
	 * @param rentCommissionDetailsReceiptDate the rentCommissionDetailsReceiptDate to set
	 */
	public void setRentCommissionDetailsReceiptDate(Date rentCommissionDetailsReceiptDate) {
		this.rentCommissionDetailsReceiptDate = rentCommissionDetailsReceiptDate;
	}
	
	
	/**
	 * @return the rentCommissionSchedulesStartDate
	 */
	public Date getRentCommissionSchedulesStartDate() {
		return rentCommissionSchedulesStartDate;
	}
	
	
	/**
	 * @param rentCommissionSchedulesStartDate the rentCommissionSchedulesStartDate to set
	 */
	public void setRentCommissionSchedulesStartDate(Date rentCommissionSchedulesStartDate) {
		this.rentCommissionSchedulesStartDate = rentCommissionSchedulesStartDate;
	}
	
	
	/**
	 * @return the rentCommissionSchedulesEndDate
	 */
	public Date getRentCommissionSchedulesEndDate() {
		return rentCommissionSchedulesEndDate;
	}
	
	
	/**
	 * @param rentCommissionSchedulesEndDate the rentCommissionSchedulesEndDate to set
	 */
	public void setRentCommissionSchedulesEndDate(Date rentCommissionSchedulesEndDate) {
		this.rentCommissionSchedulesEndDate = rentCommissionSchedulesEndDate;
	}
	
	
	/**
	 * @return the securityDepositDepositDetailsDepositDate
	 */
	public Date getSecurityDepositDepositDetailsDepositDate() {
		return securityDepositDepositDetailsDepositDate;
	}
	
	
	/**
	 * @param securityDepositDepositDetailsDepositDate the securityDepositDepositDetailsDepositDate to set
	 */
	public void setSecurityDepositDepositDetailsDepositDate(Date securityDepositDepositDetailsDepositDate) {
		this.securityDepositDepositDetailsDepositDate = securityDepositDepositDetailsDepositDate;
	}
	
	
	/**
	 * @return the securityDepositDepositDetailsExpectedReturnedDate
	 */
	public Date getSecurityDepositDepositDetailsExpectedReturnedDate() {
		return securityDepositDepositDetailsExpectedReturnedDate;
	}
	
	
	/**
	 * @param securityDepositDepositDetailsExpectedReturnedDate the securityDepositDepositDetailsExpectedReturnedDate to set
	 */
	public void setSecurityDepositDepositDetailsExpectedReturnedDate(
			Date securityDepositDepositDetailsExpectedReturnedDate) {
		this.securityDepositDepositDetailsExpectedReturnedDate = securityDepositDepositDetailsExpectedReturnedDate;
	}
	
	
	/**
	 * @return the securityDepositDepositDetailsLetterOfCreditEffectiveDate
	 */
	public Date getSecurityDepositDepositDetailsLetterOfCreditEffectiveDate() {
		return securityDepositDepositDetailsLetterOfCreditEffectiveDate;
	}
	
	
	/**
	 * @param securityDepositDepositDetailsLetterOfCreditEffectiveDate the securityDepositDepositDetailsLetterOfCreditEffectiveDate to set
	 */
	public void setSecurityDepositDepositDetailsLetterOfCreditEffectiveDate(
			Date securityDepositDepositDetailsLetterOfCreditEffectiveDate) {
		this.securityDepositDepositDetailsLetterOfCreditEffectiveDate = securityDepositDepositDetailsLetterOfCreditEffectiveDate;
	}
	
	
	/**
	 * @return the securityDepositDepositDetailsLetterOfCreditExpirationDate
	 */
	public Date getSecurityDepositDepositDetailsLetterOfCreditExpirationDate() {
		return securityDepositDepositDetailsLetterOfCreditExpirationDate;
	}
	
	
	/**
	 * @param securityDepositDepositDetailsLetterOfCreditExpirationDate the securityDepositDepositDetailsLetterOfCreditExpirationDate to set
	 */
	public void setSecurityDepositDepositDetailsLetterOfCreditExpirationDate(
			Date securityDepositDepositDetailsLetterOfCreditExpirationDate) {
		this.securityDepositDepositDetailsLetterOfCreditExpirationDate = securityDepositDepositDetailsLetterOfCreditExpirationDate;
	}
	
	
	/**
	 * @return the optionsTenantRenewalAndOtherOptionsEffectiveDate
	 */
	public Date getOptionsTenantRenewalAndOtherOptionsEffectiveDate() {
		return optionsTenantRenewalAndOtherOptionsEffectiveDate;
	}
	
	
	/**
	 * @param optionsTenantRenewalAndOtherOptionsEffectiveDate the optionsTenantRenewalAndOtherOptionsEffectiveDate to set
	 */
	public void setOptionsTenantRenewalAndOtherOptionsEffectiveDate(Date optionsTenantRenewalAndOtherOptionsEffectiveDate) {
		this.optionsTenantRenewalAndOtherOptionsEffectiveDate = optionsTenantRenewalAndOtherOptionsEffectiveDate;
	}
	
	
	/**
	 * @return the optionsTenantRenewalAndOtherOptionsExerciseDate
	 */
	public Date getOptionsTenantRenewalAndOtherOptionsExerciseDate() {
		return optionsTenantRenewalAndOtherOptionsExerciseDate;
	}
	
	
	/**
	 * @param optionsTenantRenewalAndOtherOptionsExerciseDate the optionsTenantRenewalAndOtherOptionsExerciseDate to set
	 */
	public void setOptionsTenantRenewalAndOtherOptionsExerciseDate(Date optionsTenantRenewalAndOtherOptionsExerciseDate) {
		this.optionsTenantRenewalAndOtherOptionsExerciseDate = optionsTenantRenewalAndOtherOptionsExerciseDate;
	}
	
	
	/**
	 * @return the rightsOtherRightsEffectiveFrom
	 */
	public Date getRightsOtherRightsEffectiveFrom() {
		return rightsOtherRightsEffectiveFrom;
	}
	
	
	/**
	 * @param rightsOtherRightsEffectiveFrom the rightsOtherRightsEffectiveFrom to set
	 */
	public void setRightsOtherRightsEffectiveFrom(Date rightsOtherRightsEffectiveFrom) {
		this.rightsOtherRightsEffectiveFrom = rightsOtherRightsEffectiveFrom;
	}
	
	
	/**
	 * @return the rightsOtherRightsEffectiveTo
	 */
	public Date getRightsOtherRightsEffectiveTo() {
		return rightsOtherRightsEffectiveTo;
	}
	
	
	/**
	 * @param rightsOtherRightsEffectiveTo the rightsOtherRightsEffectiveTo to set
	 */
	public void setRightsOtherRightsEffectiveTo(Date rightsOtherRightsEffectiveTo) {
		this.rightsOtherRightsEffectiveTo = rightsOtherRightsEffectiveTo;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsFundsAvailableFrom
	 */
	public Date getAllowancesImprovementClauseDetailsFundsAvailableFrom() {
		return allowancesImprovementClauseDetailsFundsAvailableFrom;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsFundsAvailableFrom the allowancesImprovementClauseDetailsFundsAvailableFrom to set
	 */
	public void setAllowancesImprovementClauseDetailsFundsAvailableFrom(
			Date allowancesImprovementClauseDetailsFundsAvailableFrom) {
		this.allowancesImprovementClauseDetailsFundsAvailableFrom = allowancesImprovementClauseDetailsFundsAvailableFrom;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsFundsAvailableTo
	 */
	public Date getAllowancesImprovementClauseDetailsFundsAvailableTo() {
		return allowancesImprovementClauseDetailsFundsAvailableTo;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsFundsAvailableTo the allowancesImprovementClauseDetailsFundsAvailableTo to set
	 */
	public void setAllowancesImprovementClauseDetailsFundsAvailableTo(
			Date allowancesImprovementClauseDetailsFundsAvailableTo) {
		this.allowancesImprovementClauseDetailsFundsAvailableTo = allowancesImprovementClauseDetailsFundsAvailableTo;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsRequestDate
	 */
	public Date getAllowancesImprovementClauseDetailsRequestDate() {
		return allowancesImprovementClauseDetailsRequestDate;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsRequestDate the allowancesImprovementClauseDetailsRequestDate to set
	 */
	public void setAllowancesImprovementClauseDetailsRequestDate(Date allowancesImprovementClauseDetailsRequestDate) {
		this.allowancesImprovementClauseDetailsRequestDate = allowancesImprovementClauseDetailsRequestDate;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsDueDate
	 */
	public Date getAllowancesImprovementClauseDetailsDueDate() {
		return allowancesImprovementClauseDetailsDueDate;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsDueDate the allowancesImprovementClauseDetailsDueDate to set
	 */
	public void setAllowancesImprovementClauseDetailsDueDate(Date allowancesImprovementClauseDetailsDueDate) {
		this.allowancesImprovementClauseDetailsDueDate = allowancesImprovementClauseDetailsDueDate;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsReceivedDate
	 */
	public Date getAllowancesImprovementClauseDetailsReceivedDate() {
		return allowancesImprovementClauseDetailsReceivedDate;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsReceivedDate the allowancesImprovementClauseDetailsReceivedDate to set
	 */
	public void setAllowancesImprovementClauseDetailsReceivedDate(Date allowancesImprovementClauseDetailsReceivedDate) {
		this.allowancesImprovementClauseDetailsReceivedDate = allowancesImprovementClauseDetailsReceivedDate;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease
	 */
	public Date getAllowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease() {
		return allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease the allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease to set
	 */
	public void setAllowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease(
			Date allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease) {
		this.allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease = allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsActualCompletionOfLandlordWork
	 */
	public Date getAllowancesImprovementClauseDetailsActualCompletionOfLandlordWork() {
		return allowancesImprovementClauseDetailsActualCompletionOfLandlordWork;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsActualCompletionOfLandlordWork the allowancesImprovementClauseDetailsActualCompletionOfLandlordWork to set
	 */
	public void setAllowancesImprovementClauseDetailsActualCompletionOfLandlordWork(
			Date allowancesImprovementClauseDetailsActualCompletionOfLandlordWork) {
		this.allowancesImprovementClauseDetailsActualCompletionOfLandlordWork = allowancesImprovementClauseDetailsActualCompletionOfLandlordWork;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsCompletionOfTenantWork
	 */
	public Date getAllowancesImprovementClauseDetailsCompletionOfTenantWork() {
		return allowancesImprovementClauseDetailsCompletionOfTenantWork;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsCompletionOfTenantWork the allowancesImprovementClauseDetailsCompletionOfTenantWork to set
	 */
	public void setAllowancesImprovementClauseDetailsCompletionOfTenantWork(
			Date allowancesImprovementClauseDetailsCompletionOfTenantWork) {
		this.allowancesImprovementClauseDetailsCompletionOfTenantWork = allowancesImprovementClauseDetailsCompletionOfTenantWork;
	}
	
	
	/**
	 * @return the allowancesImprovementClauseDetailsActualCompletionOfTenantWork
	 */
	public Date getAllowancesImprovementClauseDetailsActualCompletionOfTenantWork() {
		return allowancesImprovementClauseDetailsActualCompletionOfTenantWork;
	}
	
	
	/**
	 * @param allowancesImprovementClauseDetailsActualCompletionOfTenantWork the allowancesImprovementClauseDetailsActualCompletionOfTenantWork to set
	 */
	public void setAllowancesImprovementClauseDetailsActualCompletionOfTenantWork(
			Date allowancesImprovementClauseDetailsActualCompletionOfTenantWork) {
		this.allowancesImprovementClauseDetailsActualCompletionOfTenantWork = allowancesImprovementClauseDetailsActualCompletionOfTenantWork;
	}
	
	
	/**
	 * @return the opexCamAuditSetupReconciliationStart
	 */
	public Date getOpexCamAuditSetupReconciliationStart() {
		return opexCamAuditSetupReconciliationStart;
	}
	
	
	/**
	 * @param opexCamAuditSetupReconciliationStart the opexCamAuditSetupReconciliationStart to set
	 */
	public void setOpexCamAuditSetupReconciliationStart(Date opexCamAuditSetupReconciliationStart) {
		this.opexCamAuditSetupReconciliationStart = opexCamAuditSetupReconciliationStart;
	}
	
	
	/**
	 * @return the opexCamAuditSetupFirstBillingEndDate
	 */
	public Date getOpexCamAuditSetupFirstBillingEndDate() {
		return opexCamAuditSetupFirstBillingEndDate;
	}
	
	
	/**
	 * @param opexCamAuditSetupFirstBillingEndDate the opexCamAuditSetupFirstBillingEndDate to set
	 */
	public void setOpexCamAuditSetupFirstBillingEndDate(Date opexCamAuditSetupFirstBillingEndDate) {
		this.opexCamAuditSetupFirstBillingEndDate = opexCamAuditSetupFirstBillingEndDate;
	}
	
	
	/**
	 * @return the opexCamSchedulesStartDate
	 */
	public Date getOpexCamSchedulesStartDate() {
		return opexCamSchedulesStartDate;
	}
	
	
	/**
	 * @param opexCamSchedulesStartDate the opexCamSchedulesStartDate to set
	 */
	public void setOpexCamSchedulesStartDate(Date opexCamSchedulesStartDate) {
		this.opexCamSchedulesStartDate = opexCamSchedulesStartDate;
	}
	
	
	/**
	 * @return the opexCamSchedulesEndDate
	 */
	public Date getOpexCamSchedulesEndDate() {
		return opexCamSchedulesEndDate;
	}
	
	
	/**
	 * @param opexCamSchedulesEndDate the opexCamSchedulesEndDate to set
	 */
	public void setOpexCamSchedulesEndDate(Date opexCamSchedulesEndDate) {
		this.opexCamSchedulesEndDate = opexCamSchedulesEndDate;
	}
	
	
	/**
	 * @return the insuranceInsuranceClauseDetailsEffectiveFrom
	 */
	public Date getInsuranceInsuranceClauseDetailsEffectiveFrom() {
		return insuranceInsuranceClauseDetailsEffectiveFrom;
	}
	
	
	/**
	 * @param insuranceInsuranceClauseDetailsEffectiveFrom the insuranceInsuranceClauseDetailsEffectiveFrom to set
	 */
	public void setInsuranceInsuranceClauseDetailsEffectiveFrom(Date insuranceInsuranceClauseDetailsEffectiveFrom) {
		this.insuranceInsuranceClauseDetailsEffectiveFrom = insuranceInsuranceClauseDetailsEffectiveFrom;
	}
	
	
	/**
	 * @return the insuranceInsuranceClauseDetailsEffectiveTo
	 */
	public Date getInsuranceInsuranceClauseDetailsEffectiveTo() {
		return insuranceInsuranceClauseDetailsEffectiveTo;
	}
	
	
	/**
	 * @param insuranceInsuranceClauseDetailsEffectiveTo the insuranceInsuranceClauseDetailsEffectiveTo to set
	 */
	public void setInsuranceInsuranceClauseDetailsEffectiveTo(Date insuranceInsuranceClauseDetailsEffectiveTo) {
		this.insuranceInsuranceClauseDetailsEffectiveTo = insuranceInsuranceClauseDetailsEffectiveTo;
	}
	
	
	/**
	 * @return the insuranceInsuranceSchedulesStartDate
	 */
	public Date getInsuranceInsuranceSchedulesStartDate() {
		return insuranceInsuranceSchedulesStartDate;
	}
	
	
	/**
	 * @param insuranceInsuranceSchedulesStartDate the insuranceInsuranceSchedulesStartDate to set
	 */
	public void setInsuranceInsuranceSchedulesStartDate(Date insuranceInsuranceSchedulesStartDate) {
		this.insuranceInsuranceSchedulesStartDate = insuranceInsuranceSchedulesStartDate;
	}
	
	
	/**
	 * @return the insuranceInsuranceSchedulesEndDate
	 */
	public Date getInsuranceInsuranceSchedulesEndDate() {
		return insuranceInsuranceSchedulesEndDate;
	}
	
	
	/**
	 * @param insuranceInsuranceSchedulesEndDate the insuranceInsuranceSchedulesEndDate to set
	 */
	public void setInsuranceInsuranceSchedulesEndDate(Date insuranceInsuranceSchedulesEndDate) {
		this.insuranceInsuranceSchedulesEndDate = insuranceInsuranceSchedulesEndDate;
	}
	
	
	/**
	 * @return the taxTaxSchedulesStartDate
	 */
	public Date getTaxTaxSchedulesStartDate() {
		return taxTaxSchedulesStartDate;
	}
	
	
	/**
	 * @param taxTaxSchedulesStartDate the taxTaxSchedulesStartDate to set
	 */
	public void setTaxTaxSchedulesStartDate(Date taxTaxSchedulesStartDate) {
		this.taxTaxSchedulesStartDate = taxTaxSchedulesStartDate;
	}
	
	
	/**
	 * @return the taxTaxSchedulesEndDate
	 */
	public Date getTaxTaxSchedulesEndDate() {
		return taxTaxSchedulesEndDate;
	}
	
	
	/**
	 * @param taxTaxSchedulesEndDate the taxTaxSchedulesEndDate to set
	 */
	public void setTaxTaxSchedulesEndDate(Date taxTaxSchedulesEndDate) {
		this.taxTaxSchedulesEndDate = taxTaxSchedulesEndDate;
	}
	
	
	/**
	 * @return the coTenancyItemEffectiveFrom
	 */
	public Date getCoTenancyItemEffectiveFrom() {
		return coTenancyItemEffectiveFrom;
	}
	
	
	/**
	 * @param coTenancyItemEffectiveFrom the coTenancyItemEffectiveFrom to set
	 */
	public void setCoTenancyItemEffectiveFrom(Date coTenancyItemEffectiveFrom) {
		this.coTenancyItemEffectiveFrom = coTenancyItemEffectiveFrom;
	}
	
	
	/**
	 * @return the coTenancyItemffectiveTo
	 */
	public Date getCoTenancyItemffectiveTo() {
		return coTenancyItemffectiveTo;
	}
	
	
	/**
	 * @param coTenancyItemffectiveTo the coTenancyItemffectiveTo to set
	 */
	public void setCoTenancyItemffectiveTo(Date coTenancyItemffectiveTo) {
		this.coTenancyItemffectiveTo = coTenancyItemffectiveTo;
	}
	
	
	/**
	 * @return the coTenancyItemRemodelDate
	 */
	public Date getCoTenancyItemRemodelDate() {
		return coTenancyItemRemodelDate;
	}
	
	
	/**
	 * @param coTenancyItemRemodelDate the coTenancyItemRemodelDate to set
	 */
	public void setCoTenancyItemRemodelDate(Date coTenancyItemRemodelDate) {
		this.coTenancyItemRemodelDate = coTenancyItemRemodelDate;
	}
	
	
	/**
	 * @return the greenLeaseProvisionsCredentialsValidUntil
	 */
	public Date getGreenLeaseProvisionsCredentialsValidUntil() {
		return greenLeaseProvisionsCredentialsValidUntil;
	}
	
	
	/**
	 * @param greenLeaseProvisionsCredentialsValidUntil the greenLeaseProvisionsCredentialsValidUntil to set
	 */
	public void setGreenLeaseProvisionsCredentialsValidUntil(Date greenLeaseProvisionsCredentialsValidUntil) {
		this.greenLeaseProvisionsCredentialsValidUntil = greenLeaseProvisionsCredentialsValidUntil;
	}
	
	
	/**
	 * @return the otherClausesEffectiveFrom
	 */
	public Date getOtherClausesEffectiveFrom() {
		return otherClausesEffectiveFrom;
	}
	
	
	/**
	 * @param otherClausesEffectiveFrom the otherClausesEffectiveFrom to set
	 */
	public void setOtherClausesEffectiveFrom(Date otherClausesEffectiveFrom) {
		this.otherClausesEffectiveFrom = otherClausesEffectiveFrom;
	}
	
	
	/**
	 * @return the otherClausesEffectiveEnd
	 */
	public Date getOtherClausesEffectiveEnd() {
		return otherClausesEffectiveEnd;
	}
	
	
	/**
	 * @param otherClausesEffectiveEnd the otherClausesEffectiveEnd to set
	 */
	public void setOtherClausesEffectiveEnd(Date otherClausesEffectiveEnd) {
		this.otherClausesEffectiveEnd = otherClausesEffectiveEnd;
	}
	
	
	/**
	 * @return the accountingStartDate
	 */
	public Date getAccountingStartDate() {
		return accountingStartDate;
	}
	
	
	/**
	 * @param accountingStartDate the accountingStartDate to set
	 */
	public void setAccountingStartDate(Date accountingStartDate) {
		this.accountingStartDate = accountingStartDate;
	}
	
	
	/**
	 * @return the accountingEndDate
	 */
	public Date getAccountingEndDate() {
		return accountingEndDate;
	}
	
	
	/**
	 * @param accountingEndDate the accountingEndDate to set
	 */
	public void setAccountingEndDate(Date accountingEndDate) {
		this.accountingEndDate = accountingEndDate;
	}
	
	
	/**
	 * @return the accountingLikelyTermEndDate
	 */
	public Date getAccountingLikelyTermEndDate() {
		return accountingLikelyTermEndDate;
	}
	
	
	/**
	 * @param accountingLikelyTermEndDate the accountingLikelyTermEndDate to set
	 */
	public void setAccountingLikelyTermEndDate(Date accountingLikelyTermEndDate) {
		this.accountingLikelyTermEndDate = accountingLikelyTermEndDate;
	}
	
   public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("**********  Here are my Finds  **********").append("\n");
        sb.append("General - Abstract Details - Abstracted Date: ").append( dateToString( generalAbstractDetailsAbstractedDate )).append("\n");
        sb.append("General - Document Details - Inception (Execution) Date: ").append( dateToString( generalDocumentDetailsInceptionDate ) ).append("\n");
        sb.append("General - Document Details - Effective Date: ").append( dateToString( generalDocumentDetailsEffectiveDate ) ).append("\n");
        sb.append("General - Critical Dates - Commencement Date: ").append( dateToString( generalCriticalDatesCommencementDate ) ).append("\n");
        sb.append("General - Critical Dates - Construction Start Date: ").append( dateToString( generalCriticalDatesConstructionStartDate)).append("\n");
        sb.append("General - Critical Dates - Base Lease Expiration Date: ").append( dateToString( generalCriticalDatesBaseLeaseExpirationDate)).append("\n");
        sb.append("General - Critical Dates - Construction End Date: ").append( dateToString( generalCriticalDatesConstructionEndDate)).append("\n");
        sb.append("General - Critical Dates - Rent Commencement Date: ").append( dateToString( generalCriticalDatesRentCommencementDate)).append("\n");
        sb.append("General - Critical Dates - Occupancy Date: ").append( dateToString( generalCriticalDatesOccupancyDate)).append("\n");
        sb.append("General - Critical Dates - Legal Notice Date: ").append( dateToString( generalCriticalDatesLegalNoticeDate)).append("\n");
        sb.append("General - Premise Location - Effective From: ").append( dateToString( generalPremiseLocationEffectiveFrom)).append("\n");
        sb.append("General - Premise Location - Effective To: ").append( dateToString( generalPremiseLocationEffectiveTo)).append("\n");
        sb.append("General - Other Dates - Date: ").append( dateToString( generalOtherDatesDate)).append("\n");
        sb.append("General - Abstract Notifications - Target Date: ").append( dateToString( generalAbstractNotificationsTargetDate)).append("\n");
        sb.append("General - Lease Abstract Exceptions - Issue Reported: ").append( dateToString( generalLeaseAbstractExceptionsIssueReported)).append("\n");
        sb.append("General - Lease Abstract Exceptions - Issue Resolved: ").append( dateToString( generalLeaseAbstractExceptionsIssueResolved)).append("\n");
        
        sb.append("Rent - Rent Schedules - Start Date: ").append( dateToString( rentRentSchedulesStartDate)).append("\n");
        sb.append("Rent - Rent Schedules - End Date: ").append( dateToString( rentRentSchedulesEndDate)).append("\n");
        sb.append("Rent - Index Adjustments - Base Index Date: ").append( dateToString( rentIndexAdjustmentsBaseIndexDate)).append("\n");
        sb.append("Rent - tIndex Adjustments - First Adjustment Date: ").append( dateToString( rentIndexAdjustmentsFirstAdjustmentDate)).append("\n");
        sb.append("Rent - Fair Market Rate Value - Current Rate Date: ").append( dateToString( rentFairMarketRateValueCurrentRateDate)).append("\n");
        sb.append("Rent - Fair Market Rate Value - Original Rate Date: ").append( dateToString( rentFairMarketRateValueOriginalRateDate)).append("\n");
        sb.append("Rent - Fair Market Rate Value - First Adjustment Date: ").append( dateToString( rentFairMarketRateValueFirstAdjustmentDate)).append("\n");
        sb.append("Rent - Percent Rent Setup First Reporting Period - Start Date: ").append( dateToString( rentPercentRentSetupFirstReportingPeriodStartDate)).append("\n");
        sb.append("Rent - Sales Reporting Details - Effective From: ").append( dateToString( rentSalesReportingDetailsEffectiveFrom)).append("\n");
        sb.append("Rent - Sales Reporting Details - Effective To: ").append( dateToString( rentSalesReportingDetailsEffectiveTo)).append("\n");
        sb.append("Rent - Percent Rent Schedules - Start Date: ").append( dateToString( rentPercentRentSchedulesStartDate)).append("\n");
        sb.append("Rent - Percent Rent Schedules - End Date: ").append( dateToString( rentPercentRentSchedulesEndDate)).append("\n");
        sb.append("Rent - Commission Details - Due Date: ").append( dateToString( rentCommissionDetailsDueDate)).append("\n");
        sb.append("Rent - Commission Details - Paid Date: ").append( dateToString( rentCommissionDetailsPaidDate)).append("\n");
        sb.append("Rent - Commission Details - Receipt Date: ").append( dateToString( rentCommissionDetailsReceiptDate)).append("\n");
        sb.append("Rent - Commission Details - Start Date: ").append( dateToString( rentCommissionSchedulesStartDate)).append("\n");
        sb.append("Rent - Commission Details - End Date: ").append( dateToString( rentCommissionSchedulesEndDate)).append("\n");
		
        sb.append("Security Deposit - Deposit Details - Deposit Date: ").append( dateToString( securityDepositDepositDetailsDepositDate)).append("\n");
        sb.append("Security Deposit - Deposit Details - Expected Returned Date: ").append( dateToString( securityDepositDepositDetailsExpectedReturnedDate)).append("\n");
        sb.append("Security Deposit - Deposit Details - Letter of Credit Effective Date: ").append( dateToString( securityDepositDepositDetailsLetterOfCreditEffectiveDate)).append("\n");
        sb.append("Security Deposit - Deposit Details - Letter of Credit Expiration Date: ").append( dateToString( securityDepositDepositDetailsLetterOfCreditExpirationDate)).append("\n");
        
        sb.append("Options - Tenant Renewal and Other Options - Effective Date: ").append( dateToString( optionsTenantRenewalAndOtherOptionsEffectiveDate)).append("\n");
        sb.append("Options - Tenant Renewal and Other Options - Exercise Date: ").append( dateToString( optionsTenantRenewalAndOtherOptionsExerciseDate)).append("\n");
        
        sb.append("Rights - Other Rights - Effective From: ").append( dateToString( rightsOtherRightsEffectiveFrom)).append("\n");
        sb.append("Rights - Other Rights - Effective To: ").append( dateToString( rightsOtherRightsEffectiveTo)).append("\n");
        
        sb.append("Allowances - Improvement Clause - Details Funds Available From: ").append( dateToString( allowancesImprovementClauseDetailsFundsAvailableFrom)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Funds Available To: ").append( dateToString( allowancesImprovementClauseDetailsFundsAvailableTo)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Request Date: ").append( dateToString( allowancesImprovementClauseDetailsRequestDate)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Due Date: ").append( dateToString( allowancesImprovementClauseDetailsDueDate)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Received Date: ").append( dateToString( allowancesImprovementClauseDetailsReceivedDate)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Completion of Landlord Work Date per Lease: ").append( dateToString( allowancesImprovementClauseDetailsCompletionOfLandlordWorkDatePerLease)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Actual Completion of Landlord Work: ").append( dateToString( allowancesImprovementClauseDetailsActualCompletionOfLandlordWork)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Completion of Tenant Work: ").append( dateToString( allowancesImprovementClauseDetailsCompletionOfTenantWork)).append("\n");
        sb.append("Allowances - Improvement Clause - Details Actual Completion of Tenant Work: ").append( dateToString( allowancesImprovementClauseDetailsActualCompletionOfTenantWork)).append("\n");
        
        sb.append("OPEX/CAM - CAM Audit Setup - Reconciliation Start: ").append( dateToString( opexCamAuditSetupReconciliationStart)).append("\n");
        sb.append("OPEX/CAM - CAM Audit Setup - First Billing End Date: ").append( dateToString( opexCamAuditSetupFirstBillingEndDate)).append("\n");
        sb.append("OPEX/CAM - CAM Schedules - Start Date: ").append( dateToString( opexCamSchedulesStartDate)).append("\n");
        sb.append("OPEX/CAM - CAM Schedules - End Date: ").append( dateToString( opexCamSchedulesEndDate)).append("\n");
        
        sb.append("Insurance - Insurance Clause - Details Effective From: ").append( dateToString( insuranceInsuranceClauseDetailsEffectiveFrom)).append("\n");
        sb.append("Insurance - Insurance Clause - Details Effective To: ").append( dateToString( insuranceInsuranceClauseDetailsEffectiveTo)).append("\n");
        sb.append("Insurance - Insurance Schedules - Start Date: ").append( dateToString( insuranceInsuranceSchedulesStartDate)).append("\n");
        sb.append("Insurance - Insurance Schedules - End Date: ").append( dateToString( insuranceInsuranceSchedulesEndDate)).append("\n");
        
        sb.append("Tax - Tax Schedules - Start Date: ").append( dateToString( taxTaxSchedulesStartDate)).append("\n");
        sb.append("Tax - Tax Schedules - End Date: ").append( dateToString( taxTaxSchedulesEndDate)).append("\n");
        
        sb.append("Co-Tenancy - Co-Tenancy Item - Effective From: ").append( dateToString( coTenancyItemEffectiveFrom)).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Effective To: ").append( dateToString( coTenancyItemffectiveTo)).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Remodel Date: ").append( dateToString( coTenancyItemRemodelDate)).append("\n");
        
        sb.append("Green Lease Provisions - Credentials - Valid Until: ").append( dateToString( greenLeaseProvisionsCredentialsValidUntil)).append("\n");
        
        sb.append("Other Clauses - Effective From: ").append( dateToString( otherClausesEffectiveFrom)).append("\n");
        sb.append("Other Clauses - Effective End: ").append( dateToString( otherClausesEffectiveEnd)).append("\n");
        
        sb.append("Accounting - Start Date: ").append( dateToString( accountingStartDate)).append("\n");
        sb.append("Accounting - End Date: ").append( dateToString( accountingEndDate)).append("\n");
        sb.append("Accounting - Likely Term - End Date: ").append( dateToString( accountingLikelyTermEndDate)).append("\n");
        
        return sb.toString();
    }
   
   private String dateToString(Date date) {
	   if(date!=null) {
		   return DATE_FORMAT.format( date );
	   }
	   return "<?>";	
   }
}
