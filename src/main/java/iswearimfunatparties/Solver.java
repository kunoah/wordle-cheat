package iswearimfunatparties;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Solver {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final LocalDate FIRST_WORDLE_DATE = LocalDate.of(2021, 6, 19);

    public String cheat(LocalDate currentDate) {
        try {
            List<String> solutions = OBJECT_MAPPER.readValue(Paths.get("src/main/resources/solutions.txt").toFile(), new TypeReference<>() {});
            return solutions.get((int) (ChronoUnit.DAYS.between(FIRST_WORDLE_DATE, currentDate) % solutions.size()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
