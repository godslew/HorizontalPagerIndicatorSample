package com.godslew.horizontalpagerindicatorsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.godslew.horizontalpagerindicatorsample.ui.theme.HorizontalPagerIndicatorSampleTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HorizontalPagerIndicatorSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val pagerState = rememberPagerState()
                    val imageUrls = remember {
                        listOf(
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            /*
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/Xq1ntWruZQI/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                            "https://source.unsplash.com/NYyCqdBOKwc/600x800",
                            "https://source.unsplash.com/buF62ewDLcQ/600x800",
                            "https://source.unsplash.com/THozNzxEP3g/600x800",
                            "https://source.unsplash.com/LrMWHKqilUw/600x800",
                            "https://source.unsplash.com/PeFk7fzxTdk/600x800",
                            "https://source.unsplash.com/USrZRcRS2Lw/600x800",
                             */
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        HorizontalPager(
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.Center),
                            count = imageUrls.size,
                            state = pagerState
                        ) { page ->
                            val imageUrl = imageUrls[page]
                            AsyncImage(
                                model = imageUrl,
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                        }
                        HorizontalPagerIndicator(
                            pagerState = pagerState,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 20.dp),
                            activeColor = Color.White,
                            indicatorHeight = 4.dp,
                            spacing = 2.dp,
                            indicatorShape = RoundedCornerShape(8.dp),
                        )
                    }
                }
            }
        }
    }
}
