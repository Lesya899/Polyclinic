//класс терапевтическое отделение

public class TherapeuticDepartment extends DepartmentOfPolyclinic {
    private boolean canteen; //есть ли столовая

    public TherapeuticDepartment (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel,
        int numberFloor, int countWard, String phoneNumber, String nameDepartmentHead, boolean canteen) {
        super(nameDepartment, countDoctor, countNurse, countOtherPersonnel, numberFloor, countWard, phoneNumber,   nameDepartmentHead);
        this.canteen = canteen;}

    public void setCanteen (boolean canteen) {
        this.canteen = canteen;}

    public boolean isCanteen () {
        return this.canteen;}


    @Override
    public void infoDepartment () {
        System.out.println(getNameDepartment() + "\n" + "количество врачей: " + getCountDoctor() + ", количество медсестер: " + getCountNurse()
                + ", количество прочего персонала: " + getCountOtherPersonnel() + ", номер этажа: " + getNumberFloor() + ", количество палат: "
                + getCountWard() + ", контактный номер телефона: " + getPhoneNumber() + ", заведующий отделением: " + getNameDepartmentHead()
                + ", наличие столовой в отделении:  " + ((canteen)?"Да":"Нет") + ".");}

    @Override
    public void schedule () {
        System.out.println("Режим работы: круглосуточно с понедельника по воскресенье." + "\n" + "Часы приема: ежедневно с 8:00" +
                " до 14:30." + "\n" + "Дежурный врач работает: с 14:30 до 08:00.");}


    @Override
    public void listOfMedical () {
        System.out.println("Специализация медицинских работников отделения: врач-терапевт, участковый врач-терапевт, старшая " +
                "медицинская сестра, медицинская сестра." + "\n");}}
