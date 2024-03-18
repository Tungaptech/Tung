$(document).ready(function(){
    $(".button").hover(function(){
        $(this).css("background-color", "rgba(0, 138.38, 216.22, 0.36)");
    }, function(){
        $(this).css("background-color", "rgba(217, 217, 217, 0.30)");
    });
});
$(document).ready(function() {
    $("div").css("opacity", "1"); // Khi tất cả tài liệu đã được tải, hiển thị body với hiệu ứng fade in
});

