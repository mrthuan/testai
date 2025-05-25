package a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import ga.r;
import java.util.HashMap;
import java.util.Locale;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ga.e {
    public static int b(float f10, float f11, PathHolder pathHolder, float f12, Rect rect) {
        pathHolder.lineTo(f12, f10 + f11);
        return rect.centerX();
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(String str, String str2, String str3, Context context, int i10) {
        kotlin.jvm.internal.g.d(str3, ea.a.p(str, str2));
        return context.getString(i10);
    }

    public static String f(String str, String str2, Locale locale, String str3, Locale locale2) {
        kotlin.jvm.internal.g.d(locale, ea.a.p(str, str2));
        return str3.toLowerCase(locale2);
    }

    public static String g(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static HashMap h(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static /* synthetic */ void i() {
    }

    public static void j(String str, String str2, SharedPreferences.Editor editor, boolean z10) {
        editor.putBoolean(ea.a.p(str, str2), z10).apply();
    }

    public static void k(StringBuilder sb2, String str, String str2, fe.a aVar) {
        sb2.append(str);
        sb2.append(str2);
        aVar.b(sb2.toString());
    }

    public static void l(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void m(ExtendedFormatRecord extendedFormatRecord, short s4, short s10, short s11, short s12) {
        extendedFormatRecord.setFontIndex(s4);
        extendedFormatRecord.setFormatIndex(s10);
        extendedFormatRecord.setCellOptions(s11);
        extendedFormatRecord.setAlignmentOptions(s12);
    }

    @Override // ga.e
    public Object a(r rVar) {
        return FirebaseInstallationsRegistrar.a(rVar);
    }
}
