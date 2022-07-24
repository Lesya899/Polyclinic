//класс врач-кардиолог

public class Cardiologist extends MedicalPersonnel implements Patient {

    public Cardiologist (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается лечением, профилактикой и диагностикой таких заболеваний, как: " +
                "ишемическая болезнь сердца, сердечная недостаточность, гипертоническая болезнь.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Макаров Сергей Александрович, 52 года, диагноз: атеросклероз" + "\n"
                + "Бурдин Василий Викторович, 37 лет, диагноз: гипотония." + "\n");}}
