//класс врач-уролог

public class Urologist extends MedicalPersonnel implements Patient {
    public Urologist (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается лечением, профилактикой и диагностикой таких заболеваний, как: воспаление мочевого пузыря," +
                " мочекаменная болезнь, уретрит, нефрит, простатит, бесплодие.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Пенкин Ренат Игоревич, 36 лет, диагноз: пиелонефрит" + "\n"
                + "Абрамова Ольга Владимировна, 29 лет, диагноз: камни в почках." + "\n");}}
