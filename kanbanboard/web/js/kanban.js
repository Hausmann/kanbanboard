rhost = "./api";
function init() {
    $("#kanbanlists").empty();
    testFunc();
    
}

function testFunc(){
    
    function showLists(lists){
        for(var index in lists){
            alert(lists[index].listName);
             var htmlStr = (buildListHeader(lists[index].listName));
            
            htmlStr += createHtmlTasks(lists[index].listId);
            
            // add tasks
            htmlStr += buildListEnd(lists[index].listId);
            
            $("#kanbanlists").append(htmlStr);
        }
    }
    
    
    $.get(rhost + "/lists", function (data) {
       showLists(data); 
    });
}

 function loadTasks(listId){
     
     $.get(rhost + "/lists/" + listId, function(data){
        return createHtmlTasks(data); 
     });
 }
 
 function createHtmlTasks(tasks){
     var html = "";
     for(var index in tasks){
         html+= buildTask(tasks[index]);
     }
     return html;
 }


function loadLists() {
    // get lists
    $.get(rhost + "/lists", function(data) {
        alert(data);
        lists = JSON.parse(data);
        $("#kanbanlists").fadeOut(
            function() {
                for (var list in lists){
                    $("#kanbanlists").append(buildListHeader(list.name));
                    $.get(rhost + "/tasks/" + list.id, function(data) {
                        tasks = JSON.parse(data);
                        for (var task in tasks) {
                            $("#kanbanlists").append(buildTask(task));
                        }
                    });
                    $("#kanbanlists").append(buildListEnd());
                }
            });
        }
    );
    
    // get lists
    //$.get(rhost + "/lists", function(data) {});
    // get tasks
    //$.get(rhost + "/tasks", function(data) {});
    // get listspecific tasks
    //$.get(rhost + "/tasks/", function(data) {});
}

function buildListHeader(name, listId)
{
   listheader = ('<div id="' + listId + '" class="col-md-offset-1 col-md-3 col-sm-offset-1 col-sm-10">\
                        <div class="row">\
                            <h4>' + name + '</h4>\
                        </div>');
    return listheader;
}

function buildTask(task)
{
   var htmlTask = ('<div class="row">\
                <p>' + task.name + '</p>\
                <p>' + task.description + '</p>\
            </div>');
    return htmlTask;
}

function buildListEnd(listId)
{
   listEnd = (  '<div class="row input-group center-block">\
                    <input type="text" class="form-control" placeholder="Name">\
                    <input type="text" class="form-control" placeholder="Beschreibung">\
                    <input type="hidden" name="listID" value="' + listId + '" />\
                    <button class="btn btn-default" type="button">+</button>\
                </div>\
                </div>'); // close list
    return listEnd;
}

function getErrorBox(Msg) {
    return '<div class="alert alert-danger"><div class="panel-heading"><div class="text-center"><div class="row"><div class="col-sm-9"><h3 class="pull-left">Hoppla, da ist was schiefgelaufen:</h3></div><div class="col-sm-3"></div></div></div></div>\
           <div class="panel-body">' + Msg + '</div></div>';

}


