package Creational.Builder;

//Builder é um padrão de criação que tem a intenção
//de separar a construção de um objeto complexo
//da sua representação, de modo que o mesmo processo
//de construção possa criar diferentes representações.
//
//Builder te da a possibilidade de criar objetos passo-a-passo
//e isso já é possível em algumas linguagens como o Python sem o uso deste padrão.
//
//Geralmente o builder aceita o encadeamento de métodos
//(method chaining).

public class Client {
    public static void main(String[] args) {
        IUserBuilder userBuilder = new UserBuilder();
        UserDirector director  = new UserDirector(userBuilder);

        director.getUser()
                .adress("rua nicolau pass")
                .name("lucas").lastName("sombra")
                .age(35);
    }
}

