//класс кардиологическое отделение

public class CardiologicalDepartment extends DepartmentOfPolyclinic {
    public CardiologicalDepartment (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel,
        int numberFloor, int countWard, String phoneNumber, String nameDepartmentHead) {
        super(nameDepartment, countDoctor, countNurse, countOtherPersonnel, numberFloor, countWard, phoneNumber,   nameDepartmentHead);}

    @Override
    public void infoDepartment () {
        System.out.println(getNameDepartment() + "\n" + "количество врачей: " + getCountDoctor() + ", количество медсестер: "
                + getCountNurse() + ", количество прочего персонала: " + getCountOtherPersonnel() + ", номер этажа: " + getNumberFloor()
                + ", количество палат: " + getCountWard() + ", контактный номер телефона: " + getPhoneNumber() + ", заведующий отделением: "
                + getNameDepartmentHead());}

    @Override
    public void schedule () {
        System.out.println("Режим работы: понедельник-пятница с 08:00 до 20:00." + "\n" + "Суббота: с 08:00 до 14:00." + "\n"
                + "Выходной день: воскресенье.");}

    @Override
    public void listOfMedical () {
        System.out.println ("Специализация медицинских работников отделения: врач-кардиолог, старшая медицинская сестра," +
                " медицинская сестра." + "\n");}
}
