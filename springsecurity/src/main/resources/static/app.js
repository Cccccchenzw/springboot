var stompClient = null;
function setConnected(connected){
    $("#connect").prop("disable",connected);
    $("#disconnect").prop("disable",!connected);
    if (connected){
        $("#conversation").show();
        $("#chat").show();
    }else {
        $("#conversation").hide();
        $("#chat").hide();
    }
    $("#greetings").html("");
}

function connect(){
    if (!$("#name").val()){
        return;
    }
    var socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({},function (frame){
        setConnected(true);
        stompClient.subscribe('/topic/greetings',function (greeting){
            showGreeting(JSON.parse(greeting.body));
        });
    });
}

function disconnect(){
    if (stompClient !== null){
        stompClient.disconnect();
    }
    setConnected(false);
}

function sendName(){
    stompClient.send("/app/greet",{},JSON.stringify({'name':$("#name").val(),'content':$("#content").val()}));
}

function showGreeting(message){
    $("#greetings").append("<div>"+message.name+":"+message.content+"</div>");
}

$(function (){
    $("#content").click(function (){connect();});
    $("#disconnect").click(function (){disconnect();});
    $("#send").click(function (){sendName();});
})()
