package a0;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import io.flutter.embedding.android.KeyboardMap;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) * f12) / f13;
    }

    public static float b(Float f10, float f11, float f12) {
        return (f10.floatValue() * f11) + f12;
    }

    public static int c(Float f10, float f11) {
        return Math.round(f10.floatValue() * f11);
    }

    public static IObjectWrapper d(Parcel parcel) {
        IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
        parcel.recycle();
        return K;
    }

    public static Long e(long j10, KeyboardMap.AnonymousClass1 anonymousClass1, Long l10, long j11) {
        anonymousClass1.put(l10, Long.valueOf(j10));
        return Long.valueOf(j11);
    }

    public static Object f(List list, int i10) {
        return list.get(list.size() + i10);
    }

    public static String g(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, Context context, String str3, String str4) {
        g.d(context, ea.a.p(str, str2));
        return ea.a.p(str3, str4);
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder k(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* bridge */ /* synthetic */ void l(Object obj, int i10, int i11, int i12) {
        throw null;
    }

    public static float m(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }
}
