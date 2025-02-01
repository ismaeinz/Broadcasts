package com.example.broadcasts

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.datasource.RawResourceDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView


@SuppressLint("UnsafeOptInUsageError")
@Composable
fun PlayMedia() {
    val context = LocalContext.current
    val playerView = PlayerView(context)
    val player = ExoPlayer.Builder(context).build().apply {
        val uri = RawResourceDataSource.buildRawResourceUri(R.raw.m)
        setMediaItem(MediaItem.fromUri(uri))
        prepare()
        playWhenReady = true

    }
    val playWhenReady by rememberSaveable {
        mutableStateOf(true)
    }
    playerView.player = player
    LaunchedEffect(player) {
        player.prepare()
        if (!playWhenReady) {
            player.playWhenReady = playWhenReady
        }
    }
    AndroidView(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp), factory = {
        playerView
    })

}