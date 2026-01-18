package com.example.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // === TEST CASE CHO HÀM ĐẾM HỌC SINH GIỎI ===

    @Test
    public void testCountExcellentStudents_StandardCase() {
        // Kịch bản: Dữ liệu hỗn hợp (Giỏi, Khá, Rác)
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, -1.0, 11.0);
        // Mong đợi: Chỉ có 9.0 và 8.5 là hợp lệ và giỏi -> Kết quả 2
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_Boundary() {
        // Kịch bản: Điểm biên 8.0 (vừa đủ giỏi)
        List<Double> scores = Arrays.asList(7.99, 8.0, 8.01);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_Empty() {
        // Kịch bản: Danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_Null() {
        // Kịch bản: Danh sách null (Optional - để code an toàn tuyệt đối)
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    // === TEST CASE CHO HÀM TÍNH TRUNG BÌNH ===

    @Test
    public void testCalculateValidAverage_StandardCase() {
        // Kịch bản: 3 điểm hợp lệ (9, 8, 7) và 2 điểm rác (-5, 15)
        List<Double> scores = Arrays.asList(9.0, 8.0, 7.0, -5.0, 15.0);
        // Tính toán: (9+8+7)/3 = 24/3 = 8.0
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        // Kịch bản: Không có điểm nào hợp lệ
        List<Double> scores = Arrays.asList(-1.0, 11.0, 100.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}