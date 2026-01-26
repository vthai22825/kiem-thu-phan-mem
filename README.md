# Student Analyzer – Unit Test với JUnit

## 1. Giới thiệu
Dự án **Student Analyzer** là bài tập thực hành kiểm thử đơn vị (Unit Test) bằng **JUnit 5** trong Java.  
Chương trình thực hiện phân tích dữ liệu điểm số học sinh, nhằm rèn luyện kỹ năng:
- Viết mã Java theo yêu cầu chức năng
- Viết kiểm thử đơn vị bằng JUnit
- Tổ chức dự án theo chuẩn Maven
- Sử dụng Git/GitHub trong quá trình phát triển phần mềm

---

## 2. Công nghệ sử dụng
- **Ngôn ngữ:** Java 17
- **Build tool:** Maven
- **Unit Test:** JUnit 5 (JUnit Jupiter)
- **IDE:** IntelliJ IDEA

---

## 3. Cấu trúc dự án
Junit/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── StudentAnalyzer.java
│ └── test/
│ └── java/
│ └── StudentAnalyzerTest.java
├── target/
└── README.md

---

## 4. Mô tả chức năng

### 4.1. countExcellentStudents(List<Double> scores)
- Đếm số học sinh đạt loại **Giỏi (>= 8.0)**
- Chỉ xét các điểm hợp lệ trong khoảng **0 – 10**
- Bỏ qua các điểm không hợp lệ (< 0 hoặc > 10)
- Nếu danh sách rỗng hoặc null → trả về 0

### 4.2. calculateValidAverage(List<Double> scores)
- Tính điểm trung bình của các điểm hợp lệ (0 – 10)
- Bỏ qua các điểm không hợp lệ
- Nếu không có điểm hợp lệ → trả về 0

---

## 5. Kiểm thử với JUnit

Các ca kiểm thử được cài đặt trong file `StudentAnalyzerTest.java`, bao gồm:
- Trường hợp bình thường (có dữ liệu hợp lệ và không hợp lệ)
- Trường hợp biên (0, 10, danh sách rỗng)
- Trường hợp dữ liệu sai (điểm < 0 hoặc > 10)

---

## 6. Cách chạy kiểm thử

### Cách 1: Chạy bằng IntelliJ IDEA
1. Mở file `StudentAnalyzerTest.java`
2. Chuột phải vào file
3. Chọn **Run 'StudentAnalyzerTest'**

### Cách 2: Chạy bằng Maven
Mở Terminal tại thư mục project và chạy:
```bash
mvn test
