package roboTanque;

public class TanqueRobo implements Posicao, Cor, Canhao {

    private int x, y;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private String nome;

    public TanqueRobo(){

    };

    public TanqueRobo(int x, int y, CoresRGB corTanque, CoresRGB corCanhao, String nome) {
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.nome = nome;
    }

    @Override
    public void atirar() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(Long cadencia) {
        for (int i = 0; i < 5; i++) {
            esperar(cadencia * 1000);
            System.out.println("Atirando...");
        }
    }

    private void esperar(Long cadencia){
        try {
            if (cadencia > 5000){
                throw new IllegalArgumentException("Valor inválido");
            }
            Thread.sleep(cadencia);
        } catch (InterruptedException e) {
            System.out.println("Erro ao congelar tempo: " + e.getMessage());
        }
    }

    @Override
    public void atribCorTangue(CoresRGB corTamque) {
        this.corTanque = corTamque;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorTangue() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public String toString() {
        return "TanqueRobo{" +
                "x=" + x +
                ", y=" + y +
                ", corTanque=" + corTanque +
                ", corCanhao=" + corCanhao +
                ", nome='" + nome + '\'' +
                '}';
    }
}
