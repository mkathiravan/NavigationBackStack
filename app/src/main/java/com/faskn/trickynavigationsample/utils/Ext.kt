package com.faskn.trickynavigationsample.utils

import androidx.navigation.NavController

/**
 * Created by Kathiravan on 18.04.2020
 */

fun NavController.popBackStackAllInstances(destination: Int, inclusive: Boolean): Boolean {
    var popped: Boolean
    while (true) {
        popped = popBackStack(destination, inclusive)
        if (!popped) {
            break
        }
    }
    return popped
}