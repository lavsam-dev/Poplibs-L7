package lavsam.gb.libs.poplibs.poplibs_l7

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GithubUser(
    val login: String,
    val id: Int
) : Parcelable