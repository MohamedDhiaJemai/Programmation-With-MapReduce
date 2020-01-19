package modelmapreduce;

import java.io.IOException;
import org.apache.hadoop.io.DoubleWritable;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


// TODO définir les clés et valeurs du reducer
public class ModeleMapReduceReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable>
{
    // allocation mémoire de la clé et valeur de sortie
    private Text cleS;
    private DoubleWritable valeurS = new DoubleWritable();

    @Override
    public void reduce(Text cleI, Iterable<DoubleWritable> valeursI, Context context)
            throws IOException, InterruptedException
    {
        // définir la clé de sortie
        cleS = cleI;
        
        
        // TODO calculer la valeur de sortie
         double max = 0;
       
          while (valeursI.iterator().hasNext())
          {
              double hauteur = valeursI.iterator().next().get();
              if (hauteur > max) {
                   
                  max = hauteur;
              }
              
              
          }

          valeurS = new DoubleWritable(max); 
            // émettre une paire (clé, valeur)

          context.write(cleS, valeurS);
      }

       

      
}
