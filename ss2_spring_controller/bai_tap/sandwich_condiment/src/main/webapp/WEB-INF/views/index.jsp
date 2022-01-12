<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiment</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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


        }

        .row::after {
            clear: both;
            display: block;
            content: "";

        }
        .icon_facebook li{
            position: relative;
            float: left;
            list-style: none;


        }
        /*.icon_facebook li:hover{*/
        /*    background-color: #CDCDCD;*/
        /*}*/

        .home li{
            position: relative;
            float: left;
            list-style: none;
            text-align: center;

        }

        /*.home li:hover{*/
        /*    background-color: #CDCDCD;*/
        /*}*/
        .bell li{
            position: relative;
            float: left;
            list-style: none;


        }
        /*.bell li:hover{*/
        /*    background-color: #CDCDCD;*/
        /*}*/

    </style>
</head>
<body>
<form action="sandwich" method="post">
<div style="font-size: 50px">Sandwich condiment</div>
<div class="row" >
    <div class="col-1">
        <ul class="icon_facebook">
            <li> ${Lettuce}<input class="form-check-input me-1" type="checkbox" name="a" value="${Lettuce}" aria-label="..."></li>

        </ul>

    </div>

    <div class="col-1">
        <ul class="home">
            ${Tomato}<li><input class="form-check-input me-1" type="checkbox" name="a" value="${Tomato}" aria-label="..."></li>

        </ul>
    </div>

    <div class="col-1">
        <ul class="bell">
            ${Mustard}<li><input class="form-check-input me-1" type="checkbox"  name="a" value="${Mustard}"  aria-label="..."></li>
        </ul>

    </div>

    <div class="col-1">
        <ul class="bell">
            ${Sprouts}<li><input class="form-check-input me-1" type="checkbox" name="a" value="${Sprouts}" aria-label="..."></li>
        </ul>

    </div>
</div>
<hr>
<div>
    <button  type="submit" class="btn btn-dark"><b>Save</b></button>
</div>


</form>

</body>
</html>
