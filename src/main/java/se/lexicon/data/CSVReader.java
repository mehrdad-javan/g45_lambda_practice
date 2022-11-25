package se.lexicon.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVReader {
	
	private final static CSVReader INSTANCE;
	
	static {
		INSTANCE = new CSVReader();
	}
	
	private CSVReader() {}
	
	public static CSVReader getInstance() {
		return INSTANCE;
	}
	
    public List<String> getMaleFirstNames(){
        BufferedReader reader = null;
        List<String> names = null;
        try{
            reader = Files.newBufferedReader(Paths.get("firstname_males.txt"));
                     names = reader.lines()
                    .flatMap(line -> Stream.of(line.split(",")))
                    .collect(Collectors.toList());

        } catch(IOException e){
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        	return names;
        }
    

    public List<String> getFemaleFirstNames(){
        List<String> names=null;

            try(BufferedReader reader = Files.newBufferedReader(Paths.get("firstname_female.txt"))){
                names = reader.lines()
                        .flatMap(line -> Stream.of(line.split(",")))
                        .collect(Collectors.toList());
            } catch(IOException e){
                e.printStackTrace();
            }
        return names;
    }



    public List<String> getLastNames() {

        List<String> names = null;
        BufferedReader reader = null;

        try{
            reader = Files.newBufferedReader(Paths.get("lastnames.txt"));
            names = reader.lines()
            .flatMap(line -> Stream.of(line.split(",")))
            .collect(Collectors.toList());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return names;
    }


}
