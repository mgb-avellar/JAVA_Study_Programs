package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int contractNumber;
    private Date issuanceDate;
    private Double contractTotalValue;

    List<Installment> installmentList = new ArrayList<>();

    public Contract(int contractNumber, Date issuanceDate, Double contractTotalValue) {
        this.contractNumber = contractNumber;
        this.issuanceDate = issuanceDate;
        this.contractTotalValue = contractTotalValue;
    }

    public Contract() {

    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Double getContractTotalValue() {
        return contractTotalValue;
    }

    public void setContractTotalValue(Double contractTotalValue) {
        this.contractTotalValue = contractTotalValue;
    }

    public void addInstallment(Installment installment) {
        installmentList.add(installment);
    }

    public void removeInstallment(Installment installment) {
        installmentList.remove(installment);
    }


    public List<Installment> getInstallmentList() {
        return installmentList;
    }


}
