package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

import androidx.activity.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SignPathActionInfo implements Serializable, Cloneable {
    int color;
    String filePath;
    int height;

    /* renamed from: id  reason: collision with root package name */
    long f28499id;
    String otherStrAll;
    String otherStrOne;
    String otherStrThree;
    String otherStrTwo;
    List<a> signPathInfoList;
    int size;
    int width;
    boolean otherBoolOne = false;
    boolean otherBoolTwo = false;
    boolean otherBoolThree = false;
    boolean otherBoolFour = false;
    int otherIntOne = 0;
    int otherIntTwo = 0;
    int otherIntThree = 0;
    int otherIntFour = 0;

    /* loaded from: classes3.dex */
    public static class a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public int f28500a;

        /* renamed from: b  reason: collision with root package name */
        public float f28501b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f28502d;

        /* renamed from: e  reason: collision with root package name */
        public float f28503e;

        /* renamed from: a */
        public final a clone() {
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException unused) {
                return this;
            }
        }

        public final String toString() {
            return ea.a.p("YGksbiNhFmg7blJvEmE1dC1vXFQ_cCY9", "BITDswaG") + this.f28500a + ea.a.p("YyBJPQ==", "scDQGGLC") + this.f28501b + ea.a.p("YyBIPQ==", "2dctFygc") + this.c + ea.a.p("GyAWMj0=", "Dm7nrxbe") + this.f28502d + ea.a.p("HyAyMj0=", "USaat57Y") + this.f28503e + '}';
        }
    }

    public int getColor() {
        return this.color;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.f28499id;
    }

    public int getOtherIntFour() {
        return this.otherIntFour;
    }

    public int getOtherIntOne() {
        return this.otherIntOne;
    }

    public int getOtherIntThree() {
        return this.otherIntThree;
    }

    public int getOtherIntTwo() {
        return this.otherIntTwo;
    }

    public String getOtherStrAll() {
        return this.otherStrAll;
    }

    public String getOtherStrOne() {
        return this.otherStrOne;
    }

    public String getOtherStrThree() {
        return this.otherStrThree;
    }

    public String getOtherStrTwo() {
        return this.otherStrTwo;
    }

    public List<a> getSignPathInfoList() {
        return this.signPathInfoList;
    }

    public int getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isOtherBoolFour() {
        return this.otherBoolFour;
    }

    public boolean isOtherBoolOne() {
        return this.otherBoolOne;
    }

    public boolean isOtherBoolThree() {
        return this.otherBoolThree;
    }

    public boolean isOtherBoolTwo() {
        return this.otherBoolTwo;
    }

    public void setColor(int i10) {
        this.color = i10;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setId(long j10) {
        this.f28499id = j10;
    }

    public void setOtherBoolFour(boolean z10) {
        this.otherBoolFour = z10;
    }

    public void setOtherBoolOne(boolean z10) {
        this.otherBoolOne = z10;
    }

    public void setOtherBoolThree(boolean z10) {
        this.otherBoolThree = z10;
    }

    public void setOtherBoolTwo(boolean z10) {
        this.otherBoolTwo = z10;
    }

    public void setOtherIntFour(int i10) {
        this.otherIntFour = i10;
    }

    public void setOtherIntOne(int i10) {
        this.otherIntOne = i10;
    }

    public void setOtherIntThree(int i10) {
        this.otherIntThree = i10;
    }

    public void setOtherIntTwo(int i10) {
        this.otherIntTwo = i10;
    }

    public void setOtherStrAll(String str) {
        this.otherStrAll = str;
    }

    public void setOtherStrOne(String str) {
        this.otherStrOne = str;
    }

    public void setOtherStrThree(String str) {
        this.otherStrThree = str;
    }

    public void setOtherStrTwo(String str) {
        this.otherStrTwo = str;
    }

    public void setSignPathInfoList(List<a> list) {
        this.signPathInfoList = list;
    }

    public void setSize(int i10) {
        this.size = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("AmkRbhVhH2gJYxJpW24ebl5vKWktPQ==", "v7QvEkBD"));
        sb2.append(this.f28499id);
        sb2.append(ea.a.p("HyAtaR9lMmEGaAkn", "M3De0cI4"));
        sb2.append(this.filePath);
        sb2.append('\'');
        sb2.append(ea.a.p("YiARbzhvSz0=", "JvNrT9uH"));
        sb2.append(this.color);
        sb2.append(ea.a.p("VSAFaTdlPQ==", "ZzyvMM76"));
        sb2.append(this.size);
        sb2.append(ea.a.p("SCA6aRJoPQ==", "mgdMfv7B"));
        sb2.append(this.width);
        sb2.append(ea.a.p("TyAgZRlnKnQ9", "vccHpBT8"));
        sb2.append(this.height);
        sb2.append(ea.a.p("QyAQaRNuaWE8aC9uUm8baUt0PQ==", "uBoct924"));
        sb2.append(this.signPathInfoList);
        sb2.append(ea.a.p("HyAkdBtlEFMGcntuDD0n", "ychJw0VO"));
        sb2.append(this.otherStrOne);
        sb2.append('\'');
        sb2.append(ea.a.p("GiBWdABlMVM8cjJ3Wz0n", "AT69hCFT"));
        sb2.append(this.otherStrTwo);
        sb2.append('\'');
        sb2.append(ea.a.p("HyAkdBtlEFMGcmBoG2UzPSc=", "XATu56Dg"));
        sb2.append(this.otherStrThree);
        sb2.append('\'');
        sb2.append(ea.a.p("dCAfdF9lAlM8cidsWD0n", "djXp7pdN"));
        sb2.append(this.otherStrAll);
        sb2.append('\'');
        sb2.append(ea.a.p("HyAkdBtlEEIdb1hPB2U9", "zf0qcyT7"));
        sb2.append(this.otherBoolOne);
        sb2.append(ea.a.p("YyBedBFlRUI1byZUAm89", "c1DEFXlT"));
        sb2.append(this.otherBoolTwo);
        sb2.append(ea.a.p("YyBedBFlRUI1byZUHXINZT0=", "vUxDwtfs"));
        sb2.append(this.otherBoolThree);
        sb2.append(ea.a.p("XCBWdCJlHEInbwpGW3UlPQ==", "h8p9JnQy"));
        sb2.append(this.otherBoolFour);
        sb2.append(ea.a.p("YyBedBFlRUk0dAVuED0=", "V13PBzR6"));
        sb2.append(this.otherIntOne);
        sb2.append(ea.a.p("HyAkdBtlEEkcdGB3Bj0=", "Jxn5PQEE"));
        sb2.append(this.otherIntTwo);
        sb2.append(ea.a.p("HyAkdBtlEEkcdGBoG2UzPQ==", "JsoSfMrX"));
        sb2.append(this.otherIntThree);
        sb2.append(ea.a.p("HyAkdBtlEEkcdHJvHHI9", "bz5SPTUO"));
        return f.n(sb2, this.otherIntFour, '}');
    }

    public SignPathActionInfo clone() {
        try {
            SignPathActionInfo signPathActionInfo = (SignPathActionInfo) super.clone();
            ArrayList arrayList = new ArrayList();
            for (a aVar : this.signPathInfoList) {
                arrayList.add(aVar.clone());
            }
            signPathActionInfo.setSignPathInfoList(arrayList);
            return signPathActionInfo;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
