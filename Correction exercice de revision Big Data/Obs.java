/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import org.apache.hadoop.io.WritableComparable;

/**
 *
 * @author hp
 */
public class Obs {
private  String[] champs;

    public Obs(String line) {
        this.champs = line.split(",");
    }

    public String[] getChamps() {
        return champs;
    }

    public void setChamps(String[] champs) {
        this.champs = champs;
    }

 public int getObservation() throws NumberFormatException
    {
        if (champs[0].isEmpty())
        {
            return 0000;
        }
        else
            return Integer.parseInt(champs[0]);
    }
    public String getAnti() throws NumberFormatException
    {
        if(champs[1].isEmpty())
        {
            return "";
        }
        else
        {
            return champs[1];
        }
        
    }
    
    public String getLongueur() throws NumberFormatException
    {
        if (champs[2].isEmpty())
        {
            return "";
        }
        else
            return (champs[2]);
    }
    
    public int getIDBAv() throws NumberFormatException
    {
        if (champs[3].isEmpty())
        {
            return 0000;
        }
        else
            return Integer.parseInt(champs[3]);
    }
    public int getIDB2() throws NumberFormatException
    {
        if (champs[4].isEmpty())
        {
            return 0000;
        }
        else
            return Integer.parseInt(champs[4]);
    }
    public int getIDB4() throws NumberFormatException
    {
        if (champs[5].isEmpty())
        {
            return 0000;
        }
        else
            return Integer.parseInt(champs[5]);
    }
    public int getIDB6() throws NumberFormatException
    {
        if (champs[6].isEmpty())
        {
            return 0000;
        }
        else
            return Integer.parseInt(champs[6]);
    }
    
}