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



    
function AddItemDialog(data)
{

    var modal = document.getElementById('myModal');
    var btn = document.getElementById("addItem");
    var assignedto = document.getElementById("assignedTo");
    var caption = document.getElementById("beschreibung");
    // Get the <span> element that closes the modal
    var span = document.getElementById("closeItem");
    var okButton = document.getElementById("acceptItem");

    var today = new Date();
    var dd = today.getDate();
    var mm = today.getMonth()+1; //January is 0!
    var yyyy = today.getFullYear();

    if(dd<10) {
        dd='0'+dd
    } 

    if(mm<10) {
        mm='0'+mm
    } 

    today = mm+'/'+dd+'/'+yyyy;



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
        var currentListId = data.context.parentElement.parentElement.parentElement.id;
        var childs = data.context.parentElement.children;
        var itemcontainer;
        for (var i = 0; i<childs.length; i++){
            if(childs[i].className === "ItemContainer"){
                itemcontainer = childs[i];
            }
        }
        itemcontainer.innerHTML += "<div class='panel panel-default'><div class='panel-heading' style='background-color: white;'>" + caption.value + "</div><div class='panel-body'><div class='Date pull-left' style='color: gray'>" + assignedto.value + "</div><div class='Assigned pull-right' style='color: gray'>" + today + "</div>";
        
        
        
    }
}

function AddListDialog(data){
    // Get the modal
    var modal = document.getElementById('myModalList');

    // Get the button that opens the modal
    var btn = document.getElementById("addList");

    // Get the <span> element that closes the modal
    var span = document.getElementById("closeList");

    //Ok-Button
    var btnOk = document.getElementById("acceptList");
    
    btnOk.onclick = function() {
        //Hier: Neue Liste einfügen
        modal.style.display = "none";
    }
    
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
