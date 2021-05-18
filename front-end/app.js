import * as sender from './send.js';


let submitBtn = document.querySelector("#submit");
submitBtn.addEventListener('click', function() {
  let title = document.querySelector("#title");
  let subject = document.querySelector("#subject");

  sender.sendToBack(subject);

});
