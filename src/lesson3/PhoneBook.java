package lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, Set<String>> phonesBySurname = new TreeMap();

    public PhoneBook() {
    }

    public void add(String surname, String phoneNumber) {
        Set<String> phones = (Set)this.phonesBySurname.get(surname);
        if (phones == null) {
            Set<String> phonesSet = new HashSet();
            phonesSet.add(phoneNumber);
            this.phonesBySurname.put(surname, phonesSet);
        } else {
            phones.add(phoneNumber);
            this.phonesBySurname.put(surname, phones);
        }

    }

    public Set<String> get(String surname) {
        return (Set)this.phonesBySurname.get(surname);
    }

    public Set<String> allSurname() {
        return this.phonesBySurname.keySet();
    }
}
