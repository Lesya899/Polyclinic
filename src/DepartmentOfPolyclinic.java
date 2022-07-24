//абстрактный класс отделение поликлиники

public abstract class DepartmentOfPolyclinic {
    private String nameDepartment; //название отделения
    private int countDoctor;  //количество врачей
    private int countNurse; // количество медсестер
    private int countOtherPersonnel; //количество прочего персонала
    private int numberFloor; //номер этажа
    private int countWard; //количество палат
    private String phoneNumber; //номер телефона
    private String nameDepartmentHead; //ФИО заведующего отделением


    public DepartmentOfPolyclinic (String nameDepartment, int countDoctor, int countNurse, int countOtherPersonnel,
        int numberFloor, int countWard, String phoneNumber, String nameDepartmentHead) {
        this.nameDepartment = nameDepartment;
        this.countDoctor = countDoctor;
        this.countNurse = countNurse;
        this.countOtherPersonnel = countOtherPersonnel;
        this.numberFloor = numberFloor;
        this.countWard = countWard;
        this.phoneNumber = phoneNumber;
        this.nameDepartmentHead = nameDepartmentHead;}

    public void setNameDepartment (String nameDepartment) {
        this.nameDepartment = nameDepartment;}

    public String getNameDepartment () {
        return this.nameDepartment;}

    public void setCountDoctor (int countDoctor) {
        this.countDoctor = countDoctor;}

    public int getCountDoctor () {
        return this.countDoctor;}

    public void setCountNurse (int countNurse) {
        this.countNurse = countNurse;}

    public int getCountNurse () {
        return this.countNurse;}

    public void setCountOtherPersonnel (int countOtherPersonnel) {
        this.countOtherPersonnel = countOtherPersonnel;}

    public int getCountOtherPersonnel () {
        return this.countOtherPersonnel;}

    public void setNumberFloor (int numberFloor) {
        this.numberFloor = numberFloor;}

    public int getNumberFloor () {
        return this.numberFloor;}

    public void setCountWard (int countWard) {
        this.countWard = countWard;}

    public int getCountWard () {
        return this.countWard;}

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;}

    public String getPhoneNumber () {
        return this.phoneNumber;}

    public void setNameDepartmentHead (String nameDepartmentHead) {
        this.nameDepartmentHead = nameDepartmentHead;}

    public String getNameDepartmentHead () {
        return this.nameDepartmentHead;}


    //Метод выводит общую информацию об отделении
    public abstract void infoDepartment ();

    //Метод выводит расписание работы отделения
    public abstract void schedule();

    //Метод выводит  врачей по специализациям и медсестер, работающих в отделении
    public abstract void listOfMedical ();
}
