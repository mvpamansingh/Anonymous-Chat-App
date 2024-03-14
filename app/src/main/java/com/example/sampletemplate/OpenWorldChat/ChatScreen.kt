package com.example.sampletemplate.OpenWorldChat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapptrial.ChatViewModel
import com.example.chatapptrial.Message

@Composable
fun ChatScreen(viewModel: ChatViewModel) {

    val messageList by viewModel.messages.collectAsState(initial = emptyList())
    val messageText by viewModel.messageText.collectAsState()
    val scrollState = rememberLazyListState()
    // To position input area at the bottom
    Column(modifier = Modifier.fillMaxWidth().fillMaxSize(.90f).background(Color(0xFFF5F5F5))) { // Fill entire available space

        LazyColumn(
            modifier = Modifier
                .weight(1f) // Allows the message list to grow and fill available space
                .padding(16.dp),// Add some padding around the message list
            state= scrollState,reverseLayout = true,
            contentPadding = PaddingValues(bottom = 16.dp) // Provide space for input row
        ) {
            items(messageList.asReversed()) { message ->
                MessageItem(message)
                Spacer(modifier = Modifier.height(9.dp))
            }
        }
        LaunchedEffect(messageList) {
            scrollState.animateScrollToItem(0) // Scroll to the top (index 0)
        }
        // Attach input field and button to the bottom
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween // Space elements evenly
        ) {
            OutlinedTextField(
                value = messageText,
                onValueChange = { viewModel.onMessageTextChange(it) },
                label = { Text("Message") },
                modifier = Modifier.weight(1f) // Expand to take available space
            )

            Button(
                onClick = { viewModel.sendMessage() },
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text("Send")
            }
        }
    }
}

//ASAMblDWWf2uXkbd
// ... (unchanged imports)
// mongodb+srv://<username>:<password>@cluster0.guw5ahm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
// app id - application-0-bshhq

@Composable
fun MessageItem(message: Message) {
    val backgroundcolor = if (message.sender == "Me") Color(0xFFC0D6E4) else Color(0xFFE8E8E8)

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (message.sender == "Me") Arrangement.End else Arrangement.Start
    ) {
        Text(
            text = message.text,
            modifier = Modifier
                .background(
                    color = backgroundcolor,
                    shape = RoundedCornerShape(topStart = 12.dp, bottomEnd = 12.dp)
                )
                .padding(top = 6.dp, end = 7.dp, bottom = 7.dp, start = 7.dp),
            fontStyle = if (message.sender == "Me") FontStyle.Normal else FontStyle.Italic,
            fontSize = if (message.sender == "Me") 20.sp else 18.sp,
            style = TextStyle(color = if (message.sender == "Me") Color(0xFF424242) else Color(0xFF000000)),

            )
    }
}

