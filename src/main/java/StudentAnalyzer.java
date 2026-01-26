import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     *
     * @param scores danh sách điểm số (0–10)
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     *
     * Quy ước:
     * - Bỏ qua điểm < 0 hoặc > 10 (dữ liệu không hợp lệ)
     * - Nếu danh sách rỗng hoặc null → trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (double score : scores) {
            if (score >= 0 && score <= 10 && score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình của các điểm hợp lệ (0–10).
     *
     * @param scores danh sách điểm
     * @return điểm trung bình các điểm hợp lệ
     *
     * Quy ước:
     * - Bỏ qua điểm < 0 hoặc > 10
     * - Nếu không có điểm hợp lệ → trả về 0
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        double sum = 0;
        int validCount = 0;

        for (double score : scores) {
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        return validCount == 0 ? 0 : sum / validCount;
    }
}
