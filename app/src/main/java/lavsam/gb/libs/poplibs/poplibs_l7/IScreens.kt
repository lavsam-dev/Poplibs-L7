package lavsam.gb.libs.poplibs.poplibs_l7

import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun users(): Screen
    fun settings() = Unit
}