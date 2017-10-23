package indsys;

import pmp.filter.AbstractFilter;
import pmp.filter.Source;
import pmp.interfaces.Writeable;
import pmp.pipes.SimplePipe;

import java.io.StreamCorruptedException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public class SequenceWordsFilter extends AbstractFilter<ArrayList<String>, SimplePipe<ArrayList<String>>> {

    public SequenceWordsFilter(Writeable<SimplePipe<ArrayList<String>>> output) throws InvalidParameterException {
        super(output);
    }

    @Override
    public SimplePipe<ArrayList<String>> read() throws StreamCorruptedException {
        return null;
    }

    @Override
    public void write(ArrayList<String> lines) throws StreamCorruptedException {
        for(String line : lines) {

        }
    }
}
