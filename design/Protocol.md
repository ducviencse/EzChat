#Thiết kế Protocol

##Xác định các khối chức năng
**Client**  -Kết nối->  **Server**  -Xác nhận kết nối, cung cấp port-> **Client**

**Client Gửi** -Gửi Message/File-> **Server** -Gửi Message/File-> **Client Nhận** -Xác nhận đã nhận-> **Server** -Xác nhận đã gửi-> **Client Gửi**
##Xác định định dạng dữ liệu cần truyền tải
Khi kết nối: Struct

Khi chat: String

Gửi file: Byte stream
##Xác định mô hình kết nối
* Loại kiết nối: TCP
* Dạng liên kết: Đa Socket
##Phân chia session
1. Khởi tạo Session:
    * Client gởi về Server 1 request khởi tạo kết nối qua port 8080(!?!).
    * Server sinh 1 port riêng cho Client và gửi thông tin port lại cho Client.
    * Client sử dụng port được Server cung cấp và kết nối với Server, trả tự do cho cổng 8080.
    * Server xác nhận đã kết nối thành công, lưu lại thông tin session
2. Chạy Session:
    * Client gửi các gói về server theo cầu trúc. (đặc tả sau)
    * Server xử lý và trả kết quả về cho Client.
    * Client xử lý gói nhận được và quyết định thực hiện bước tiếp theo.
3. Reconnect:
    * Khi mất kết nối, Client liên lạc lại cổng 8080 để xin mở cổng.
    * Server kiểm tra dữ liệu Session và mở lại cổng nếu cần thiết.
    * Server trả kết quả cua Client: Đã mở cổng nếu Session còn hoạt động, Session đã hết hạn nếu Client cố gắng mở port của 1 Session đã cũ.
