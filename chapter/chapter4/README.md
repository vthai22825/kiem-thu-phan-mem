# Chapter 04 - Performance Testing with JMeter

## Website Tested
https://www.wikipedia.org

---

## Thread Group 1 - Basic Load
Users: 10  
Loop Count: 5  

Average Response Time: 320 ms  
Throughput: 15 requests/sec  
Error Rate: 0%

---

## Thread Group 2 - Heavy Load
Users: 50  
Ramp-up Period: 30s  

Average Response Time: 870 ms  
Throughput: 40 requests/sec  
Error Rate: 1%

---

## Thread Group 3 - Custom Scenario
Users: 20  
Duration: 60s  

Average Response Time: 540 ms  
Throughput: 22 requests/sec  
Error Rate: 0%

---

## Analysis

- Hệ thống hoạt động ổn định với tải nhẹ.
- Khi tăng số lượng user lên 50, response time tăng đáng kể.
- Không có lỗi nghiêm trọng.