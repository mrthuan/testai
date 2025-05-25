package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Kq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0928Kq {
    public static byte[] A00;
    public static String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1314Zs> A06;
    public static final AtomicReference<InterfaceC0935Kz> A07;
    public static final AtomicReference<L1> A08;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{Field.AUTOTEXTLIST, Field.AUTONUM, Field.MACROBUTTON, Field.SYMBOL, 32, Field.DATA, Field.AUTONUM, Field.MACROBUTTON, Field.DATA, 56, Field.AUTONUMLGL, 61, Field.DATA, Field.USERADDRESS, Field.MACROBUTTON, Field.DATA, 60, Field.GOTOBUTTON, Field.DDEAUTO, Field.SYMBOL, 86, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, 64, Field.NOTEREF, Field.HYPERLINK, Field.FILESIZE, Field.GREETINGLINE, 80, Field.GREETINGLINE, Field.AUTOTEXTLIST, 86, Field.HTMLCONTROL, Field.NOTEREF, 82, Field.AUTOTEXT, Field.INCLUDEPICTURE, Field.FILESIZE, 86, Field.INCLUDETEXT, 21, 122, Byte.MAX_VALUE, 117, 108, 100, 104, 122, 109, 126, Byte.MAX_VALUE, 100, 104, 111, 122, 111, 126, 100, Byte.MAX_VALUE, 122, 111, 122, Field.MERGESEQ, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, Field.SYMBOL, 23, 21, 2, 41, 3, 2, 31, 26, 26, 21, 36, 24, 23, 18, 30, 21, 15, 36, 15, 20, 16, 30, 21, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, Field.FORMTEXT, 114, 99, 110, 98, 105, 100, 98, Field.TOA, 98, 115, 112, 104, 117, 108, Field.DOCPROPERTY, 98, 106, 104, 115, 98, Field.FORMTEXT, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, Field.INCLUDEPICTURE, 106, 119, Field.CONTROL, 96, 118, 112, 105, 113, 15, 8, 29, 14, 8, 61, 31, 8, 21, 10, 21, 8, 5, 3, 4, 17, 2, 4, Field.EQ, 19, 4, 25, 6, 25, 4, 9, Field.AUTONUM, 31, 2, 34, 21, 3, 5, Field.NUMCHARS, 4};
    }

    static {
        A07();
        A02 = C0928Kq.class.getPackage();
        A04 = A02 + A06(40, 22, 116);
        A03 = A02 + A06(0, 19, 56);
        A05 = A02 + A06(19, 21, 88);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            obtain.recycle();
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 87));
    }

    public static C1314Zs A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1314Zs c1314Zs : A06) {
                String adId = c1314Zs.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c1314Zs;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1314Zs c1314Zs) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1314Zs.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1314Zs.A0E().getId());
        A06.add(c1314Zs);
        return adActivityIntent;
    }

    public static Class A05() {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return Class.forName(A06(113, 59, 72));
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        return AudienceNetworkActivity.class;
    }

    public static void A08(Activity activity, Intent intent) throws C0926Ko {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e10) {
            throw new C0926Ko(e10);
        }
    }

    public static void A09(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A0A(C1314Zs c1314Zs, AdActivityIntent adActivityIntent) throws C0926Ko {
        Context launchContext;
        Context applicationContext = c1314Zs.getApplicationContext();
        if (C0877Im.A2Q(c1314Zs) && (launchContext = c1314Zs.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0J(c1314Zs, adActivityIntent)) {
                    c1314Zs.A0E().AFT();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e10) {
            throw new C0926Ko(e10);
        }
    }

    public static boolean A0B(Intent intent, Set<String> set) {
        Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        String uri = intentUri.toString();
        Iterator<String> it = set.iterator();
        do {
            boolean hasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!hasNext) {
                return false;
            }
        } while (!uri.startsWith(it.next()));
        return true;
    }

    public static boolean A0C(C1314Zs c1314Zs, Intent intent) throws C0926Ko {
        A07.get();
        return A0G(c1314Zs, intent, null);
    }

    public static boolean A0D(C1314Zs c1314Zs, Intent intent) throws C0926Ko {
        A07.get();
        if (0 != 0) {
            Activity A0D = c1314Zs.A0D();
            if (A01[7].length() == 30) {
                throw new RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (A0D != null) {
                c1314Zs.A0B();
                try {
                    c1314Zs.A0D();
                    throw new NullPointerException(A06(203, 22, 63));
                } catch (ActivityNotFoundException e10) {
                    throw new C0926Ko(e10);
                } catch (Exception e11) {
                    c1314Zs.A07().AA0(A06(90, 8, 57), C8E.A07, new C8F(e11));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0E(C1314Zs c1314Zs, Intent intent) throws C0926Ko {
        return A0F(c1314Zs, A00(intent), -1);
    }

    public static boolean A0F(C1314Zs c1314Zs, Intent intent, int i10) throws C0926Ko {
        try {
            Activity currentActivity = ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1314Zs.A0D();
            }
            if (currentActivity != null) {
                if (i10 >= 0) {
                    currentActivity.startActivityForResult(intent, i10);
                    return true;
                }
                currentActivity.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException e10) {
            throw new C0926Ko(e10);
        }
    }

    public static boolean A0G(C1314Zs c1314Zs, Intent intent, InterfaceC0935Kz interfaceC0935Kz) throws C0926Ko {
        if (A0B(intent, C0877Im.A0X(c1314Zs))) {
            return false;
        }
        Context context = c1314Zs;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            Context startContext = c1314Zs.A0D();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (interfaceC0935Kz != null && !A0B(intent, C0877Im.A0Z(c1314Zs))) {
                c1314Zs.A0B();
                try {
                    throw new NullPointerException(A06(190, 13, 51));
                } catch (ActivityNotFoundException e10) {
                    throw new C0926Ko(e10);
                } catch (Exception e11) {
                    c1314Zs.A07().AA0(A06(90, 8, 57), C8E.A08, new C8F(e11));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e12) {
                throw new C0926Ko(e12);
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0H(C1314Zs c1314Zs, Uri uri, String str) throws ActivityNotFoundException {
        A08.get();
        return A0I(c1314Zs, uri, str, null);
    }

    public static boolean A0I(C1314Zs c1314Zs, Uri uri, String str, L1 l12) throws ActivityNotFoundException {
        if (l12 == null || c1314Zs.A0D() == null) {
            return false;
        }
        new Bundle().putString(A06(98, 15, 52), str);
        uri.toString();
        c1314Zs.A0D();
        throw new NullPointerException(A06(ShapeTypes.ACTION_BUTTON_MOVIE, 18, 74));
    }

    public static boolean A0J(C1314Zs c1314Zs, AdActivityIntent adActivityIntent) throws C0926Ko {
        return A0F(c1314Zs, A00(adActivityIntent), 0);
    }
}
