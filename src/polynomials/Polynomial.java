package polynomials;

/**
 * The class Polynomial
 *
 * @author jui & p6majo
 * @version 2021-03-19
 */
public class Polynomial {

    public static Polynomial random(int degree, int bound){
        Integer[] coeff = new Integer[degree+1];
        for (int i = 0; i < coeff.length; i++) {
            coeff[i] = -bound+(int) (Math.random()*2.*bound);
        }
        return new Polynomial(coeff);
    }

    /*
     *********************************************
     ***           Attributes           **********
     *********************************************
     */

    private Double[] coefficients;

    /*
     **********************************************
     ****           Constructors         **********
     **********************************************
     */

    public Polynomial(Double... coefficients){
        this.coefficients = coefficients;
    }

    public Polynomial(Integer... coefficients){
        this.coefficients = new Double[coefficients.length];
        int i=0;
        for (Integer coefficient : coefficients) {
            this.coefficients[i++]=(double) coefficient;
        }
    }

    /*
     ***********************************************
     ***           Getters              ************
     ***********************************************
     */



    /*
     ***********************************************
     ***           Setters              ************
     ***********************************************
     */



    /*
     ***********************************************
     ***           Public methods       ************
     ***********************************************
     */

    /**
     * TODO implement addition for polynomials
     * @param summand
     * @return
     */
    public Polynomial add(Polynomial summand){
        return null;
    }

    /**
     * TODO implement multiplication for polynomials
     * @param factor
     * @return
     */
    public Polynomial mul(Polynomial factor){
        return null;
    }

    /*
     ***********************************************
     ***           Private methods      ************
     ***********************************************
     */

    /**
     * Create exponents from integers
     * @param i
     * @return
     */
    private String toSuperScript(int i){
        String superscript = i+"";
        superscript = superscript.replaceAll("0", "⁰");
        superscript = superscript.replaceAll("1", "¹");
        superscript = superscript.replaceAll("2", "²");
        superscript = superscript.replaceAll("3", "³");
        superscript = superscript.replaceAll("4", "⁴");
        superscript = superscript.replaceAll("5", "⁵");
        superscript = superscript.replaceAll("6", "⁶");
        superscript = superscript.replaceAll("7", "⁷");
        superscript = superscript.replaceAll("8", "⁸");
        superscript = superscript.replaceAll("9", "⁹");
        return superscript;
    }

    /*
     ***********************************************
     ***           Overrides            ************
     ***********************************************
     */

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            String sign = coefficients[i]<0?"":"+";
            out.append(sign+coefficients[i]+"x"+ toSuperScript(i));
        }
        return out.toString();
    }


}
