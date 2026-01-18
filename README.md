# Student Score Analyzer (Spring Boot Unit Test)

Dự án thực hành môn Kiểm thử phần mềm, minh họa cách viết Unit Test với JUnit 5 và quy trình CI cơ bản.

## 📋 Chức năng chính
1.  **Count Excellent Students**: Đếm số học sinh có điểm `>= 8.0` (Tự động lọc bỏ điểm `<0` hoặc `>10`).
2.  **Calculate Valid Average**: Tính điểm trung bình của các điểm số hợp lệ.

## 🛠 Công nghệ sử dụng
* Java 17
* Spring Boot 3.x
* JUnit 5 (Jupiter)

## ✅ Danh sách Test Cases

| Phương thức | Tên Test Case | Input (Mô tả) | Kết quả mong đợi |
| :--- | :--- | :--- | :--- |
| `countExcellentStudents` | `testCountExcellentStudents_StandardCase` | `[9.0, 8.5, 7.0, -1.0, 11.0]` | `2` (Lọc 9.0, 8.5) |
| `countExcellentStudents` | `testCountExcellentStudents_Boundary` | `[7.99, 8.0, 8.01]` | `2` (Lấy 8.0, 8.01) |
| `countExcellentStudents` | `testCountExcellentStudents_Empty` | `[]` (Rỗng) | `0` |
| `calculateValidAverage` | `testCalculateValidAverage_StandardCase` | `[9.0, 8.0, 7.0, -5.0]` | `8.0` |
| `calculateValidAverage` | `testCalculateValidAverage_AllInvalid` | `[-1.0, 11.0]` | `0.0` |

## 🚀 Hướng dẫn chạy Test
1.  Clone dự án về máy.
2.  Mở bằng IntelliJ IDEA.
3.  Mở file `src/test/java/com/example/unittest/StudentAnalyzerTest.java`.
4.  Nhấn nút **Run** để kiểm tra kết quả.