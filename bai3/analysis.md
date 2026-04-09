# 1. Luồng dữ liệu (Data Flow)

Bước 1: Người dùng ở trang danh sách (dish-list.html)
- Nhấn nút "Chỉnh sửa" tại 1 món ăn
- URL được gọi: /bai3/edit/{id}

Bước 2: Controller nhận request
- AdminDishController nhận @PathVariable id

Bước 3: Gọi Service
- Controller gọi AdminDishService.getDishById(id)

Bước 4:
- Nếu tìm thấy:
  → Đưa object Dish vào Model
  → return view "edit-dish"
- Nếu KHÔNG tìm thấy:
  → redirect về /bai2/dishes
  → kèm thông báo lỗi: "Không tìm thấy món ăn yêu cầu!"

Bước 5: View edit-dish.html
- Nhận object dish
- Binding dữ liệu vào form bằng:
    + th:object
    + th:field

---

# 2. Binding Thymeleaf

- th:object="${dish}" → bind toàn bộ object
- th:field="*{name}" → bind field
- th:field="*{price}"
- th:field="*{available}"

---

# 3. Tạo URL động

- Dùng:
  @{/bai3/edit/{id}(id=${dish.id})}
  hoặc
  @{|/bai3/edit/${dish.id}|}

---

# 4. Xử lý lỗi ID không tồn tại

- Không return null view
- Phải redirect:
  redirect:/bai2/dishes
- Kèm message:
  model.addAttribute("error", "...") (hoặc RedirectAttributes)

---

# 5. Ý nghĩa

- Controller xử lý logic
- Service truy xuất dữ liệu
- View chỉ hiển thị + binding