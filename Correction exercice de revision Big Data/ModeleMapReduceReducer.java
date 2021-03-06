package revision;

import java.io.IOException;
import org.apache.hadoop.io.DoubleWritable;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


// TODO définir les clés et valeurs du reducer
public class ModeleMapReduceReducer extends Reducer<Text, IntWritable, Text,IntWritable>
{
    // allocation mémoire de la clé et valeur de sortie
    private Text cleS;
    private IntWritable valeurS = new IntWritable();

    @Override
    public void reduce(Text cleI, Iterable<IntWritable> valeursI, Context context)
            throws IOException, InterruptedException
    {
        // définir la clé de sortie
        cleS = cleI;
        
        
        // TODO calculer la valeur de sortie
         int total = 0;
         int i = 0;
       
          for (IntWritable valeurI : valeursI )
          {
              i++;
              int val = valeurI.get();
              
              total = total + val;
              
              
          }
          

          valeurS.set(total/i); 
            // émettre une paire (clé, valeur)

          context.write(cleS, valeurS);
      }

       

      
}