//класс физиотерапевтическое отделение

public class PhysiotherapyDepartment extends DepartmentOfPolyclinic {
    private int countPhysiotherapyRooms; //количество кабинетов физиотерапии

    public PhysiotherapyDepartment (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel,
        int numberFloor, int countWard, String phoneNumber, String nameDepartmentHead, int countPhysiotherapyRooms) {
        super(nameDepartment, countDoctor, countNurse, countOtherPersonnel, numberFloor, countWard, phoneNumber, nameDepartmentHead);
        this.countPhysiotherapyRooms = countPhysiotherapyRooms;}

    public void setCountPhysiotherapyRooms (int countPhysiotherapyRooms) {
        this.countPhysiotherapyRooms = countPhysiotherapyRooms;}

    public int getCountPhysiotherapyRooms () {
        return this.countPhysiotherapyRooms;}

    @Override
    public void infoDepartment () {
        System.out.println(getNameDepartment() + "\n" + "количество врачей: " + getCountDoctor() + ", количество медсестер: "
                + getCountNurse() + ", количество прочего персонала: " + getCountOtherPersonnel() + ", номер этажа: " + getNumberFloor()
                + ", количество палат: " + getCountWard() + ", контактный номер телефона: " + getPhoneNumber() + ", заведующий отделением: "
                + getNameDepartmentHead() + ", количество кабинетов физиотерапии: " + getCountPhysiotherapyRooms() + "."); }

        @Override
    public void schedule () {
        System.out.println("Режим работы: понедельник-пятница с 08:00 до 15:40." + "\n" + "Суббота: с 08:00 до 14:00." + "\n"
                + "Выходной день: воскресенье.");}

    @Override
    public void listOfMedical () {
        System.out.println("Специализация медицинских работников отделения: врач-физиотерапевт, иглорефлексотерапевт," +
                " старшая медицинская сестра, медицинская сестра-анестезист." + "\n");}}

