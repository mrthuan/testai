package pdf.pdfreader.viewer.editor.free.db;

import a2.c;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.c;
import bm.d;
import bm.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import w1.g;
import y1.b;
import y1.c;

/* loaded from: classes3.dex */
public final class ReaderAppDataBase_Impl extends ReaderAppDataBase {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f24214m = 0;

    /* renamed from: l  reason: collision with root package name */
    public volatile e f24215l;

    @Override // androidx.room.RoomDatabase
    public final g e() {
        return new g(this, new HashMap(0), new HashMap(0), ea.a.p("P2RXXx9pW2Vz", "TOe4iVty"));
    }

    @Override // androidx.room.RoomDatabase
    public final c f(androidx.room.a aVar) {
        androidx.room.c cVar = new androidx.room.c(aVar, new a(), ea.a.p("VzJzYkA2W2UXMlI0UWQ1NHM0BmZ3YXZldzRXN2kwQjQ=", "OaYvCxGx"), ea.a.p("djQJMB04UTY_Y3o5RjhcNQ0yVzJ3Y1JhfzZUMkY3ezk=", "MAe3LewC"));
        Context context = aVar.f4645b;
        if (context != null) {
            return aVar.f4644a.a(new c.b(context, aVar.c, cVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // pdf.pdfreader.viewer.editor.free.db.ReaderAppDataBase
    public final d k() {
        e eVar;
        if (this.f24215l != null) {
            return this.f24215l;
        }
        synchronized (this) {
            if (this.f24215l == null) {
                this.f24215l = new e(this);
            }
            eVar = this.f24215l;
        }
        return eVar;
    }

    /* loaded from: classes3.dex */
    public class a extends c.a {
        public a() {
            super(1);
        }

        @Override // androidx.room.c.a
        public final void a(b2.a aVar) {
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTE1NtYAdkNF9VaSdlAGBCKBJpUGBJSRhUAUd3UmZQEUkKQR9ZV0sXWRNBHlQ8SSxDIEV5RSdUdk4LVBJOE0wPLGdgKWEDZTIgek4fRTRFMCA8T2AgJ1UaTGggUmYndixyLnQoYFdJHFR2Rw5SU04tVFJOYUwlLHZgImFEbzRpN2UDYTllFyAbTmdFDEUhICxPJiB6VSVMeiAkblNtI2BjVAJYGSxXYCJhVGUrIDpONkU1RWYgJ08CIApVfkxqICNwJnQlYFdUF1hnLGtgAWUBZRx0VCAgTgJFA0VgIAhPFyAJVQFMWyAyclZjLm4HRAN0F2AUSSdUE0cBUhJOCVRjThJMASxXYCFpSWUrIDpONkU1RWYgJ08CIApVfkxqICN1N2QsdBJBJmATSQVUNkcnUlJOe1RJTgNMCCwSYCl0K2U1UzlyOG43YBNUDlgnLEJgHXRcZRtTInIQd11gZlQGWBMsbWAYdDplQVM_cidoEGUXYBRULFgCLGRgXXQuZTFTM3IMbBtgclR2WB8sU2ANdBplRkIGbzpPKmVSIA9OF0UARR8gOU8GIH1VB0xfIAJvBmhRcitvOWwQd11gZkkNVAJHCFJXTh1UE04eTD8sQmAddFxlG0I5byhUWnIjZSMgDk4ZRTBFACB9Tx8gPVUuTF4gVG8daDNyBm9dbABvNnInIAROI0UVRWEgBU8nICxVPkwYIAlvImghcntuMk8tZScgBE4jRRVFYSAFTycgLFU-TBggCW8iaCFye24yVDRvJyAETiNFFUVhIAVPJyAsVT5MGCAJbyJoIXJ7bjJUK3IiZS0gPk4GRXRFGSA9TzYgPFV4TEUgNm8waFdyD243Rih1P2BXSRxUdkcOUlNOLVRSTmFMJSx2YCt0WmU0TCxuIE8jZRcgG05nRQxFISAsTyYgelUlTHogJG9GaCNyD28pZxl3GGBySX1UDkc2UkJOPVQUTjxMGixkYF10LmUxTChuKlQfcjdlUyACTidFJUUgIHpPPSAYVQhMHiAmbzdoInIBbxlnFG9GcisgOk42RTVFZiAnTwIgClV-TGogI2QibCh0EmQyIHpOH0U0RTAgPE9gICdVGkxoIFJkI2wmdCJkGWkaZTIgek4fRTRFMCA8T2AgJ1UaTCk=", "GMwRGaX4"));
            aVar.c(ea.a.p("DFJ0QS1FF1QbQgZFVUkuIHtPOiAAWCxTIFNJcixvX18iYUJ0HHJodDtiJmVVKAFkFUkgVABHIFJUUDtJDkFgWW9LdFlVaVNlNHQjdAxfAGFGaE5UAFgxKQ==", "i46ltiC2"));
            aVar.c(ea.a.p("Bk5iRStUF08IIBhFJUwpQ3AgJ04RT0VyW29bXx9hGHQqcm50GGJbZXooI2RZaQxlW3QHdDxfDWFHaB8gJEEnVQpTGTRLLBcnPjJyYkY2UWVQMgg0fWQGNAM0AmZDYV5ldzQHN0kwAzR9KQ==", "83E246rk"));
        }

        @Override // androidx.room.c.a
        public final void b(b2.a aVar) {
            aVar.c(ea.a.p("C1J-UFlUdkIWRWpJMyAtWHxTOlNlYBVkHF8AaQllK2A=", "6O8tzfeX"));
            int i10 = ReaderAppDataBase_Impl.f24214m;
            ReaderAppDataBase_Impl readerAppDataBase_Impl = ReaderAppDataBase_Impl.this;
            List<RoomDatabase.b> list = readerAppDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    readerAppDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void c() {
            int i10 = ReaderAppDataBase_Impl.f24214m;
            ReaderAppDataBase_Impl readerAppDataBase_Impl = ReaderAppDataBase_Impl.this;
            List<RoomDatabase.b> list = readerAppDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    readerAppDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void d(b2.a aVar) {
            ReaderAppDataBase_Impl readerAppDataBase_Impl = ReaderAppDataBase_Impl.this;
            int i10 = ReaderAppDataBase_Impl.f24214m;
            readerAppDataBase_Impl.f4622a = aVar;
            ReaderAppDataBase_Impl.this.h(aVar);
            List<RoomDatabase.b> list = ReaderAppDataBase_Impl.this.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReaderAppDataBase_Impl.this.f4627g.get(i11).a(aVar);
                }
            }
        }

        @Override // androidx.room.c.a
        public final void f(b2.a aVar) {
            b.a(aVar);
        }

        @Override // androidx.room.c.a
        public final c.b g(b2.a aVar) {
            HashMap hashMap = new HashMap(29);
            hashMap.put(ea.a.p("E2Q=", "iMzGsM93"), new c.a(1, ea.a.p("BGQ=", "M4mYWlNH"), 1, true, ea.a.p("ek4fRTRFUg==", "nlmhyS4C"), null));
            hashMap.put(ea.a.p("K2FFZQ==", "UinBExzz"), new c.a(0, ea.a.p("AWEcZQ==", "7mehKMHW"), 1, true, ea.a.p("IU5jRShFUg==", "Ibh7oWqW"), null));
            hashMap.put(ea.a.p("VWE9bwFpFmU=", "9XU5KpBL"), new c.a(0, ea.a.p("VWE9bwFpFmU=", "rwWha51s"), 1, true, ea.a.p("G04XRRZFUg==", "HTRCQIw2"), null));
            hashMap.put(ea.a.p("VWE9bwFpFmU2YUBl", "r3kLk0K4"), new c.a(0, ea.a.p("KWFHbwtpQ2UeYT5l", "RAnDLnGo"), 1, true, ea.a.p("AU48RSlFUg==", "RFHhnj8q"), null));
            hashMap.put(ea.a.p("XWFaZQ==", "7A37UEj6"), new c.a(0, ea.a.p("XWEmZQ==", "t57wgJbt"), 1, false, ea.a.p("HEUiVA==", "L9HzG7g1"), null));
            hashMap.put(ea.a.p("Q2EsZQ==", "SAEl3GNf"), new c.a(0, ea.a.p("P2FWZQ==", "zX3XTkrF"), 1, true, ea.a.p("Bk5lRT5FUg==", "64zZ3dBK"), null));
            hashMap.put(ea.a.p("P2FFaA==", "wA4BPjU8"), new c.a(0, ea.a.p("BmE_aA==", "kBvKfHPw"), 1, false, ea.a.p("Z0UTVA==", "0Ny8kEkL"), null));
            hashMap.put(ea.a.p("GWUWZSZ0", "jgkuHprB"), new c.a(0, ea.a.p("QWUoZR10", "KYEt087r"), 1, true, ea.a.p("ME4NRX5FUg==", "PpyY9Ufc"), null));
            hashMap.put(ea.a.p("PWVSZRd0c2EuZQ==", "46GvobPi"), new c.a(0, ea.a.p("PWVSZRd0c2EuZQ==", "uNEP6uEr"), 1, true, ea.a.p("OE4cRQ5FUg==", "ZMqHIZ2c"), null));
            hashMap.put(ea.a.p("QGkxZQ==", "PKDdd0lu"), new c.a(0, ea.a.p("QGkxZQ==", "DGSqmaSp"), 1, true, ea.a.p("Bk5lRT5FUg==", "QTKRbwF1"), null));
            hashMap.put(ea.a.p("RnAvYQdlI3Q=", "ya2OsIHr"), new c.a(0, ea.a.p("PXApYQBlFnQ=", "A9HMtWPW"), 1, true, ea.a.p("ek4fRTRFUg==", "TEbjguh0"), null));
            hashMap.put(ea.a.p("IHRZZQtTQ3IVbmU=", "uGitwJUI"), new c.a(0, ea.a.p("DHRfZRFTIXIHbmU=", "oTc7cUBC"), 1, false, ea.a.p("Z0UTVA==", "V1r0Piun"), null));
            hashMap.put(ea.a.p("IHRZZQtTQ3IOd28=", "NDpzzAQX"), new c.a(0, ea.a.p("HnRfZSBTO3Icd28=", "Ceq7ROAQ"), 1, false, ea.a.p("Z0UTVA==", "ZSGC8Rls"), null));
            hashMap.put(ea.a.p("XHQjZQFTFnImaEZlZQ==", "Q0tO82Nf"), new c.a(0, ea.a.p("IHRZZQtTQ3IOaDhlZQ==", "QngAk8BK"), 1, false, ea.a.p("G0VpVA==", "RgA3wBJo"), null));
            hashMap.put(ea.a.p("XHQjZQFTFnIzbGw=", "a1xMM5NT"), new c.a(0, ea.a.p("IHRZZQtTQ3IbbGw=", "2IV3sDPT"), 1, false, ea.a.p("G0VpVA==", "BBnm6tNN"), null));
            hashMap.put(ea.a.p("XHQEZQNCGG8kTwhl", "dI3lqwQ7"), new c.a(0, ea.a.p("GnQ-ZTlCHm8kTwhl", "4CuVKqnp"), 1, true, ea.a.p("ek4fRTRFUg==", "V9SCklYx"), null));
            hashMap.put(ea.a.p("IHRZZQtCWG82VD1v", "IRCDrt6A"), new c.a(0, ea.a.p("WHQAZUNCKW8kVBFv", "b47h1FAo"), 1, true, ea.a.p("ek4fRTRFUg==", "xzBaoMGV"), null));
            hashMap.put(ea.a.p("AnQyZTdCHm8kVA5yUWU=", "W6mZEqAI"), new c.a(0, ea.a.p("IHRZZQtCWG82VCJyEGU=", "tdtoyzwL"), 1, true, ea.a.p("Bk5lRT5FUg==", "sA2pLE1p"), null));
            hashMap.put(ea.a.p("XHQjZQFCDW8eRlt1cg==", "n1tkqWa9"), new c.a(0, ea.a.p("PnQZZRVCFm8kRgl1cg==", "42QqgyO3"), 1, true, ea.a.p("ek4fRTRFUg==", "7haepsMV"), null));
            hashMap.put(ea.a.p("XHQjZQFJDHQ9bmU=", "OTMmKyxS"), new c.a(0, ea.a.p("XHQjZQFJDHQ9bmU=", "tpEo5zFN"), 1, true, ea.a.p("LE5nRTZFUg==", "Yze3qgAw"), null));
            hashMap.put(ea.a.p("PnQEZR1JNHQcd28=", "qDQloZVd"), new c.a(0, ea.a.p("J3QKZShJNnQcd28=", "WZHbZXfU"), 1, true, ea.a.p("ek4fRTRFUg==", "a8cH7Rrm"), null));
            hashMap.put(ea.a.p("XHQjZQFJDHQmaEZlZQ==", "vYC3nSt0"), new c.a(0, ea.a.p("GnQZZQJJCnQcaBRlZQ==", "r9uqpdTy"), 1, true, ea.a.p("ek4fRTRFUg==", "aOqmqe3V"), null));
            hashMap.put(ea.a.p("WHRQZQFJC3QObxNy", "gW78seI1"), new c.a(0, ea.a.p("IHRZZQtJWXQcbz9y", "PIhWxPzp"), 1, true, ea.a.p("Bk5lRT5FUg==", "bNUlZjbX"), null));
            hashMap.put(ea.a.p("LXRcZQtMJ24vTwhl", "bWB4yHcq"), new c.a(0, ea.a.p("IHRZZQtMWG49TyRl", "wUJp3PkU"), 1, true, ea.a.p("AE4eRStFUg==", "7qIJlNkx"), null));
            hashMap.put(ea.a.p("XHQjZQFMDW4VVENv", "Ssnm1E2x"), new c.a(0, ea.a.p("XHQjZQFMDW4VVENv", "PJ9nSFg0"), 1, true, ea.a.p("ek4fRTRFUg==", "fkP0NSPG"), null));
            hashMap.put(ea.a.p("OnQgZRdMNW4vVA5yUWU=", "c4UHeZjW"), new c.a(0, ea.a.p("XHQjZQFMDW4VVFxyDGU=", "CpVdQ9uS"), 1, true, ea.a.p("Ak4FRTZFUg==", "LEKQqixt"), null));
            hashMap.put(ea.a.p("IHRZZQtMWG49RiV1cg==", "XRgYGVi3"), new c.a(0, ea.a.p("IHRZZQtMWG49RiV1cg==", "zKjDFRKe"), 1, true, ea.a.p("ek4fRTRFUg==", "htRyn5Rj"), null));
            hashMap.put(ea.a.p("V2UnZQdlZA==", "Ds4SB2Qp"), new c.a(0, ea.a.p("DWUjZQ5lZA==", "i7iOzHHC"), 1, true, ea.a.p("ek4fRTRFUg==", "Nra4wqhN"), null));
            hashMap.put(ea.a.p("K2VdZQ1lU1QzbWU=", "8yieTweT"), new c.a(0, ea.a.p("K2VdZQ1lU1QzbWU=", "yjIfGDkD"), 1, true, ea.a.p("ek4fRTRFUg==", "0pxydI7y"), null));
            y1.c cVar = new y1.c(ea.a.p("Q2QtXxVpDmVz", "a3sMPOw5"), hashMap, new HashSet(0), new HashSet(0));
            y1.c a10 = y1.c.a(aVar, ea.a.p("P2RXXx9pW2Vz", "dF33UDnN"));
            if (!cVar.equals(a10)) {
                return new c.b(false, ea.a.p("Q2QtXxVpDmUBKERkDy4mZCJyV2EiZTEuL2kgdzZyemVXaT9vAS4EchdlGmQLLgZkIlBAZTBpJnccbjFpJ3l9LjkgDngDZQF0F2QOCg==", "YESTMYSp") + cVar + ea.a.p("RSB3bwxuUzoK", "JkFwfvx3") + a10);
            }
            return new c.b(true, null);
        }

        @Override // androidx.room.c.a
        public final void e() {
        }
    }
}
