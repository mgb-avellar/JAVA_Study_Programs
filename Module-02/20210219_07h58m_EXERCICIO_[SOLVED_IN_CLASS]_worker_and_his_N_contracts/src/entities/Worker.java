package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    /*
        Essa é a classe mais complexa. Ela caracteriza o trabalhador e tem três variáveis básicas:
        o nome, o nível de contrato e um salário base.
        A classe também possui três métodos:
        - adicionar contratos para o trabalhador;
        - remover contratos do trabalhador;
        - uma função que calcula quanto ele ganhou em determinados mês e ano que o RH fornece.
        Essa classe tem duas associações: um departamento e vários contratos. (Esse conceito é importante.)

     */

    private String workerName;
    private WorkerLevel workerContractLevel;  // (Aqui defino a variável que é do tipo Enum)
    private Double workerBaseSalary;

    // (Abaixo, coloco as associações; a isso chamamos de composição)

    private Department workerDepartment;          // Associação simples: uma variável do tipo Department

        /*
            A associação com os vários contratos que um trabalhador pode ter é mais complicada,
            pois um trabalhador pode ter mais de um contrato do tipo HourContract.

            Os vários contratos devem ser representados com uma LISTA!

            As listas devem ser logo instanciadas, e não entram nos construtores! (ATENÇÃO AQUI!!)
            Essa regrinha vale para qualquer composição do tipo "tem muitos".

         */

    // Eis a lista contracts de contratos do trabalhador, já inicializada
    private List<HourContract> workerContracts = new ArrayList<>();

    // A seguir, os construtores, getters e setters; depois os métodos.


    public Worker() {

    }

    public Worker(String workerName, WorkerLevel workerContractLevel, Double baseSalary, Department department) {
        this.workerName = workerName;
        this.workerContractLevel = workerContractLevel;
        this.workerBaseSalary = baseSalary;
        this.workerDepartment = department;
        // Note que não entra aqui a lista:  this.workerContracts = contracts;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public WorkerLevel getWorkerContractLevel() {
        return workerContractLevel;
    }

    public void setWorkerContractLevel(WorkerLevel workerContractLevel) {
        this.workerContractLevel = workerContractLevel;
    }

    public Double getWorkerBaseSalary() {
        return workerBaseSalary;
    }

    public void setWorkerBaseSalary(Double workerBaseSalary) {
        this.workerBaseSalary = workerBaseSalary;
    }

    public Department getWorkerDepartment() {
        return workerDepartment;
    }

    public void setWorkerDepartment(Department workerDepartment) {
        this.workerDepartment = workerDepartment;
    }

    public List<HourContract> getWorkerContracts() {
        return workerContracts;
    }

    // Vamos aos métodos: esses dois métodos fazem e desfazem a associação entre um trabalhador e um contrato.
    // Agora, porque temos esses dois métodos que adicionam e removem essas associações, não posso permitir que
    //   outras partes do programa consigam substituir as listas de contratos (por exemplo, isso levaria à fraudes).
    // Por essa razão, não posso permitir que haja um setter para a lista de contratos. Assim, temos apenas
    //   o getter para a lista.

    public void addContract(HourContract contract) {
        workerContracts.add(contract);
        // O método recebe uma variável contract tipo HourContract e adiciona na lista de contratos que criamos
    }

    public void removeContract(HourContract contract) {
        workerContracts.remove(contract);
        // O método recebe uma variável contract tipo HourContract e remove ele da lista de contratos que criamos
    }

    public Double income(int year, int month){
        // O total ganho por mês é o salário base mais o que ele ganhou pelos contratos referentes àquele mês.

        double sum = this.workerBaseSalary;
        Calendar cal = Calendar.getInstance(); // O Calendar será necessário abaixo

        // Usaremos um FOR EACH para percorrer toda a lista de contratos do trabalhador para saber quais
        //   deles correspondem ao mês e ao ano fornecidos para a pesquisa

        for (HourContract c : workerContracts) {

            // Cada contrato tem uma data, e é para isso que temos que olhar primeiro.

            cal.setTime(c.getContractDate());  // coloco no calendário a data de cada contrato c que recebo aqui
                                               // pego a data do contrato com "c.getContractDate()"
                                               // jogo a data do contrato no calendário com "cal.setTime();"

            // cal agora já tem a data do contrato e posso usar as funções do Calendar para pegar o ano e o mês
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            // Cada contrato também tem uma operação (totalValue) que fornece a remuneração pelo contrato;
            // no entanto, tenho que pegar apenas os contratos dos referidos mês e ano.

            if ( (c_month == month) && (c_year == year) ) {

                sum += c.totalValue();
            }

        }

        return sum;

    }

}
