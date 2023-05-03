package coderscampus.trevorassignment9.service;

import coderscampus.trevorassignment9.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    public List<Recipe> allRecipes() throws IOException {

        ArrayList<Recipe> allRecipesParsed = new ArrayList<>();


//        CSVFormat myFormatParser = CSVFormat.RFC4180
//                .withEscape('\\').withFirstRecordAsHeader().withIgnoreSurroundingSpaces();

        //NOTE: Roche, I implemented CSVFormat this way cause the methods above on lines 22 and 23 commented are deprecated.
        //I'm having same results with the methods below use, but this topic is completely new for me, and I'm not 100% I did
        // it in the right way even if it looks like is working. As always please advice.Thanks
        CSVFormat.Builder myFormatParser = CSVFormat.RFC4180.builder()
                .setEscape('\\').setHeader().setSkipHeaderRecord(true).setIgnoreSurroundingSpaces(true);

        Reader in = new FileReader("recipes.txt");

        Iterable<CSVRecord> records = myFormatParser.build().parse(in);
        for (CSVRecord record : records) {
            Recipe recipe = new Recipe(record.values());

            allRecipesParsed.add(recipe);
        }
        return allRecipesParsed;
    }
}

