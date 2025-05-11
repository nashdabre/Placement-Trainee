package com.example.placementtrainee.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.placementtrainee.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyApp(modifier: Modifier = Modifier) {


    val images = listOf(
        R.drawable.interview1,
        R.drawable.interview2,
        R.drawable.interview3,
        R.drawable.interview4,
        R.drawable.interview5

    )

    val pagerState = rememberPagerState(
        pageCount = { images.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = images[currentPage]),
                        contentDescription = ""
                    )
                }
            }

        }

        PageIndicator(
            pageCount = images.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WissenImages(modifier: Modifier = Modifier) {



    val wissen = listOf(
        R.drawable.wissen0,
        R.drawable.wissen1,
        R.drawable.wissen2,
        R.drawable.wissen3
    )
    val pagerState = rememberPagerState(
        pageCount = { wissen.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = wissen[currentPage]),
                        contentDescription = ""
                    )
                }
            }

        }

        PageIndicator(
            pageCount = wissen.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DolatImages(modifier: Modifier = Modifier) {



    val dolat = listOf(
        R.drawable.dolat1,
        R.drawable.dolat2,
        R.drawable.dolat3,
        R.drawable.dolat4
    )
    val pagerState = rememberPagerState(
        pageCount = { dolat.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = dolat[currentPage]),
                        contentDescription = ""
                    )
                }
            }

        }

        PageIndicator(
            pageCount = dolat.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuantiphiImages(modifier: Modifier = Modifier) {



    val dolat = listOf(
        R.drawable.quantiphi1,
        R.drawable.quantiphi2,
        R.drawable.quantiphi3,
        R.drawable.dolat4
    )
    val pagerState = rememberPagerState(
        pageCount = { dolat.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = dolat[currentPage]),
                        contentDescription = ""
                    )
                }
            }

        }

        PageIndicator(
            pageCount = dolat.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ArconImages(modifier: Modifier = Modifier) {



    val dolat = listOf(
        R.drawable.arcon1,
        R.drawable.broswerstack2,
        R.drawable.arcon2,
        R.drawable.arcon3
    )
    val pagerState = rememberPagerState(
        pageCount = { dolat.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = dolat[currentPage]),
                        contentDescription = ""
                    )
                }
            }

        }

        PageIndicator(
            pageCount = dolat.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}


@Composable
fun PageIndicator(pageCount: Int, currentPage: Int, modifier: Modifier) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        repeat(pageCount){
            IndicatorDots(isSelected = it == currentPage, modifier= modifier)
        }
    }
}

@Composable
fun IndicatorDots(isSelected: Boolean, modifier: Modifier) {
    val size = animateDpAsState(targetValue = if (isSelected) 12.dp else 10.dp, label = "")
    Box(modifier = modifier.padding(2.dp)
        .size(size.value)
        .clip(CircleShape)
        .background(if (isSelected) Color(0xff373737) else Color(0xA8373737))
    )
}