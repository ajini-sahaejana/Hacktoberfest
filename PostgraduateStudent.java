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
public class PostgraduateStudent extends UniversityStudent{
    
    private String supervisor;
    private String thesis;
    
    public PostgraduateStudent(String fname, String lname, int regNo, String degree, String supervisor, String thesis){
        super(fname, lname, regNo, degree);
        this.supervisor = supervisor;
        this.thesis = thesis;
    }

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the thesis
     */
    public String getThesis() {
        return thesis;
    }

    /**
     * @param thesis the thesis to set
     */
    public void setThesis(String thesis) {
        this.thesis = thesis;
    } 
    
}
