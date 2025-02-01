//package com.example.broadcasts
//
//import android.app.Service
//import android.content.Intent
//
//
//abstract class MyService : Service() {
//    override fun onStartCmmand(intent: Intent?, flags: Int, startId: Int): Int {
//        return START_STICKY;
//    }
//}
//
//    onBind =>
//    BoundServiceنستخدمها للـ

//    override fun onBind(intent: Intent): IBinder {
//
//    }


//       الكود ال عاوزه يشتغل عند البدايه بضيفه هنا
//        return super.onStartCommand(intent, flags, startId)

//        //        الريترين فاليو int لان الريترن عندي تلات انواع
//        1=> START_STICKY
//        return START_STICKY;
//        لو السييتم كنسل السيرفيس قبل ما تخلص شغلها روح شغلها تاني ولكن بدون ما ترسل الـintent
//2=>START_NOT_STICKY
//        لو فيهـpendingIntent موجوده روح شغلها مره تانيه
//        return START_NOT_STICKY
//        3=>START_REDELIVER_INTENT
//        لو السيستم طفاها قبل ما تخلص شغلها روح شغلها مره تاني عشان تاخد البيانات ال داخل الاـintent
//        return START_REDELIVER_INTENT

//    }
//
//}