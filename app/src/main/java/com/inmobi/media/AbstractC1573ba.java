package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ba  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1573ba {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c f14969a = kotlin.a.a(C1559aa.f14937a);

    public static final JSONObject a(WindowInsets windowInsets) {
        JSONObject jSONObject;
        Insets systemGestureInsets;
        int i10;
        Insets systemGestureInsets2;
        int i11;
        Insets systemGestureInsets3;
        int i12;
        Insets systemGestureInsets4;
        int i13;
        JSONObject jSONObject2;
        DisplayCutout displayCutout;
        int i14;
        DisplayCutout displayCutout2;
        int i15;
        DisplayCutout displayCutout3;
        int i16;
        DisplayCutout displayCutout4;
        int i17;
        JSONObject jSONObject3;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int i18;
        int i19;
        int i20;
        int radius;
        int radius2;
        int radius3;
        int radius4;
        Insets insets;
        int i21;
        int i22;
        int i23;
        int i24;
        Insets insets2;
        int i25;
        int i26;
        int i27;
        int i28;
        kotlin.jvm.internal.g.e(windowInsets, "<this>");
        C1566b3 c1566b3 = C1566b3.f14952a;
        if (c1566b3.E()) {
            insets2 = windowInsets.getInsets(16);
            kotlin.jvm.internal.g.d(insets2, "getInsets(...)");
            JSONObject jSONObject4 = new JSONObject();
            i25 = insets2.left;
            jSONObject4.put("left", AbstractC1579c2.a(i25));
            i26 = insets2.top;
            jSONObject4.put("top", AbstractC1579c2.a(i26));
            i27 = insets2.right;
            jSONObject4.put("right", AbstractC1579c2.a(i27));
            i28 = insets2.bottom;
            jSONObject = jSONObject4.put("bottom", AbstractC1579c2.a(i28));
            kotlin.jvm.internal.g.b(jSONObject);
        } else {
            if (c1566b3.D()) {
                JSONObject jSONObject5 = new JSONObject();
                systemGestureInsets = windowInsets.getSystemGestureInsets();
                i10 = systemGestureInsets.left;
                jSONObject5.put("left", AbstractC1579c2.a(i10));
                systemGestureInsets2 = windowInsets.getSystemGestureInsets();
                i11 = systemGestureInsets2.top;
                jSONObject5.put("top", AbstractC1579c2.a(i11));
                systemGestureInsets3 = windowInsets.getSystemGestureInsets();
                i12 = systemGestureInsets3.right;
                jSONObject5.put("right", AbstractC1579c2.a(i12));
                systemGestureInsets4 = windowInsets.getSystemGestureInsets();
                i13 = systemGestureInsets4.bottom;
                jSONObject = jSONObject5.put("bottom", AbstractC1579c2.a(i13));
                kotlin.jvm.internal.g.d(jSONObject, "run(...)");
            } else {
                jSONObject = (JSONObject) f14969a.getValue();
            }
            kotlin.jvm.internal.g.b(jSONObject);
        }
        int i29 = 0;
        if (c1566b3.E()) {
            insets = windowInsets.getInsets(128);
            kotlin.jvm.internal.g.d(insets, "getInsets(...)");
            JSONObject jSONObject6 = new JSONObject();
            i21 = insets.left;
            jSONObject6.put("left", AbstractC1579c2.a(i21));
            i22 = insets.top;
            jSONObject6.put("top", AbstractC1579c2.a(i22));
            i23 = insets.right;
            jSONObject6.put("right", AbstractC1579c2.a(i23));
            i24 = insets.bottom;
            jSONObject2 = jSONObject6.put("bottom", AbstractC1579c2.a(i24));
            kotlin.jvm.internal.g.b(jSONObject2);
        } else {
            if (c1566b3.C()) {
                JSONObject jSONObject7 = new JSONObject();
                displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    i14 = displayCutout.getSafeInsetLeft();
                } else {
                    i14 = 0;
                }
                jSONObject7.put("left", AbstractC1579c2.a(i14));
                displayCutout2 = windowInsets.getDisplayCutout();
                if (displayCutout2 != null) {
                    i15 = displayCutout2.getSafeInsetTop();
                } else {
                    i15 = 0;
                }
                jSONObject7.put("top", AbstractC1579c2.a(i15));
                displayCutout3 = windowInsets.getDisplayCutout();
                if (displayCutout3 != null) {
                    i16 = displayCutout3.getSafeInsetRight();
                } else {
                    i16 = 0;
                }
                jSONObject7.put("right", AbstractC1579c2.a(i16));
                displayCutout4 = windowInsets.getDisplayCutout();
                if (displayCutout4 != null) {
                    i17 = displayCutout4.getSafeInsetBottom();
                } else {
                    i17 = 0;
                }
                JSONObject put = jSONObject7.put("bottom", AbstractC1579c2.a(i17));
                kotlin.jvm.internal.g.d(put, "run(...)");
                jSONObject2 = put;
            } else {
                jSONObject2 = (JSONObject) f14969a.getValue();
            }
            kotlin.jvm.internal.g.b(jSONObject2);
        }
        if (c1566b3.F()) {
            roundedCorner = windowInsets.getRoundedCorner(3);
            roundedCorner2 = windowInsets.getRoundedCorner(0);
            roundedCorner3 = windowInsets.getRoundedCorner(1);
            roundedCorner4 = windowInsets.getRoundedCorner(2);
            if (roundedCorner != null) {
                radius4 = roundedCorner.getRadius();
                i18 = (int) (radius4 * Math.sin(Math.toRadians(45.0d)));
            } else {
                i18 = 0;
            }
            if (roundedCorner2 != null) {
                radius3 = roundedCorner2.getRadius();
                i19 = (int) (radius3 * Math.sin(Math.toRadians(45.0d)));
            } else {
                i19 = 0;
            }
            if (roundedCorner3 != null) {
                radius2 = roundedCorner3.getRadius();
                i20 = (int) (radius2 * Math.sin(Math.toRadians(45.0d)));
            } else {
                i20 = 0;
            }
            if (roundedCorner4 != null) {
                radius = roundedCorner4.getRadius();
                i29 = (int) (Math.sin(Math.toRadians(45.0d)) * radius);
            }
            int max = Math.max(i18, i19);
            int max2 = Math.max(i29, i20);
            int max3 = Math.max(i19, i20);
            int max4 = Math.max(i18, i29);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("left", AbstractC1579c2.a(max));
            jSONObject8.put("top", AbstractC1579c2.a(max3));
            jSONObject8.put("right", AbstractC1579c2.a(max2));
            jSONObject3 = jSONObject8.put("bottom", AbstractC1579c2.a(max4));
            kotlin.jvm.internal.g.b(jSONObject3);
        } else {
            jSONObject3 = (JSONObject) f14969a.getValue();
            kotlin.jvm.internal.g.d(jSONObject3, "<get-defaultJSONObjectInsets>(...)");
        }
        int max5 = Math.max(jSONObject.optInt("left"), Math.max(jSONObject2.optInt("left"), jSONObject3.optInt("left")));
        int max6 = Math.max(jSONObject.optInt("right"), Math.max(jSONObject2.optInt("right"), jSONObject3.optInt("right")));
        int max7 = Math.max(jSONObject.optInt("top"), Math.max(jSONObject2.optInt("top"), jSONObject3.optInt("top")));
        int max8 = Math.max(jSONObject.optInt("bottom"), Math.max(jSONObject2.optInt("bottom"), jSONObject3.optInt("bottom")));
        JSONObject a10 = H9.a("left", max5, "top", max7);
        a10.put("right", max6);
        JSONObject put2 = a10.put("bottom", max8);
        kotlin.jvm.internal.g.b(put2);
        return put2;
    }
}
