//класс врач-терапевт

public class Therapist extends MedicalPersonnel implements Patient {
    public Therapist (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается лечением таких заболеваний, как: простудные болезни, суставные заболевания, нарушения обмена веществ.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Фиалкина Лидия Петровна, 35 лет, диагноз: гипертония" + "\n"
                + "Тропинина Ольга Леонидовна, 46 лет, диагноз: инфекционный эндокардит." + "\n");}
}
