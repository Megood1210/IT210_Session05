# Phân tích lỗi cấu hình Thymeleaf

## 1. Sai thư mục chứa template
Code cũ:
resolver.setPrefix("/WEB-INF/views");

- Đây là thư mục dành cho JSP
- Thymeleaf mặc định sử dụng /WEB-INF/templates/

→ Hậu quả: Không tìm thấy file view

---

## 2. Sai định dạng file
Code cũ:
resolver.setSuffix(".jsp");

- Thymeleaf không hỗ trợ JSP
- Phải sử dụng file .html

→ Hậu quả: Render lỗi hoặc không hiển thị

---

## 3. Thiếu cấu hình bắt buộc
- Thiếu SpringTemplateEngine
- Thiếu ThymeleafViewResolver

→ Hệ thống không biết cách xử lý view Thymeleaf → lỗi 500

---

## 4. Cách sửa đúng
- Đổi prefix → /WEB-INF/templates/
- Đổi suffix → .html
- Thêm TemplateEngine và ViewResolver

→ Sau khi sửa, hệ thống render đúng Thymeleaf template