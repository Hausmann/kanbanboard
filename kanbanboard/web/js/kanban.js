rhost = "./api";
function init() {
    $("#kanbanlists").empty();
    testFunc();
    
}

function testFunc(){    
    function showLists(lists){
        for(var index in lists){
            //alert(lists[index].listName);
            var htmlStr = (buildListHeader(lists[index].listName, lists[index].listId));           
            
            htmlStr += buildListEnd(lists[index].listId);
            
            $("#kanbanlists").append(htmlStr);
            
            loadTasks(lists[index].listId);
        }        
    }    
    
    $.get(rhost + "/lists", function (data) {
       showLists(data); 
    });
    
    
}

function loadTasks(listId) {
//
//    $.ajax({
//        async: false,
//        type: 'GET',
//        url: rhost + "/lists/" + listId,
//        success: function (data) {
//            htmlStr += createHtmlTasks(data);
//            return html;
//        }
//    });
     
     $.get(rhost + "/lists/" + listId, function(data){
            var htmlStr = createHtmlTasks(data);
            $(('#'+listId)).append(htmlStr);           
            
     });
 }
 
 function createHtmlTasks(tasks){
     var html = "";
     
     for(var index in tasks){
         html+= buildTask(tasks[index]);
     }
     return html;
 }



function buildTask(task)
{
   var htmlTask = ('<div class="row">\
                        <div class="col-md-12">\
                            <div class="panel panel-default">\
                                <div class="panel-heading" style="background-color: white;">'+
                                    task.name +
                                '</div>\
                                <div class="panel-body">'+
                                    task.description +
                                '</div>\
                            </div>\
                        </div>\
                    </div>');                
    return htmlTask;
}

function buildListEnd(listId)
{
    listEnd = ('<div>\
    <label>Task hinzufügen</label>\
                    <form role="form">\
                        <div class="form-group">\
                                <input name="TaskName' + listId + '" type="text" class="form-control" placeholder="Name">\
                        </div>\
                        <div class="form-group">\
                                <input name="TaskDescription' + listId + '" type="text" class="form-control" placeholder="Beschreibung">\
                        </div>\
                                <input type="hidden" name="listID" value="' + listId + '" />\
                                <input class="btn btn-default" type="button" onClick="addTask(' + listId + ')" value="Hinzufügen" />\
                        </div>\
                    </form>\
                    <hr>\
                </div>'); // close list
    return listEnd;
}

function appendNewList(listName, listId)
{
    var htmlStr = (buildListHeader(listName));
    htmlStr += createHtmlTasks(listId);
    htmlStr += buildListEnd(listId);
    $("#kanbanlists").append(htmlStr);
}

function buildListHeader(name, listId)
{
   listheader = ('<div id="' + listId + '" class="col-md-offset-1 col-md-2 col-sm-offset-1 col-sm-10" style="background-color: CFD1DB">\
                        <div class="row">\
                        <div class="col-md-12">\
                            <h3>' + name + '</h3>\
                            <hr>\
                        </div>\
                        </div>');
    return listheader;
}

function addTask(listId)
{
    var a = document.getElementsByName("TaskName"+listId)[0].value;
    var b = document.getElementsByName("TaskDescription"+listId)[0].value;
    
    var request = JSON.stringify({
        name:a,
        description:b,
        listId:listId
    });
    

    $.ajax ({
    url: rhost+"/tasks",
    type: "POST",
    data: request,
    success: function(data){
        $("#"+listId).append(buildTask(data));
    },
    contentType: 'application/json'
    });
}


function addList(listName)
{
    var request = JSON.stringify({
        name:listName
    });
    

    $.ajax ({
    url: rhost+"/lists",
    type: "POST",
    data: request,
    success: function(data){
            appendNewList(data.listName, data.listId);
    },
    contentType: 'application/json'
    });   
    
}