package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04550y extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC1484cf A00;
    public InterfaceC04540x A01;
    public C1314Zs A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, Field.SECTIONPAGES, 78, 76, 15, Field.FORMCHECKBOX, 64, Field.SECTIONPAGES, Field.INCLUDETEXT, Field.INCLUDEPICTURE, 78, 78, 74, 15, 64, Field.FILESIZE, 82, 15, Field.INCLUDEPICTURE, 64, Field.AUTOTEXT, Field.AUTOTEXT, Field.INCLUDETEXT, Field.FORMDROPDOWN, 15, Field.SECTIONPAGES, 77, Field.NOTEREF, Field.SECTIONPAGES, 74, Field.INCLUDETEXT, Field.FILESIZE};
    }

    public C04550y(C1314Zs c1314Zs, String str, InterfaceC1484cf interfaceC1484cf, InterfaceC04540x interfaceC04540x) {
        this.A02 = c1314Zs;
        this.A03 = str;
        this.A01 = interfaceC04540x;
        this.A00 = interfaceC1484cf;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        C04972o.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        C04972o.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ABN(this.A00);
        }
    }
}
