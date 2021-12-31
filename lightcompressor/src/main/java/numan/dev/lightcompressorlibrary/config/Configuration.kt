package numan.dev.lightcompressorlibrary.config

import numan.dev.lightcompressorlibrary.VideoQuality

data class Configuration(
    var quality: VideoQuality = VideoQuality.MEDIUM,
    var frameRate: Int? = null,
    var isMinBitrateCheckEnabled: Boolean = true,
    var videoBitrate: Int? = null,
    var disableAudio: Boolean = false,
    var forcedVideoWidthHeight: Pair<Int, Int>? = null
)