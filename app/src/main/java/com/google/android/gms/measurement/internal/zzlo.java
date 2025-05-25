package com.google.android.gms.measurement.internal;

import a0.a;
import a8.j2;
import a8.l0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzlo extends l0 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f11915g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f11916h = {"_err"};
    public SecureRandom c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f11917d;

    /* renamed from: e  reason: collision with root package name */
    public int f11918e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f11919f;

    public zzlo(zzge zzgeVar) {
        super(zzgeVar);
        this.f11919f = null;
        this.f11917d = new AtomicLong(0L);
    }

    public static void D(j2 j2Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        g0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        j2Var.b(bundle, str);
    }

    public static boolean X(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean a0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean b0(String str) {
        Preconditions.f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean d0(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        Preconditions.j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                    if (serviceInfo2.enabled) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    public static boolean e0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.j(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    public static byte[] f0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean g0(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean j0(String str, String[] strArr) {
        boolean z10;
        Preconditions.j(strArr);
        for (String str2 : strArr) {
            if (str != str2 && (str == null || !str.equals(str2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static long q0(byte[] bArr) {
        boolean z10;
        Preconditions.j(bArr);
        int length = bArr.length;
        int i10 = 0;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.m(z10);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static String t(int i10, String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (!z10) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return str;
    }

    public static MessageDigest u() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList w(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.f11516a);
            bundle.putString("origin", zzacVar.f11517b);
            bundle.putLong("creation_timestamp", zzacVar.f11518d);
            bundle.putString(NamingTable.TAG, zzacVar.c.f11910b);
            Object d10 = zzacVar.c.d();
            Preconditions.j(d10);
            zzha.b(d10, bundle);
            bundle.putBoolean("active", zzacVar.f11519e);
            String str = zzacVar.f11520f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f11521g;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f11546a);
                zzau zzauVar = zzawVar.f11547b;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.d());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f11522h);
            zzaw zzawVar2 = zzacVar.f11523i;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f11546a);
                zzau zzauVar2 = zzawVar2.f11547b;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.d());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.c.c);
            bundle.putLong("time_to_live", zzacVar.f11524j);
            zzaw zzawVar3 = zzacVar.f11525k;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f11546a);
                zzau zzauVar3 = zzawVar3.f11547b;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.d());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void z(zziq zziqVar, Bundle bundle, boolean z10) {
        if (bundle != null && zziqVar != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            } else {
                String str = zziqVar.f11842a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zziqVar.f11843b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zziqVar.c);
                return;
            }
        }
        if (bundle != null && zziqVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzlo zzloVar = ((zzge) this.f3529a).f11783l;
                zzge.d(zzloVar);
                zzloVar.E(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void B(Parcelable[] parcelableArr, int i10, boolean z10) {
        Preconditions.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (b0(str) && !j0(str, zzhc.f11807d) && (i11 = i11 + 1) > i10) {
                    Object obj = this.f3529a;
                    if (z10) {
                        zzge zzgeVar = (zzge) obj;
                        zzeu zzeuVar = zzgeVar.f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11714h.c(zzgeVar.f11784m.e(str), "Param can't contain more than " + i10 + " item-scoped custom parameters", zzgeVar.f11784m.b(bundle));
                        g0(28, bundle);
                    } else {
                        zzge zzgeVar2 = (zzge) obj;
                        zzeu zzeuVar2 = zzgeVar2.f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11714h.c(zzgeVar2.f11784m.e(str), "Param cannot contain item-scoped custom parameters", zzgeVar2.f11784m.b(bundle));
                        g0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void C(zzev zzevVar, int i10) {
        Bundle bundle = zzevVar.f11723d;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (b0(str) && (i11 = i11 + 1) > i10) {
                String g10 = a.g("Event can't contain more than ", i10, " params");
                zzge zzgeVar = (zzge) this.f3529a;
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11714h.c(zzgeVar.f11784m.d(zzevVar.f11721a), g10, zzgeVar.f11784m.b(bundle));
                g0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void E(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            Object obj2 = this.f3529a;
            zzeu zzeuVar = ((zzge) obj2).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11717k.c(((zzge) obj2).f11784m.e(str), "Not putting event parameter. Invalid value type. name, type", str2);
        }
    }

    public final void F(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void G(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void H(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void I(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void J(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void K(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void L(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlo.M(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final boolean N(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        Object obj = this.f3529a;
        if (!isEmpty) {
            Preconditions.j(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                zzge zzgeVar = (zzge) obj;
                if (TextUtils.isEmpty(zzgeVar.f11774b)) {
                    zzeu zzeuVar = zzgeVar.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11714h.b(zzeu.v(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            Preconditions.j(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11714h.b(zzeu.v(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        } else {
            zzge zzgeVar2 = (zzge) obj;
            if (TextUtils.isEmpty(zzgeVar2.f11774b)) {
                zzeu zzeuVar3 = zzgeVar2.f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11714h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean O(int i10, String str, String str2) {
        Object obj = this.f3529a;
        if (str2 == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11714h.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i10) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11714h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int P(java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlo.P(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final void Q() {
        m();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.a("Utils falling back to Random for random id");
            }
        }
        this.f11917d.set(nextLong);
    }

    public final boolean R(String str, String[] strArr, String[] strArr2, String str2) {
        Object obj = this.f3529a;
        if (str2 == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11714h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f11915g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                zzeu zzeuVar2 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11714h.c(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr != null && j0(str2, strArr)) {
            if (strArr2 == null || !j0(str2, strArr2)) {
                zzeu zzeuVar3 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11714h.c(str, "Name is reserved. Type, name", str2);
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean S(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11717k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean T(String str, String str2) {
        Object obj = this.f3529a;
        if (str2 == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11714h.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11714h.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    zzeu zzeuVar3 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11714h.c(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    zzeu zzeuVar4 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar4);
                    zzeuVar4.f11714h.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean U(String str, String str2) {
        Object obj = this.f3529a;
        if (str2 == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11714h.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11714h.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzeu zzeuVar3 = ((zzge) obj).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11714h.c(str, "Name must start with a letter. Type, name", str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    zzeu zzeuVar4 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar4);
                    zzeuVar4.f11714h.c(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean V(String str) {
        m();
        zzge zzgeVar = (zzge) this.f3529a;
        if (Wrappers.a(zzgeVar.f11773a).f11391a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.b(str, "Permission not granted");
        return false;
    }

    public final boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzge zzgeVar = (zzge) this.f3529a;
        String n10 = zzgeVar.f11778g.n("debug.firebase.analytics.app");
        zzgeVar.getClass();
        return n10.equals(str);
    }

    @VisibleForTesting
    public final boolean Y(Context context, String str) {
        Signature[] signatureArr;
        Object obj = this.f3529a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c = Wrappers.a(context).c(64, str);
            if (c != null && (signatureArr = c.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.b(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11712f.b(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean Z(int i10) {
        Boolean bool = ((zzge) this.f3529a).o().f11859e;
        if (p0() < i10 / 1000 && (bool == null || bool.booleanValue())) {
            return false;
        }
        return true;
    }

    public final int h0(String str) {
        boolean equals = "_ldl".equals(str);
        Object obj = this.f3529a;
        if (equals) {
            ((zzge) obj).getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            ((zzge) obj).getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            ((zzge) obj).getClass();
            return 100;
        } else {
            ((zzge) obj).getClass();
            return 36;
        }
    }

    public final Object i0(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        long j10;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                return Long.valueOf(j10);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle t02 = t0((Bundle) parcelable);
                            if (!t02.isEmpty()) {
                                arrayList.add(t02);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return t(i10, obj.toString(), z10);
            }
        }
        return obj;
    }

    public final int k0(Object obj, String str) {
        boolean S;
        if ("_ldl".equals(str)) {
            S = S("user property referrer", str, h0(str), obj);
        } else {
            S = S("user property", str, h0(str), obj);
        }
        if (S) {
            return 0;
        }
        return 7;
    }

    public final int l0(String str) {
        if (!T("event", str)) {
            return 2;
        }
        if (!R("event", zzhb.f11802a, zzhb.f11803b, str)) {
            return 13;
        }
        ((zzge) this.f3529a).getClass();
        if (!O(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    public final int m0(String str) {
        if (!T("event param", str)) {
            return 3;
        }
        if (!R("event param", null, null, str)) {
            return 14;
        }
        ((zzge) this.f3529a).getClass();
        if (!O(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    @Override // a8.l0
    public final boolean n() {
        return true;
    }

    public final int n0(String str) {
        if (!U("event param", str)) {
            return 3;
        }
        if (!R("event param", null, null, str)) {
            return 14;
        }
        ((zzge) this.f3529a).getClass();
        if (!O(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int o0(String str) {
        if (!T("user property", str)) {
            return 6;
        }
        if (!R("user property", zzhd.f11808a, null, str)) {
            return 15;
        }
        ((zzge) this.f3529a).getClass();
        if (!O(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final int p0() {
        if (this.f11919f == null) {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
            Context context = ((zzge) this.f3529a).f11773a;
            googleApiAvailabilityLight.getClass();
            this.f11919f = Integer.valueOf(GoogleApiAvailabilityLight.a(context) / 1000);
        }
        return this.f11919f.intValue();
    }

    public final Object q(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i10 = 256;
        Object obj2 = this.f3529a;
        if (equals) {
            ((zzge) obj2).getClass();
            return i0(256, obj, true, true);
        }
        if (a0(str)) {
            ((zzge) obj2).getClass();
        } else {
            ((zzge) obj2).getClass();
            i10 = 100;
        }
        return i0(i10, obj, false, true);
    }

    public final Object r(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return i0(h0(str), obj, true, false);
        }
        return i0(h0(str), obj, false, false);
    }

    public final long r0() {
        long andIncrement;
        long j10;
        if (this.f11917d.get() == 0) {
            synchronized (this.f11917d) {
                long nanoTime = System.nanoTime();
                ((zzge) this.f3529a).f11785n.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i10 = this.f11918e + 1;
                this.f11918e = i10;
                j10 = nextLong + i10;
            }
            return j10;
        }
        synchronized (this.f11917d) {
            this.f11917d.compareAndSet(-1L, 1L);
            andIncrement = this.f11917d.getAndIncrement();
        }
        return andIncrement;
    }

    public final String s() {
        byte[] bArr = new byte[16];
        v().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Bundle s0(boolean z10, Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("utm_id");
                str6 = uri.getQueryParameter("dclid");
                str7 = uri.getQueryParameter("srsltid");
                if (z10) {
                    str8 = uri.getQueryParameter("sfmc_id");
                } else {
                    str8 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z10 || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(Constants.MEDIUM, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("campaign_id", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("dclid", str6);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("srsltid", str7);
            }
            if (z10 && !TextUtils.isEmpty(str8)) {
                bundle.putString("sfmc_id", str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final Bundle t0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object q5 = q(bundle.get(str), str);
                if (q5 == null) {
                    Object obj = this.f3529a;
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11717k.b(((zzge) obj).f11784m.e(str), "Param value can't be null");
                } else {
                    E(bundle2, str, q5);
                }
            }
        }
        return bundle2;
    }

    public final Bundle u0(String str, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        String str2;
        String str3;
        List list2 = list;
        boolean j02 = j0(str, zzhb.f11804d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            zzge zzgeVar = (zzge) this.f3529a;
            zzlo zzloVar = ((zzge) zzgeVar.f11778g.f3529a).f11783l;
            zzge.d(zzloVar);
            if (zzloVar.Z(201500000)) {
                i10 = 100;
            } else {
                i10 = 25;
            }
            int i12 = i10;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i13 = 0;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i11 = 0;
                } else {
                    if (!z10) {
                        i11 = n0(str4);
                    } else {
                        i11 = 0;
                    }
                    if (i11 == 0) {
                        i11 = m0(str4);
                    }
                }
                if (i11 != 0) {
                    if (i11 == 3) {
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    y(bundle2, i11, str4, str3);
                    bundle2.remove(str4);
                } else {
                    int P = P(str, str4, bundle.get(str4), bundle2, list, z10, j02);
                    if (P == 17) {
                        y(bundle2, 17, str4, Boolean.FALSE);
                    } else if (P != 0 && !"_ev".equals(str4)) {
                        if (P == 21) {
                            str2 = str;
                        } else {
                            str2 = str4;
                        }
                        y(bundle2, P, str2, bundle.get(str4));
                        bundle2.remove(str4);
                    }
                    if (b0(str4)) {
                        int i14 = i13 + 1;
                        if (i14 > i12) {
                            String g10 = a.g("Event can't contain more than ", i12, " params");
                            zzeu zzeuVar = zzgeVar.f11780i;
                            zzge.f(zzeuVar);
                            zzeuVar.f11714h.c(zzgeVar.f11784m.d(str), g10, zzgeVar.f11784m.b(bundle));
                            g0(5, bundle2);
                            bundle2.remove(str4);
                        }
                        i13 = i14;
                    }
                }
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    public final SecureRandom v() {
        m();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final zzaw v0(String str, Bundle bundle, String str2, long j10, boolean z10) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (l0(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle u02 = u0(str, bundle2, Collections.singletonList("_o"), true);
            if (z10) {
                u02 = t0(u02);
            }
            Preconditions.j(u02);
            return new zzaw(str, new zzau(u02), str2, j10);
        }
        zzge zzgeVar = (zzge) this.f3529a;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11712f.b(zzgeVar.f11784m.f(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final void x(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.b(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void y(Bundle bundle, int i10, String str, Object obj) {
        if (g0(i10, bundle)) {
            ((zzge) this.f3529a).getClass();
            bundle.putString("_ev", t(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }
}
