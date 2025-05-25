package ii;

import com.adjust.sdk.Constants;

/* compiled from: BorderStyle.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public short f18496a;

    /* renamed from: b  reason: collision with root package name */
    public short f18497b;

    public b() {
        this.f18496a = (short) 0;
        this.f18497b = (short) 0;
    }

    public b(String str, short s4) {
        short s10 = 0;
        this.f18496a = (short) 0;
        this.f18497b = (short) 0;
        if (str != null && !str.equals("none")) {
            if (str.equals("thin")) {
                s10 = 1;
            } else if (str.equals(Constants.MEDIUM)) {
                s10 = 2;
            } else if (str.equals("dashed")) {
                s10 = 3;
            } else if (str.equals("dotted")) {
                s10 = 7;
            } else if (str.equals("thick")) {
                s10 = 5;
            } else if (str.equals("double")) {
                s10 = 6;
            } else if (str.equals("hair")) {
                s10 = 4;
            } else if (str.equals("mediumDashed")) {
                s10 = 8;
            } else if (str.equals("dashDot")) {
                s10 = 9;
            } else if (str.equals("mediumDashDot")) {
                s10 = 10;
            } else if (str.equals("dashDotDot")) {
                s10 = 11;
            } else if (str.equals("mediumDashDotDot")) {
                s10 = 12;
            } else if (str.equals("slantDashDot")) {
                s10 = 13;
            }
        }
        this.f18496a = s10;
        this.f18497b = s4;
    }
}
