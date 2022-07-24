public class Main {
    public static void main(String[] args) {
    TherapeuticDepartment th = new TherapeuticDepartment("Терапевтическое отделение №2", 8,
    12, 5, 1, 23, "+7 (4952) 41-61-93", "Юдина Елена Петровна", true);
    th.infoDepartment();
    th.schedule();
    th.listOfMedical();

    SurgicalDepartment sr = new SurgicalDepartment("Хирургическое отделение №8", 9, 15,
    6, 2, 35, "+7 (4952) 41-61-94", "Перьев Леонид Сергеевич", 6);
    sr.infoDepartment();
    sr.schedule();
    sr.listOfMedical();

    PhysiotherapyDepartment ph = new PhysiotherapyDepartment ("Физиотерапевтическое отделение №4", 7,
    10, 5, 3, 5, "+7 (4952) 41-61-96", "Тюрин Степан Васильевич", 8);
    ph.infoDepartment();
    ph.schedule();
    ph.listOfMedical();

    UltrasoundDiagnosticsDepartment lt = new UltrasoundDiagnosticsDepartment ("Отделение ультразвуковой и " +
    "функциональной диагностики", 11, 8, 5, 4, 6,
     "+7 (4952) 41-61-98", "Алтуфьева Нина Григорьевна", 10, 12);
    lt.infoDepartment();
    lt.schedule();
    lt.listOfMedical();

    NeurologicalDepartment neurolog = new NeurologicalDepartment ("Неврологическое отделение для больных с ОНМК",
    12, 10, 6, 5, 22, "+7 (4952) 41-61-06", "Лапотин Игорь Викторович");
    neurolog.infoDepartment();
    neurolog.schedule();
    neurolog.listOfMedical();

    CardiologicalDepartment cardio = new CardiologicalDepartment ("Кардиологическое отделение", 13,
    10, 4, 6, 15, "+7 (4952) 41-61-08", "Афанасьев Николай Федорович");
    cardio.infoDepartment();
    cardio.schedule();
    cardio.listOfMedical();

    Therapist tp = new Therapist ("Порфирьев Антон Львович", "Терапевтическое отделение №2", "10 лет",
     "врач-терапевт", "высшая", false, "нет");
    tp.infoPersonnel();
    tp.diseases();
    tp.infoPatient();

    Surgeon s = new Surgeon ("Аристархов Роман Владимирович", "Хирургическое отделение №8", "24 года",
     "врач-хирург", "высшая", true, "Галинова Анастасия Алексеевна");
    s.infoPersonnel();
    s.diseases();
    s.infoPatient();

    Urologist r = new Urologist ("Ионов Евгений Николаевич", "Хирургическое отделение №8", "13 лет",
    "врач-уролог", "высшая", true, "Сычева Наталья Ивановна");
    r.infoPersonnel();
    r.diseases();
    r.infoPatient();

    Physiotherapist f = new Physiotherapist ("Шиганова Оксана Геннадьевна", "Физиотерапевтическое отделение №4",
     "20 лет", "врач-физиотерапевт", "вторая", false, "нет");
    f.infoPersonnel();
    f.diseases();
    f.infoPatient();

    DoctorOfUltrasoundDiagnostics d = new DoctorOfUltrasoundDiagnostics ("Горковцова Светлана Викторовна",
    "Отделение ультразвуковой и функциональной диагностики", "30 лет", "врач ультразвуковой диагностики",
    "высшая", false, "нет");
    d.infoPersonnel();
    d.diseases();
    d.infoPatient();

    Neurologist n = new Neurologist ("Кузьмина Зоя Валерьевна", "Неврологическое отделение для больных с ОНМК",
    "29 лет", "врач-невролог", "высшая", false, "нет");
    n.infoPersonnel();
    n.diseases();
    n.infoPatient();

    Cardiologist c = new Cardiologist ("Смирнова Елена Амишевна", "Кардиологическое отделение",
    "29 лет", "врач-кардиолог", "высшая", true, "Нестёркина Елена Владимировна");
    c.infoPersonnel();
    c.diseases();
    c.infoPatient(); }}
