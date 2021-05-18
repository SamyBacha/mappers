#!/usr/bin/env node

var amqp = require('amqplib/callback_api');

amqp.connect('amqp://localhost', function(error0, connection) {
  if (error0) {
    throw error0;
  }
  connection.createChannel(function(error1, channel) {
    if (error1) {
      throw error1;
    }

    var queue = 'in_back';
    var msg = 'Hello World!';

    channel.assertQueue(queue, {
      durable: false
    });

    console.log(" [x] Sent %s", msg);
  });
  // setTimeout(function() {
  //   connection.close();
  //   process.exit(0);
  // }, 500);
});

export async function sendToBack(msg) {
  channel.sendToQueue(queue, Buffer.from(msg));

}