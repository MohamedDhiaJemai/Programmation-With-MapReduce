/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelmapreduce;

import org.apache.hadoop.io.WritableComparable;

/**
 *
 * @author hp
 */
public class Arbres {
private  String[] champs;

    public Arbres(String line) {
        this.champs = line.split(",");
    }

    public String[] getChamps() {
        return champs;
    }

    public void setChamps(String[] champs) {
        this.champs = champs;
    }

public double getAnnee() throws NumberFormatException
{
    if (champs[6].isEmpty()) {
        return 0000;
    }
    else
return Double.parseDouble(champs[6]);
}

public double getHateur() throws NumberFormatException
{
    if (champs[7].isEmpty()) {
        return 0;
    }
    else
return Double.parseDouble(champs[7]);
}

public double getArrondissment() throws NumberFormatException
{
    if (champs[2].isEmpty()) {
        return 0000;
    }
    else
return Double.parseDouble(champs[2]);
}
public String getGenre() 
{
    if (champs[3].isEmpty()) {
        return " ";
    }
    else
return champs[3] ;
}
}
