package com.apm.insight;

/* loaded from: classes.dex */
public interface ICrashCallback {
    void onCrash(CrashType crashType, String str, Thread thread);
}
