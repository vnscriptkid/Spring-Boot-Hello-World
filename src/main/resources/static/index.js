let socket, stompClient;

setConnected(false);

function setConnected(isConnected) {
  $('#connect').attr('disabled', isConnected);
  $('#submitMyName').attr('disabled', !isConnected);
  $('#disconnect').attr('disabled', !isConnected);
}

function addMessageToList(content) {
  $('ul.msgList').append(
    $('<li>')
      .text(content)
      .addClass('msgItem list-group-item')
  );
}

function handleConnectClick() {
  socket = new SockJS('/websocket-demo');
  stompClient = Stomp.over(socket);
  stompClient.connect({}, function(frame) {
    setConnected(true);
    stompClient.subscribe('/topic/user', response => {
      addMessageToList(response.body);
    });
  });
}

function handleDisconnectClick() {
  if (stompClient) {
    stompClient.disconnect();
    setConnected(false);
  }
}

function handleNameSubmit(e) {
  e.preventDefault();
  const name = $('#myName').val();
  if (!name || !stompClient) return;
  // submit here
  stompClient.send('/app/user', {}, JSON.stringify({ name }));

  // clear input
  $('#myName').val('');
}

$('#connect').on('click', handleConnectClick);
$('#disconnect').on('click', handleDisconnectClick);
$('#myNameForm').on('click', handleNameSubmit);
