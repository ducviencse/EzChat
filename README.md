# EzChat
Bộ môn: mạng máy tính - Học kỳ 161

### Nội dung
Đây là Project Assignment 1 của nhóm ClgT.
Để tài là xây đựng 1 ứng dụng chat có các chức năng:
a. Ứng dụng cho phép hai người sử dụng ở hai máy khác nhau có thể chat với nhau
b. Một người có thể chat với nhiều người khác.
c. Ứng dụng cho phép truyền tải file trong quá trình chat giữa hai người.
d. Ứng dụng cho sử dụng protocol mà nhóm đã định nghĩa.

### Cấu trúc gói tin
1 gói tin được gửi đi sẽ có các thông tin:
- source        : Cổng port của người gửi gói tin. (int)
- destination   : Cổng port ủa người nhận gói tin. (int)
- dataPos       : Số thứ thự của gói tin trong chuỗi gói tin nếu dữ liệu lớn (int)
- flag          : Cờ hiệu đánh dấu loại gói tin.
- data          : Dữ liệu được gửi, tối đa 256 byte cho mỗi gói. (byte[])

### Thành Viên
1. 1412252 Dương Thái Minh 
2. 1414444 Lê Đình Tuyên 
3. 1410950 Nguyễn Tấn Đức 
4. 1414646 Nguyễn Đức Viễn 
5. 1411153 Trần Công Hậu
