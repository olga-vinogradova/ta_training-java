package com.epam.training.student_Olga_Vinogradova.fundamentals1.nestedClasses.contactBook;


public class Contact {

    private String name;
    private ContactInfo[] contactInfoList;
    private int contactInfoCount;

    public Contact(String contactName) {
        if (contactName != null && !contactName.isEmpty()) {
            this.name = contactName;
            this.contactInfoList = new ContactInfo[10];
            this.contactInfoCount = 1;
            this.contactInfoList[0] = new NameContactInfo();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public void rename(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }

    public Email addEmail(String localPart, String domain) {
        if (contactInfoCount < 10 && countEmailEntries() < 3) {
            Email email = new Email(localPart, domain);
            addContactInfo(email);
            return email;
        }
        return null;
    }

    public EpamEmail addEpamEmail(String firstname, String lastname) {
        if (contactInfoCount < 10 && countEmailEntries() < 3) {
            EpamEmail epamEmail = new EpamEmail(firstname, lastname);
            addContactInfo(epamEmail);
            return epamEmail;
        }
        return null;
    }

    public Phone addPhoneNumber(int code, String number) {
        if (contactInfoCount < 10 && countPhoneNumberEntries() < 1) {
            Phone phone = new Phone(code, number);
            addContactInfo(phone);
            return phone;
        }
        return null;
    }

    public Social addTwitter(String twitterId) {
        if (contactInfoCount < 10 && countSocialMediaEntries() < 5) {
            Social social = new Social("Twitter", twitterId);
            addContactInfo(social);
            return social;
        }
        return null;
    }

    public Social addInstagram(String instagramId) {
        if (contactInfoCount < 10 && countSocialMediaEntries() < 5) {
            Social social = new Social("Instagram", instagramId);
            addContactInfo(social);
            return social;
        }
        return null;
    }

    public Social addSocialMedia(String title, String id) {
        if (contactInfoCount < 10 && countSocialMediaEntries() < 5) {
            Social social = new Social(title, id);
            addContactInfo(social);
            return social;
        }
        return null;
    }

    public ContactInfo[] getInfo() {
        ContactInfo[] result = new ContactInfo[contactInfoCount];
        System.arraycopy(contactInfoList, 0, result, 0, contactInfoCount);
        return result;
    }

    private void addContactInfo(ContactInfo contactInfo) {
        contactInfoList[contactInfoCount] = contactInfo;
        contactInfoCount++;
    }

    private int countEmailEntries() {
        int count = 0;
        for (int i = 0; i < contactInfoCount; i++) {
            if (contactInfoList[i] instanceof Email) {
                count++;
            }
        }
        return count;
    }

    private int countPhoneNumberEntries() {
        int count = 0;
        for (int i = 0; i < contactInfoCount; i++) {
            if (contactInfoList[i] instanceof Phone) {
                count++;
            }
        }
        return count;
    }

    private int countSocialMediaEntries() {
        int count = 0;
        for (int i = 0; i < contactInfoCount; i++) {
            if (contactInfoList[i] instanceof Social) {
                count++;
            }
        }
        return count;
    }

    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return name;
        }
    }

    public interface ContactInfo {
        String getTitle();
        String getValue();
    }

    public class Email implements ContactInfo {
        private final String email;

        public Email(String localPart, String domain) {
            this.email = localPart + "@" + domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return email;
        }
    }

    public class EpamEmail extends Email {
        public EpamEmail(String firstname, String lastname) {
            super(firstname + "_" + lastname, "epam.com");
        }

        @Override
        public String getTitle() {
            return "Epam Email";
        }
    }

    public class Social implements ContactInfo {
        private final String title;
        private final String id;

        public Social(String title, String id) {
            this.title = title;
            this.id = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return id;
        }
    }

    public class Phone implements ContactInfo {
        private final String phoneNumber;

        public Phone(int code, String number) {
            this.phoneNumber = "+" + code + " " + number;
        }

        @Override
        public String getTitle() {
            return "Tel";
        }

        @Override
        public String getValue() {
            return phoneNumber;
        }
    }
}