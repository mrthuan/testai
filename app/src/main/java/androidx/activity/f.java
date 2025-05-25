package androidx.activity;

import android.database.Cursor;
import android.graphics.Rect;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.room.RoomDatabase;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import km.c;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static long a(km.c cVar, km.a aVar, km.a aVar2) {
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        km.a aVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        if (aVar2.f19875e != 100) {
            String str = aVar2.c;
            ea.a.p("YEUHRTBUQipSRmZPJCA3aRtjWmEyXypuFW9yd1BlAGUTaS8gTiA_", "sR8rHrx0");
            w1.h b10 = w1.h.b(1, ea.a.p("HEV9RTpUFyp6RhhPOCAJaWpjBmExXwxuUm9XdzFlHWVvaVUgRCA_", "uygx4wYo"));
            if (str == null) {
                b10.f(1);
            } else {
                b10.h(1, str);
            }
            RoomDatabase roomDatabase = cVar.f19897a;
            roomDatabase.b();
            Cursor i10 = roomDatabase.i(b10);
            try {
                N = t0.N(i10, ea.a.p("UGgqdDpk", "k5KPYBA6"));
                N2 = t0.N(i10, ea.a.p("PWVcbw1ldGg7dANk", "mhQXFxdk"));
                N3 = t0.N(i10, ea.a.p("JmQ=", "Dg2Xyjxd"));
                N4 = t0.N(i10, ea.a.p("UWkCZTBk", "Jy7ny2MT"));
                N5 = t0.N(i10, ea.a.p("LGhQdC15R2U=", "jQ1vbzTb"));
                N6 = t0.N(i10, ea.a.p("QWUmbwdlJGkeZWRhHWg=", "q6c5blrA"));
                N7 = t0.N(i10, ea.a.p("VWknZSNhFmg=", "zkRydW0i"));
                N8 = t0.N(i10, ea.a.p("KWldZTdhWmU=", "AUBdZLeR"));
                N9 = t0.N(i10, ea.a.p("VWknZSd5EmU=", "0L91d2mh"));
                N10 = t0.N(i10, ea.a.p("VWknZSBpGGU=", "KCLoBqKa"));
                N11 = t0.N(i10, ea.a.p("UGgqdD5lEXMTZ1FUAG1l", "N6peYG5Z"));
                N12 = t0.N(i10, ea.a.p("PG9DdC1hZw==", "UvV1xPPb"));
                N13 = t0.N(i10, ea.a.p("PnVUcw1pWG4OeTpl", "X62JLFFe"));
                hVar = b10;
            } catch (Throwable th2) {
                th = th2;
                hVar = b10;
            }
            try {
                int N14 = t0.N(i10, ea.a.p("PnVUcw1pWG4ZbyR0EG50", "ETiYlUiW"));
                int N15 = t0.N(i10, ea.a.p("QnUucwdpDW4hdFV0ZQ==", "jwHwJ3aB"));
                int N16 = t0.N(i10, ea.a.p("Lm5CdxxyY3kqZQ==", "1VuK2g4K"));
                int N17 = t0.N(i10, ea.a.p("WnMHbxBr", "GBSvhrOd"));
                int N18 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "14dEbE0h"));
                int N19 = t0.N(i10, ea.a.p("KnhFZRdkUmQcaS9sEXM8d28=", "ArZdU3Iy"));
                int N20 = t0.N(i10, ea.a.p("HXg8ZTdkFGQOaQNsUHMDaEplZQ==", "flxHYqQx"));
                int N21 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdPXGU=", "graXsxs1"));
                int N22 = t0.N(i10, ea.a.p("MXgyZRhkCmQBbhJGXWU7ZEtUJW8=", "VHTFvoCf"));
                int N23 = t0.N(i10, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUBnIgZQ==", "MToxDXIu"));
                int N24 = t0.N(i10, ea.a.p("MngHZR9kLWQKbwlsUWE5RlFlPmQ6T1hl", "AmWsqHJx"));
                int N25 = t0.N(i10, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VBJv", "utUyBlne"));
                int N26 = t0.N(i10, ea.a.p("LXgMZR9kM2QKbwlsUWE5RlFlPmQ6VF5yEWU=", "HmHxqVsv"));
                if (i10.moveToFirst()) {
                    aVar3 = new km.a();
                    aVar3.f19872a = i10.getLong(N);
                    aVar3.f19873b = i10.getString(N2);
                    aVar3.c = i10.getString(N3);
                    aVar3.f19874d = i10.getLong(N4);
                    aVar3.f19875e = i10.getInt(N5);
                    aVar3.f19876f = i10.getString(N6);
                    aVar3.f19877g = i10.getString(N7);
                    aVar3.f19878h = i10.getString(N8);
                    aVar3.f19879i = i10.getInt(N9);
                    aVar3.f19880j = i10.getLong(N10);
                    aVar3.f19884n = i10.getLong(N11);
                    aVar3.f19885o = i10.getLong(N12);
                    aVar3.f19887q = i10.getInt(N13);
                    aVar3.f19888r = i10.getString(N14);
                    aVar3.f19889s = i10.getInt(N15);
                    aVar3.f19891u = i10.getInt(N16);
                    boolean z13 = false;
                    if (i10.getInt(N17) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar3.B = z10;
                    aVar3.C = i10.getString(N18);
                    aVar3.D = i10.getString(N19);
                    aVar3.E = i10.getString(N20);
                    aVar3.F = i10.getInt(N21);
                    aVar3.G = i10.getInt(N22);
                    aVar3.H = i10.getInt(N23);
                    if (i10.getInt(N24) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar3.I = z11;
                    if (i10.getInt(N25) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar3.J = z12;
                    if (i10.getInt(N26) != 0) {
                        z13 = true;
                    }
                    aVar3.K = z13;
                } else {
                    aVar3 = null;
                }
                i10.close();
                hVar.i();
                if (aVar3 == null) {
                    roomDatabase.c();
                    try {
                        long c = c(cVar, aVar, aVar2);
                        roomDatabase.j();
                        return c;
                    } finally {
                        roomDatabase.g();
                    }
                }
                String str2 = aVar2.c;
                int i11 = aVar2.f19889s;
                roomDatabase.b();
                c.d dVar = cVar.f19900e;
                b2.e a10 = dVar.a();
                a10.c(1, i11);
                if (str2 == null) {
                    a10.d(2);
                } else {
                    a10.f(2, str2);
                }
                roomDatabase.c();
                try {
                    a10.h();
                    roomDatabase.j();
                    roomDatabase.g();
                    dVar.c(a10);
                    return aVar2.f19874d;
                } catch (Throwable th3) {
                    roomDatabase.g();
                    dVar.c(a10);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                i10.close();
                hVar.i();
                throw th;
            }
        }
        return aVar2.f19874d;
    }

    public static ArrayList b(km.c cVar, long j10) {
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        RoomDatabase roomDatabase;
        int N12;
        w1.h hVar2;
        int N13;
        int N14;
        int N15;
        int N16;
        int N17;
        int N18;
        int N19;
        int N20;
        int N21;
        Iterator it;
        int N22;
        int N23;
        ArrayList arrayList;
        int N24;
        int N25;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ea.a.p("YEUHRTBUQipSRmZPJCA3aRtjWmEyXypuUG9zdzplHGUTZiJsFkkGIE8gCyAoThIgLXN-byVrYz0WMHNBHEROcUZlOHQabwxTBmFAZUk9djJ0MhJPFEQGUhZCCiAhbxx0Z2EsIDJTQw==", "6SRnoJqA");
        w1.h b10 = w1.h.b(1, ea.a.p("EEUWRTtUUSpoRjRPeSA2aWdjOmE9X19uEm9RdzllMGVjZjNsHUkVIHUgWSB1ThMgUXMebyprFj1UMFFBH0RicTZlKXQRbx9TPGESZRQ9dzIIMnJPG0RzUlRCKCAibzB0F2E9IDlTQw==", "luCZxqRz"));
        b10.d(1, j10);
        RoomDatabase roomDatabase2 = cVar.f19897a;
        roomDatabase2.b();
        Cursor i10 = roomDatabase2.i(b10);
        try {
            N = t0.N(i10, ea.a.p("DWgXdAJk", "1XnvKN67"));
            N2 = t0.N(i10, ea.a.p("I2VUbxdlK2gpdC9k", "FJQ9chFb"));
            N3 = t0.N(i10, ea.a.p("BGQ=", "Q4mRcGqX"));
            N4 = t0.N(i10, ea.a.p("L2lbZTBk", "vBI7yLYz"));
            N5 = t0.N(i10, ea.a.p("L2gDdAJ5M2U=", "q3LbVCNE"));
            N6 = t0.N(i10, ea.a.p("N2U4byNlIWkkZTZhQGg=", "9wEUWghu"));
            N7 = t0.N(i10, ea.a.p("F2kLZSFhFmg=", "PPqgqbLu"));
            N8 = t0.N(i10, ea.a.p("KWldZTdhWmU=", "lCTLROlu"));
            N9 = t0.N(i10, ea.a.p("KWldZS15R2U=", "ZB4POFuT"));
            N10 = t0.N(i10, ea.a.p("VWknZSBpGGU=", "yV5yYIX6"));
            N11 = t0.N(i10, ea.a.p("UGgqdD5lEXMTZ1FUAG1l", "5W1zL8CX"));
            roomDatabase = roomDatabase2;
            N12 = t0.N(i10, ea.a.p("PG9DdC1hZw==", "ZXBkz82k"));
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N26 = t0.N(i10, ea.a.p("QnUucwdpDW4meURl", "LAWSP8eR"));
            int N27 = t0.N(i10, ea.a.p("PnVUcw1pWG4ZbyR0EG50", "jNMMQp33"));
            int N28 = t0.N(i10, ea.a.p("PnVUcw1pWG4JdCt0ZQ==", "W2X44hAY"));
            int N29 = t0.N(i10, ea.a.p("Dm45dx9yJXk4ZQ==", "Y2oJzqo3"));
            int N30 = t0.N(i10, ea.a.p("P3MWb1pr", "LLVZ9xfO"));
            int N31 = t0.N(i10, ea.a.p("KnhFZRdkUmQcaS9sEXMnbmU=", "ly4vvxZ4"));
            int N32 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCd28=", "6O7o0aVO"));
            int N33 = t0.N(i10, ea.a.p("KnhFZRdkUmQcaS9sEXM8aEdlZQ==", "c4dblrjm"));
            int N34 = t0.N(i10, ea.a.p("Ang2ZVdkAmQBbhJGXWU7ZEtPPGU=", "U4gB9gqj"));
            int N35 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdURW8=", "5D51qPLd"));
            int N36 = t0.N(i10, ea.a.p("XHghZTlkMWQBbhJGXWU7ZEtUOnIsZQ==", "yd9UWT3Q"));
            int N37 = t0.N(i10, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "DofmXKG2"));
            String str = "KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VBJv";
            int N38 = t0.N(i10, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VBJv", "3nbvC2nZ"));
            int N39 = t0.N(i10, ea.a.p("FHg5ZTtkJmQKbwlsUWE5RlFlPmQ6VF5yEWU=", "dgqMUCnM"));
            ArrayList arrayList2 = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                km.a aVar = new km.a();
                int i11 = N37;
                int i12 = N11;
                aVar.f19872a = i10.getLong(N);
                aVar.f19873b = i10.getString(N2);
                aVar.c = i10.getString(N3);
                aVar.f19874d = i10.getLong(N4);
                aVar.f19875e = i10.getInt(N5);
                aVar.f19876f = i10.getString(N6);
                aVar.f19877g = i10.getString(N7);
                aVar.f19878h = i10.getString(N8);
                aVar.f19879i = i10.getInt(N9);
                aVar.f19880j = i10.getLong(N10);
                int i13 = N;
                int i14 = N2;
                aVar.f19884n = i10.getLong(i12);
                aVar.f19885o = i10.getLong(N12);
                int i15 = N26;
                aVar.f19887q = i10.getInt(i15);
                int i16 = N27;
                aVar.f19888r = i10.getString(i16);
                int i17 = N28;
                aVar.f19889s = i10.getInt(i17);
                N28 = i17;
                int i18 = N29;
                aVar.f19891u = i10.getInt(i18);
                int i19 = N30;
                N30 = i19;
                if (i10.getInt(i19) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                aVar.B = z14;
                N29 = i18;
                int i20 = N31;
                aVar.C = i10.getString(i20);
                N31 = i20;
                int i21 = N32;
                aVar.D = i10.getString(i21);
                N32 = i21;
                int i22 = N33;
                aVar.E = i10.getString(i22);
                N33 = i22;
                int i23 = N34;
                aVar.F = i10.getInt(i23);
                N34 = i23;
                int i24 = N35;
                aVar.G = i10.getInt(i24);
                N35 = i24;
                int i25 = N36;
                aVar.H = i10.getInt(i25);
                if (i10.getInt(i11) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                aVar.I = z15;
                int i26 = N38;
                N38 = i26;
                if (i10.getInt(i26) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                aVar.J = z16;
                int i27 = N39;
                N39 = i27;
                if (i10.getInt(i27) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                aVar.K = z17;
                arrayList2.add(aVar);
                N36 = i25;
                N37 = i11;
                N11 = i12;
                N26 = i15;
                N = i13;
                N27 = i16;
                N2 = i14;
            }
            i10.close();
            hVar.i();
            if (arrayList2.size() == 0) {
                return null;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                km.a aVar2 = (km.a) it2.next();
                if (aVar2.f19875e == 100) {
                    aVar2.f19881k = PglCryptUtils.LOAD_SO_FAILED;
                    File file = new File(aVar2.f19877g);
                    if (file.exists() && file.canRead() && file.length() > 0) {
                        aVar2.f19880j = file.length();
                    }
                }
                long j11 = aVar2.f19872a;
                ea.a.p("HEV9RTpUFyp6RhhPOCAJaWphAHMyZRdfAG9cdAFuLCA4aFRyHCBUaDt0A2RVPUg_FUEgRGVpFkwMY1kgWSBoIA==", "TomZc2dX");
                w1.h b11 = w1.h.b(1, ea.a.p("YEUHRTBUQipSRmZPJCA3aRthXHMxZTFfOm9bdBxuRiBEaC5yFiABaBN0fWRJPXY_ZEF8RGZpMEw2Y14gRCACIA==", "Y5y21g0z"));
                b11.d(1, j11);
                roomDatabase.b();
                RoomDatabase roomDatabase3 = roomDatabase;
                Cursor i28 = roomDatabase3.i(b11);
                try {
                    N13 = t0.N(i28, ea.a.p("WmQ=", "121taAdO"));
                    N14 = t0.N(i28, ea.a.p("O3lBZQ==", "rGVCcvvl"));
                    N15 = t0.N(i28, ea.a.p("Vm4vSR1kB3g=", "X0BFBjnZ"));
                    N16 = t0.N(i28, ea.a.p("LGhQdDBk", "AccVjssY"));
                    N17 = t0.N(i28, ea.a.p("VWknZTpk", "BT0Eq4fB"));
                    N18 = t0.N(i28, ea.a.p("LG9fdBxudA==", "1YJZRcn2"));
                    N19 = t0.N(i28, ea.a.p("JnMmbw5r", "6cOjm73m"));
                    N20 = t0.N(i28, ea.a.p("Wm0sVxpkFmg=", "gBTx5b7J"));
                    N21 = t0.N(i28, ea.a.p("Wm0sSBZpBWh0", "DdBC5Wcq"));
                    it = it2;
                    N22 = t0.N(i28, ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "xGgIkP0c"));
                    N23 = t0.N(i28, ea.a.p("Cng_ZQhkNWQOaQNsUHMDd28=", "dOoKfPy7"));
                    arrayList = arrayList2;
                    N24 = t0.N(i28, ea.a.p("KXgwZTpkB2QOaQNsUHMDaEplZQ==", "XHLDTbFH"));
                    N25 = t0.N(i28, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZPAGU=", "gdCGbhW3"));
                    hVar2 = b11;
                } catch (Throwable th3) {
                    th = th3;
                    hVar2 = b11;
                }
                try {
                    int N40 = t0.N(i28, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUGW8=", "Nihtr3RT"));
                    int N41 = t0.N(i28, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "iq0zvzHz"));
                    int N42 = t0.N(i28, ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1Ty1l", "ap7bEamL"));
                    String str2 = str;
                    str = str2;
                    int N43 = t0.N(i28, ea.a.p(str2, "xZVbZOTW"));
                    int N44 = t0.N(i28, ea.a.p("E3gBZThkK2QKbwlsUWE5RlFlPmQ6VF5yEWU=", "yDvuVNqx"));
                    ArrayList arrayList3 = new ArrayList(i28.getCount());
                    while (i28.moveToNext()) {
                        AIAnswerContent aIAnswerContent = new AIAnswerContent(i28.getLong(N16), i28.getLong(N17), i28.getString(N18), i28.getInt(N20), i28.getInt(N21), i28.getInt(N14));
                        int i29 = N16;
                        int i30 = N17;
                        aIAnswerContent.setId(i28.getLong(N13));
                        aIAnswerContent.setEndIndex(i28.getInt(N15));
                        if (i28.getInt(N19) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        aIAnswerContent.setLock(z10);
                        aIAnswerContent.setExtendedFieldsOne(i28.getString(N22));
                        aIAnswerContent.setExtendedFieldsTwo(i28.getString(N23));
                        aIAnswerContent.setExtendedFieldsThree(i28.getString(N24));
                        aIAnswerContent.setExtendedIntFieldsOne(i28.getInt(N25));
                        int i31 = N40;
                        aIAnswerContent.setExtendedIntFieldsTwo(i28.getInt(i31));
                        int i32 = N22;
                        int i33 = N41;
                        aIAnswerContent.setExtendedIntFieldsThree(i28.getInt(i33));
                        int i34 = N42;
                        N42 = i34;
                        if (i28.getInt(i34) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        aIAnswerContent.setExtendedBooleanFieldsOne(z11);
                        int i35 = N43;
                        N43 = i35;
                        if (i28.getInt(i35) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        aIAnswerContent.setExtendedBooleanFieldsTwo(z12);
                        int i36 = N44;
                        N44 = i36;
                        if (i28.getInt(i36) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        aIAnswerContent.setExtendedBooleanFieldsThree(z13);
                        arrayList3.add(aIAnswerContent);
                        N41 = i33;
                        N22 = i32;
                        N17 = i30;
                        N40 = i31;
                        N16 = i29;
                    }
                    i28.close();
                    hVar2.i();
                    if (arrayList3.size() > 0) {
                        aVar2.f19893w.addAll(arrayList3);
                    }
                    it2 = it;
                    arrayList2 = arrayList;
                    roomDatabase = roomDatabase3;
                } catch (Throwable th4) {
                    th = th4;
                    i28.close();
                    hVar2.i();
                    throw th;
                }
            }
            return arrayList2;
        } catch (Throwable th5) {
            th = th5;
            i10.close();
            hVar.i();
            throw th;
        }
    }

    public static long c(km.b bVar, km.a aVar, km.a aVar2) {
        km.a aVar3;
        RoomDatabase roomDatabase;
        w1.h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        int N11;
        int N12;
        int N13;
        AIFileEntity aIFileEntity;
        boolean z10;
        boolean z11;
        if (aVar != null) {
            long j10 = aVar.f19874d;
            km.c cVar = (km.c) bVar;
            cVar.getClass();
            ea.a.p("YEUHRTBUQipSRmZPJCA3aRtmW2wjc2N3AWUTZUFpLSAOID8=", "iaaIZ6nB");
            w1.h b10 = w1.h.b(1, ea.a.p("HEV9RTpUFyp6RhhPOCAJaWpmB2wgc0V3C2VEZVhpNCByID8=", "KAKPc6xP"));
            b10.d(1, j10);
            RoomDatabase roomDatabase2 = cVar.f19897a;
            roomDatabase2.b();
            Cursor i10 = roomDatabase2.i(b10);
            try {
                N = t0.N(i10, ea.a.p("WmQ=", "pUk8jX5I"));
                N2 = t0.N(i10, ea.a.p("QWUmbwdlJGkeZWRhHWg=", "2J28naee"));
                N3 = t0.N(i10, ea.a.p("KWldZSlhQ2g=", "iPUAYUXk"));
                N4 = t0.N(i10, ea.a.p("KWldZTdhWmU=", "hDvgF2XM"));
                N5 = t0.N(i10, ea.a.p("VWknZSd5EmU=", "hkg55FOn"));
                N6 = t0.N(i10, ea.a.p("JmENUytvGUghcxJvRnk=", "j7EcCnrt"));
                N7 = t0.N(i10, ea.a.p("UWkAZStpF2U=", "2K7lxmh9"));
                N8 = t0.N(i10, ea.a.p("OnBdbxhkY2k3ZQ==", "UXIgAjDk"));
                N9 = t0.N(i10, ea.a.p("DHgAZVlkM2QOaQNsUHMYbmU=", "b3it7VmF"));
                N10 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCd28=", "5ryq21lE"));
                N11 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCaDZlZQ==", "aJiVgxbq"));
                N12 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdPXGU=", "iWhYAckS"));
                N13 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdURW8=", "SGH7eT0d"));
                hVar = b10;
            } catch (Throwable th2) {
                th = th2;
                hVar = b10;
            }
            try {
                int N14 = t0.N(i10, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "e0LokxZ0"));
                int N15 = t0.N(i10, ea.a.p("PHg5ZSJkUmQKbwlsUWE5RlFlPmQ6T1hl", "nTYML7Ny"));
                int N16 = t0.N(i10, ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRv", "bF2Nh0wi"));
                int N17 = t0.N(i10, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VA1yJmU=", "lllfCiRC"));
                if (i10.moveToFirst()) {
                    aIFileEntity = new AIFileEntity();
                    aIFileEntity.setId(i10.getLong(N));
                    aIFileEntity.setRemoteFilePath(i10.getString(N2));
                    aIFileEntity.setFilePath(i10.getString(N3));
                    aIFileEntity.setFileName(i10.getString(N4));
                    aIFileEntity.setFileType(i10.getInt(N5));
                    aIFileEntity.setCanShowHistory(i10.getInt(N6));
                    aIFileEntity.setFileSize(i10.getLong(N7));
                    aIFileEntity.setUploadTime(i10.getLong(N8));
                    aIFileEntity.setExtendedFieldsOne(i10.getString(N9));
                    aIFileEntity.setExtendedFieldsTwo(i10.getString(N10));
                    aIFileEntity.setExtendedFieldsThree(i10.getString(N11));
                    aIFileEntity.setExtendedIntFieldsOne(i10.getInt(N12));
                    aIFileEntity.setExtendedIntFieldsTwo(i10.getInt(N13));
                    aIFileEntity.setExtendedIntFieldsThree(i10.getInt(N14));
                    boolean z12 = false;
                    if (i10.getInt(N15) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aIFileEntity.setExtendedBooleanFieldsOne(z10);
                    if (i10.getInt(N16) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aIFileEntity.setExtendedBooleanFieldsTwo(z11);
                    if (i10.getInt(N17) != 0) {
                        z12 = true;
                    }
                    aIFileEntity.setExtendedBooleanFieldsThree(z12);
                } else {
                    aIFileEntity = null;
                }
                i10.close();
                hVar.i();
                if (aIFileEntity == null) {
                    AIFileEntity aIFileEntity2 = new AIFileEntity();
                    aIFileEntity2.setFilePath(aVar.f19877g);
                    aIFileEntity2.setFileName(aVar.f19878h);
                    aIFileEntity2.setFileType(aVar.f19879i);
                    aIFileEntity2.setFileSize(aVar.f19880j);
                    aIFileEntity2.setUploadTime(aVar.f19884n);
                    aIFileEntity2.setId(aVar.f19874d);
                    roomDatabase = cVar.f19897a;
                    roomDatabase.b();
                    roomDatabase.c();
                    try {
                        long f10 = cVar.f19898b.f(aIFileEntity2);
                        roomDatabase.j();
                        roomDatabase.g();
                        aVar.f19874d = f10;
                        aVar3 = aVar2;
                        aVar3.f19874d = f10;
                        roomDatabase = cVar.f19897a;
                        roomDatabase.b();
                        roomDatabase.c();
                        try {
                            long f11 = cVar.c.f(aVar);
                            roomDatabase.j();
                            roomDatabase.g();
                            aVar.f19872a = f11;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    aVar3 = aVar2;
                    aVar3.f19874d = aVar.f19874d;
                }
            } catch (Throwable th3) {
                th = th3;
                i10.close();
                hVar.i();
                throw th;
            }
        } else {
            aVar3 = aVar2;
        }
        if (aVar3.f19875e != 100) {
            km.c cVar2 = (km.c) bVar;
            roomDatabase = cVar2.f19897a;
            roomDatabase.b();
            roomDatabase.c();
            try {
                long f12 = cVar2.c.f(aVar3);
                roomDatabase.j();
                roomDatabase.g();
                aVar3.f19872a = f12;
                int i11 = aVar3.f19875e;
                roomDatabase = cVar2.f19897a;
                if (i11 == 102) {
                    long j11 = aVar3.f19874d;
                    roomDatabase.b();
                    c.h hVar2 = cVar2.f19904i;
                    b2.e a10 = hVar2.a();
                    a10.c(1, j11);
                    roomDatabase.c();
                    try {
                        a10.h();
                        roomDatabase.j();
                    } finally {
                        roomDatabase.g();
                        hVar2.c(a10);
                    }
                }
                ArrayList arrayList = aVar3.f19893w;
                if (arrayList != null && !arrayList.isEmpty()) {
                    AIAnswerContent aIAnswerContent = (AIAnswerContent) androidx.appcompat.view.menu.d.b(arrayList, 1);
                    aIAnswerContent.setChatId(f12);
                    aIAnswerContent.setFileId(aVar3.f19874d);
                    roomDatabase.b();
                    roomDatabase.c();
                    try {
                        long f13 = cVar2.f19899d.f(aIAnswerContent);
                        roomDatabase.j();
                        roomDatabase.g();
                        aIAnswerContent.setId(f13);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return aVar3.f19874d;
    }

    public static void d(km.c cVar, AIAnswerContent aIAnswerContent) {
        RoomDatabase roomDatabase = cVar.f19897a;
        roomDatabase.b();
        c.e eVar = cVar.f19901f;
        b2.e a10 = eVar.a();
        roomDatabase.c();
        try {
            a10.h();
            roomDatabase.j();
            roomDatabase.g();
            eVar.c(a10);
            roomDatabase.b();
            c.f fVar = cVar.f19902g;
            b2.e a11 = fVar.a();
            roomDatabase.c();
            try {
                a11.h();
                roomDatabase.j();
                if (aIAnswerContent != null) {
                    int endIndex = aIAnswerContent.getEndIndex();
                    long id2 = aIAnswerContent.getId();
                    roomDatabase.b();
                    c.g gVar = cVar.f19903h;
                    b2.e a12 = gVar.a();
                    a12.c(1, endIndex);
                    a12.c(2, id2);
                    roomDatabase.c();
                    try {
                        a12.h();
                        roomDatabase.j();
                    } finally {
                        roomDatabase.g();
                        gVar.c(a12);
                    }
                }
            } finally {
                roomDatabase.g();
                fVar.c(a11);
            }
        } catch (Throwable th2) {
            roomDatabase.g();
            eVar.c(a10);
            throw th2;
        }
    }

    public static double e(double d10, double d11, double d12, double d13) {
        return ((d10 - d11) * d12) + d13;
    }

    public static int f(float f10, float f11, PathHolder pathHolder, float f12, Rect rect) {
        pathHolder.lineTo(f12, f10 - f11);
        return rect.centerX();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static int h(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static View i(ViewGroup viewGroup, int i10, ViewGroup viewGroup2, boolean z10) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup2, z10);
    }

    public static RuntimeException j(int i10, String str) {
        Process.killProcess(Process.myPid());
        System.exit(i10);
        return new RuntimeException(str);
    }

    public static String k(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb2, int i10, char c) {
        sb2.append(i10);
        sb2.append(c);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static /* synthetic */ Iterator p() {
        try {
            return Arrays.asList(new kotlinx.coroutines.android.b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static void q(String str, String str2, dp.a aVar) {
        String p10 = ea.a.p(str, str2);
        aVar.getClass();
        dp.a.c(p10);
    }

    public static void r(ExtendedFormatRecord extendedFormatRecord, short s4, short s10, short s11, short s12) {
        extendedFormatRecord.setIndentionOptions(s4);
        extendedFormatRecord.setBorderOptions(s10);
        extendedFormatRecord.setPaletteOptions(s11);
        extendedFormatRecord.setAdtlPaletteOptions(s12);
    }
}
