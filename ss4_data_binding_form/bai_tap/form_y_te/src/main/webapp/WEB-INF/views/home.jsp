<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./js/bootstrap.min.js">
    <style>
        * {
            box-sizing: border-box;

        }

        .col-1 {
            width: 8.33%;
        }

        .col-2 {
            width: 16.66%;
        }

        .col-3 {
            width: 25%;
        }

        .col-4 {
            width: 33.33%;
        }

        .col-5 {
            width: 41.66%;
        }

        .col-6 {
            width: 50%;
        }

        .col-7 {
            width: 58.33%;
        }

        .col-8 {
            width: 66.66%;
        }

        .col-9 {
            width: 75%;
        }

        .col-10 {
            width: 83.33%;
        }

        .col-11 {
            width: 91.66%;
        }

        .col-12 {
            width: 100%;
        }

        [ class*="col-"] {
            float: left;
            padding: 10px;

        }

        .row::after {
            clear: both;
            display: block;
            content: "";

        }
    </style>

</head>
<body>
<h3 style="text-align: center;padding-top: 80px">Khai Báo Y tế</h3>
<form action="show" method="post" style="margin-left: 130px" >
<div class="row">
    <div class="col-12" >Họ Và Tên (ghi chữ in hoa)</div>
    <div class="col-12" ><textarea name=""  cols="125" rows="1"></textarea></div>

    <div class="row">
        <div class="col-4 " >
            <div class="row">
                <div class="col-12">Năm Sinh</div>
                <div class="col-12"><input type="text"></div>
            </div>
        </div>

        <div class="col-4" >
            <div class="row">
                <div class="col-12">Gioi Tinh</div>
                <div class="col-12"><input type="text"></div>
            </div>
        </div>

        <div class="col-4" >
            <div class="row">
                <div class="col-12">Quốc Tịch</div>
                <div class="col-12"><input type="text"></div>
            </div>
        </div>



    <div class="col-12">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</div>
    <div class="col-12" ><input type="text"></div>


        <div class="col-7" >
            <div class="row">
                <div class="col-12">Thông tin đi lại</div>
                <div class="col-3"><input type="checkbox">Tàu bay</div>
                <div class="col-3"><input type="checkbox">Thuyền </div>
                <div class="col-3"><input type="checkbox">Ô tô</div>
                <div class="col-3"><input type="checkbox">Khác(ghi rõ)</div>
            </div>
        </div>

        <div class="col-12" >
            <div class="row">
                <div class="col-6">
                    <div class="row">
                <div class="col-12">Số hiệu phương tiện</div>
                <div class="col-12"><input type="text"></div>
                    </div>
                </div>

                <div class="col-6">
                    <div class="row">
                        <div class="col-12">Số ghế</div>
                        <div class="col-12"><input type="text"></div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-12" >
            <div class="row">
                <div class="col-6">
                    <div class="row">
                        <div class="col-12">Ngày khởi hành</div>
                        <div class="col-2"><input type="text"></div>
                        <div class="col-2"><input type="text"></div>
                        <div class="col-2"><input type="text"></div>
                    </div>
                </div>

                <div class="col-6">
                    <div class="row">
                        <div class="col-12">Ngày kết thúc</div>
                        <div class="col-2"><input type="text"></div>
                        <div class="col-2"><input type="text"></div>
                        <div class="col-2"><input type="text"></div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-12" >Trong vòng 14 ngày anh/chị có đến tỉnh/thành phố nào</div>
        <div class="col-12" ><textarea name="" id="" cols="125" rows="2"></textarea></div>



        <div class="col-12" >
            <div class="row">
                <span>Địa chỉ liên lạc:</span>
                <div class="col-4">
                    <div class="row">

                        <div class="col-12">Tinh/Thành</div>
                        <div class="col-2"><input type="text"></div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="row">

                        <div class="col-12">Quận/Huyện</div>
                        <div class="col-2"><input type="text"></div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="row">

                        <div class="col-12">xã/Phường</div>
                        <div class="col-2"><input type="text"></div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-12">
            <span>Địa chỉ nơi ở:</span><br>
            <textarea name=""  cols="125" rows="1"></textarea>
        </div>

        <div class="col-12" >
            <div class="row">
                <span>Địa chỉ liên lạc:</span>
                <div class="col-6">
                    <div class="row">
                        <div class="col-12">
                            <span>Điện thoại</span><br>
                            <input type="number">
                        </div>

                    </div>
                </div>
                <div class="col-6">
                    <div class="row">
                        <div class="col-12">
                            <span>Email</span><br>
                            <input type="text">
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <table>
            <tr>
                <th>Triệu chứng</th>
                <th>có</th>
                <th>không</th>
                <th>Triệu Chứng</th>
                <th>có</th>
                <th>không</th>
            </tr>
            <tr>
                <td>Sót</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
                <td>Nôn/buồn nôn</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
            </tr>
            <tr>
                <td>Ho</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
                <td>Tiêu chảy</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
            </tr>
            <tr>
                <td>Khó thở</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
                <td>Xuất huyết ngoài da</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
            </tr>
            <tr>
                <td>Đau họng</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
                <td>Nổi da gà</td>
                <td><input type="radio"></td>
                <td><input type="radio"></td>
            </tr>

        </table>

    </div>
</div>

</form>

</body>
</html>
