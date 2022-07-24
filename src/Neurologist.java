//класс врач-невролог

public class Neurologist extends MedicalPersonnel implements Patient {

    public Neurologist (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач проводит диагностику, профилактику и лечение заболеваний центральной и периферической" +
                " нервной системы, а также опорно-двигательного аппарата.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Сумина Любовь Александровна, 39 лет, диагноз: мигрень" + "\n"
                + "Лелеков Владимир Вячеславович, 52 года, диагноз: ишемический инсульт." + "\n");}}
