//5.1.1 Salutation
public String salutation(String  name) {
    String[] lastName = name.split(" ");
    return "Mr. "+lastName[1];
}