//класс врач-хирург

public class Surgeon extends MedicalPersonnel implements Patient {
    public Surgeon (String name, String nameDepartment, String lengthOfWork, String specialization, String skillDoctor,
        boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается лечением и  диагностикой таких заболеваний, как: травмы, переломы, растяжения," +
                " сосудистые патологии, опухоли.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Новиков Сергей Александрович, 41 год, диагноз: грыжа передней брюшной стенки" + "\n"
                + "Сапожников Олег Васильевич, 38 лет, диагноз: желчнокаменная болезнь." + "\n");}}

