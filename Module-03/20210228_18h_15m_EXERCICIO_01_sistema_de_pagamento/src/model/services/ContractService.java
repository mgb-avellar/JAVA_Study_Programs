package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int numberOfInstallments) {

        double basicQuota = contract.getContractTotalValue() / numberOfInstallments;

        for (int i = 1; i <= numberOfInstallments; i++) {

            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

            Date dueDate = addMonthsForInstallmentsPaymentDate(contract.getIssuanceDate(), i);

            //contract.addInstallment(new Installment(dueDate, fullQuota));
            contract.getInstallmentList().add(new Installment(dueDate, fullQuota));

            // Acima, duas opções para adicionar a parcela
        }
    }

    private Date addMonthsForInstallmentsPaymentDate(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }



}
