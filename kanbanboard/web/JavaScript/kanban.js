var host = "http://http://localhost:8080/kanbanboard/"

function init(){   


$.get(host + "kanbanboard/lists/0", gotKanbanListItem());}
    
   /* $("#kanbanlists").fadeout(
            funtion(){
              alert(data);
               kanbanlistid = data.id;
               kanbanlistname = data.name;
               kanbanlists = buildHtmlKanbanList
                
            })*/


function gotKanbanListItem(data){
    
}






    
function AddItem()
{
    // Get the modal
    var modal = document.getElementById('myModal');

    // Get the button that opens the modal
    var btn = document.getElementById("addItem");

    // Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal
    btn.onclick = function () {
        modal.style.display = "block";
    }

// When the user clicks on <span> (x), close the modal
    span.onclick = function () {
        modal.style.display = "none";
    }

// When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
    // Ausgabe von Hallo Name mit Prompt- und Alert-Box
    //var sName = prompt("Bitte Beschreibung eingeben:");
}

function AddList(){
    // Get the modal
    var modal = document.getElementById('myModal');

    // Get the button that opens the modal
    var btn = document.getElementById("addList");

    // Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];

    // When the user clicks on the button, open the modal
    btn.onclick = function () {
        modal.style.display = "block";
    }

    // When the user clicks on <span> (x), close the modal
    span.onclick = function () {
        modal.style.display = "none";
    }

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}
