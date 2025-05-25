package bm;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w1.h;

/* compiled from: PdfReaderDao_Impl.java */
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f5486a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5487b;
    public final b c;

    /* compiled from: PdfReaderDao_Impl.java */
    /* loaded from: classes3.dex */
    public class a extends w1.b<PdfPreviewEntity> {
        @Override // w1.j
        public final String b() {
            return ea.a.p("Hk5kRTtUSk8aIDRFZEwWQ30gG04dTxZgBGQXXzdpLmUkYBcoCWkOYGRgAmFAZTcsWGYzdiZyX3QRYF1gN2E0byVpQ2UtYR5lKCwGblVtMmAUYCJhLmVWLBRwEHQ5YG5gJWVUZQd0CiwocgNjUW4jRFl0N2BlYEVpDmURLDF1MmQ2dFJBHWBGYCd0DmVGUyNyd243YGVgWXQcZQNTJXIWdzhgG2AGdAJlOlMScmBoJWVdYH5gJnReZQZTBXIQbC5ge2BYdAFlGEInbwpPWmU3LFhvJmgscnRvG2wldz5gbmA4dF9lG0IFbyRUDnJRZTcsWG8maCxydG8bbDdvJHIiLDdvQ2gMciNuPE8IZVQsN29MaDdyAG5CVANvESwxbzZoMnJ-bh1UAnItZQYsVG8jaF1yG249Rll1BmBdYD50KmUlTFhuDk8EZSgsBm9AaDJydG88Zx13WWBYYB50OWUwTDhuUFQBcg9lKCwGb0BoMnJ0bzxnD29DchQsEWQ0bCd0MmRXLAlkD2wtdANkYGk6ZVgpclYITGNFJyBZbiRsLmkxKAgsSTBDLHcsWSwLLGgsByxtLHYsCSxLLE4sbix9LGgsCCxWLFUsdyxZLAssaCwHLG0sdiwJLEssTixuLH0p", "KJW7ijR1");
        }

        @Override // w1.b
        public final void d(b2.e eVar, PdfPreviewEntity pdfPreviewEntity) {
            PdfPreviewEntity pdfPreviewEntity2 = pdfPreviewEntity;
            eVar.c(1, pdfPreviewEntity2.getId());
            eVar.c(2, pdfPreviewEntity2.getDate());
            eVar.c(3, pdfPreviewEntity2.getFavorite());
            eVar.c(4, pdfPreviewEntity2.getFavoriteDate());
            if (pdfPreviewEntity2.getName() == null) {
                eVar.d(5);
            } else {
                eVar.f(5, pdfPreviewEntity2.getName());
            }
            eVar.c(6, pdfPreviewEntity2.getPage());
            if (pdfPreviewEntity2.getPath() == null) {
                eVar.d(7);
            } else {
                eVar.f(7, pdfPreviewEntity2.getPath());
            }
            eVar.c(8, pdfPreviewEntity2.getRecent());
            eVar.c(9, pdfPreviewEntity2.getRecentDate());
            eVar.c(10, pdfPreviewEntity2.getSize());
            eVar.c(11, pdfPreviewEntity2.getUpdateAt());
            if (pdfPreviewEntity2.getOtherStrOne() == null) {
                eVar.d(12);
            } else {
                eVar.f(12, pdfPreviewEntity2.getOtherStrOne());
            }
            if (pdfPreviewEntity2.getOtherStrTwo() == null) {
                eVar.d(13);
            } else {
                eVar.f(13, pdfPreviewEntity2.getOtherStrTwo());
            }
            if (pdfPreviewEntity2.getOtherStrThree() == null) {
                eVar.d(14);
            } else {
                eVar.f(14, pdfPreviewEntity2.getOtherStrThree());
            }
            if (pdfPreviewEntity2.getOtherStrAll() == null) {
                eVar.d(15);
            } else {
                eVar.f(15, pdfPreviewEntity2.getOtherStrAll());
            }
            eVar.c(16, pdfPreviewEntity2.isOtherBoolOne() ? 1L : 0L);
            eVar.c(17, pdfPreviewEntity2.isOtherBoolTwo() ? 1L : 0L);
            eVar.c(18, pdfPreviewEntity2.isOtherBoolThree() ? 1L : 0L);
            eVar.c(19, pdfPreviewEntity2.isOtherBoolFour() ? 1L : 0L);
            eVar.c(20, pdfPreviewEntity2.getOtherIntOne());
            eVar.c(21, pdfPreviewEntity2.getOtherIntTwo());
            eVar.c(22, pdfPreviewEntity2.getOtherIntThree());
            eVar.c(23, pdfPreviewEntity2.getOtherIntFour());
            eVar.c(24, pdfPreviewEntity2.getOtherLongOne());
            eVar.c(25, pdfPreviewEntity2.getOtherLongTwo());
            eVar.c(26, pdfPreviewEntity2.getOtherLongThree());
            eVar.c(27, pdfPreviewEntity2.getOtherLongFour());
            eVar.c(28, pdfPreviewEntity2.getDeleted());
            eVar.c(29, pdfPreviewEntity2.getDeletedTime());
        }
    }

    /* compiled from: PdfReaderDao_Impl.java */
    /* loaded from: classes3.dex */
    public class b extends w1.a<PdfPreviewEntity> {
        @Override // w1.j
        public final String b() {
            return ea.a.p("ZlAPQSdFQk8gIGZFOUwXQwEgUnAiZhxmXGwIcykgEUVnICtpF2BCPVI_GGANYSJlJCAPIHksI2ZUdgJyIHQnYBM9az9fYARhBG9GaR1lEmEwZVIgeyB8LFVuDG0sYGI9Ez9nYANhBWUSIAkgViw2cCV0WmBmPWM_GWAfZSplLHRTIHYgTCwCchdjUW4dRDd0IWASPWY_b2BGaRdlKSB_IAwsK3UDZAN0F0FAYEk9dj9oYF10LmUxU0FyIm4sYGI9Ez9nYBx0CmUAU0ByPXc5YGQ9Ej9qYCx0XWUfUz1yFmhBZS5gUz1CP15gW3QBZSRTMHJzbCpgYz0VP0FgJnQqZUFCJG8fTwxlEiAJIFYsNm8waFdyBG8sbGF3AmBpPWI_H2AkdBtlEEIdb1hUAXIzZSQgDyB5LCNvQWgIcgtvLWx1bz5yEyBfIE0sVG8daDNyDW5GTyhlIyAIIFIsKW82aFZyAm4HVBVvEiAJIFYsNm8waFdyD243VF1yCGUpIH8gDCwrbwdoB3I7bkBGBnUkYGQ9Ej9qYCx0XWUfTCZuJU9dZSsgTiBdLBJvQGgMchpvKmdmdylgYz0VP0FgJnQqZUFMJG4UVApyF2VUIFQgaSwkb0ZoI3IPb1tnK288ciIgDiB0LBNkB2wXdFFkCSBrIHssUmQjbCZ0UGQ5aSRlIiAOIHQgJEgnUjcgVGkNYHY9ZD8=", "5mIBVRZp");
        }

        public final void d(b2.e eVar, Object obj) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
            eVar.c(1, pdfPreviewEntity.getId());
            eVar.c(2, pdfPreviewEntity.getDate());
            eVar.c(3, pdfPreviewEntity.getFavorite());
            eVar.c(4, pdfPreviewEntity.getFavoriteDate());
            if (pdfPreviewEntity.getName() == null) {
                eVar.d(5);
            } else {
                eVar.f(5, pdfPreviewEntity.getName());
            }
            eVar.c(6, pdfPreviewEntity.getPage());
            if (pdfPreviewEntity.getPath() == null) {
                eVar.d(7);
            } else {
                eVar.f(7, pdfPreviewEntity.getPath());
            }
            eVar.c(8, pdfPreviewEntity.getRecent());
            eVar.c(9, pdfPreviewEntity.getRecentDate());
            eVar.c(10, pdfPreviewEntity.getSize());
            eVar.c(11, pdfPreviewEntity.getUpdateAt());
            if (pdfPreviewEntity.getOtherStrOne() == null) {
                eVar.d(12);
            } else {
                eVar.f(12, pdfPreviewEntity.getOtherStrOne());
            }
            if (pdfPreviewEntity.getOtherStrTwo() == null) {
                eVar.d(13);
            } else {
                eVar.f(13, pdfPreviewEntity.getOtherStrTwo());
            }
            if (pdfPreviewEntity.getOtherStrThree() == null) {
                eVar.d(14);
            } else {
                eVar.f(14, pdfPreviewEntity.getOtherStrThree());
            }
            if (pdfPreviewEntity.getOtherStrAll() == null) {
                eVar.d(15);
            } else {
                eVar.f(15, pdfPreviewEntity.getOtherStrAll());
            }
            eVar.c(16, pdfPreviewEntity.isOtherBoolOne() ? 1L : 0L);
            eVar.c(17, pdfPreviewEntity.isOtherBoolTwo() ? 1L : 0L);
            eVar.c(18, pdfPreviewEntity.isOtherBoolThree() ? 1L : 0L);
            eVar.c(19, pdfPreviewEntity.isOtherBoolFour() ? 1L : 0L);
            eVar.c(20, pdfPreviewEntity.getOtherIntOne());
            eVar.c(21, pdfPreviewEntity.getOtherIntTwo());
            eVar.c(22, pdfPreviewEntity.getOtherIntThree());
            eVar.c(23, pdfPreviewEntity.getOtherIntFour());
            eVar.c(24, pdfPreviewEntity.getOtherLongOne());
            eVar.c(25, pdfPreviewEntity.getOtherLongTwo());
            eVar.c(26, pdfPreviewEntity.getOtherLongThree());
            eVar.c(27, pdfPreviewEntity.getOtherLongFour());
            eVar.c(28, pdfPreviewEntity.getDeleted());
            eVar.c(29, pdfPreviewEntity.getDeletedTime());
            eVar.c(30, pdfPreviewEntity.getId());
        }
    }

    public e(RoomDatabase roomDatabase) {
        this.f5486a = roomDatabase;
        this.f5487b = new a(roomDatabase);
        new AtomicBoolean(false);
        this.c = new b(roomDatabase);
    }

    public final PdfPreviewEntity a(String str) {
        h hVar;
        PdfPreviewEntity pdfPreviewEntity;
        boolean z10;
        boolean z11;
        boolean z12;
        ea.a.p("QGUnZRB0QipSZkZvBCAmZCJfVGkqZTAgMUgvUnAgL2VfZT9lFz1fMFJBekRJbyJoIXJhdDRPLWVGPVcgPw==", "fj5KCLCG");
        h b10 = h.b(1, ea.a.p("NGUOZSJ0aCpoZhRvWSAnZF5fNGklZUUgI0g0UhQgJmUrZRZlJT11MGhBKEQUbyNoXXIBdDtPWGVUPUwgPw==", "zxGbAHA8"));
        b10.h(1, str);
        RoomDatabase roomDatabase = this.f5486a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            int N = t0.N(i10, ea.a.p("WmQ=", "Bi6685Z3"));
            int N2 = t0.N(i10, ea.a.p("V2E_ZQ==", "e9dtSygD"));
            int N3 = t0.N(i10, ea.a.p("VWE9bwFpFmU=", "FamIRRIn"));
            int N4 = t0.N(i10, ea.a.p("KWFHbwtpQ2UeYT5l", "4uQDgL4p"));
            int N5 = t0.N(i10, ea.a.p("XWEmZQ==", "paIMk2Xu"));
            int N6 = t0.N(i10, ea.a.p("Q2EsZQ==", "9a7FYCpR"));
            int N7 = t0.N(i10, ea.a.p("Q2E_aA==", "42IHr5IO"));
            int N8 = t0.N(i10, ea.a.p("QWUoZR10", "S24C8MwB"));
            int N9 = t0.N(i10, ea.a.p("PWVSZRd0c2EuZQ==", "x1BA3hPV"));
            int N10 = t0.N(i10, ea.a.p("H2kuZQ==", "7DlTWZDA"));
            int N11 = t0.N(i10, ea.a.p("OnBVYQ1ldnQ=", "DVvGylGi"));
            int N12 = t0.N(i10, ea.a.p("NXQFZQNTRXIHbmU=", "A8Zmq1Fr"));
            int N13 = t0.N(i10, ea.a.p("PXQxZRxTTXIcd28=", "NWRYn9DD"));
            hVar = b10;
            try {
                int N14 = t0.N(i10, ea.a.p("XHQjZQFTFnImaEZlZQ==", "a3NvWrtA"));
                int N15 = t0.N(i10, ea.a.p("XHQjZQFTFnIzbGw=", "umyx3raS"));
                int N16 = t0.N(i10, ea.a.p("KnQ-ZUtCAm8kTwhl", "qYEV9m9x"));
                int N17 = t0.N(i10, ea.a.p("XHQjZQFCDW8eVENv", "0MFOqI70"));
                int N18 = t0.N(i10, ea.a.p("XHQjZQFCDW8eVFxyDGU=", "O0wk7hlk"));
                int N19 = t0.N(i10, ea.a.p("B3QsZQBCNm8kRgl1cg==", "jXhDrYT9"));
                int N20 = t0.N(i10, ea.a.p("XHQjZQFJDHQ9bmU=", "F9YvY5HX"));
                int N21 = t0.N(i10, ea.a.p("XHQjZQFJDHQmd28=", "5dMumgn9"));
                int N22 = t0.N(i10, ea.a.p("IHRZZQtJWXQOaDhlZQ==", "eedJXngw"));
                int N23 = t0.N(i10, ea.a.p("XHQjZQFJDHQ0b0Fy", "RBza4iC7"));
                int N24 = t0.N(i10, ea.a.p("XHQjZQFMDW4VT1pl", "0uxtNhea"));
                int N25 = t0.N(i10, ea.a.p("XHQjZQFMDW4VVENv", "tSI969a2"));
                int N26 = t0.N(i10, ea.a.p("XHQjZQFMDW4VVFxyDGU=", "kPUgDa4g"));
                int N27 = t0.N(i10, ea.a.p("IHRZZQtMWG49RiV1cg==", "QNdKzj8K"));
                int N28 = t0.N(i10, ea.a.p("K2VdZQ1lZA==", "wAR2LCG8"));
                int N29 = t0.N(i10, ea.a.p("K2VdZQ1lU1QzbWU=", "tZKwu6sM"));
                if (i10.moveToFirst()) {
                    pdfPreviewEntity = new PdfPreviewEntity();
                    pdfPreviewEntity.setId(i10.getLong(N));
                    pdfPreviewEntity.setDate(i10.getLong(N2));
                    pdfPreviewEntity.setFavorite(i10.getInt(N3));
                    pdfPreviewEntity.setFavoriteDate(i10.getLong(N4));
                    pdfPreviewEntity.setName(i10.getString(N5));
                    pdfPreviewEntity.setPage(i10.getInt(N6));
                    pdfPreviewEntity.setPath(i10.getString(N7));
                    pdfPreviewEntity.setRecent(i10.getInt(N8));
                    pdfPreviewEntity.setRecentDate(i10.getLong(N9));
                    pdfPreviewEntity.setSize(i10.getLong(N10));
                    pdfPreviewEntity.setUpdateAt(i10.getLong(N11));
                    pdfPreviewEntity.setOtherStrOne(i10.getString(N12));
                    pdfPreviewEntity.setOtherStrTwo(i10.getString(N13));
                    pdfPreviewEntity.setOtherStrThree(i10.getString(N14));
                    pdfPreviewEntity.setOtherStrAll(i10.getString(N15));
                    boolean z13 = false;
                    if (i10.getInt(N16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pdfPreviewEntity.setOtherBoolOne(z10);
                    if (i10.getInt(N17) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pdfPreviewEntity.setOtherBoolTwo(z11);
                    if (i10.getInt(N18) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    pdfPreviewEntity.setOtherBoolThree(z12);
                    if (i10.getInt(N19) != 0) {
                        z13 = true;
                    }
                    pdfPreviewEntity.setOtherBoolFour(z13);
                    pdfPreviewEntity.setOtherIntOne(i10.getInt(N20));
                    pdfPreviewEntity.setOtherIntTwo(i10.getInt(N21));
                    pdfPreviewEntity.setOtherIntThree(i10.getInt(N22));
                    pdfPreviewEntity.setOtherIntFour(i10.getInt(N23));
                    pdfPreviewEntity.setOtherLongOne(i10.getLong(N24));
                    pdfPreviewEntity.setOtherLongTwo(i10.getLong(N25));
                    pdfPreviewEntity.setOtherLongThree(i10.getLong(N26));
                    pdfPreviewEntity.setOtherLongFour(i10.getLong(N27));
                    pdfPreviewEntity.setDeleted(i10.getInt(N28));
                    pdfPreviewEntity.setDeletedTime(i10.getLong(N29));
                } else {
                    pdfPreviewEntity = null;
                }
                i10.close();
                hVar.i();
                return pdfPreviewEntity;
            } catch (Throwable th2) {
                th = th2;
                i10.close();
                hVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = b10;
        }
    }

    public final long b(PdfPreviewEntity pdfPreviewEntity) {
        RoomDatabase roomDatabase = this.f5486a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            long f10 = this.f5487b.f(pdfPreviewEntity);
            roomDatabase.j();
            return f10;
        } finally {
            roomDatabase.g();
        }
    }

    public final ArrayList c(String str) {
        h hVar;
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
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ea.a.p("NmUVZTR0bypoZhRvWSAnZF5fNGklZUUgI0g0UhQgJmUpZQ1lMz1yMGhBKEQUcDZ0UCA-aSJlFidRJ1F8LSB9IDl8WSdyJ29vOmQDchRiLiBcYSZlaWRTc2M=", "9AEyWOrl");
        h b10 = h.b(1, ea.a.p("QGUnZRB0QipSZkZvBCAmZCJfVGkqZTAgEEg3Ug8gJmVfZT9lFz1fMFJBekRJcDd0LCBeaS1lYydiJ1J8NiB9IE98aydWJ0JvAGRRckliLyAgYUZlZmQmc2M=", "GrJB0Lcr"));
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f5486a;
        roomDatabase.b();
        Cursor i11 = roomDatabase.i(b10);
        try {
            N = t0.N(i11, ea.a.p("LmQ=", "WRG9JAjo"));
            N2 = t0.N(i11, ea.a.p("K2FFZQ==", "fv4u6gEt"));
            N3 = t0.N(i11, ea.a.p("E2EkbxZpJGU=", "4huRdP9F"));
            N4 = t0.N(i11, ea.a.p("KWFHbwtpQ2UeYT5l", "xjoXu41i"));
            N5 = t0.N(i11, ea.a.p("IWFcZQ==", "WvMnlMgL"));
            N6 = t0.N(i11, ea.a.p("Q2EsZQ==", "VCuASdm4"));
            N7 = t0.N(i11, ea.a.p("P2FFaA==", "DibjcLYE"));
            N8 = t0.N(i11, ea.a.p("PWVSZRd0", "2cpxKww2"));
            N9 = t0.N(i11, ea.a.p("QWUSZR10LGE8ZQ==", "8w3qshIB"));
            N10 = t0.N(i11, ea.a.p("QGkxZQ==", "RMbbnom5"));
            N11 = t0.N(i11, ea.a.p("OHA-YQJleHQ=", "BHMZv91F"));
            N12 = t0.N(i11, ea.a.p("IHRZZQtTQ3IVbmU=", "wPXGtXCu"));
            N13 = t0.N(i11, ea.a.p("NnReZSRTHHIcd28=", "UqY6Vhs3"));
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N14 = t0.N(i11, ea.a.p("XHQjZQFTFnImaEZlZQ==", "aEM7ZxJi"));
            int N15 = t0.N(i11, ea.a.p("XHQjZQFTFnIzbGw=", "S9yvV9nI"));
            int N16 = t0.N(i11, ea.a.p("XHQjZQFCDW8eT1pl", "LvEd0crq"));
            int N17 = t0.N(i11, ea.a.p("XHQjZQFCDW8eVENv", "gsfBcanG"));
            int N18 = t0.N(i11, ea.a.p("XnQqZRtCXW8kVA5yUWU=", "Yz1Bi2Hm"));
            int N19 = t0.N(i11, ea.a.p("IHRZZQtCWG82RiV1cg==", "ydTGDGdG"));
            int N20 = t0.N(i11, ea.a.p("XHQjZQFJDHQ9bmU=", "yjma7FSi"));
            int N21 = t0.N(i11, ea.a.p("IHRZZQtJWXQOd28=", "JpWEdVGG"));
            int N22 = t0.N(i11, ea.a.p("XHQjZQFJDHQmaEZlZQ==", "nNoeOS0M"));
            int N23 = t0.N(i11, ea.a.p("XHQjZQFJDHQ0b0Fy", "8eaEQdMx"));
            int N24 = t0.N(i11, ea.a.p("IHRZZQtMWG49TyRl", "IQvyyG3F"));
            int N25 = t0.N(i11, ea.a.p("XHQjZQFMDW4VVENv", "X078V8Ax"));
            int N26 = t0.N(i11, ea.a.p("IHRZZQtMWG49VCJyEGU=", "Q32VsJwv"));
            int N27 = t0.N(i11, ea.a.p("XHQjZQFMDW4VRlt1cg==", "SBqV6f3i"));
            int N28 = t0.N(i11, ea.a.p("V2UnZQdlZA==", "K9YY2far"));
            int N29 = t0.N(i11, ea.a.p("K2VdZQ1lU1QzbWU=", "cMX6YEyZ"));
            ArrayList arrayList = new ArrayList(i11.getCount());
            while (i11.moveToNext()) {
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                int i12 = N12;
                int i13 = N13;
                pdfPreviewEntity.setId(i11.getLong(N));
                pdfPreviewEntity.setDate(i11.getLong(N2));
                pdfPreviewEntity.setFavorite(i11.getInt(N3));
                pdfPreviewEntity.setFavoriteDate(i11.getLong(N4));
                pdfPreviewEntity.setName(i11.getString(N5));
                pdfPreviewEntity.setPage(i11.getInt(N6));
                pdfPreviewEntity.setPath(i11.getString(N7));
                pdfPreviewEntity.setRecent(i11.getInt(N8));
                pdfPreviewEntity.setRecentDate(i11.getLong(N9));
                pdfPreviewEntity.setSize(i11.getLong(N10));
                pdfPreviewEntity.setUpdateAt(i11.getLong(N11));
                pdfPreviewEntity.setOtherStrOne(i11.getString(i12));
                int i14 = N;
                pdfPreviewEntity.setOtherStrTwo(i11.getString(i13));
                int i15 = N14;
                pdfPreviewEntity.setOtherStrThree(i11.getString(i15));
                N14 = i15;
                int i16 = N15;
                pdfPreviewEntity.setOtherStrAll(i11.getString(i16));
                int i17 = N16;
                if (i11.getInt(i17) != 0) {
                    i10 = i17;
                    z10 = true;
                } else {
                    i10 = i17;
                    z10 = false;
                }
                pdfPreviewEntity.setOtherBoolOne(z10);
                int i18 = N17;
                if (i11.getInt(i18) != 0) {
                    N17 = i18;
                    z11 = true;
                } else {
                    N17 = i18;
                    z11 = false;
                }
                pdfPreviewEntity.setOtherBoolTwo(z11);
                int i19 = N18;
                if (i11.getInt(i19) != 0) {
                    N18 = i19;
                    z12 = true;
                } else {
                    N18 = i19;
                    z12 = false;
                }
                pdfPreviewEntity.setOtherBoolThree(z12);
                int i20 = N19;
                if (i11.getInt(i20) != 0) {
                    N19 = i20;
                    z13 = true;
                } else {
                    N19 = i20;
                    z13 = false;
                }
                pdfPreviewEntity.setOtherBoolFour(z13);
                int i21 = N20;
                pdfPreviewEntity.setOtherIntOne(i11.getInt(i21));
                N20 = i21;
                int i22 = N21;
                pdfPreviewEntity.setOtherIntTwo(i11.getInt(i22));
                N21 = i22;
                int i23 = N22;
                pdfPreviewEntity.setOtherIntThree(i11.getInt(i23));
                N22 = i23;
                int i24 = N23;
                pdfPreviewEntity.setOtherIntFour(i11.getInt(i24));
                int i25 = N24;
                pdfPreviewEntity.setOtherLongOne(i11.getLong(i25));
                int i26 = N2;
                int i27 = N25;
                int i28 = N3;
                pdfPreviewEntity.setOtherLongTwo(i11.getLong(i27));
                int i29 = N26;
                pdfPreviewEntity.setOtherLongThree(i11.getLong(i29));
                int i30 = N27;
                pdfPreviewEntity.setOtherLongFour(i11.getLong(i30));
                int i31 = N28;
                pdfPreviewEntity.setDeleted(i11.getInt(i31));
                int i32 = N29;
                pdfPreviewEntity.setDeletedTime(i11.getLong(i32));
                arrayList.add(pdfPreviewEntity);
                N13 = i13;
                N23 = i24;
                N12 = i12;
                N24 = i25;
                N = i14;
                N28 = i31;
                N2 = i26;
                N26 = i29;
                N29 = i32;
                N3 = i28;
                N25 = i27;
                N27 = i30;
                N16 = i10;
                N15 = i16;
            }
            i11.close();
            hVar.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            i11.close();
            hVar.i();
            throw th;
        }
    }

    public final PdfPreviewEntity d(String str) {
        h hVar;
        PdfPreviewEntity pdfPreviewEntity;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgOkgIUh8gLWUjZUVlHT0KMHpBBERVcAl0XSBTPWU_", "EiyAmMZI");
        h b10 = h.b(1, ea.a.p("QGUnZRB0QipSZkZvBCAmZCJfVGkqZTAgAkhwUi4gNWVfZT9lFz1fMFJBekRJcDd0LCAPPWY_", "U5kQ8Ga6"));
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = this.f5486a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b10);
        try {
            int N = t0.N(i10, ea.a.p("JmQ=", "cehQeRmm"));
            int N2 = t0.N(i10, ea.a.p("V2E_ZQ==", "wv1L8I60"));
            int N3 = t0.N(i10, ea.a.p("LmEsb0ZpBWU=", "bKHZ4qrk"));
            int N4 = t0.N(i10, ea.a.p("KWFHbwtpQ2UeYT5l", "nbnBnIVI"));
            int N5 = t0.N(i10, ea.a.p("XWEmZQ==", "kIR8eEr5"));
            int N6 = t0.N(i10, ea.a.p("P2FWZQ==", "AbucXcEX"));
            int N7 = t0.N(i10, ea.a.p("PGERaA==", "IMLe9A4q"));
            int N8 = t0.N(i10, ea.a.p("QWUoZR10", "k6Qo0LCW"));
            int N9 = t0.N(i10, ea.a.p("PWVSZRd0c2EuZQ==", "KrvVxKbz"));
            int N10 = t0.N(i10, ea.a.p("PGlLZQ==", "O8D2pEej"));
            int N11 = t0.N(i10, ea.a.p("RnAvYQdlI3Q=", "leFRcVT5"));
            int N12 = t0.N(i10, ea.a.p("XHQjZQFTFnI9bmU=", "5nDadSXk"));
            int N13 = t0.N(i10, ea.a.p("IHRZZQtTQ3IOd28=", "elXy6i1l"));
            hVar = b10;
            try {
                int N14 = t0.N(i10, ea.a.p("C3QQZQtTPHIcaBRlZQ==", "F4dxyHcU"));
                int N15 = t0.N(i10, ea.a.p("IHRZZQtTQ3IbbGw=", "8dMEyN8k"));
                int N16 = t0.N(i10, ea.a.p("IHRZZQtCWG82TyRl", "mkCMUbbR"));
                int N17 = t0.N(i10, ea.a.p("IHRZZQtCWG82VD1v", "btIuKx4g"));
                int N18 = t0.N(i10, ea.a.p("IHRZZQtCWG82VCJyEGU=", "mxytlZJw"));
                int N19 = t0.N(i10, ea.a.p("IHQSZSJCOW8kRgl1cg==", "7cOzPVVX"));
                int N20 = t0.N(i10, ea.a.p("IHRZZQtJWXQVbmU=", "i2feBou2"));
                int N21 = t0.N(i10, ea.a.p("XHQjZQFJDHQmd28=", "3rBSXQpS"));
                int N22 = t0.N(i10, ea.a.p("IXQ_ZTpJJHQcaBRlZQ==", "GFNWHJ8H"));
                int N23 = t0.N(i10, ea.a.p("XHQjZQFJDHQ0b0Fy", "taMxqMkP"));
                int N24 = t0.N(i10, ea.a.p("XHQjZQFMDW4VT1pl", "jwDB0db0"));
                int N25 = t0.N(i10, ea.a.p("LHQnZTVMKW4vVBFv", "3UCOGFqg"));
                int N26 = t0.N(i10, ea.a.p("IHRZZQtMWG49VCJyEGU=", "NYzkccw2"));
                int N27 = t0.N(i10, ea.a.p("XHQjZQFMDW4VRlt1cg==", "xRbRbd9S"));
                int N28 = t0.N(i10, ea.a.p("K2VdZQ1lZA==", "mhv6rfly"));
                int N29 = t0.N(i10, ea.a.p("V2UnZQdlBlQbbWU=", "Q3DS7Ur9"));
                if (i10.moveToFirst()) {
                    pdfPreviewEntity = new PdfPreviewEntity();
                    pdfPreviewEntity.setId(i10.getLong(N));
                    pdfPreviewEntity.setDate(i10.getLong(N2));
                    pdfPreviewEntity.setFavorite(i10.getInt(N3));
                    pdfPreviewEntity.setFavoriteDate(i10.getLong(N4));
                    pdfPreviewEntity.setName(i10.getString(N5));
                    pdfPreviewEntity.setPage(i10.getInt(N6));
                    pdfPreviewEntity.setPath(i10.getString(N7));
                    pdfPreviewEntity.setRecent(i10.getInt(N8));
                    pdfPreviewEntity.setRecentDate(i10.getLong(N9));
                    pdfPreviewEntity.setSize(i10.getLong(N10));
                    pdfPreviewEntity.setUpdateAt(i10.getLong(N11));
                    pdfPreviewEntity.setOtherStrOne(i10.getString(N12));
                    pdfPreviewEntity.setOtherStrTwo(i10.getString(N13));
                    pdfPreviewEntity.setOtherStrThree(i10.getString(N14));
                    pdfPreviewEntity.setOtherStrAll(i10.getString(N15));
                    if (i10.getInt(N16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pdfPreviewEntity.setOtherBoolOne(z10);
                    if (i10.getInt(N17) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pdfPreviewEntity.setOtherBoolTwo(z11);
                    if (i10.getInt(N18) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    pdfPreviewEntity.setOtherBoolThree(z12);
                    if (i10.getInt(N19) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pdfPreviewEntity.setOtherBoolFour(z13);
                    pdfPreviewEntity.setOtherIntOne(i10.getInt(N20));
                    pdfPreviewEntity.setOtherIntTwo(i10.getInt(N21));
                    pdfPreviewEntity.setOtherIntThree(i10.getInt(N22));
                    pdfPreviewEntity.setOtherIntFour(i10.getInt(N23));
                    pdfPreviewEntity.setOtherLongOne(i10.getLong(N24));
                    pdfPreviewEntity.setOtherLongTwo(i10.getLong(N25));
                    pdfPreviewEntity.setOtherLongThree(i10.getLong(N26));
                    pdfPreviewEntity.setOtherLongFour(i10.getLong(N27));
                    pdfPreviewEntity.setDeleted(i10.getInt(N28));
                    pdfPreviewEntity.setDeletedTime(i10.getLong(N29));
                } else {
                    pdfPreviewEntity = null;
                }
                i10.close();
                hVar.i();
                return pdfPreviewEntity;
            } catch (Throwable th2) {
                th = th2;
                i10.close();
                hVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = b10;
        }
    }

    public final int e(PdfPreviewEntity pdfPreviewEntity) {
        RoomDatabase roomDatabase = this.f5486a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            b bVar = this.c;
            b2.e a10 = bVar.a();
            bVar.d(a10, pdfPreviewEntity);
            int h10 = a10.h();
            bVar.c(a10);
            int i10 = h10 + 0;
            roomDatabase.j();
            return i10;
        } finally {
            roomDatabase.g();
        }
    }
}
