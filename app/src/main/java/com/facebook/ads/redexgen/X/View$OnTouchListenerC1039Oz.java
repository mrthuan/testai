package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1039Oz implements View.OnTouchListener {
    public static String[] A01 = {"Ag1edxGPmMygd2ZYlIUVji8noIaHMiLQ", "WBm6rd5teeEdNPvhq6Xy4yUZakZyqmkG", "ECfpblw4grbEX8THFPRM2kFRttXYDoHg", "puAZOL7My1RDIFuoQdQlIGU8uD74vctF", "rOVXccWrouvhHaM6oOMABT92DHzQ0mnK", "DC0vFQcYgsBFza3ppzX1spbq624HEpuf", "poJar2xzbFJI41pUq505BIfUZ51x22BX", "IrxdQF8UtoekkpFzNw9qcg8fTKi13Wor"};
    public final /* synthetic */ UQ A00;

    public View$OnTouchListenerC1039Oz(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f10 = this.A00.A00;
                int action2 = (f10 > browserFinalY ? 1 : (f10 == browserFinalY ? 0 : -1));
                if (action2 >= 0) {
                    return true;
                }
                UQ uq = this.A00;
                String[] strArr = A01;
                String str = strArr[6];
                String str2 = strArr[2];
                int charAt = str.charAt(3);
                int action3 = str2.charAt(3);
                if (charAt == action3) {
                    throw new RuntimeException();
                }
                A01[3] = "IGAgl0ADkCINtDuAhI065JcG0AD0YiJn";
                uq.A0g(false);
                return true;
            default:
                return true;
        }
    }
}
