/*
### **Задание 8: Композиция классов**

Создайте классы:

- `Address`(улица, дом, город)

- `Person`(имя, возраст, адрес типа Address)


В классе`Person`создайте метод`displayInfo()`, который выводит всю информацию о человеке, включая адрес.
 */

package ClassesObjectsMethods.task8;

public class Address {
    private String street;
    private int houseNumber;
    private String city;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
}
