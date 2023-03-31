/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tapiwamla;

/**
 *
 * @author me
 */
public class MedicalService {
    private double baseCost;

    public MedicalService(double baseCost) {
        this.baseCost = baseCost;
    }

    public double calculateBill() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }
}

