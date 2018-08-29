function puppySubmit() {
    console.log("Clicking submit!");
};

function petSelection() {
    var selection = document.querySelector('input[name = "petRadio"]:checked').value;
    if(selection == "yesPet") {
        console.log(selection);
        document.getElementById("petInput").style.display='block';
    }
    else {
        document.getElementById("petInput").style.display='none';
        console.log(selection);
    }
};

function kidSelection() {
    var selection = document.querySelector('input[name = "kidRadio"]:checked').value;
    if(selection == "yesKids") {
        console.log(selection);
        document.getElementById("kidInput").style.display='block';
    }
    else {
        document.getElementById("kidInput").style.display='none';
        console.log(selection);
    }
};