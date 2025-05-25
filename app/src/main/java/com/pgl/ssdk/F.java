package com.pgl.ssdk;

/* compiled from: DomainMgr.java */
/* loaded from: classes2.dex */
public class F {

    /* renamed from: a  reason: collision with root package name */
    public static int f15758a = -1;

    public static String a() {
        int i10 = f15758a;
        if (i10 != 0) {
            if (i10 != 1) {
                return "";
            }
            return "https://ssdk-va.pangle.io/ssdk/v2/r";
        }
        return "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }

    public static String b() {
        int i10 = f15758a;
        if (i10 != 0) {
            if (i10 != 1) {
                return "";
            }
            return "https://ssdk-va.pangle.io/ssdk/sd/token";
        }
        return "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }
}
