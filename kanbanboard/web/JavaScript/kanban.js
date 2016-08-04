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