# 1. Định nghĩa đối tượng Dish

Đối tượng Dish đại diện cho một món ăn trong nhà hàng.

Thuộc tính:
- id (int): Mã món ăn
- name (String): Tên món ăn
- price (double): Giá tiền
- isAvailable (boolean): Trạng thái còn hàng hay không

---

# 2. Luồng dữ liệu (I/O)

[Client (Browser)]
|
|  GET /bai2/dishes
v
[DishController]
|
| gọi
v
[DishService]
|
| trả về List<Dish>
v
[Controller]
|
| model.addAttribute("dishList", list)
v
[View: dish-list.html (Thymeleaf)]
|
| th:each render dữ liệu
v
[HTML trả về trình duyệt]

---

# 3. Luồng xử lý hiển thị

- Nếu danh sách dishList:
    + Có dữ liệu → hiển thị bảng
    + Rỗng hoặc null → hiển thị thông báo:
      "Hiện tại nhà hàng đang cập nhật thực đơn, vui lòng quay lại sau"

---

# 4. Kỹ thuật Thymeleaf sử dụng

- th:each → lặp danh sách
- th:text → hiển thị dữ liệu
- th:if / th:unless → điều kiện
- #lists.isEmpty() → kiểm tra list rỗng

---

# 5. Ý nghĩa

- Controller chịu trách nhiệm điều phối dữ liệu
- Service xử lý logic (mock data)
- View chỉ hiển thị (không chứa logic Java)