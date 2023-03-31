/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tapiwamla;

/**
 *
 * @author me
 */
public class Consultation extends MedicalService {
    private String doctorName;
    private int numberOfVisits;

    public Consultation(double baseCost, String doctorName, int numberOfVisits) {
        super(baseCost);
        this.doctorName = doctorName;
        this.numberOfVisits = numberOfVisits;
    }

    @Override
    public double calculateBill() {
        double costPerVisit = 50.0;
        double totalCost = super.calculateBill() + (costPerVisit * numberOfVisits);

        return totalCost;
    }
}