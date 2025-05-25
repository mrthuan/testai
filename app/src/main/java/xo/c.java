package xo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathDataBase;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: SignCreateView.java */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SignCreateView f31896a;

    public c(SignCreateView signCreateView) {
        this.f31896a = signCreateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
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
        boolean z10;
        pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d dVar;
        boolean z11;
        boolean z12;
        boolean z13;
        if (g3.b.f17513b == null) {
            g3.b.f17513b = new g3.b(7);
        }
        pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d dVar2 = (pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d) ((SignPathDataBase) g3.b.f17513b.f17514a).k();
        dVar2.getClass();
        ea.a.p("HEV9RTpUFyp6RhhPOCAYZFNfHWkibhYgIXIIZQogMHlvaVUgHWVEYw==", "YKWKNlxR");
        w1.h b10 = w1.h.b(0, ea.a.p("HEV9RTpUFyp6RhhPOCAYZFNfHWkibhYgCnIjZSMgC3lvaVUgHWVEYw==", "LpgteGQi"));
        RoomDatabase roomDatabase = dVar2.f28510a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            N = t0.N(i10, ea.a.p("JmQ=", "xPBIQnJ4"));
            N2 = t0.N(i10, ea.a.p("AmkJZWdhA2g=", "qCde7wAH"));
            N3 = t0.N(i10, ea.a.p("UG8nb3I=", "3XYw25Oj"));
            N4 = t0.N(i10, ea.a.p("QGkxZQ==", "H5pMcrcd"));
            N5 = t0.N(i10, ea.a.p("I2lddGg=", "FZT9IOtF"));
            N6 = t0.N(i10, ea.a.p("J2VYZxF0", "T4yCDVco"));
            N7 = t0.N(i10, ea.a.p("QGksbiNhFmg7blJvJWkldA==", "Xwj2FE51"));
            N8 = t0.N(i10, ea.a.p("IHRZZQtTQ3IVbmU=", "2NuRrIOk"));
            N9 = t0.N(i10, ea.a.p("XHQjZQFTFnImd28=", "z6akySx6"));
            N10 = t0.N(i10, ea.a.p("XHQjZQFTFnImaEZlZQ==", "E0D93EEO"));
            N11 = t0.N(i10, ea.a.p("DHRZZQhTQ3IJbGw=", "Uwc1z7DW"));
            N12 = t0.N(i10, ea.a.p("XHQjZQFCDW8eT1pl", "O0ou62tl"));
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N13 = t0.N(i10, ea.a.p("P3QgZTBCHm8kVBFv", "MNPHBqje"));
            int N14 = t0.N(i10, ea.a.p("IHRZZQtCWG82VCJyEGU=", "h4kUL6nT"));
            int N15 = t0.N(i10, ea.a.p("IHRZZQtCWG82RiV1cg==", "c8b1ti3g"));
            int N16 = t0.N(i10, ea.a.p("IHRZZQtJWXQVbmU=", "EpmPuuyJ"));
            int N17 = t0.N(i10, ea.a.p("XHQjZQFJDHQmd28=", "Omv30PDL"));
            int N18 = t0.N(i10, ea.a.p("AnQGZTpJLHQcaBRlZQ==", "sfmnHBWx"));
            int N19 = t0.N(i10, ea.a.p("IHRZZQtJWXQcbz9y", "hNKelMtr"));
            ArrayList arrayList = new ArrayList(i10.getCount());
            while (i10.moveToNext()) {
                SignPathActionInfo signPathActionInfo = new SignPathActionInfo();
                int i11 = N11;
                ArrayList arrayList2 = arrayList;
                signPathActionInfo.setId(i10.getLong(N));
                signPathActionInfo.setFilePath(i10.getString(N2));
                signPathActionInfo.setColor(i10.getInt(N3));
                signPathActionInfo.setSize(i10.getInt(N4));
                signPathActionInfo.setWidth(i10.getInt(N5));
                signPathActionInfo.setHeight(i10.getInt(N6));
                String string = i10.getString(N7);
                dVar2.c.getClass();
                signPathActionInfo.setSignPathInfoList(pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.e.a(string));
                signPathActionInfo.setOtherStrOne(i10.getString(N8));
                signPathActionInfo.setOtherStrTwo(i10.getString(N9));
                signPathActionInfo.setOtherStrThree(i10.getString(N10));
                N11 = i11;
                signPathActionInfo.setOtherStrAll(i10.getString(N11));
                if (i10.getInt(N12) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                signPathActionInfo.setOtherBoolOne(z10);
                int i12 = N13;
                if (i10.getInt(i12) != 0) {
                    dVar = dVar2;
                    z11 = true;
                } else {
                    dVar = dVar2;
                    z11 = false;
                }
                signPathActionInfo.setOtherBoolTwo(z11);
                int i13 = N14;
                if (i10.getInt(i13) != 0) {
                    N14 = i13;
                    z12 = true;
                } else {
                    N14 = i13;
                    z12 = false;
                }
                signPathActionInfo.setOtherBoolThree(z12);
                int i14 = N15;
                if (i10.getInt(i14) != 0) {
                    N15 = i14;
                    z13 = true;
                } else {
                    N15 = i14;
                    z13 = false;
                }
                signPathActionInfo.setOtherBoolFour(z13);
                int i15 = N16;
                int i16 = N12;
                signPathActionInfo.setOtherIntOne(i10.getInt(i15));
                int i17 = N17;
                signPathActionInfo.setOtherIntTwo(i10.getInt(i17));
                int i18 = N18;
                signPathActionInfo.setOtherIntThree(i10.getInt(i18));
                int i19 = N19;
                signPathActionInfo.setOtherIntFour(i10.getInt(i19));
                arrayList2.add(signPathActionInfo);
                arrayList = arrayList2;
                dVar2 = dVar;
                N13 = i12;
                N19 = i19;
                N12 = i16;
                N16 = i15;
                N17 = i17;
                N18 = i18;
            }
            ArrayList arrayList3 = arrayList;
            i10.close();
            hVar.i();
            boolean isEmpty = arrayList3.isEmpty();
            SignCreateView signCreateView = this.f31896a;
            if (!isEmpty) {
                int i20 = SignCreateView.f28437d;
                signCreateView.getClass();
                w0.a().f28791b.execute(new e(signCreateView, arrayList3));
                return;
            }
            int i21 = SignCreateView.f28437d;
            signCreateView.getClass();
            w0.a().f28791b.execute(new d(signCreateView));
        } catch (Throwable th3) {
            th = th3;
            i10.close();
            hVar.i();
            throw th;
        }
    }
}
