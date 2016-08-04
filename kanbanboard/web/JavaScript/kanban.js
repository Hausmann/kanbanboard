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






    
function AddItemDialog(data)
{

    var modal = document.getElementById('myModal');
    var btn = document.getElementById("addItem");
    var span = document.getElementById("closeItem");
    var okButton = document.getElementById("acceptItem");

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
    
    okButton.onclick = function (){
        modal.style.display = "none";
        var currentListId = data.getParent.getParent.getParent.Id;
        var childs = data.getParent.children;
        for (var i = 0; i<childs.count; i++){
            if(childs[i].class == "ItemContainer"){
                continue;
            }
        }
    }
}

function AddListDialog(data){
    // Get the modal
    var modal = document.getElementById('myModalList');

    // Get the button that opens the modal
    var btn = document.getElementById("addList");

    // Get the <span> element that closes the modal
    var span = document.getElementById("closeList");

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
