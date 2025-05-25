package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class PW extends WebChromeClient {
    public static byte[] A01;
    public static String[] A02 = {"hD342XNQVEXChvJ41FuJYkzzL30E7V8C", "VFqqxEswv4BXF4BUDT4NnG4IAUyY785", "G3ZSvK9EmqC1e5u7Ivg7hdOkIQzdfa68", "vFWJ81dDNXk", "PGv8G8TosU31EXJAVb0WhvumqcSTUHDE", "JPUBUdUfGKDjW9Qe8mrAO5frWlzvQ1oz", "qcwfoFOZSGXVTY97XWLRaEh5jd9GG5ia", "FIykCHI4yyfel4YrSgGCK0Zn6vKmeZ"};
    public final /* synthetic */ C1041Pb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{64, Field.FILESIZE, Field.SECTIONPAGES, Field.TOA, 98, Field.AUTOTEXTLIST, Field.SECTION, 78, Field.TOA, Field.GREETINGLINE, Field.FILLIN, Field.GLOSSARY, Field.SYMBOL, Field.SYMBOL, 43, Field.DDE, Field.GLOSSARY, 118, 106, 112, 119, 102, 96, 76, 97};
    }

    static {
        A01();
    }

    public PW(C1041Pb c1041Pb) {
        this.A00 = c1041Pb;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        JF jf2;
        PO po2;
        C1314Zs c1314Zs;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 124), consoleMessage.message());
                jSONObject.put(A00(0, 10, 26), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 51), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            jf2 = this.A00.A0D;
            jf2.A04(JE.A0N, null);
            po2 = this.A00.A0E;
            po2.A04(C8E.A14, jSONObject2);
            c1314Zs = this.A00.A0B;
            c1314Zs.A0E().A5g(jSONObject2);
        }
        boolean onConsoleMessage = super.onConsoleMessage(consoleMessage);
        if (A02[5].charAt(17) != '8') {
            A02[3] = "bhT1kVUsfNz";
            return onConsoleMessage;
        }
        throw new RuntimeException();
    }
}
