package pr2.task1;

class Author{
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(){
        this.name = "?";
        this.email = "?";
        this.gender = '?';
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return this.gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public String toString(){
        return "ФИО: " + this.name + "\n" + "e-mail: " + this.email + "\n" + "Пол: " + this.gender;
    }
}