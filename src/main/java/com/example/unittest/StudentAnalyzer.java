package com.example.unittest;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * Logic: Duyệt danh sách, bỏ qua điểm rác, đếm điểm >= 8.0
     * @param scores danh sách điểm số
     * @return số học sinh đạt loại Giỏi
     */
    public int countExcellentStudents(List<Double> scores) {
        // Điều kiện 2: Kiểm tra danh sách rỗng hoặc null
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        // Vòng lặp 1: Duyệt danh sách để lọc học sinh giỏi
        for (Double score : scores) {
            // Điều kiện 1: Validate - Bỏ qua điểm null, điểm âm hoặc > 10
            if (score == null || score < 0 || score > 10) {
                continue; // Bỏ qua vòng lặp này
            }

            // Logic nghiệp vụ: Giỏi là >= 8.0
            if (score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ.
     * Logic: Chỉ tính toán trên các điểm số hợp lệ (0-10)
     * @param scores danh sách điểm
     * @return điểm trung bình
     */
    public double calculateValidAverage(List<Double> scores) {
        // Điều kiện 2: Kiểm tra danh sách rỗng hoặc null
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int validCount = 0;

        // Vòng lặp 2: Duyệt danh sách để tính trung bình
        for (Double score : scores) {
            // Điều kiện 1: Validate điểm hợp lệ
            if (score != null && score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        // Tránh lỗi chia cho 0 (ArithmeticException)
        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}