package androidx.activity;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import lib.zj.office.fc.util.HexDump;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static double a(double d10, double d11, double d12, double d13) {
        return (d10 * d11) + d12 + d13;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) / f12) * f13;
    }

    public static Context c(String str, String str2, HashSet hashSet) {
        hashSet.add(ea.a.p(str, str2));
        return OCREventCenter.a();
    }

    public static String d(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String e(String str, int i10, int i11) {
        return str.substring(i11, str.length() - i10);
    }

    public static String f(StringBuilder sb2, String str, char c) {
        sb2.append(str);
        sb2.append(c);
        return sb2.toString();
    }

    public static String g(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder h(String str, long j10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static tg.b i(ArrayList arrayList, tg.b bVar) {
        arrayList.add(bVar);
        return new tg.b();
    }

    public static void j(int i10, StringBuffer stringBuffer, String str) {
        stringBuffer.append(HexDump.shortToHex(i10));
        stringBuffer.append(str);
    }

    public static /* bridge */ /* synthetic */ void k(Object obj) {
        throw null;
    }

    public static float l(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }
}
