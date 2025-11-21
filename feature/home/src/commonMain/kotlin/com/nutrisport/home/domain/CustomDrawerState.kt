package com.nutrisport.home.domain

enum class CustomDrawerState {
    Opened, Closed
}

fun CustomDrawerState.isOpened() = this == CustomDrawerState.Opened

fun CustomDrawerState.opposite(): CustomDrawerState {
    return if (this == CustomDrawerState.Opened) CustomDrawerState.Closed
    else CustomDrawerState.Opened
}