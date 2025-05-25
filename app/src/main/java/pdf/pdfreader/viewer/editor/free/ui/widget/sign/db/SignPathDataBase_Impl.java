package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

import a2.c;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import w1.g;
import y1.c;

/* loaded from: classes3.dex */
public final class SignPathDataBase_Impl extends SignPathDataBase {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f28506m = 0;

    /* renamed from: l  reason: collision with root package name */
    public volatile d f28507l;

    @Override // androidx.room.RoomDatabase
    public final g e() {
        return new g(this, new HashMap(0), new HashMap(0), ea.a.p("Q2QtXwBpBW5z", "2tTwxbU5"));
    }

    @Override // androidx.room.RoomDatabase
    public final a2.c f(androidx.room.a aVar) {
        androidx.room.c cVar = new androidx.room.c(aVar, new a(), ea.a.p("AGMpMUZiVTJDYQc5C2ZjY304BjJ-OXQ1YThRNlY5JGM=", "RaoAZ3Zk"), ea.a.p("BjhyZEYyAWFDYQA2XDBmN3c0AWJxM3A0STUwNgRkeTg=", "qSbNuekf"));
        Context context = aVar.f4645b;
        if (context != null) {
            return aVar.f4644a.a(new c.b(context, aVar.c, cVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathDataBase
    public final pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.a k() {
        d dVar;
        if (this.f28507l != null) {
            return this.f28507l;
        }
        synchronized (this) {
            if (this.f28507l == null) {
                this.f28507l = new d(this);
            }
            dVar = this.f28507l;
        }
        return dVar;
    }

    /* loaded from: classes3.dex */
    public class a extends c.a {
        public a() {
            super(1);
        }

        @Override // androidx.room.c.a
        public final void a(b2.a aVar) {
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTGFNxYAhkHF9AaSxuAGBCKBJpUGBJSRhUAUd3UmZQEUkBQQNZWEs_WRNBHlQ8SSxDIEV5RSdUdk4LVBJOE0wPLGxgN2kUZSphR2grICdFOlReIFRjBmw5ciQge04SRQRFHiAfTywgNFV_TGcgE3MLehdgFEknVBNHAVISTglUY04ZTB0sWGANaVd0I2BTSSxUN0dxUklOGVRkTmdMCixjYCRlOGcQdBogek4fRTRFMCA8T2AgJ1UaTGggUnMvZy1QLXQ5SRZmFUxacz9gU1QnWCYsFGAGdD5lNlNGcgluJmBsVBRYLCxaYFx0I2UBUxZyJndbYElUE1gQLBJgKXQrZT5TJXIsaAhlVmBrVDZYNixSYFt0AWUkUzByc2wqYGNUCVgFLFhgFXRbZTlCHG8OTxxlVCAgTgJFA0VgIAhPFyACVR1MVCAab0doLnIxbw1sJndbYElJGFQBR3dSZk4MVGxOBEw0LFpgXHQjZQFCDW8eVFxyDGU2IA1OZkUBRREgAk8FIDZVNkwfICtvB2gHcjBvW2wvbyNyJCB7ThJFBEUeIB9PLCA0VX9MZyATbxZoF3J9bh1POGUkIHtOEkUERR4gH08sIDRVf0xnIBNvFmgXcn1uHVQhbyQge04SRQRFHiAfTywgNFV_TGcgE28WaBdyfW4dVD5yIWVSIA9OF0ULRQMgNk8uIH1VB0xfIAJvBmhRciBuIkYrdUBgZkkNVAlHFFJYTjVUE04eTD8p", "LQxz0F6u"));
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTAlNScgdvAl9eYTh0FnI9dBNiWGVJKD9kZEl8VANHBlJ2UCBJJUE9WRNLDllfaQZlHHRddBBfPmE3aBJUA1gXKQ==", "VrhobSWN"));
            aVar.c(ea.a.p("C04URRpUdk8aIDRFZEwWQ30gG04dTxZyG28cXzxhMXQnchh0KWI6ZWgoD2QYaTNlVnQ7dDBfXmEHaFggB0EOVQdTbzR6LHYne2MEMQFiYDIJYWE5K2YDY004RTJpOXU1cTh3NnE5M2NvKQ==", "hfBGHVVQ"));
        }

        @Override // androidx.room.c.a
        public final void b(b2.a aVar) {
            aVar.c(ea.a.p("C1J-UFlUdkIWRWpJMyAtWHxTOlNlYBVkNF8aaShuQmA=", "2nc3RiO1"));
            int i10 = SignPathDataBase_Impl.f28506m;
            SignPathDataBase_Impl signPathDataBase_Impl = SignPathDataBase_Impl.this;
            List<RoomDatabase.b> list = signPathDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    signPathDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void c() {
            int i10 = SignPathDataBase_Impl.f28506m;
            SignPathDataBase_Impl signPathDataBase_Impl = SignPathDataBase_Impl.this;
            List<RoomDatabase.b> list = signPathDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    signPathDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void d(b2.a aVar) {
            SignPathDataBase_Impl signPathDataBase_Impl = SignPathDataBase_Impl.this;
            int i10 = SignPathDataBase_Impl.f28506m;
            signPathDataBase_Impl.f4622a = aVar;
            SignPathDataBase_Impl.this.h(aVar);
            List<RoomDatabase.b> list = SignPathDataBase_Impl.this.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    SignPathDataBase_Impl.this.f4627g.get(i11).a(aVar);
                }
            }
        }

        @Override // androidx.room.c.a
        public final void f(b2.a aVar) {
            y1.b.a(aVar);
        }

        @Override // androidx.room.c.a
        public final c.b g(b2.a aVar) {
            HashMap hashMap = new HashMap(19);
            hashMap.put(ea.a.p("JmQ=", "hjJo41nk"), new c.a(1, ea.a.p("XmQ=", "Kq746shy"), 1, true, ea.a.p("Bk5lRT5FUg==", "RQ1j6jtk"), null));
            hashMap.put(ea.a.p("KWldZSlhQ2g=", "LwUzlWgO"), new c.a(0, ea.a.p("VWknZSNhFmg=", "x0hGuwZK"), 1, false, ea.a.p("Z0UTVA==", "bSeuOKNE"), null));
            hashMap.put(ea.a.p("LG9db3I=", "DRlguNJt"), new c.a(0, ea.a.p("UG8nb3I=", "w0XC336o"), 1, true, ea.a.p("Kk4aRQJFUg==", "zqcNEgeZ"), null));
            hashMap.put(ea.a.p("QGkxZQ==", "p4v0S3y5"), new c.a(0, ea.a.p("QGkxZQ==", "HSeOAoc6"), 1, true, ea.a.p("Bk5lRT5FUg==", "QtbXBI2N"), null));
            hashMap.put(ea.a.p("OGlVdGg=", "6xFp3Osf"), new c.a(0, ea.a.p("RGkvdGg=", "Eg5Bui5C"), 1, true, ea.a.p("ek4fRTRFUg==", "1mgUSTPq"), null));
            hashMap.put(ea.a.p("J2VYZxF0", "uuwvQpYw"), new c.a(0, ea.a.p("GWVbZy10", "tBq2EzEb"), 1, true, ea.a.p("ek4fRTRFUg==", "Qak0N8Vw"), null));
            hashMap.put(ea.a.p("QGksbiNhFmg7blJvJWkldA==", "1ghTy0BS"), new c.a(0, ea.a.p("PGlWbilhQ2gTbixvOWkbdA==", "h3xgjnrx"), 1, false, ea.a.p("G0VpVA==", "BUV3rU6K"), null));
            hashMap.put(ea.a.p("IHRZZQtTQ3IVbmU=", "m6hwmD6E"), new c.a(0, ea.a.p("XHQjZQFTFnI9bmU=", "Usq62X0Y"), 1, false, ea.a.p("Z0UTVA==", "vUpt5i2S"), null));
            hashMap.put(ea.a.p("IHRZZQtTQ3IOd28=", "ClRUxhAQ"), new c.a(0, ea.a.p("IHRZZQtTQ3IOd28=", "Zr2BIhsh"), 1, false, ea.a.p("N0UMVA==", "hzcTJqZ4"), null));
            hashMap.put(ea.a.p("XHQjZQFTFnImaEZlZQ==", "t8ROHSxt"), new c.a(0, ea.a.p("XHQjZQFTFnImaEZlZQ==", "0vcmAF3a"), 1, false, ea.a.p("bUUUVA==", "WB9LyZMU"), null));
            hashMap.put(ea.a.p("IHRZZQtTQ3IbbGw=", "3vMYYrI4"), new c.a(0, ea.a.p("IHRZZQtTQ3IbbGw=", "l6FtTrmw"), 1, false, ea.a.p("Z0UTVA==", "PKsH3c5g"), null));
            hashMap.put(ea.a.p("GXRfZURCWW8kTwhl", "74v766Nx"), new c.a(0, ea.a.p("XHQjZQFCDW8eT1pl", "0Y30CDpo"), 1, true, ea.a.p("Bk5lRT5FUg==", "g8gwOdhf"), null));
            hashMap.put(ea.a.p("XHQjZQFCDW8eVENv", "9hxUuac4"), new c.a(0, ea.a.p("BnQLZUtCAm8kVBFv", "DRic9mNc"), 1, true, ea.a.p("ek4fRTRFUg==", "e6waB0Ig"), null));
            hashMap.put(ea.a.p("IHRZZQtCWG82VCJyEGU=", "gzNpTWGr"), new c.a(0, ea.a.p("XHQ_ZTFCHm8kVA5yUWU=", "GF3WCqEK"), 1, true, ea.a.p("Jk4MRXBFUg==", "7goX7xjF"), null));
            hashMap.put(ea.a.p("IHRZZQtCWG82RiV1cg==", "bkVkI4Pu"), new c.a(0, ea.a.p("IHRZZQtCWG82RiV1cg==", "fGidKuYw"), 1, true, ea.a.p("ek4fRTRFUg==", "13STlAv9"), null));
            hashMap.put(ea.a.p("XHQjZQFJDHQ9bmU=", "Dqhf31Sc"), new c.a(0, ea.a.p("IHRZZQtJWXQVbmU=", "Ttd81pPG"), 1, true, ea.a.p("Bk4FRRVFUg==", "qWOQRjDt"), null));
            hashMap.put(ea.a.p("IHRZZQtJWXQOd28=", "vu2IhndL"), new c.a(0, ea.a.p("IHRZZQtJWXQOd28=", "jtpvLM1B"), 1, true, ea.a.p("Ck5sRR1FUg==", "JiC8ZBi7"), null));
            hashMap.put(ea.a.p("XHQjZQFJDHQmaEZlZQ==", "7rXalgmn"), new c.a(0, ea.a.p("H3RfZRRJJ3QcaBRlZQ==", "fvp7fI7v"), 1, true, ea.a.p("Bk5lRT5FUg==", "QfhEVimN"), null));
            hashMap.put(ea.a.p("JnQ6ZSZJC3QObxNy", "Z9IRTepm"), new c.a(0, ea.a.p("C3Q6ZStJKXQObxNy", "hHdRYG46"), 1, true, ea.a.p("Bk5lRT5FUg==", "bFdI1kY1"), null));
            y1.c cVar = new y1.c(ea.a.p("P2RXXwppUG5z", "3DyPtUbO"), hashMap, new HashSet(0), new HashSet(0));
            y1.c a10 = y1.c.a(aVar, ea.a.p("P2QpXwZpHW5z", "9wOOuzuE"));
            if (!cVar.equals(a10)) {
                return new c.b(false, ea.a.p("Q2QtXwBpBW4BKERkDy4mZCJyV2EiZTEuR2kLdx9yGmVXaT9vAS4EchdlGnUALiFpIGdXdGhzKmdfLgpiVFNdZ11QKnQbQQF0G29aSQdmOSlqChJFPnAmY0VlCjoK", "1nz4jv5S") + cVar + ea.a.p("RSB3bwxuUzoK", "b8kCjjCt") + a10);
            }
            return new c.b(true, null);
        }

        @Override // androidx.room.c.a
        public final void e() {
        }
    }
}
