// This class represents a polynomial. A polynomial is a sum of multiple monomials (class 'Monom'),
// such as 3*x^1 + -1*x^2 + 1*x^5.
// 'Polynom' uses a binary search tree to store its monomials. The degree of the monomial is the key.
// A specific degree exists at most once in the polynomial.
// TODO: define further classes for the implementation of the binary search tree, if needed

public class Polynom {

    //TODO: declare variables
    private Polynom left, right;
    private Monom storedMonom;

    // allows us to use empty constructors
    public Polynom() {

    }

    // Initializes this polynomial with multiple monomials. The coefficients of the monomials are
    // specified by 'coeffs', where coeffs[i] is the coefficient of the monomial of degree i.
    // Entries with value 0 are ignored, i.e. corresponding monomials are not stored in the polynomial.
    public Polynom(int[] coeffs) {
        // TODO: implement this constructor
        for (int i = 0; i < coeffs.length; i++) {
            add(coeffs[i], i);
        }
    }

    // Adds the monomial specified by 'coeff' and 'degree' to this polynomial, if coeff != 0,
    // otherwise 'add' has no effect.
    // If this polynomial already has a monomial of the same degree, no new monomial is added, instead
    // the coefficient of the monomial is modified accordingly ('combine' is called).
    public void add(int coeff, int degree) {
        // TODO: implement this method
        if (coeff == 0) return;

        Monom addMonom = new Monom(coeff, degree);
        if (storedMonom == null) {
            storedMonom = addMonom;
            return;
        }

        if (storedMonom.combine(addMonom)) return;

        if (storedMonom.lowerDegreeThan(addMonom)) {
            if (right == null) right = new Polynom();
            right.add(coeff, degree);
        } else {
            if (left == null) left = new Polynom();
            left.add(coeff, degree);
        }
    }

    private void add(Monom m) {
        add(m.getCoeff(), m.getDegree());
    }

    // Adds all monomials of 'p' to this polynomial.
    // (The rules of 'add(int,int)' apply for each monomial to be added.)
    public void add(Polynom p) {
        // TODO: implement this method
        if (p.left != null) add(p.left);

        add(p.storedMonom);

        if (p.right != null) add(p.right);
    }

    // Returns the value of the polynomial for a specified value of 'x'
    public int eval(int x) {
        // TODO: implement this method

        int retVal = 0;
        if (left != null) retVal += left.eval(x);
        retVal += storedMonom.eval(x);
        if (right != null) retVal += right.eval(x);

        return retVal;
    }

    // Returns a polynomial representation in mathematical notation such as
    // "2*x^0 + 6*x^2 + -2*x^3", where monomials are ordered ascending according to
    // their degree. Note that a positive sign of the leftmost coefficient is
    // not shown.
    // Returns the string "0" if the polynomial has no monomials (is empty).
    public String toString() {
        // TODO: implement this method

        if (storedMonom == null) return "0";

        String retString = "";

        if (left != null) retString += left.toString() + " + ";
        retString += storedMonom.toString();
        if (right != null) retString += " + " + right.toString();


        return retString;
    }

}

