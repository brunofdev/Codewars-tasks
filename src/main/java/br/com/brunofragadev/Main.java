package br.com.brunofragadev;
import br.com.brunofragadev.teknonymy.Person;
import br.com.brunofragadev.teknonymy.Teknonymy;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Geração 3 - Netos
        Person ana     = new Person("Ana",     'f', new Person[]{}, LocalDateTime.of(1043, 11, 1, 0, 0, 0));
        Person pedro   = new Person("Pedro",   'm', new Person[]{}, LocalDateTime.of(1045, 1, 1, 0, 0, 0));
        Person lucas   = new Person("Lucas",   'm', new Person[]{}, LocalDateTime.of(1046, 1, 1, 0, 0, 0));
        Person maria   = new Person("Maria",   'f', new Person[]{}, LocalDateTime.of(1047, 1, 1, 0, 0, 0));

        // Geração 2 - Filhos
        Person beatriz = new Person("Beatriz", 'f', new Person[]{maria},          LocalDateTime.of(1020, 1, 1, 0, 0, 0));
        Person carlos  = new Person("Carlos",  'm', new Person[]{lucas},          LocalDateTime.of(1021, 2, 1, 0, 0, 0));
        Person daniel  = new Person("Daniel",  'm', new Person[]{pedro, ana},     LocalDateTime.of(1023, 11, 28, 0, 0, 0));

        // Geração 1 - Avô
        Person joao    = new Person("Joao",    'm', new Person[]{beatriz, carlos, daniel}, LocalDateTime.of(1000, 1, 1, 0, 0, 0));

        Teknonymy t = new Teknonymy();
        t.compute(joao);

        System.out.println(joao.teknonym);    // grandfather of Ana
        System.out.println(beatriz.teknonym); // mother of Maria
        System.out.println(daniel.teknonym);  // father of Ana
        System.out.println(carlos.teknonym);  // father of Lucas
    }
}