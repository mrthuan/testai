package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.JavascriptInterface;
import java.util.Arrays;
import javax.annotation.Nullable;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Od  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1017Od {
    public static byte[] A03;
    public static String[] A04 = {"YhJyuYe5vArJMmHzMuaOmLSCLmdqTU9j", "tLzAZeBWVy5iXgZDrdogWSn3", "hJ3d0o6ZZetAls9RrrDnUnn76Lt6Ph0J", "xiAWoJKpfkjoLWhrM4jOgBmrkR74JwPz", "VoY4iRsyTVm9uFdDYrz8WEjEYD2Z3Vra", "M1ZhteGLEXQSShFsqI7vtOn7V", "Vb7qcjlVsUqRs6UGFJep9", "iIqC1fqKcVklIXQ956w4m"};
    public final View.OnClickListener A00;
    public final View A01;
    @Nullable
    public final InterfaceC1016Oc A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{Field.FILESIZE, 115, 102, 113, 122, Field.FORMDROPDOWN, 124, 118, Field.HTMLCONTROL, 124, 97, 102, 115, 126, 126, 101, 110, 121, 110, 124, 108, 125, 102, Byte.MAX_VALUE, 123, Field.AUTONUMLGL, 121, 110, 125, Field.GLOSSARY, 108, 99, 102, 108, 100, Field.FORMTEXT, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 105, 110, 99, 124, 106, Field.AUTONUMOUT, 105, 122, 97, 108, 123, 102, 96, 97, Field.GLOSSARY, 102, 97, 123, 76, 99, 100, Field.FILLIN, 110, 97, 108, 103, 96, 125, 124, Field.ASK, Field.GLOSSARY, 116, 105, 96, 125, Field.FILLIN, 121, 110, 125, Field.GLOSSARY, 102, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, Field.BARCODE, Field.AUTONUMOUT, Field.GLOSSARY, 102, Field.GLOSSARY, Field.MACROBUTTON, Field.GLOSSARY, 110, 97, 108, 103, 96, 125, 124, 33, 99, 106, 97, 104, 123, 103, Field.AUTONUMOUT, Field.GLOSSARY, 102, 36, 36, Field.ASK, Field.GLOSSARY, 116, 121, 110, 125, Field.GLOSSARY, 110, 97, 108, 103, 96, 125, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 110, 97, 108, 103, 96, 125, 124, Field.ADVANCE, 102, 82, Field.AUTONUMOUT, 110, 97, 108, 103, 96, 125, 33, 125, 106, 98, 96, 121, 106, 78, 123, 123, 125, 102, 109, 122, 123, 106, Field.FILLIN, Field.DATA, 101, 124, 110, 108, 123, 102, 96, 97, Field.DATA, Field.ASK, Field.AUTONUMOUT, Field.GLOSSARY, Field.GLOSSARY, Field.GLOSSARY, Field.GLOSSARY, Field.GLOSSARY, Field.GLOSSARY, 110, 97, 108, 103, 96, 125, 33, 96, 97, 108, 99, 102, 108, 100, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 105, 122, 97, 108, 123, 102, 96, 97, Field.FILLIN, Field.ASK, Field.GLOSSARY, 116, Field.HYPERLINK, 110, 123, 108, 103, 78, 97, 107, Field.FORMTEXT, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, Field.FILLIN, Field.ASK, Field.AUTONUMOUT, 114, Field.AUTONUMOUT, 108, 99, 102, 108, 100, Field.FORMTEXT, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 123, 125, 122, 106, Field.AUTONUMOUT, Field.GLOSSARY, 114, Field.GLOSSARY, 114, Field.GLOSSARY, 121, 110, 125, Field.GLOSSARY, 102, 97, 123, 76, 123, 110, Field.FORMTEXT, 107, 124, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, Field.ADVANCE, Field.DATA, Field.FORMTEXT, 105, 74, 108, 122, 106, Field.DATA, Field.QUOTE, Field.GLOSSARY, Field.DATA, Field.AUTOTEXTLIST, 105, Field.SHAPE, Byte.MAX_VALUE, 100, 107, 34, Field.INCLUDEPICTURE, 104, 109, 124, Field.BIDIOUTLINE, 106, Field.GLOSSARY, Field.AUTOTEXTLIST, 105, Field.SHAPE, Byte.MAX_VALUE, 100, 107, 34, Field.INCLUDEPICTURE, 104, 109, 124, Field.BIDIOUTLINE, 106, 34, 64, Field.HYPERLINK, Field.CONTROL, 74, Field.CONTROL, 106, 34, 100, Field.IMPORT, Field.GREETINGLINE, Byte.MAX_VALUE, Field.FILESIZE, Field.DATA, 82, Field.AUTONUMOUT, 105, 96, 125, Field.FILLIN, 121, 110, 125, Field.GLOSSARY, 102, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, Field.BARCODE, Field.AUTONUMOUT, Field.GLOSSARY, 102, Field.GLOSSARY, Field.MACROBUTTON, Field.GLOSSARY, 102, 97, 123, 76, 123, 110, Field.FORMTEXT, 107, 124, 33, 99, 106, 97, 104, 123, 103, Field.AUTONUMOUT, Field.GLOSSARY, 102, 36, 36, Field.ASK, Field.GLOSSARY, 116, Field.GLOSSARY, 102, 97, 123, 76, 99, 100, Field.FILLIN, 107, 96, 108, 122, 98, 106, 97, 123, 33, 104, 106, 123, 74, 99, 106, 98, 106, 97, 123, 124, 77, 118, 76, 99, 110, 124, 124, Field.SECTION, 110, 98, 106, Field.FILLIN, 102, 97, 123, 76, 123, 110, Field.FORMTEXT, 107, 124, Field.ADVANCE, 102, 82, Field.ASK, Field.ASK, Field.AUTONUMOUT, 114, Field.GLOSSARY, 102, 105, Field.GLOSSARY, Field.FILLIN, Field.DDEAUTO, 108, 99, 102, 108, 100, Field.FORMTEXT, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, Field.GLOSSARY, 41, 41, Field.GLOSSARY, 123, 118, Byte.MAX_VALUE, 106, 96, 105, Field.GLOSSARY, Field.HYPERLINK, 110, 123, 108, 103, 78, 97, 107, Field.FORMTEXT, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, Field.FORMTEXT, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, Field.TOA, 110, 102, 99, 106, 107, Field.GLOSSARY, Field.DDEAUTO, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.GLOSSARY, Field.DDE, 122, 97, 107, 106, 105, 102, 97, 106, 107, Field.DDE, Field.ASK, Field.GLOSSARY, 116, Field.HYPERLINK, 110, 123, 108, 103, 78, 97, 107, Field.FORMTEXT, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, Field.FORMTEXT, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, Field.TOA, 110, 102, 99, 106, 107, Field.FILLIN, Field.ASK, Field.AUTONUMOUT, 114};
    }

    static {
        A03();
    }

    public C1017Od(View.OnClickListener onClickListener, View view, @Nullable InterfaceC1016Oc interfaceC1016Oc) {
        this.A00 = onClickListener;
        this.A01 = view;
        this.A02 = interfaceC1016Oc;
    }

    public static String A00() {
        String[] strArr = A04;
        if (strArr[0].charAt(19) != strArr[2].charAt(19)) {
            A04[4] = "xS32wGzeebxJmdkB8qXqbLj70rQzUTrd";
            return A02(15, 560, 19);
        }
        throw new RuntimeException();
    }

    public static String A01() {
        return A02(0, 15, 14);
    }

    @JavascriptInterface
    public void onClick() {
        this.A00.onClick(this.A01);
    }

    @JavascriptInterface
    public void onClickInterceptFailed() {
        if (this.A02 != null) {
            this.A02.ABW();
        }
    }
}
