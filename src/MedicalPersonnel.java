//абстрактный класс персонал поликлиники

public abstract class MedicalPersonnel {
    private String name; //ФИО
    private  String nameDepartment; //в каком отделении работает
    private  String lengthOfWork; //стаж работы
    private  String specialization; //специализация
    private  String skillDoctor;  //квалификация
    private  boolean assistedNurse; //ассистирует медсестра
    private  String nameNurse;  //ФИО медсестры


    public MedicalPersonnel (String name, String nameDepartment, String lengthOfWork, String specialization,
        String skillDoctor, boolean assistedNurse, String nameNurse) {
        this.name = name;
        this.nameDepartment = nameDepartment;
        this.lengthOfWork = lengthOfWork;
        this.specialization = specialization;
        this.skillDoctor = skillDoctor;
        this.assistedNurse = assistedNurse;
        this.nameNurse = nameNurse;}

    public void setName (String name) {
        this.name = name;}

    public String getName () {
        return this.name;}

    public void setNameDepartment (String nameDepartment) {
        this.nameDepartment = nameDepartment;}

    public String getNameDepartment () {
        return this.nameDepartment;}

    public void setLengthOfWork (String lengthOfWork) {
        this.lengthOfWork = lengthOfWork;}

    public String getLengthOfWork () {
        return this.lengthOfWork; }

    public void setSpecialization (String specialization) {
        this.specialization = specialization;}

    public String getSpecialization () {
        return this.specialization; }

    public void setSkillDoctor (String skillDoctor) {
        this.skillDoctor = skillDoctor;}

    public String getSkillDoctor () {
        return this.skillDoctor; }

    public void setAssistedNurse (boolean assistedNurse) {
        this.assistedNurse = assistedNurse;}

    public boolean isAssistedNurse () {
        return this.assistedNurse; }

    public void setNameNurse (String nameNurse) {
        this.nameNurse = nameNurse;}

    public String getNameNurse() {
        return this.nameNurse; }

    //Метод выводит  информацию о медецинском работнике
    public abstract void infoPersonnel();

    //метод выводит список заболеваний, которые лечит данный врач
    public abstract void diseases ();
}
