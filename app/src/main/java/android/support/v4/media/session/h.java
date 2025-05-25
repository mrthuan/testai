package android.support.v4.media.session;

import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static double a(double d10, double d11, double d12) {
        return (Math.sin(d10) * d11) + d12;
    }

    public static int b(String str, String str2, String str3) {
        kotlin.jvm.internal.g.d(str3, ea.a.p(str, str2));
        return str3.length();
    }

    public static Long c(long j10, KeyboardMap.AnonymousClass2 anonymousClass2, Long l10, long j11) {
        anonymousClass2.put(l10, Long.valueOf(j10));
        return Long.valueOf(j11);
    }

    public static Object d(zzbl zzblVar, int i10, List list, int i11) {
        zzh.zzh(zzblVar.name(), i10, list);
        return list.get(i11);
    }

    public static String e(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static HashMap g(Class cls, com.google.firebase.encoders.proto.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ Iterator h() {
        try {
            return Arrays.asList(new kotlinx.coroutines.android.a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static /* bridge */ /* synthetic */ void i(int i10, int i11, Class cls) {
        throw null;
    }
}
