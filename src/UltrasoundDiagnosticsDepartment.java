//класс отделение ультразвуковой диагностики

public class UltrasoundDiagnosticsDepartment extends DepartmentOfPolyclinic {
    private int countFunctionalDiagnosticEquipment; //количество оборудования функциональной диагностики
    private int countUltrasoundMachine; //количество ультразвуковых аппаратов

    public UltrasoundDiagnosticsDepartment (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel,
        int numberFloor, int countWard, String phoneNumber, String nameDepartmentHead, int countFunctionalDiagnosticEquipment, int countUltrasoundMachine) {
        super(nameDepartment, countDoctor, countNurse, countOtherPersonnel, numberFloor, countWard, phoneNumber,   nameDepartmentHead);
        this.countFunctionalDiagnosticEquipment = countFunctionalDiagnosticEquipment;
        this.countUltrasoundMachine = countUltrasoundMachine;}

    public void setCountFunctionalDiagnosticEquipment (int countFunctionalDiagnosticEquipment) {
        this.countFunctionalDiagnosticEquipment = countFunctionalDiagnosticEquipment;}

    public int getCountFunctionalDiagnosticEquipment () {
        return this.countFunctionalDiagnosticEquipment;}

    public void setCountUltrasoundMachine (int countUltrasoundMachine) {
        this.countUltrasoundMachine = countUltrasoundMachine;}

    public int getCountUltrasoundMachine () {
        return this.countUltrasoundMachine;}

    @Override
    public void infoDepartment () {
        System.out.println(getNameDepartment() + "\n" + "количество врачей: " + getCountDoctor() + ", количество медсестер: "
                + getCountNurse() + ", количество прочего персонала: " + getCountOtherPersonnel() + ", номер этажа: " + getNumberFloor()
                + ", количество палат: " + getCountWard() + ", контактный номер телефона: " + getPhoneNumber() + ", заведующий отделением: "
                + getNameDepartmentHead() + ", количество оборудования функциональной диагностики: "
                + getCountFunctionalDiagnosticEquipment() + ", количество ультразвуковых аппаратов: " + getCountUltrasoundMachine());}

    @Override
    public void schedule () {
        System.out.println("Режим работы: понедельник-пятница с 08:00 до 20:00." + "\n" + "Суббота: с 08:00 до 14:00."
                + "\n" + "Выходной день: воскресенье.");}

    @Override
    public void listOfMedical () {
        System.out.println("Специализация медицинских работников отделения:врач ультразвуковой диагностики, старшая медицинская сестра, медицинская сестра." + "\n");}}
