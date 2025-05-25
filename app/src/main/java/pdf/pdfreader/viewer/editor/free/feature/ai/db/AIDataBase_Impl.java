package pdf.pdfreader.viewer.editor.free.feature.ai.db;

import a2.c;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import km.b;
import km.c;
import w1.g;
import y1.c;

/* loaded from: classes3.dex */
public final class AIDataBase_Impl extends AIDataBase {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f24344m = 0;

    /* renamed from: l  reason: collision with root package name */
    public volatile c f24345l;

    @Override // androidx.room.RoomDatabase
    public final g e() {
        return new g(this, new HashMap(0), new HashMap(0), ea.a.p("F2kuZitsXXM=", "2svqB8V6"), ea.a.p("LmluYxFhQ18zbixv", "Lb3lNcwd"), ea.a.p("UmkUYR1zFWUAX1dvB3QzbnQ=", "r5eOjzeq"));
    }

    @Override // androidx.room.RoomDatabase
    public final a2.c f(androidx.room.a aVar) {
        androidx.room.c cVar = new androidx.room.c(aVar, new a(), ea.a.p("UmJ6NxVmUGUXMgQ2XWRgNXAwBThxMnRhIzBDMVsyYDI=", "GtlYdVE0"), ea.a.p("fzc0YgA0ZDh9MgQ0BDNvOA82ZDN8YgIxRThJNzc0ejc=", "wYHQ8RNp"));
        Context context = aVar.f4645b;
        if (context != null) {
            return aVar.f4644a.a(new c.b(context, aVar.c, cVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase
    public final b k() {
        km.c cVar;
        if (this.f24345l != null) {
            return this.f24345l;
        }
        synchronized (this) {
            if (this.f24345l == null) {
                this.f24345l = new km.c(this);
            }
            cVar = this.f24345l;
        }
        return cVar;
    }

    /* loaded from: classes3.dex */
    public class a extends c.a {
        public a() {
            super(1);
        }

        @Override // androidx.room.c.a
        public final void a(b2.a aVar) {
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTNVNQYFBpLmZabC5zEyBKYBtkVCAgTgJFA0VgIBZSCk0gUikgekUoIHJVH086TiFSN01xTj0gGE8QIHxVCkxvIAFyFW1edBRGWmwuUBJ0CmBSVHFYPSx2YCJpXmUWYTdoASAkRWlUXSBTZiJsFk4DbRdgFFQsWAIsZGBUaSplF3kRZRAgeE4lRXRFGSA9TzYgPFV4TEUgNmMlbmFoKXcLaRJ0H3JIYFFJfVQORzZSQk49VBROPEwaLGRgVGkqZRBpG2UQIHhOJUV0RRkgPU82IDxVeExFIDZ1NGxdYSJUKm0EYFBJf1Q0R3ZSa048VEJOJ0x4LElgM3gwZVxkI2QFaQRsFHN-bhRgE1QOWCcsQmAXeEBlB2QzZAJpV2wicxd3DmBQVHRYJSwTYC54B2UMZBdkcmkMbDJzEGhAZSNgY1QkWCQsEWAUeEdlJWQWZCtuBkZdZQVkJU8qZVIgD04XRSZFIiB_TyUgfVUHTF8gAmUKdFFuDWUySSp0dGkjbCdzNXcfYBFJP1R2Rw5SU04tVFJOYUwlLHZgIXhGZShkJmQobgRGWGUdZEBUI3IWZQIgO05gRS5FBCAKT2YgCFUPTE0gEGVJdBRuV2UvQhxvDmUTbnJpDGwycwtuV2BmSQ1UJEc1UhFOPlQTTh5MPyxCYBd4QGUHZDNkBm9dbCNhLUYIZRxkQlQGb1MgAk4nRSVFICB6Tz0gGFUITB4gJmU7dARuFGVVQh5vX2UqbjVpB2wWc2BoG2UzYGRJfFQDRwZSQU4_VBFOJEx_KQ==", "ap1qn4jD"));
            aVar.c(ea.a.p("dFIhQRlFU1QJQipFFEkRIHZPBiAMWH9TIFNRYDBpHWNfYRBfJG4VbyggTmBXaDZ0cWQyIABOYkUzRSMgAVILTXZSPSAGRSogCVUyT31OFFJ9TRdOHSB4TyAgP1UdTG4gV3IBbSJ0FkMgYRJJUGB3VH1YBixpYF9kFCAlRQlUYk54VEROGEw_LGhgAGlYZR5kWCAbTh1FcUUmID9PBSAMVXtMSCAtYxthPFQfcFFgd0l2VBdHDFIWTjtUUU4ETA4sF2AWZSBvB2UOaQplZGEjaFggBkURVBogFGYYbDRQI3RfYERUCFgnLGhgAGlYZRlhVWUyIB1FblRYIBFmOGwnVE5wAWBtST1UDUcjUhROGFQYTgdMBSwWYBJpHWUCaThlVyAtThlFNEUaIChPYCAZVXRMfiApY15hAE0UcyJhJWVjaQllLSA6ThxFIUVmIBlPbCAcVQVMGiAUcx5yJVQjZ1cgLU4ZRTRFGiAoT2AgGVV0TH4gKXFDZQd0GG8_VDtwUmBESQNUNkcNUkZOe1R3Tm1MHixpYEd1EXMFaT5uAW9ZdAFuOWBTVA1YMiwUYCZ1XXMmaSZuZXQVdBRgcUkMVHJHIVJtTjxUaE4zTHgsd2BZbiF3LHJieQRlESAYThZFcEU2IANPJyAGVSpMGCA3aUtMPWMiYBZJOlQ0RxRSYk54VEROGEw_LGhgA3hAZTlkXWQUaSxsUnM7bhRgcVQHWGMsRGAoeAdlJmQDZHJpMmxccwZ3JmAWVDFYJSxxYCd4Q2UKZChkNWktbAJzYGglZV1gclQMWGIsVGAUeCVlLGRSZC1uOUYaZSRkFU9aZTcgcU4GRQ5FZCA6TyUgH1UOTBsgBGU1dBZuLGUCSVp0EWldbDZzHXdZYFRJP1QURwdSF04rVG1OJkwELEZgUXgjZVZkN2QAbkJGHWUdZCJUKnJSZQQgBE4nRQ9FNCB6TwMgdlUeTGUgVmUMdBRuNWUmQlhvCGUsbjVpLWwCc3tuMmAYSRxUDEdzUlROPlRxThdMeyxEYCh4B2UmZANkdm84bF1hPEYgZVpkB1QGbzEgC05jRSNFHyA9TxwgKFV4THsgWGUqdCxuUmUQQh5vPWUjbnFpAWwpcydoOmUDYBRJGVR9RxdSaU55VFROJEwdKQ==", "bL7dMsui"));
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTLlNUYDJpNWFdczxlAV8Bbxx0UW4dYHYoJGlWYGZJDVQ_RzFSc1A4SX5BGVlTSydZUkFhVCZJGEMWRX9FCFRjTjVUVE4GTCYsE2A_eQNlAiA7TmBFLkUEIApPZiAIVQ9MViAUZT1kI25XZTNgU0ksVDdHcVJJThlUZE5nTAosY2AZaBV0GmQKIHpOH0U0RTAgPE9gICdVGkxoIFJmL2wmSR5gVEkdVC9HdlJrTjxUQk4nTHgsSWA1byp0V24yYGNUP1ggLHNgA3N_byhrEyArTiZFc0U7IBhPECB8VQpMbyAaaRlnBGkOdFtga0k9VCdHN1IUTiZUdk4RTH4sZmAqbR1IEWk0aB5gE0kFVDZHJ1JSTntUSU4DTAgsEmAjeDdlFGQRZBVpD2xXcwRuFmBCVDdYYCxJYDN4MGVcZCNkBWkfbBBzB3cFYBNUDlgnLEJgF3hAZQdkM2QCaVdsInMXaAhlEWBzVC9YZyxrYBZ4FmUcZFFkIG4iRi1lXmQ1Ty1lGiA9TgdFLUVhIAVPJyAsVT5MGCAJZS50IW5WZSJJLXQ8aRFsN3M-d1xga0k9VCdHN1IUTiZUdk4RTH4sZmAmeA5lGmQ2ZCNuR0YiZR9kEVQaclFlCSAfThBFdUUUIA1PLiA6VR9MRiBTZTN0Fm4GZRZCW28FZTduAmlXbCJzDG4fYFRJHVQvR3ZSa048VEJOJ0x4LElgM3gwZVxkI2QBbxVsEWE9RgNlX2Q4VARvAiA7TmBFLkUEIApPZiAIVQ9MViAUZSt0D25XZS9CHG8OZRNucmkMbDJzEGhAZSNgY0k0VDFHFlJKTnxUa04mTC4p", "ztSjvy8i"));
            aVar.c(ea.a.p("cFIOQSdFQlQzQnhFSUkQIApPZiADWApTLVNDcidvXV9eYTh0FnI9dBNiWGVJKD9kZEl8VANHBlJZUDFJBUFiWRNLDllfaQZlHHRddBBfPmE3aBJUA1gXKQ==", "ycH0o2q5"));
            aVar.c(ea.a.p("Bk5iRStUF08IIBhFJUwpQ3AgJ04RT0VyJm8kXylhJ3Qqcm50GGJbZXooI2RZaQxlW3QHdDxfDWE6aGAgEkEYVQpTGTRLLBcnO2J7NxNmWmVQMl42cWRTNX0wfjhzMmNhKzAGMU4yDjJ9KQ==", "FPgnIIDT"));
        }

        @Override // androidx.room.c.a
        public final void b(b2.a aVar) {
            aVar.c(ea.a.p("C1J-UFlUdkIWRWpJMyAtWHxTOlNlYARpKWYRbC9zYA==", "6RDKvxJe"));
            aVar.c(ea.a.p("C1J-UFlUdkIWRWpJMyAtWHxTOlNlYARpEGM6YThfBG4pb2A=", "djnUORLm"));
            aVar.c(ea.a.p("KVILUBRUO0IERUZJciASWHFTBlNpYFdpK2EfcyZlMF8Obyp0UW4OYA==", "ghmD4zB9"));
            int i10 = AIDataBase_Impl.f24344m;
            AIDataBase_Impl aIDataBase_Impl = AIDataBase_Impl.this;
            List<RoomDatabase.b> list = aIDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    aIDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void c() {
            int i10 = AIDataBase_Impl.f24344m;
            AIDataBase_Impl aIDataBase_Impl = AIDataBase_Impl.this;
            List<RoomDatabase.b> list = aIDataBase_Impl.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    aIDataBase_Impl.f4627g.get(i11).getClass();
                }
            }
        }

        @Override // androidx.room.c.a
        public final void d(b2.a aVar) {
            AIDataBase_Impl aIDataBase_Impl = AIDataBase_Impl.this;
            int i10 = AIDataBase_Impl.f24344m;
            aIDataBase_Impl.f4622a = aVar;
            AIDataBase_Impl.this.h(aVar);
            List<RoomDatabase.b> list = AIDataBase_Impl.this.f4627g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AIDataBase_Impl.this.f4627g.get(i11).a(aVar);
                }
            }
        }

        @Override // androidx.room.c.a
        public final void f(b2.a aVar) {
            y1.b.a(aVar);
        }

        @Override // androidx.room.c.a
        public final c.b g(b2.a aVar) {
            HashMap hashMap = new HashMap(17);
            hashMap.put(ea.a.p("JmQ=", "v8rsAmsf"), new c.a(1, ea.a.p("JmQ=", "rKwAJmhn"), 1, true, ea.a.p("I04yRQFFUg==", "9MjfFpbD"), null));
            hashMap.put(ea.a.p("PWVcbw1lcWk2ZRphAWg=", "mhwNYleY"), new c.a(0, ea.a.p("QWUmbwdlJGkeZWRhHWg=", "RwlaUHkn"), 1, false, ea.a.p("P0U_VA==", "EYkgWzgq"), null));
            hashMap.put(ea.a.p("LGkDZQBhOGg=", "qEJoPL9f"), new c.a(0, ea.a.p("KWldZSlhQ2g=", "huslwzh2"), 1, false, ea.a.p("Z0UTVA==", "Czm7GZH5"), null));
            hashMap.put(ea.a.p("F2kDZQBhWWU=", "M7qoN4Gv"), new c.a(0, ea.a.p("AWkZZS1hGGU=", "Cugucu9i"), 1, false, ea.a.p("G0VpVA==", "4IO2BKOG"), null));
            hashMap.put(ea.a.p("VWknZSd5EmU=", "izkOXStP"), new c.a(0, ea.a.p("KWldZS15R2U=", "RmjkoTzn"), 1, true, ea.a.p("Bk5lRT5FUg==", "IFl41UDP"), null));
            hashMap.put(ea.a.p("UGElUxtvFUgbc0BvG3k=", "7ZVK5HbO"), new c.a(0, ea.a.p("UGElUxtvFUgbc0BvG3k=", "tOk6VaBJ"), 1, true, ea.a.p("Bk5lRT5FUg==", "ULXydDhL"), null));
            hashMap.put(ea.a.p("VWknZSBpGGU=", "HanFiGzN"), new c.a(0, ea.a.p("LWkpZRFpMmU=", "9zKEBH1x"), 1, true, ea.a.p("Bk5lRT5FUg==", "kzcpZFwu"), null));
            hashMap.put(ea.a.p("LHAlbzNkO2klZQ==", "tqYIRoDr"), new c.a(0, ea.a.p("RnAnbxJkNmkfZQ==", "S60upYs2"), 1, true, ea.a.p("Kk4VRR5FUg==", "kxcAYqs7"), null));
            hashMap.put(ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "mwoy5TzB"), new c.a(0, ea.a.p("B3gBZRlkXGQOaQNsUHMYbmU=", "wpbuw9Hk"), 1, false, ea.a.p("G0VpVA==", "AhVyRKeE"), null));
            hashMap.put(ea.a.p("KnhFZRdkUmQcaS9sEXM8d28=", "OxmhszIC"), new c.a(0, ea.a.p("KnhFZRdkUmQcaS9sEXM8d28=", "2pBMpCcL"), 1, false, ea.a.p("G0VpVA==", "4pVugWhu"), null));
            hashMap.put(ea.a.p("XHhCZTpkPGQOaQNsUHMDaEplZQ==", "lV96TY6n"), new c.a(0, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCaDZlZQ==", "rEM0IWc1"), 1, false, ea.a.p("G0VpVA==", "nyhMCZYh"), null));
            hashMap.put(ea.a.p("LXgfZT5kAWQBbhJGXWU7ZEtPPGU=", "UIHkPdlQ"), new c.a(0, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdPXGU=", "5GWjXEWd"), 1, true, ea.a.p("Jk4_RRZFUg==", "ciokQ3HA"), null));
            hashMap.put(ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUGW8=", "imFKr2CX"), new c.a(0, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUGW8=", "13GAQinY"), 1, true, ea.a.p("ek4fRTRFUg==", "z0gVlCPl"), null));
            hashMap.put(ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "9SWXhmrE"), new c.a(0, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "IBaRdijV"), 1, true, ea.a.p("EE4ERRNFUg==", "R4YPTHM6"), null));
            hashMap.put(ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "YLG36dvZ"), new c.a(0, ea.a.p("UngCZSdkJmQKbwlsUWE5RlFlPmQ6T1hl", "y77vICho"), 1, true, ea.a.p("Bk5lRT5FUg==", "UbOwWFgD"), null));
            hashMap.put(ea.a.p("F3hFZT5kUmQKbwlsUWE5RlFlPmQ6VEFv", "8Ir1P7Hn"), new c.a(0, ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRv", "mtFat5cd"), 1, true, ea.a.p("Bk5lRT5FUg==", "LglJ6e1e"), null));
            hashMap.put(ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VCtyVWU=", "0IhqAK3s"), new c.a(0, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VA1yHGU=", "ForAysXg"), 1, true, ea.a.p("Bk5lRT5FUg==", "6UQsuIYA"), null));
            y1.c cVar = new y1.c(ea.a.p("LmluZhBsUnM=", "JlWxI8ke"), hashMap, new HashSet(0), new HashSet(0));
            y1.c a10 = y1.c.a(aVar, ea.a.p("LmluZhBsUnM=", "xrnXgUrc"));
            if (!cVar.equals(a10)) {
                return new c.b(false, ea.a.p("UmkUZhpsB3NacFBmR3AyZjZlU2Qjcm12E2UVZTMuBmRadCRyXWYQZRcuUmUIdCNyIS5TaWhkIS47SSRpLWUmbkdpP3laLmggN3hEZQp0M2R-Cg==", "zbAcWD5z") + cVar + ea.a.p("OSANbwZuBjoK", "cvDmKaK5") + a10);
            }
            HashMap hashMap2 = new HashMap(26);
            hashMap2.put(ea.a.p("UGgqdDpk", "ahHosz4l"), new c.a(1, ea.a.p("CmgQdDxk", "H7iquZfJ"), 1, true, ea.a.p("Bk5lRT5FUg==", "TAphkMKr"), null));
            hashMap2.put(ea.a.p("CGUObzFlLWgpdC9k", "n9zcEnZ2"), new c.a(0, ea.a.p("BmU3byZlL2gpdC9k", "H9tZRlU9"), 1, false, ea.a.p("Z0UTVA==", "wAL0U7Gj"), null));
            hashMap2.put(ea.a.p("JmQ=", "3VuMRKJM"), new c.a(0, ea.a.p("WmQ=", "M4bXmSmR"), 1, true, ea.a.p("AkUsVA==", "2mVtx7WQ"), null));
            hashMap2.put(ea.a.p("KGldZTFk", "Z7N1xz8o"), new c.a(0, ea.a.p("VWknZTpk", "iCv0xz5V"), 1, true, ea.a.p("ek4fRTRFUg==", "Sjs7sfPf"), null));
            hashMap2.put(ea.a.p("V2g5dDp5AGU=", "mM4XnpRq"), new c.a(0, ea.a.p("LGhQdC15R2U=", "EyJ8L8VK"), 1, true, ea.a.p("OE42RQtFUg==", "tRqbL7FF"), null));
            hashMap2.put(ea.a.p("PWVcbw1lcWk2ZRphAWg=", "kdUEXAsD"), new c.a(0, ea.a.p("PWVcbw1lcWk2ZRphAWg=", "NwCGB3DP"), 1, false, ea.a.p("G0VpVA==", "YEKxYuCQ"), null));
            hashMap2.put(ea.a.p("VWknZSNhFmg=", "iX4y3A0e"), new c.a(0, ea.a.p("KWldZSlhQ2g=", "TBwAPm4Z"), 1, false, ea.a.p("LEUbVA==", "39xCEoJN"), null));
            hashMap2.put(ea.a.p("VWknZT1hD2U=", "Z5eI2g3Y"), new c.a(0, ea.a.p("KWldZTdhWmU=", "1BMP84zi"), 1, false, ea.a.p("G0VpVA==", "nloYj8Mk"), null));
            hashMap2.put(ea.a.p("VWknZSd5EmU=", "mbYLSdEv"), new c.a(0, ea.a.p("FWkdZQx5SWU=", "HWsqX9QL"), 1, true, ea.a.p("G04bRT1FUg==", "cZROzp7z"), null));
            hashMap2.put(ea.a.p("VWknZSBpGGU=", "KcaifUGi"), new c.a(0, ea.a.p("KWldZSppTWU=", "UkQEjYlD"), 1, true, ea.a.p("AU4aRQxFUg==", "rUHNK2nR"), null));
            hashMap2.put(ea.a.p("LGhQdDRlRHM7Zy9UHG1l", "PAi6fumt"), new c.a(0, ea.a.p("UGgqdD5lEXMTZ1FUAG1l", "agqS12fR"), 1, true, ea.a.p("Bk5lRT5FUg==", "sRum2I6r"), null));
            hashMap2.put(ea.a.p("PG9DdC1hZw==", "OQxTr6WC"), new c.a(0, ea.a.p("QG85dCdhZw==", "0k6FYnhm"), 1, true, ea.a.p("ek4fRTRFUg==", "HWy2faIf"), null));
            hashMap2.put(ea.a.p("PnVUcw1pWG4OeTpl", "IPdPUEcB"), new c.a(0, ea.a.p("PnVUcw1pWG4OeTpl", "ixprYViv"), 1, true, ea.a.p("Bk5lRT5FUg==", "In8ijzK8"), null));
            hashMap2.put(ea.a.p("PnVUcw1pWG4ZbyR0EG50", "NRvZjIMP"), new c.a(0, ea.a.p("N3U1c0xpIm4Lbwh0UW50", "DWFP8MHh"), 1, false, ea.a.p("O0VrVA==", "Vbo3e89V"), null));
            hashMap2.put(ea.a.p("QnUucwdpDW4hdFV0ZQ==", "qtT3l0AL"), new c.a(0, ea.a.p("PnVUcw1pWG4JdCt0ZQ==", "AdNI24O3"), 1, true, ea.a.p("Bk5lRT5FUg==", "zhvFZG2V"), null));
            hashMap2.put(ea.a.p("Lm5CdxxyY3kqZQ==", "TV1mRTIv"), new c.a(0, ea.a.p("Um44dxZyNnkCZQ==", "dEH0eCdZ"), 1, true, ea.a.p("eE4yRX5FUg==", "Uf1f9KAI"), null));
            hashMap2.put(ea.a.p("WnMHbxBr", "SPVesQa3"), new c.a(0, ea.a.p("AXN_bxNr", "MHh3pTkE"), 1, true, ea.a.p("ek4fRTRFUg==", "wxP5eQHL"), null));
            hashMap2.put(ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "L5vdfuNp"), new c.a(0, ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "rOFKq30d"), 1, false, ea.a.p("Z0UTVA==", "QBck2pia"), null));
            hashMap2.put(ea.a.p("KnhFZRdkUmQcaS9sEXM8d28=", "iDnnodKJ"), new c.a(0, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCd28=", "aCx9pcig"), 1, false, ea.a.p("Z0UTVA==", "Fynazt7g"), null));
            hashMap2.put(ea.a.p("AXg-ZSVkBmQOaQNsUHMDaEplZQ==", "FHdJKcEL"), new c.a(0, ea.a.p("KnhFZRdkUmQcaS9sEXM8aEdlZQ==", "VZ32sWTQ"), 1, false, ea.a.p("Z0UTVA==", "Xz8i0kH1"), null));
            hashMap2.put(ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdPXGU=", "SN5lz2Qm"), new c.a(0, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdPXGU=", "Fc0hXRiZ"), 1, true, ea.a.p("ek4fRTRFUg==", "ZB0WTfC2"), null));
            hashMap2.put(ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUGW8=", "dcDEMrzz"), new c.a(0, ea.a.p("C3hDZQJkLWQBbhJGXWU7ZEtUJW8=", "Idn7lHhe"), 1, true, ea.a.p("ek4fRTRFUg==", "tFYPL0i6"), null));
            hashMap2.put(ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "lJid44SA"), new c.a(0, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUBnIgZQ==", "4e4cGGoh"), 1, true, ea.a.p("ek4fRTRFUg==", "6S5XbGTC"), null));
            hashMap2.put(ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "gQxCNltL"), new c.a(0, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "vmtsLmYi"), 1, true, ea.a.p("ek4fRTRFUg==", "S8etU6Xk"), null));
            hashMap2.put(ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRv", "6kM5DLRg"), new c.a(0, ea.a.p("XHgEZSdkDWQKbwlsUWE5RlFlPmQ6VEFv", "O99pIhj6"), 1, true, ea.a.p("IU4CRTdFUg==", "rKhVp1vq"), null));
            hashMap2.put(ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VCtyHWU=", "x6L5QSQQ"), new c.a(0, ea.a.p("EXgFZTxkDmQKbwlsUWE5RlFlPmQ6VF5yEWU=", "kutqRkVV"), 1, true, ea.a.p("G048RX5FUg==", "BvRh9GeH"), null));
            y1.c cVar2 = new y1.c(ea.a.p("M2kuYwphP18hbgBv", "HzRqbKrW"), hashMap2, new HashSet(0), new HashSet(0));
            y1.c a11 = y1.c.a(aVar, ea.a.p("UmkUYxthFl8bblJv", "7jsn565U"));
            if (!cVar2.equals(a11)) {
                return new c.b(false, ea.a.p("LmluYxFhQ18zbixvXXAMZhtwCmY3ZQRkA3J6dj5lL2U9LlRkEHRYcnRmOGUQLg5lVHQbciAuBGlIZDYuFkkbaC50eG4fbx4uUCAPeAVlC3RQZFQK", "Ky2VfTWX") + cVar2 + ea.a.p("WyA3bwRuDjoK", "VoQqqjgu") + a11);
            }
            HashMap hashMap3 = new HashMap(18);
            hashMap3.put(ea.a.p("JmQ=", "VT1MutmW"), new c.a(1, ea.a.p("GGQ=", "szqPHZxQ"), 1, true, ea.a.p("Bk5lRT5FUg==", "QGjjRmLm"), null));
            hashMap3.put(ea.a.p("E3klZQ==", "MWgUI7Jg"), new c.a(0, ea.a.p("O3lBZQ==", "uoKlFvfT"), 1, true, ea.a.p("IU4_RTBFUg==", "dehkwb1H"), null));
            hashMap3.put(ea.a.p("EW4RSVhkMng=", "qdtu6Wyh"), new c.a(0, ea.a.p("LW4sSTlkHHg=", "iuHHWyq8"), 1, true, ea.a.p("Bk5lRT5FUg==", "Zc8GMWW8"), null));
            hashMap3.put(ea.a.p("OmgQdCpk", "UYYqcKKZ"), new c.a(0, ea.a.p("LGhQdDBk", "ls81UGte"), 1, true, ea.a.p("Bk5lRT5FUg==", "zeUzUArh"), null));
            hashMap3.put(ea.a.p("KWldZTBk", "4KWpmUA3"), new c.a(0, ea.a.p("KWldZTBk", "nDZJBhJs"), 1, true, ea.a.p("ek4fRTRFUg==", "PZLOipaK"), null));
            hashMap3.put(ea.a.p("LG9fdBxudA==", "J2UoQxLs"), new c.a(0, ea.a.p("UG8ldBZudA==", "jCHqj52Z"), 1, false, ea.a.p("Z0UTVA==", "c3hPSYeg"), null));
            hashMap3.put(ea.a.p("JnN9bxpr", "DpCrQucm"), new c.a(0, ea.a.p("WnMHbxBr", "UEa9kVkk"), 1, true, ea.a.p("IE45RT1FUg==", "o3imzHb3"), null));
            hashMap3.put(ea.a.p("Wm0sVxpkFmg=", "l4hRD02S"), new c.a(0, ea.a.p("GG1fVy5kDGg=", "3Tq8Gxm2"), 1, true, ea.a.p("ek4fRTRFUg==", "Dyex5OLw"), null));
            hashMap3.put(ea.a.p("LW0XSA9pEWh0", "9mDpjvUX"), new c.a(0, ea.a.p("Jm1WSBxpUGh0", "jbLVWcmT"), 1, true, ea.a.p("Bk5lRT5FUg==", "fWowzLOJ"), null));
            hashMap3.put(ea.a.p("Vng_ZR1kB2Q0aVFsDXMZbmU=", "J3SwPAMp"), new c.a(0, ea.a.p("NHgCZQRkKWQOaQNsUHMYbmU=", "FkQvjLt7"), 1, false, ea.a.p("Z0UTVA==", "b3jz5tDZ"), null));
            hashMap3.put(ea.a.p("Vng_ZR1kB2Q0aVFsDXMCd28=", "b5gA4soD"), new c.a(0, ea.a.p("KnhFZRdkUmQcaS9sEXM8d28=", "rfpnt6bC"), 1, false, ea.a.p("Z0UTVA==", "I9VI9eh0"), null));
            hashMap3.put(ea.a.p("Vng_ZR1kB2Q0aVFsDXMCaDZlZQ==", "ycCHoraY"), new c.a(0, ea.a.p("Vng_ZR1kB2Q0aVFsDXMCaDZlZQ==", "harbuqXF"), 1, false, ea.a.p("Z0UTVA==", "EM3oF1ao"), null));
            hashMap3.put(ea.a.p("N3hDZT5kXWQBbhJGXWU7ZEtPPGU=", "IKR7P8Qn"), new c.a(0, ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZPAGU=", "BM8hbt6G"), 1, true, ea.a.p("Bk5lRT5FUg==", "tpbX4z4V"), null));
            hashMap3.put(ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdURW8=", "zIg8uW0g"), new c.a(0, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdURW8=", "F2Wg0Rxf"), 1, true, ea.a.p("Bk5lRT5FUg==", "VsCrGmtB"), null));
            hashMap3.put(ea.a.p("KnhFZRdkUmQTbj5GHGUEZEZUBnIgZQ==", "xrWRsZF4"), new c.a(0, ea.a.p("Vng_ZR1kB2Q7bkBGAGU6ZDdUWnIjZQ==", "6R5jnLiN"), 1, true, ea.a.p("C042RRFFUg==", "jmBbVqGq"), null));
            hashMap3.put(ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2Twtl", "yf8i4G3d"), new c.a(0, ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1Ty1l", "WdDfkPtS"), 1, true, ea.a.p("Bk5lRT5FUg==", "y4QOrEDF"), null));
            hashMap3.put(ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRv", "6ig06MxC"), new c.a(0, ea.a.p("Vng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRv", "80xXPMAY"), 1, true, ea.a.p("ek4fRTRFUg==", "xP3cS5Gf"), null));
            hashMap3.put(ea.a.p("MHg5ZR1kKGQKbwlsUWE5RlFlPmQ6VF5yEWU=", "6pUMsMqV"), new c.a(0, ea.a.p("KnhFZRdkUmQYbyVsEGEGRlxlAmQ2VA1yJ2U=", "rejZBPQt"), 1, true, ea.a.p("AE4VRStFUg==", "s9IAlGAm"), null));
            y1.c cVar3 = new y1.c(ea.a.p("UmkUYR1zFWUAX1dvB3QzbnQ=", "5EubLctw"), hashMap3, new HashSet(0), new HashSet(0));
            y1.c a12 = y1.c.a(aVar, ea.a.p("UmkUYR1zFWUAX1dvB3QzbnQ=", "KYXdSVUI"));
            if (!cVar3.equals(a12)) {
                return new c.b(false, ea.a.p("UmkUYR1zFWUAX1dvB3QzbjAoQmQgLjNkHHIgYQxlIS5FaS53FnJMZRZpQG8bLjByIWUcZiNhN3UIZWthAS43Yh1BAkEdcxVlAENbbh1lOHRtLjggA3gzZRl0IGRSCg==", "zEhSzxiy") + cVar3 + ea.a.p("OSANbwZuBjoK", "N90U0J5m") + a12);
            }
            return new c.b(true, null);
        }

        @Override // androidx.room.c.a
        public final void e() {
        }
    }
}
