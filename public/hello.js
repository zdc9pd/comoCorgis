$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function(data,status,jqxhr) {
        console.log("Content is: " + data.content);
        $('.greeting-id').append(data.id).show();
        $('.greeting-content').append(data.content).show();
        console.log(jqxhr);
    });
});