package com.example.sampletemplate.screen.AuthScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.sampletemplate.R
import com.example.sampletemplate.navigation.AuthRouteScreen


@Composable
fun OnboardingScreen1(navController: NavController) {
    val composition  = rememberLottieComposition(spec = LottieCompositionSpec.RawRes(resId = R.raw.anime2))
    val ans= composition.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFCBFA3E)) // Light Gray background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(90.dp))           //@@@@
            LottieAnimation(composition = ans,modifier= Modifier.size(300.dp),
                iterations = LottieConstants.IterateForever,)
            Spacer(modifier = Modifier.height(70.dp))
            Card( modifier= Modifier
                .fillMaxWidth().padding(horizontal = 0.dp)
                .size(300.dp),shape = RoundedCornerShape(topStart = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(600.dp) // Adjust box height as needed         @@@@@
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFFFFFFFF))
                    ) {

                        Spacer(modifier = Modifier.height(10.dp))

                        Row( // Top row with text alignments
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {

                            Text(
                                text = "Chat Anonymously",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFF9BEB05),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.height(19.dp))
                        Row( // Top row with text alignments
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 50.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = " Unburden Yourself.\nNo One's Watching. ",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFF535251),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Spacer to push content down
                        Row( // Bottom row with text and button
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 10.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Skip", color = Color.Black,
                                fontSize = 19.sp,modifier= Modifier.clickable { navController.navigate(AuthRouteScreen.Login.route) },
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.SemiBold,
                            )

                            IconButton(onClick = { navController.navigate(AuthRouteScreen.ONBOARDING2.route) }, modifier = Modifier.size(42.dp), ) {
                                Icon(Icons.Filled.ArrowForward, contentDescription ="", tint= Color(0xFF9BEB05) )
                            }
                        }

                    }
                }

            }

        }
    }
}



@Composable
fun OnboardingScreen2(navController: NavController,) {


    val composition  = rememberLottieComposition(spec = LottieCompositionSpec.RawRes(resId = R.raw.anim1))
    val ans= composition.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8953D)) // Light Gray background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(90.dp))           //@@@@
            LottieAnimation(composition = ans,modifier= Modifier.size(300.dp),
                iterations = LottieConstants.IterateForever,)
            Spacer(modifier = Modifier.height(70.dp))
            Card( modifier= Modifier
                .fillMaxWidth()
                .size(300.dp),shape = RoundedCornerShape(topStart = 50.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(600.dp) // Adjust box height as needed         @@@@@
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFFFFFFFF))
                    ) {

                        Spacer(modifier = Modifier.height(10.dp))

                        Row( // Top row with text alignments
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {

                            Text(
                                text = "Speak Freely.\nNo Judgments",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFFF8953D),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.height(19.dp))
                        Row( // Top row with text alignments
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 50.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "Make your Voice heard.\nBehind the mask.",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFF535251),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Spacer to push content down
                        Row( // Bottom row with text and button
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 10.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Skip", color = Color.Black,
                                fontSize = 19.sp, modifier = Modifier.clickable { navController.navigate(AuthRouteScreen.Login.route) },
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.SemiBold
                            )

                            IconButton(onClick = {navController.navigate(AuthRouteScreen.ONBOARDING3.route) }, modifier = Modifier.size(42.dp), ) {
                                Icon(Icons.Filled.ArrowForward, contentDescription ="", tint= Color(0xFFF89530) )
                            }
                        }

                    }
                }

            }

        }
    }
}

@Composable
fun OnboardingScreen3(navController: NavController,) {

    val composition  = rememberLottieComposition(spec = LottieCompositionSpec.RawRes(resId = R.raw.anime9))
    val ans= composition.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8953D)) // Light Gray background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(90.dp))           //@@@@
            LottieAnimation(composition = ans,modifier= Modifier.size(300.dp),
                iterations = LottieConstants.IterateForever,)
            Spacer(modifier = Modifier.height(70.dp))
            Card( modifier= Modifier
                .fillMaxWidth()
                .size(300.dp),shape = RoundedCornerShape(topStart = 50.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(600.dp) // Adjust box height as needed         @@@@@
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFFFFFFFF))
                    ) {

                        Spacer(modifier = Modifier.height(10.dp))

                        Row( // Top row with text alignments
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {

                            Text(
                                text = "Build Your own \nAnonymous tribe",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFFF8953D),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.height(19.dp))
                        Row( // Top row with text alignments
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 50.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "Where Groups Hide Faces, Not Ideas...",
                                modifier = Modifier.padding(end = 8.dp), // Add some padding
                                color = Color(0xFF535251),
                                fontFamily = FontFamily.Monospace,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Spacer to push content down
                        Row( // Bottom row with text and button
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 10.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Skip", modifier =Modifier.clickable { navController.navigate(AuthRouteScreen.Login.route) },color = Color.Black,
                                fontSize = 19.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.SemiBold
                            )

                            IconButton(onClick = { navController.navigate(AuthRouteScreen.Login.route)}, modifier = Modifier.size(42.dp), ) {
                                Icon(Icons.Filled.ArrowForward, contentDescription ="", tint= Color(0xFFF89530) )
                            }
                        }

                    }
                }

            }

        }
    }
}