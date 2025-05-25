package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.util.HashSet;

/* compiled from: MyServerData.java */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f28699a;

    /* renamed from: b  reason: collision with root package name */
    public static int f28700b;

    static {
        ea.a.p("AnliZQt2UnIeYT5h", "IkbKj1n2");
        f28699a = new HashSet();
        f28700b = -1;
    }

    public static boolean a(Context context) {
        int i10;
        zzj zzb;
        int i11 = f28700b;
        if (i11 == -1 || i11 == 0 || i11 == 2) {
            ce.g.a().getClass();
            try {
                zzb = zza.zza(context).zzb();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (zzb != null) {
                i10 = zzb.getConsentStatus();
                f28700b = i10;
            }
            i10 = 0;
            f28700b = i10;
        }
        int i12 = f28700b;
        if (i12 != 1 && i12 != 3) {
            return false;
        }
        return true;
    }

    public static int b(Context context) {
        ConstantIntType constantIntType = ConstantIntType.MinReqDataMemory;
        int ordinal = constantIntType.ordinal();
        Integer[] numArr = h.f28702a;
        Integer num = numArr[ordinal];
        int defValue = constantIntType.getDefValue(context);
        String key = constantIntType.getKey();
        if (num == null) {
            String h10 = de.e.h(key, String.valueOf(defValue));
            try {
                if (!TextUtils.isEmpty(h10)) {
                    num = Integer.valueOf(Integer.parseInt(h10));
                }
            } catch (Exception unused) {
            }
            if (num == null) {
                num = Integer.valueOf(defValue);
            }
        }
        numArr[ordinal] = Integer.valueOf(num.intValue());
        return h.f28702a[ordinal].intValue();
    }
}
