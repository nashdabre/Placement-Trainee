package com.example.placementtrainee.navigation

 sealed class Routes(val routes:String) {
     object  Splash: Routes("splash")
     object  Home: Routes("home")
     object BottomNav: Routes("bottom_nav")
     object StartPage: Routes("startpage")
     object Chatbot: Routes("chatbot")
     object Quiz: Routes("quiz")
     object ResumeBuilderScreen: Routes("resumebuilderscreen")


     object ResumeInnerPage: Routes("resumeInnerPage")

     object FAQ: Routes("faq")

     object CareerPlan: Routes("careerplan")



     object Articels: Routes("Articels")

     object Profile: Routes("Profile")
     object Languages: Routes("languages")

     object Programming: Routes("programming")
     object Fundamental: Routes("fundamental")


     object Wissen: Routes("wissen")
     object Quantiphi: Routes("quantiphi")
     object Arcon_Nash: Routes("Arcon_nash")
     object Arcon: Routes("Arcon")
     object Arcon_RolesnRes: Routes("Arcon_rolesnres")

     object Arcon_Experience: Routes("Arcon_Experience")

     object Arcon_software_role: Routes("Arcon_software_role")
     object Arcon_Support_role: Routes("Arcon_support_role")
     object Arcon_Quality_role: Routes("Arcon_quality_role")


     object Wissen_RolesnRes: Routes("wissen_rolesnres")
     object Wissen_Experience: Routes("wissen_tech1")
     object Dolat_RolesnRes: Routes("dolat_rolesnres")
     object Dolat_Experience: Routes("dolat_tech1")
     object Wissen_chhand: Routes("wissen_chhand")
     object Wissen_crsytal: Routes("wissen_crystal")


     object DolatCapital: Routes("dolatcapital")
     object DolatCapital_hiring: Routes("dolatcapital_hiring")

     object Dolat_Necole: Routes("dolat_necole")

     object Aptitude: Routes("aptitude")
     object Qaunti_Quiz: Routes("quanti_quiz")
     object Logical_Quiz: Routes("logicalg_quiz")









     object Interview: Routes("interview")
     object Youtube0: Routes("youtube")
     object Youtube1: Routes("youtube1")
     object Youtube2: Routes("youtube2")
     object Youtube3: Routes("youtube3")
     object Youtube4: Routes("youtube4")
     object Youtube5: Routes("youtube5")



     object Login: Routes("login")
     object resume: Routes("resume")

     object Logout: Routes("logout")
     object Course: Routes("course")

     object Register: Routes("register")
     object Coding: Routes("coding")


}