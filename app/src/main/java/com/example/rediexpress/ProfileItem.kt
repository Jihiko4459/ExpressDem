package com.example.rediexpress

data class ProfileItem(val image:Int, val title:String, val description:String)

class listprofile{
    val listprofiledata= listOf(ProfileItem(R.drawable.iconoir_profile_circled, "Edit Profile", "Name, phone no, address, email ..."),
        ProfileItem(R.drawable.healthicons_i_certificate_paper_outline, "Statements & Reports", "Download transaction details, orders, deliveries"),
        ProfileItem(R.drawable.notification, "Notification Settings", "mute, unmute, set location & tracking setting"),
        ProfileItem(R.drawable.wallet2, "Card & Bank account settings", "change cards, delete card details"),
        ProfileItem(R.drawable.carbon_two_person_lift, "Referrals", "check no of friends and earn"),
        ProfileItem(R.drawable.map, "About Us", "know more about us, terms and conditions"),
        ProfileItem(R.drawable.ic_round_log_out, "Log Out", ""))
}
