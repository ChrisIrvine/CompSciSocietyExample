/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomcomparer;

/**
 *
 * @author Christopher Irvine
 */
public class Room
{    
    private boolean lightsWorking;
    private int noOfTables;
    private int noOfChairs;
    private int noOfPlants;
    private String roomNumber;
    
    public Room()
    {
        lightsWorking = true;
        noOfTables = 0; // 22
        noOfChairs = 0;
        noOfPlants = 0;
        roomNumber = null;
    }

    public Room(boolean lights, int t, int c, int p, String num)
    {
        lightsWorking = lights;
        noOfTables = t;
        noOfChairs = c;
        noOfPlants = p;
        roomNumber = num;
    }

    /**
     * Accessor method for lightsWorking variable.
     * @return 
     */

    public void setLightsWorking(boolean lq) { this.lightsWorking = lq; }
    public boolean getLightsWorking() { return this.lightsWorking; }

    public void setNoOfTables(int ntables) { this.noOfTables = ntables; }
    public int getNoOfTables() { return this.noOfTables; }

    public void setNoOfChairs(int nchairs) { this.noOfChairs = nchairs; }
    public int getNoOfChairs() { return this.noOfChairs; }

    public void setNoOfPlants(int nchairs) { this.noOfPlants = nchairs; }
    public int getNoOfPlants() { return this.noOfPlants; }

    public void setNumber(String nname) { this.roomNumber = nname; }
    public String getNumber() { return this.roomNumber; }
}
