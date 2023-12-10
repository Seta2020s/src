# ООП Проект: Управление Учителями

## Изменения и Принципы SOLID

### 1. Принцип единственной ответственности (Single Responsibility Principle)

#### Код до изменений:
- Файл: `Teacher.java`
- Класс `Teacher` ранее содержал логику работы с учителем и дополнительно сравнение.

#### Код после изменений:
- Файл: `Teacher.java`
- Выделена новая сущность `UserComparator`, ответственная за сравнение.

### 2. Принцип открытости/закрытости (Open/Closed Principle)

#### Код до изменений:
- Файл: `TeacherService.java`
- Метод `getUserList` возвращал фиктивное значение `null`.

#### Код после изменений:
- Файл: `TeacherService.java`
- Метод `getUserList` теперь возвращает реальный список учителей.

### 3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle)

#### Код до изменений:
- Файл: `TeacherController.java`
- Класс `TeacherController` зависел от конкретной реализации `TeacherService` и `TeacherView`.

#### Код после изменений:
- Файл: `TeacherController.java`
- `TeacherController` теперь зависит от интерфейсов `UserController` и `UserView`, что позволяет использовать различные реализации.

### 4. Принцип разделения интерфейса (Interface Segregation Principle)

#### Код до изменений:
- Файлы: `UserController.java`, `UserView.java`
- Интерфейсы содержали лишние методы.

#### Код после изменений:
- Файлы: `UserController.java`, `UserView.java`
- Методы, необходимые только для работы с учителями, вынесены в отдельные интерфейсы.

### 5. Принцип инверсии зависимостей (Dependency Inversion Principle)

#### Код до изменений:
- Файл: `TeacherController.java`
- Класс `TeacherController` зависел от конкретных реализаций `TeacherService` и `TeacherView`.

#### Код после изменений:
- Файл: `TeacherController.java`
- `TeacherController` теперь зависит от абстракций `UserController` и `UserView`, что позволяет использовать различные реализации без изменения кода `TeacherController`.