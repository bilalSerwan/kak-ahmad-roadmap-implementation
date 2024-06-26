package com.fastlink.jetpack_compose_article_impl


import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
        .padding(horizontal = 10.dp,)) {
       items(conversationSample){ message ->
                MessageCard(message)
            }
    }
}


@Composable
fun MessageCard(message: Message){
    Row (modifier = Modifier
        .padding(10.dp)){
        Image(painter = painterResource(id =message.image),
            contentDescription = null,
            modifier= Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape),
            contentScale = ContentScale.FillBounds,
        )
         var isExpanded by  rememberSaveable{
             mutableStateOf(false)
         }
        val surfaceColor by animateColorAsState(
            if(isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface, label = ""
        )
        Column(
            modifier= Modifier
                .padding(start = 10.dp)
                .clickable { isExpanded = !isExpanded }){
            Text(text = message.name,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall)
            Surface(
                color = surfaceColor,
                modifier = Modifier
                    .animateContentSize()
                    .padding(1.dp),
                shape = MaterialTheme.shapes.medium,
                shadowElevation = 1.dp
            ) {
                Text(
                    text = message.message,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = if(isExpanded) Int.MAX_VALUE else 1,
                    modifier = Modifier.padding(5.dp)
                )
            } }
    }
}



