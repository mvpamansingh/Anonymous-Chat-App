package com.example.chatapptrial

import android.util.Log
import androidx.lifecycle.ViewModel
import io.socket.client.IO
import kotlinx.coroutines.flow.MutableStateFlow

class ChatViewModel: ViewModel() {
    private val socket = IO.socket("http://192.168.1.6:5000")
    val messages = MutableStateFlow<List<Message>>(emptyList())
    val messageText = MutableStateFlow("")





    init {
        socket.connect()
        if(socket.connected())
        {
            Log.d("connect","check1")
        }

        socket.on("receiveMessage") { args ->
            val newMessage = Message(sender = "Other", text = args[0].toString())
            if(newMessage.sender=="Other")
            {
                messages.value = messages.value + newMessage // Add only received messages
            }

        }

    }



    fun onMessageTextChange(newText: String) {
        messageText.value = newText
    }


    fun sendMessage() {
        socket.emit("sendMessage", messageText.value)

        // Only add the message to the list if it's sent by the user
        if (messageText.value.isNotEmpty()) {
            val newMessage = Message(sender = "Me", text = messageText.value)
            messages.value = messages.value + newMessage
        }

        Log.d("myApp", messageText.value)
        messageText.value = "" // Clear the message after sending
    }

}
