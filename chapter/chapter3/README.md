# Chapter 03 - End-to-End Testing with Cypress

## Mục tiêu
Thực hành kiểm thử tự động End-to-End cho website:
https://www.saucedemo.com

## Các kịch bản kiểm thử

### 1. Login thành công
- Nhập thông tin hợp lệ
- Chuyển hướng đến inventory.html

### 2. Login thất bại
- Nhập thông tin sai
- Hiển thị thông báo lỗi

### 3. Thêm sản phẩm vào giỏ hàng
- Badge hiển thị số lượng = 1

### 4. Xóa sản phẩm khỏi giỏ hàng
- Badge biến mất

### 5. Sắp xếp theo giá thấp đến cao
- Sản phẩm đầu tiên có giá thấp nhất

### 6. Kiểm tra quy trình checkout
- Điền thông tin
- Chuyển hướng đến checkout-step-two.html