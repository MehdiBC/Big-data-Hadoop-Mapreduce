package tn.insat.application;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class StoreSailMapper
        extends Mapper<Object, Text, Text, DoubleWritable> {
    private Text word = new Text();

    public void map(Object key, Text value, Mapper.Context context
    ) throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString(), "\n");
        while (itr.hasMoreTokens()) {
            String next = itr.nextToken();
            String[] data = next.split("\\s+");
            word.set(data[2]);
            context.write(word, new DoubleWritable(Double.parseDouble(data[data.length-2])));

        }
    }
}
