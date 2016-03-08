<%-- 
    Document   : Kaydol
    Created on : 08.Mar.2016, 20:38:57
    Author     : Burak
--%>

<%@page contentType="text/html" pageEncoding="windows-1254"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1254">
    <title>Kay�t Ol</title>
    <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="Bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <link href="Bootstrap/css/benim.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
    <h2>Kay�t Ol</h2>
    <form method="post" action="Kaydol">
        <div class="form-group">
            <div class="col-md-2">�sim:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="isim"/></div>
        </div>
        <div class="form-group">
            <div class="col-md-2">Soyisim:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="soyisim"/></div>
        </div>
        <div class="form-group">
            <div class="col-md-2">Kullan�c� Ad�:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="kullaniciadi"/></div>
        </div>
        <div class="form-group">
            <div class="col-md-2">Email:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="email"/></div>
        </div>
        <div class="form-group">
            <div class="col-md-2">�ifre:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="sifre"/></div>
        </div>
        <div class="form-group">
            <div class="col-md-2">�ifre Tekrar:</div>
            <div class="col-md-10"><input type="text" class="form-control" name="sifretekrar"/></div>
        </div>
        
        <button class="btn btn-primary" type="submit">Kay�t Ol</button>
    </form>
</div>
</body>
</html>
