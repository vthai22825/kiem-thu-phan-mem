import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    /**
     * ================================
     * TEST cho countExcellentStudents()
     * ================================
     */

    // Trường hợp bình thường: có điểm hợp lệ và không hợp lệ
    @Test
    void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(2, result);
    }

    // Trường hợp danh sách trống
    @Test
    void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(Collections.emptyList());

        assertEquals(0, result);
    }

    // Trường hợp chỉ có điểm biên
    @Test
    void testCountExcellentStudents_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(0.0, 8.0, 10.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(2, result);
    }

    /**
     * ================================
     * TEST cho calculateValidAverage()
     * ================================
     */

    // Trường hợp bình thường
    @Test
    void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        double avg = analyzer.calculateValidAverage(scores);

        assertEquals(8.17, avg, 0.01);
    }

    // Trường hợp toàn bộ dữ liệu không hợp lệ
    @Test
    void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-2.0, 15.0);

        double avg = analyzer.calculateValidAverage(scores);

        assertEquals(0, avg);
    }

    // Trường hợp danh sách trống
    @Test
    void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        double avg = analyzer.calculateValidAverage(Collections.emptyList());

        assertEquals(0, avg);
    }

    // Trường hợp giá trị biên
    @Test
    void testCalculateValidAverage_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(0.0, 10.0);

        double avg = analyzer.calculateValidAverage(scores);

        assertEquals(5.0, avg, 0.01);
    }
}
