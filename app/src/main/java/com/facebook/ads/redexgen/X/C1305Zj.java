package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1305Zj extends KY {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7j A01;
    public final /* synthetic */ AnonymousClass87 A02;
    public final /* synthetic */ C8F A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{115, -97, -64, -67, -48, -62, 123, -66, -51, -68, -50, -61, 123, -67, -64, -66, -68, -48, -50, -64, 123, -50, -96, -55, -47, -60, -51, -54, -55, -56, -64, -55, -49, -97, -68, -49, -68, -85, -51, -54, -47, -60, -65, -64, -51, 123, -55, -54, -49, 123, -60, -55, -59, -64, -66, -49, -64, -65, 113, -121, -116, -119, Field.USERADDRESS, -121, -111, Field.USERADDRESS, -116, -109, -118, -118, Field.BARCODE, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, Byte.MAX_VALUE, 116, 117, Byte.MAX_VALUE, 120, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, 120, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, -59, -72, -60, -56, -72, -58, -57, -78, -68, -73, -115, -113, 124, -114, -109, -118, Byte.MAX_VALUE, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C1305Zj(C7j c7j, String str, int i10, C8F c8f, AnonymousClass87 anonymousClass87) {
        this.A01 = c7j;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c8f;
        this.A02 = anonymousClass87;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        String str;
        Map<String, String> A59;
        String A7d;
        AtomicReference atomicReference;
        try {
            if (AnonymousClass88.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            JI.A08(this.A01, JA.A0A.toString() + A00(0, 1, 50) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = AbstractC0947Ll.A03(this.A01, cause);
            } else if (Io.A0R(this.A01)) {
                C7j c7j = this.A01;
                Throwable deLogExceptionCause = this.A03;
                str = AbstractC0947Ll.A03(c7j, deLogExceptionCause);
            } else {
                str = A00(0, 0, 81) + this.A03.getMessage();
            }
            if (Io.A0V(this.A01)) {
                A59 = this.A01.A03().A59();
            } else if (this.A02 != null) {
                A59 = this.A02.A7L();
            } else if (AnonymousClass88.A02) {
                AnonymousClass88.A0F(new RuntimeException(A00(1, 57, 84), this.A03));
                A59 = new HashMap<>();
            } else {
                A59 = this.A01.A03().A59();
            }
            A59.put(A00(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 7, 19), this.A04);
            A59.put(A00(ShapeTypes.FLOW_CHART_CONNECTOR, 12, 30), String.valueOf(this.A00));
            JSONObject A03 = this.A03.A03();
            if (A03 != null) {
                A59.put(A00(71, 15, 43), A03.toString());
            }
            if ((A00(106, 5, 124).equals(this.A04) || A00(111, 15, 29).equals(this.A04)) && (A7d = this.A01.A03().A7d()) != null) {
                A59.put(A00(86, 20, 12), A7d);
            }
            String A0B = this.A01.A0B();
            if (A0B != null && !TextUtils.isEmpty(A0B)) {
                A59.put(A00(126, 10, 76), A0B);
            }
            atomicReference = AnonymousClass88.A0A;
            AnonymousClass86 anonymousClass86 = (AnonymousClass86) atomicReference.get();
            if (anonymousClass86 == null) {
                AnonymousClass88.A0F(new RuntimeException(A00(58, 13, 23)));
            } else {
                anonymousClass86.AHg(str, A59, this.A01);
            }
        } catch (Throwable t4) {
            AnonymousClass88.A0F(t4);
        }
    }
}
