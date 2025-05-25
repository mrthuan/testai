package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1426bj extends KY {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1425bi A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{7, Field.ASK, 48, Field.IMPORT, Field.EQ, 44, 58, 99, Field.AUTONUMOUT, 34, 48, 99, Field.DDE, 44, Field.IMPORT, 99, 32, 34, Field.GLOSSARY, Field.GLOSSARY, Field.ASK, Field.FILLIN, 109, 123, Byte.MAX_VALUE, 124, Field.NOTEREF, Field.AUTOTEXTLIST, Field.ADVANCE, Field.HYPERLINK, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.HYPERLINK, 115, Field.HYPERLINK, Field.TOA, 74, 82, Field.AUTOTEXT, 86, 86, 96, 122, Field.GLOSSARY, 107, 102, 107, 97, Field.DATA, 123, Field.GLOSSARY, 108, 110, 99, 99, Field.GLOSSARY, 107, 106, 124, 123, 125, 96, 118, Field.FILLIN, Field.ASK, Field.GLOSSARY, 105, 96, 125, Field.GLOSSARY, 78, 107, Field.GLOSSARY, 64, 109, 101, 106, 108, 123, 33, Field.GLOSSARY, Field.HTMLCONTROL, 103, 102, 124, Field.GLOSSARY, 98, 110, 118, Field.GLOSSARY, 99, 106, 110, 107, Field.GLOSSARY, 123, 96, Field.GLOSSARY, 99, 106, 110, 100, 102, 97, 104, Field.GLOSSARY, 98, 106, 98, 96, 125, 118, 33, Field.GLOSSARY, Field.SHAPE, 99, 106, 110, 124, 106, Field.QUOTE, Field.GLOSSARY, 110, 99, 120, 110, 118, 124, Field.GLOSSARY, 108, 110, 99, 99, Field.GLOSSARY, 107, 106, 124, 123, 125, 96, 118, Field.FILLIN, Field.ASK, Field.GLOSSARY, 120, 103, 106, 97, Field.GLOSSARY, 118, 96, 122, Field.GLOSSARY, 107, 96, 97, Field.DATA, 123, Field.GLOSSARY, 97, 106, 106, 107, Field.GLOSSARY, 123, 103, 102, 124, Field.GLOSSARY, 78, 107, Field.GLOSSARY, 64, 109, 101, 106, 108, 123, Field.GLOSSARY, 110, 97, 118, Field.GLOSSARY, 98, 96, 125, 106, 33, 56, 41, 48};
    }

    public C1426bj(AbstractC1425bi abstractC1425bi) {
        this.A00 = abstractC1425bi;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        this.A00.A02.A0E().A3G();
        if (this.A00.A00.A6J() == EnumC04821z.A03) {
            return;
        }
        if (!BuildConfigApi.isDebug()) {
            this.A00.A02.A07().AAS(A00(188, 3, 107), C8E.A0Y, new C8F(A00(0, 23, 113)));
        }
        Log.e(A00(23, 17, 15), A00(40, 148, 61));
        this.A00.A08();
    }
}
