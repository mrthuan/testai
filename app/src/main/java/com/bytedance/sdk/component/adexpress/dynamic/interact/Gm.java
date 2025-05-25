package com.bytedance.sdk.component.adexpress.dynamic.interact;

import a6.h;
import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: InteractViewFactory.java */
/* loaded from: classes.dex */
public class Gm {
    public static hm Qhi(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, com.bytedance.sdk.component.adexpress.dynamic.ac.Gm gm2, com.bytedance.sdk.component.adexpress.cJ.iMK imk) {
        if (context == null || dynamicBaseWidget == null || sf2 == null) {
            return null;
        }
        String ip2 = sf2.ip();
        String Dww = imk.Dww();
        ip2.getClass();
        ip2.hashCode();
        char c = 65535;
        switch (ip2.hashCode()) {
            case 48:
                if (ip2.equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (ip2.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (ip2.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 53:
                if (ip2.equals("5")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (ip2.equals("6")) {
                    c = 4;
                    break;
                }
                break;
            case 55:
                if (ip2.equals("7")) {
                    c = 5;
                    break;
                }
                break;
            case 56:
                if (ip2.equals("8")) {
                    c = 6;
                    break;
                }
                break;
            case 57:
                if (ip2.equals("9")) {
                    c = 7;
                    break;
                }
                break;
            case 1567:
                if (ip2.equals("10")) {
                    c = '\b';
                    break;
                }
                break;
            case 1568:
                if (ip2.equals("11")) {
                    c = '\t';
                    break;
                }
                break;
            case 1569:
                if (ip2.equals("12")) {
                    c = '\n';
                    break;
                }
                break;
            case 1570:
                if (ip2.equals("13")) {
                    c = 11;
                    break;
                }
                break;
            case 1571:
                if (ip2.equals("14")) {
                    c = '\f';
                    break;
                }
                break;
            case 1573:
                if (ip2.equals("16")) {
                    c = '\r';
                    break;
                }
                break;
            case 1574:
                if (ip2.equals("17")) {
                    c = 14;
                    break;
                }
                break;
            case 1575:
                if (ip2.equals("18")) {
                    c = 15;
                    break;
                }
                break;
            case 1598:
                if (ip2.equals("20")) {
                    c = 16;
                    break;
                }
                break;
            case 1600:
                if (ip2.equals("22")) {
                    c = 17;
                    break;
                }
                break;
            case 1601:
                if (ip2.equals("23")) {
                    c = 18;
                    break;
                }
                break;
            case 1602:
                if (ip2.equals("24")) {
                    c = 19;
                    break;
                }
                break;
            case 1603:
                if (ip2.equals("25")) {
                    c = 20;
                    break;
                }
                break;
            case 1607:
                if (ip2.equals("29")) {
                    c = 21;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ROR(context, dynamicBaseWidget, sf2);
            case 1:
                return new fl(context, dynamicBaseWidget, sf2);
            case 2:
                return new ac(context, dynamicBaseWidget, sf2);
            case 3:
                if (sf2.jPH() == 1) {
                    return new tP(context, dynamicBaseWidget, sf2, sf2.ots());
                }
                return new HzH(context, dynamicBaseWidget, sf2);
            case 4:
            case '\t':
                return new pA(context, dynamicBaseWidget, sf2);
            case 5:
            case '\f':
                return new ABk(context, dynamicBaseWidget, sf2);
            case 6:
                return new iMK(context, dynamicBaseWidget, sf2);
            case 7:
            case '\r':
                return new hpZ(context, dynamicBaseWidget, sf2, ip2, gm2.Qhi(), gm2.cJ(), gm2.CJ(), gm2.ROR());
            case '\b':
                return new Tgh(context, dynamicBaseWidget, sf2);
            case '\n':
                return new HzH(context, dynamicBaseWidget, sf2);
            case 11:
                return new tP(context, dynamicBaseWidget, sf2);
            case 14:
            case 15:
                return new qMt(context, dynamicBaseWidget, sf2, ip2, gm2);
            case 16:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return new zc(context, dynamicBaseWidget, sf2, h.c(Dww, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                return new cJ(context, dynamicBaseWidget, sf2);
            case 17:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return new zc(context, dynamicBaseWidget, sf2, h.c(Dww, "static/lotties/202327swiper-up-star/index.json"), "22");
                }
                return new MQ(context, dynamicBaseWidget, sf2);
            case 18:
                if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return null;
                }
                return new zc(context, dynamicBaseWidget, sf2, h.c(Dww, "static/lotties/202327swiper-up-star/click.json"), "23");
            case 19:
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return new Qhi(context, dynamicBaseWidget, sf2);
                }
                return new kYc(context, dynamicBaseWidget, sf2);
            case 20:
                if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return null;
                }
                return new zc(context, dynamicBaseWidget, sf2, h.c(Dww, "static/lotties/gesture-slide.json"), "25");
            case 21:
                return new Sf(context, dynamicBaseWidget, sf2, gm2.Qhi(), gm2.cJ(), gm2.CJ(), gm2.ROR());
            default:
                return null;
        }
    }
}
