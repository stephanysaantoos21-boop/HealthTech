/**
 * HealthTech — exemplo inicial em Java.
 *
 * Este arquivo demonstra uma estrutura simples para representar um ponto
 * de coleta. Ele ainda não está conectado ao site HTML/CSS nem a um banco
 * de dados ou API.
 */
public class HealthTech {
    public static class PontoDeColeta {
        private final String nome;
        private final String endereco;
        private final String itensAceitos;

        public PontoDeColeta(String nome, String endereco, String itensAceitos) {
            this.nome = nome;
            this.endereco = endereco;
            this.itensAceitos = itensAceitos;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getItensAceitos() {
            return itensAceitos;
        }
    }

    public static void main(String[] args) {
        System.out.println("HealthTech — protótipo acadêmico");
        System.out.println("Próxima etapa: pesquisar e validar fontes públicas de pontos de coleta.");
    }
}
