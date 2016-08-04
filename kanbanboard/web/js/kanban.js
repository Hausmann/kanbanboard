rhost = "http://localhost:8080/testprojekt/kanbanboard/";
function init() {
    //$("#kanbanlists").append(build1HtmlKanbanList("Backlog", "generated List", "Task1", "Taskbeschreibung"));
    //$("#kanbanlists").empty();
    loadLists();
}

function loadLists() {
    // get lists
    $.get(rhost + "/lists", function(data) {
        lists = JSON.parse(data);
        $("#kanbanlists").fadeOut(
            function() {
                for (var list in lists){
                    $("#kanbanlists").append(buildListHeader(list.name));
                    $.get(rhost + "/tasks/" + list.id, function(data) {
                        tasks = JSON.parse(data)
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

function buildListHeader(name)
{
   listheader = ('<div class="col-lg-offset-1 col-lg-1 col-md-offset-1 col-md-3 col-sm-offset-1 col-sm-10">\
                        <div class="row">\
                            <h4>' + name + '</h4>\
                        </div>');
    return listheader;
}

function buildTask(task)
{
   task = ('<div>\
                <p>' + task.name + '</p>\
                <p>' + task.description + '</p>\
            </div>');
    return task;
}

function buildListEnd()
{
   listEnd = (  '<div class="input-group">\
                    <input type="text" class="form-control" placeholder="Name">\
                    <input type="text" class="form-control" placeholder="Beschreibung">\
                    <button class="btn btn-default" type="button">+</button>\
                </div>\
                </div></div>');
    return listEnd;
}

function getErrorBox(Msg) {
    return '<div class="alert alert-danger"><div class="panel-heading"><div class="text-center"><div class="row"><div class="col-sm-9"><h3 class="pull-left">Hoppla, da ist was schiefgelaufen:</h3></div><div class="col-sm-3"></div></div></div></div>\
           <div class="panel-body">' + Msg + '</div></div>';

}


