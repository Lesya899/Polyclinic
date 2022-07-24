//класс врач-физиотерапевт

public class Physiotherapist extends MedicalPersonnel implements Patient {

    public Physiotherapist (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается подбором методов физиотерапии в соответствии с диагнозом, разработкой схемы лечения," +
                " проведением физиопроцедур.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Смольцев Александр Сергеевич, 26 лет, диагноз: воспалительные процессы в суставах" + "\n"
                + "Арефьева Нина Владимировна, 29 лет, диагноз: невралгия." + "\n");}}
