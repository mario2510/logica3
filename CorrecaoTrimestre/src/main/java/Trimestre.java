/**
 *
 */
public class Trimestre {

    private int mes;

    public Trimestre() {
    }

    /**
     *
     * @param mes
     */
    public Trimestre(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @return
     */
    public String verificarTrimestre() {
        switch(this.mes) {
            case 1: return "primeiro trimestre";
            case 2: return "primeiro trimestre";
            case 3: return "primeiro trimestre";
            case 4: return "segundo trimestre";
            case 5: return "segundo trimestre";
            case 6: return "segundo trimestre";
            case 7: return "terceiro trimestre";
            case 8: return "terceiro trimestre";
            case 9: return "terceiro trimestre";
            case 10: return "quarto trimestre";
            case 11: return "quarto trimestre";
            case 12: return "quarto trimestre";
            default: return "inválido";
        }
    }

    /**
     *
     * @return
     */
    public String verificarTrimestree() {
        if(this.mes == 1 || this.mes == 2 || this.mes == 3) {
            return "primeiro trimestre";
        } else if(this.mes == 4 || this.mes == 5 || this.mes == 6) {
            return "segundo trimestre";
        } else if(this.mes == 7 || this.mes == 8 || this.mes == 9) {
            return "terceiro trimestre";
        } else if(this.mes == 10 || this.mes == 11 || this.mes == 12) {
            return "quarto trimestre";
        }
        return "inválido";
    }

    /**
     *
     * @return
     */
    public String verificarTrimestreee() {
        if(this.mes >= 1 && this.mes <= 3) {
            return "primeiro trimestre";
        } else if(this.mes >= 4 && this.mes <= 6) {
            return "segundo trimestre";
        } else if(this.mes >= 7 && this.mes <= 9) {
            return "terceiro trimestre";
        } else if(this.mes >= 10 && this.mes <= 12) {
            return "quarto trimestre";
        }
        return "inválido";
    }

    @Override
    public String toString() {
        return "\nmes = " + mes
             + "\nqual o trimestre = " + this.verificarTrimestre() ;
    }
}
