package com.godslew.horizontalpagerindicatorsample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HorizontalPagerIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    pageCount: Int = pagerState.pageCount,
    activeColor: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
    inactiveColor: Color = activeColor.copy(ContentAlpha.disabled),
    indicatorHeight: Dp,
    spacing: Dp,
    indicatorShape: Shape = CircleShape,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        if (pageCount > 0) {
            LazyVerticalGrid(
                horizontalArrangement = Arrangement.spacedBy(spacing),
                columns = GridCells.Fixed(pageCount),
            ) {
                val indicatorModifier = Modifier
                    .fillMaxSize()
                    .height(indicatorHeight)
                    .background(color = inactiveColor, shape = indicatorShape)

                val activeIndicatorModifier = indicatorModifier
                    .background(color = activeColor, shape = indicatorShape)

                items(pageCount) { index ->
                    if (index == pagerState.currentPage) {
                        Box(activeIndicatorModifier)
                    } else {
                        Box(indicatorModifier)
                    }
                }
            }
        }
    }
}