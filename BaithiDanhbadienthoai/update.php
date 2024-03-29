<?php
//Include config file
require_once 'config.php';

//Define variables and initialize with empty values
$name  = $phonenumber = "";
$name_err = $phonenumber_err = "";

//Processing form data when form is submitted
if(isset($_POST["id"]) && !empty($_POST["id"])) {
//Get hidden input value
    $id = $_POST["id"];
}
    //Validate name
//    $input_name = trim($_POST["name"]);
//    if(empty($input_name)) {
//        $name_err = "Please enter a name.";
//    }elseif (!filter_var(trim($_POST["name"]), FILTER_VALIDATE_REGEXP, array("option"=>array("regexp"=>"/^[a-zA-Z'-.\s ]+$/")))) {
//        $name_err = 'Please enter a valid name.';
//    } else{
//        $name = $input_name;
//    }
// Validate name
$input_name = trim($_POST["name"]);
if(empty($input_name)){
    $name_err = "Please enter a name.";
} elseif(!filter_var(trim($_POST["name"]), FILTER_VALIDATE_REGEXP, array("options"=>array("regexp"=>"/^[a-zA-Z'-.\s ]+$/")))){
    $name_err = 'Please enter a valid name.';
} else{
    $name = $input_name;
}
       //Validate phone number
$input_phonenumber = trim($_POST["phonenumber"]);
    if(empty($input_phonenumber)){
        $phonenumber_err = "Please enter the phone number.";

    }elseif (!ctype_digit($input_phonenumber)){
        $phonenumber_err = 'Please enter a positive integer value. ';
    }else{
        $phonenumber = $input_phonenumber;
    }

    //Check input errors before inserting in database
if(empty($name_err) && empty($phonenumber_err)){
    //Prepare an insert statement
    $sql = "UPDATE phonecontact SET name=?, phonenumber=? WHERE id=?";

    if($stmt = mysqli_prepare($link, $sql)){
        //Bind variables to the prepared statement as parameters
        mysqli_stmt_bind_param($stmt, "sssi", $param_name, $param_phonenumber, $param_id);

        //Set parameters
        $param_name = $name;
        $param_phonenumber = $phonenumber;
        $param_id = $id;

        //Attempt to execute the prepared statement
        if(mysqli_stmt_execute($stmt)){
            //Records updated successfully. Redirect to landing page
            header("location: index.php");
            exit();
        }else{
            echo "Something went wrong. Please try again later.";
        }

    //Close statement
    mysqli_stmt_close($stmt);
}

//Close connection
mysqli_close($link);
}else{

    //Check existence of id parameter before processing further
    if(isset($_GET["id"]) && !empty(trim($_GET["id"]))){
        //Get URL parameter
        $id = trim($_GET["id"]);

        //Prepare a select statement
        $sql = "SELECT*FROM phonecontact WHERE id = ?";
        if($stmt = mysqli_prepare($link, $sql)){
            //Bind variables to the prepared statement as parameters
            mysqli_stmt_bind_param($stmt, "i", $param_id);

            //Set parameters
            $param_id = $id;

            //Attempt to execute the prepared statement
            if(mysqli_stmt_execute($stmt)){
                $result = mysqli_stmt_get_result($stmt);

                if (mysqli_num_rows($result) == 1) {
                    /*Fetch result row as an associative array. Sincce the result set contains only one row, we don't need to use while loop*/
                    $row = mysqli_fetch_array($result, MYSQLI_ASSOC);
                    //Retrive individual field value
                    $name = $row["name"];
                   $phonenumber = $row["phonenumber"];
                }else{
                    //URL doesn't contain valid id. Redirect to error page
header("location: error.php");
exit();
                }
            }else{
                echo "Oops! Something went wrong. Please try again later.";
            }
        }
        //Close statement
        mysqli_stmt_close($stmt);

        //Close connection
        mysqli_close($link);
    }else{
        //URL doesn't contain id parameter. Redirect to error page
        header("location: error.php");
        exit();
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Record</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">

<style type="text/css">
    .wrapper{
        width: 5000px;
        margin: 0 auto;

    }

</style>

</head>
<body>
<div class="wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="page-header ">
                    <h2>Update Record</h2>

                </div>
                <p>Please edit the input values and submit to update the record .</p>
                <form action="<?php echo htmlspecialchars(basename($_SERVER['REQUEST_URI'])); ?>" method="post">
                <div class="form-group <?php echo (!empty($name_err)) ? 'has-error': ''; ?>">
                <label>Name</label>
<input type="text" name="name" class="form-control" value="<?php echo $name; ?> ">
<span class="help-block"><?php echo $name_err; ?></span>
</div>
<div class="form-group <?php echo (!empty($phonenumber_err)) ? 'has-error': ''; ?>">
                <label>Phone Number</label>
<input type="text" name="salary" class="form-control" value="<?php echo $phonenumber; ?> ">
<span class="help-block"><?php echo $phonenumber_err; ?></span>
</div>
<input type="hidden" name="id" value="<?php echo $id; ?>"/>
<input type="submit" class="btn btn-primary" value="Submit">
<a href="index.php" class="btn btn-default">Cancel</a>
</form>

            </div>
        </div>
    </div>
</div>
</body>
</html>






















