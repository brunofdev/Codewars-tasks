package br.com.brunofragadev.codewars_teknonymy;

public class Teknonymy {

    public int profundidade(Person person) {
        if(person.children.length == 0) return 0;
        int profundidade = 0;
        for (Person child : person.children) {
            int profundidadeFilho = profundidade(child);
            profundidade = Math.max(profundidade, profundidadeFilho);
        }
        return 1 + profundidade;
    }

    public Person buscarMaisVelho(Person person, int nivel) {
        if(nivel == 0) return person;
        Person maisVelho = null;
        for(Person child : person.children) {
            Person candidato = buscarMaisVelho(child, nivel-1);
            if(maisVelho == null || candidato.dateOfBirth.isBefore(maisVelho.dateOfBirth)) {
                maisVelho = candidato;
            }
        }
        return maisVelho;
    }

    public String montarTeknonym(Person person, int profundidade, String nomeDescendente) {
        String base = person.sex == 'm' ? "father" : "mother";
        StringBuilder sb = new StringBuilder();
        if(profundidade == 1) return base + " of " + nomeDescendente;
        if(profundidade >= 2) sb.append("grand");
        for(int i = 0; i < profundidade - 2; i++) sb.insert(0, "great-");
        sb.append(base);
        sb.append(" of ").append(nomeDescendente);
        return sb.toString();
    }

    public void compute(Person person) {
        if(person.children.length == 0) return;
        int profundidade = profundidade(person);
        Person maisVelho = buscarMaisVelho(person, profundidade);
        person.teknonym = montarTeknonym(person, profundidade, maisVelho.name);
        for(Person child : person.children) {
            compute(child);
        }

    }
}
