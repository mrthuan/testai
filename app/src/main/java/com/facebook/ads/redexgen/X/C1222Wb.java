package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1222Wb implements C2I {
    public static C1222Wb A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, C0888Iz> A00 = new LinkedHashMap<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, Field.ADDRESSBLOCK, Field.FORMTEXT, 76, Field.INCLUDETEXT, 77, Field.CONTROL, 77, 80, Field.BIDIOUTLINE, Field.LISTNUM, Field.TOA, Field.HTMLCONTROL, Field.CONTROL, Field.INCLUDEPICTURE, 77, Field.ADDIN, 6, Field.FILLIN, Field.EQ, Field.AUTONUM, 48, Field.DDE, 59, Field.FILLIN, Field.ASK, 98, 3, Field.ASK, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = C1222Wb.class.getSimpleName();
    }

    public static C1222Wb A00() {
        if (A01 == null) {
            A01 = new C1222Wb();
        }
        return A01;
    }

    public final AnonymousClass22 A03(String str) {
        C0888Iz adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) != strArr[2].charAt(31)) {
            String[] strArr2 = A03;
            strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
            strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
            return null;
        }
        throw new RuntimeException();
    }

    public final C0888Iz A04(String str) {
        return this.A00.get(str);
    }

    public final C0888Iz A05(String str, Messenger messenger, String str2) {
        C0888Iz c0888Iz = new C0888Iz(str, messenger, str2);
        this.A00.put(str, c0888Iz);
        return c0888Iz;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C0888Iz>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                AnonymousClass22 anonymousClass22 = it.next().getValue().A00;
                if (anonymousClass22 != null) {
                    anonymousClass22.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i10, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i10);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C0888Iz c0888Iz = this.A00.get(str);
        if (c0888Iz != null && c0888Iz.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            c0888Iz.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final void ACk(int i10, String str, Bundle bundle) {
        C0888Iz adRecord = A04(str);
        if (adRecord != null) {
            A07(i10, str, bundle, adRecord.A01);
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, C0888Iz> entry : this.A00.entrySet()) {
            C0888Iz value = entry.getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A02);
            }
        }
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((String) it.next());
            } else {
                return;
            }
        }
    }
}
