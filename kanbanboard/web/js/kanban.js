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
   var htmlTask = ('<div class="col-md-12 panel panel-default">\
                <h4>' + task.name + '</h4>\
                <p>' + task.description + '</p>\
            </div>');
    return htmlTask;
}

function buildListEnd(listId)
{
   listEnd = (  '<div class="row input-group center-block">\
                    <input name="TaskName'+ listId +'" type="text" class="form-control" placeholder="Name">\
                    <input name="TaskDescription'+ listId +'" type="text" class="form-control" placeholder="Beschreibung">\
                    <input type="hidden" name="listID" value="' + listId + '" />\
                    <input class="btn btn-default" type="button" onClick="addTask('+listId+')" value="+" />\
                </div>\
                </div>'); // close list
    return listEnd;
}

function buildListHeader(name, listId)
{
   listheader = ('<div id="' + listId + '" class="col-md-offset-1 col-md-3 col-sm-offset-1 col-sm-10 jumbotron">\
                        <div class="row">\
                            <h4>' + name + '</h4>\
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
    success: function(){
        //
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
    success: function(){
        //
    },
    contentType: 'application/json'
    });
}


