public class Text {
    private final static String greeting = "Добро пожаловать в телефонный справочник!";
    private final static String menuStart = "\n1.Загрузить справочник из файла  " +
            "\n2.Просмотреть текущий справочник " +
            "\n3.Найти контакт  " +
            "\n4.Удалить контакт  " +
            "\n5.Добавить контакт  " +
            "\n6.Изменить контакт  " +
            "\n7.Записать текущий справочник в файл " +
            "\n8.Выход";
    private final static String menuReaderStart = "\n1.Загрузить из файла 1 " +
            "\n2.Загрузить из файла 2 " +
            "\n3.Выйти в главное меню";
    private final static String menuFinderStart = "\n1.Поиск по имени  " +
            "\n2.Поиск по фамилии  " +
            "\n3.Поиск по телефону  " +
            "\n4.Exit";

    private final static String phonebookUpdate = "\nТелефонный справочник успешно обновлен";

    private final static String enterFName = "\n1.Введите имя : ";
    private final static String enterLName = "\n1.Введите фамилию : ";
    private final static String enterDateBtsd = "\n1.Введите дату рождения : ";
    private final static String enterNumber = "\n1.Введите телефон : ";
    private final static String enterNumberwork = "\n1.Введите рабочий телефон : ";
    private final static String enterNumberMob = "\n1.Введите мобильный телефон : ";
    private final static String enterComment = "\n1.Введите комментарий : ";
    private final static String closeApplication = "\nЗавершение работы";
    private final static String contactNotFound = "\nКонтакт не найден!";
    private final static String currentField = "\nТекущее значение: ";
    private final static String changeField = "\nВведите новое значение: ";

    private final static String inputNewFName = "\n1.Введите новое имя: ";
    private final static String inputNewLName = "\n1.Введите новую фамилию: ";
    private final static String inputNewDBirthDay = "\n1.Введите новую дату рождения: ";
    private final static String inputNewHomeNumber = "\n1.Введите новый домашний номер: ";
    private final static String menuFinderNotFondContact = "\n1.Новый поиск " +
            "\n2.Exit ";
    private final static String menuChange = "\n1.Изменить Имя " +
            "\n2.Изменить Фамилию" +
            "\n3.Изменить дату рождения" +
            "\n4.Изменить номер домашний" +
            "\n5.Изменить номер мобильный" +
            "\n6.Изменить номер рабочий" +
            "\n7.Изменить комментарий" +
            "\n8.Вернуться назад(-=пропустить контакт=-)";
    private final static String menuWriterStart = "\n1.Построчный формат " +
            "\n2.Блочный формат " +
            "\n3.Выход";
    private final static String instruction1 = "Для работы введите нужный пункт меню: ";
    private final static String instruction2 = "\nВозврат в предыдущее меню";
    private final static String instruction3 = "\nНет такого пункта.";
    private final static String fileWrite = "\nФайл записан";
    private final static String inputNewMobileNumber = "\n1.Введите новый мобильный номер: ";
    private final static String matchesFound = "\nЕсть совпадения: ";

    private final static String isNotNumber = "\nВы ввели не целое число.";
    private final static String isNotDate = "\nВы ввели не дату. \n'хх.хх.хххх' ";
    private final static String inputNewWorkNumber = "\n1.Введите новый рабочий номер: ";
    private final static String inputNewComment = "\n1.Введите новый комментарий: ";


    public String getInputNewFName() {
        return inputNewFName;
    }

    public String getInputNewLName() {
        return inputNewLName;
    }

    public String getInputNewDBirthDay() {
        return inputNewDBirthDay;
    }

    public String getInputNewHomeNumber() {
        return inputNewHomeNumber;
    }

    public String getInputNewMobileNumber() {
        return inputNewMobileNumber;
    }

    public String getInputNewWorkNumber() {
        return inputNewWorkNumber;
    }

    public String getInputNewComment() {
        return inputNewComment;
    }

    public String getCurrentField() {
        return currentField;
    }

    public String getChangeField() {
        return changeField;
    }

    public String getContactNotFound() {
        return contactNotFound;
    }

    public String getEnterDateBtsd() {
        return enterDateBtsd;
    }

    public String getEnterNumberwork() {
        return enterNumberwork;
    }

    public String getEnterNumberMob() {
        return enterNumberMob;
    }

    public String getMenuFinderNotFondContact() {
        return menuFinderNotFondContact;
    }

    public static String getCloseApplication() {
        return closeApplication;
    }

    public String getEnterFName() {
        return enterFName;
    }

    public String getEnterLName() {
        return enterLName;
    }

    public String getEnterNumber() {
        return enterNumber;
    }


    public String getIsNotDate() {
        return isNotDate;
    }

    public String getIsNotNumber() {
        return isNotNumber;
    }

    public String getMatchesFound() {
        return matchesFound;
    }

    public String getFileWrite() {
        return fileWrite;
    }

    public String getInstruction3() {
        return instruction3;
    }

    public String getInstruction2() {
        return instruction2;
    }

    public String getMenuFinderStart() {
        return menuFinderStart;
    }

    public String getInstruction1() {
        return instruction1;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getEnterComment() {
        return enterComment;
    }

    public String getMenuStart() {
        return menuStart;
    }

    public String getMenuReaderStart() {
        return menuReaderStart;
    }

    public String getMenuChange() {
        return menuChange;
    }

    public String getMenuWriterStart() {
        return menuWriterStart;
    }

    public String getPhonebookUpdate() {
        return phonebookUpdate;
    }
}
