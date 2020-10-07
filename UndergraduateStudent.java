/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec05e01;

/**
 *
 * @author Ajini Sahejana
 */
public class UndergraduateStudent extends UniversityStudent{
    
    private int yearOfStudy;
    private int coreCredits;
    private int optionalCredits;
    
    public UndergraduateStudent(String fname, String lname, int regNo, String degree, int yearOfStudy, int coreCredits, int optionalCredits){
        super(fname, lname, regNo, degree);
        this.yearOfStudy = yearOfStudy;
        this.coreCredits = coreCredits;
        this.optionalCredits = optionalCredits;
    }
    
    /**
     * @return the yearOfStudy
     */
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    /**
     * @param yearOfStudy the yearOfStudy to set
     */
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    /**
     * @return the coreCredits
     */
    public int getCoreCredits() {
        return coreCredits;
    }

    /**
     * @param coreCredits the coreCredits to set
     */
    public void setCoreCredits(int coreCredits) {
        this.coreCredits = coreCredits;
    }

    /**
     * @return the optionalCredits
     */
    public int getOptionalCredits() {
        return optionalCredits;
    }

    /**
     * @param optionalCredits the optionalCredits to set
     */
    public void setOptionalCredits(int optionalCredits) {
        this.optionalCredits = optionalCredits;
    }
}
