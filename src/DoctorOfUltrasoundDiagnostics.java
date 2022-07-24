//класс врач ультразвуковой диагностики

public class DoctorOfUltrasoundDiagnostics extends MedicalPersonnel implements Patient {

    public DoctorOfUltrasoundDiagnostics (String name, String nameDepartment, String lengthOfWork, String specialization,
                                          String skillDoctor, boolean assistedNurse, String nameNurse) {
        super(name, nameDepartment, lengthOfWork, specialization, skillDoctor, assistedNurse, nameNurse);}

    @Override
    public void infoPersonnel () {
        System.out.println(getName() + ", " + getNameDepartment() + ", стаж работы: " + getLengthOfWork() + ", специализация: "
                + getSpecialization() + ",  квалификационная категория: " + getSkillDoctor() + ", ассистирует медсестра: "
                +((isAssistedNurse())?"да":"нет") + ", медсестра: " + getNameNurse());}

    @Override
    public void diseases () {
        System.out.println ("Врач занимается проведением ультразвукового исследования органов и систем для выявления в них" +
                " патологических изменений.");}

    @Override
    public void infoPatient() {
        System.out.println ("Пациенты:" + "\n"
                + "Воронов Эдуард Петрович, 32 года, диагноз: трещина в мениске" + "\n"
                + "Томашева Ольга Георгиевна, 37 лет, диагноз: увеличение щитовидной железы." + "\n");}}


