<?php
session_start();
//Mang chua thong tin san pham
$products = array(
    array("id" => 1, "name" => "Ao Polo", "price" => 25),
    array("id" => 2, "name" => "Quan Jeans", "price" => 50),
    array("id" => 3, "name" => "Giay Sneakers", "price" => 40)
);

//Kiem tra neu gio hang chua duoc tao, thi tao moi
if  (!isset($_SESSION['cart'])){
    $_SESSION['cart'] = array();
}

//Ham them san pham vao gio
function addToCart($productId)
{
    global $products;

    foreach ($products as $product){
        if ($product['id'] == $productId){
            $_SESSION['cart'][] = $product;
            echo "Da them". $product['name']."vao gio hang.";
            return;
        }
    }
    echo "San pham khong ton tai.";
}

//Ham hien thi gio hang
function viewCart()
{
    if (empty($_SESSION['cart'])){
        echo "<p>Gio hang trong.</p>";
    }else{
        echo "<h2> Gio hang cua ban: <h2>";
        $totalPrice = 0;

        foreach ($_SESSION['cart'] as $item){
            echo $item['name']. "- $".$item['price']."<br>";
            $totalPrice += $item['price'];
        }
        echo "<p><strong> Tong gia tri: $".$totalPrice."</strong></p>";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart</title>
<!--Bootstrap CSS-->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body{
padding: 20px;
}
h1, h2{
color: #007bff;
}
form{
margin-bottom: 20px;
}
button{
margin-top: 10px;
}
p{
margin-bottom: 0;
}
</style>
</head>
<body>

<div class="container">
<h1 class="mt-4">Trang mua sam PHP</h1>

<!-- Form them san pham vao gio hang -->
<form method="post" class="form-inline">
<div class="form-group mr-2">
    <label for = "productId">Chon san pham: </label>
<select name="productId" id ="productId" class="form-control">

<?php foreach ($products as $product): ?>
    <option value="<?php echo $product["id"]; ?>"> <?php echo $product["name"]; ?> - $ <?php echo $product["price"]; ?></option>
    <?php endforeach; ?>
</select>
</div>
    <button type="submit" name="addToCart" class="btn btn-primary">Them vao gio hang</button>
</form>

<!--Hien thi gio hang -->
<?php
if (isset($_POST['addToCart']) && isset($_POST['productId'])){
    addToCart($_POST['productId']);
}
viewCart();
?>

</div>

<!--Bootstrap JS and dependencies -->
<script src = "http://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src = "http://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src = "http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
