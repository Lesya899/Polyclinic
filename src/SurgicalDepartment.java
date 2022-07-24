//класс хирургическое отделение

public class SurgicalDepartment extends DepartmentOfPolyclinic {
    int countOperationBlocks;//количество операционных блоков

    public SurgicalDepartment (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel, int numberFloor,
        int countWard, String phoneNumber, String nameDepartmentHead, int countOperationBlocks) {
        super(nameDepartment, countDoctor, countNurse, countOtherPersonnel, numberFloor, countWard, phoneNumber,   nameDepartmentHead);
        this.countOperationBlocks = countOperationBlocks;}

    public void setCountOperationBlocks (int countOperationBlocks) {
        this.countOperationBlocks = countOperationBlocks;}

    public int getCountOperationBlocks () {
        return this.countOperationBlocks;}

    @Override
    public void infoDepartment () {
        System.out.println(getNameDepartment() + "\n" + "количество врачей: " + getCountDoctor() + ", количество медсестер: "
                + getCountNurse() + ", количество прочего персонала: " + getCountOtherPersonnel() + ", номер этажа: " + getNumberFloor()
                + ", количество палат: " + getCountWard() + ", контактный номер телефона: " + getPhoneNumber() + ", заведующий отделением: "
                + getNameDepartmentHead() + ", количество операционных блоков: " + countOperationBlocks + ".");}

    @Override
    public void schedule () {
        System.out.println("Режим работы: понедельник-пятница с 09:00 до 15:00." + "\n" + "Выходной день: суббота-воскресенье."
                + "\n" + "Сестринский пост работает: круглосуточно.");}

    @Override
    public void listOfMedical () {
        System.out.println("Специализация медицинских работников отделения: врач-хирург, врач-онколог, врач-уролог, " +
                "врач-травматолог-ортопед, старшая медицинская сестра, медицинская сестра-анестезист, медицинская сестра процедурной," +
                " палатная медицинская сестра, медицинская сестра." + "\n");}}

