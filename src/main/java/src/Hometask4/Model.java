package src.Hometask4;

import java.util.HashSet;

public class Model {
    private HashSet<Record> recordsSet = new HashSet<>();

    public void addRecord(Record record){
        recordsSet.add(record);
    }

    public void printRecords(){
        recordsSet.stream().forEach(x-> System.out.println(x.toString()));
    }
}
