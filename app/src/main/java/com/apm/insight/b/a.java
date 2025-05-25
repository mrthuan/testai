package com.apm.insight.b;

import android.app.ActivityManager;

/* loaded from: classes.dex */
public class a {
    public static String a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        if (com.apm.insight.i.s()) {
            StringBuilder sb2 = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
            sb2.append("condition: " + processErrorStateInfo.condition + "\n");
            sb2.append("processName: " + processErrorStateInfo.processName + "\n");
            sb2.append("pid: " + processErrorStateInfo.pid + "\n");
            sb2.append("uid: " + processErrorStateInfo.uid + "\n");
            sb2.append("tag: " + processErrorStateInfo.tag + "\n");
            sb2.append("shortMsg : " + processErrorStateInfo.shortMsg + "\n");
            sb2.append("longMsg : " + processErrorStateInfo.longMsg + "\n");
            sb2.append("-----------------------end----------------------------");
            return sb2.toString();
        }
        return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
    }

    public static boolean a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg));
    }
}
