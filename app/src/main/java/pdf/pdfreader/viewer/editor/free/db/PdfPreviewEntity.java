package pdf.pdfreader.viewer.editor.free.db;

import androidx.activity.f;
import bg.b;
import ea.a;
import java.io.File;
import java.io.Serializable;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* loaded from: classes3.dex */
public class PdfPreviewEntity implements Serializable {
    public static final int DELETED = 1;
    public static final int NOT_DELETED = 0;
    public static final int TYPE_AD = 1;
    public static final int TYPE_AD_2 = 2;
    public static final int TYPE_CONTENT = 0;
    private static final long serialVersionUID = 1;
    private long date;
    private int deleted;
    private long deletedTime;
    private int favorite;
    private long favoriteDate;
    private boolean highlightOnce;

    /* renamed from: id  reason: collision with root package name */
    private long f24211id;
    private int itemType;
    private String name;
    private boolean otherBoolFour;
    private boolean otherBoolOne;
    private boolean otherBoolThree;
    private boolean otherBoolTwo;
    private int otherIntFour;
    private int otherIntOne;
    private int otherIntThree;
    private int otherIntTwo;
    private long otherLongFour;
    private long otherLongOne;
    private long otherLongThree;
    private long otherLongTwo;
    private String otherStrAll;
    private String otherStrOne;
    private String otherStrThree;
    private String otherStrTwo;
    private int page;
    private String path;
    private String preRenamePath;
    private int recent;
    private long recentDate;
    private long size;
    private long updateAt;
    public static final String TYPE_PDF = a.p("H0RG", "hJiENjbT");
    public static final String TYPE_WORD = a.p("ZE8ZRA==", "F5vVgBu8");
    public static final String TYPE_PPT = a.p("aVBU", "kt9U1wrF");
    public static final String TYPE_EXCEL = a.p("ClhyRUw=", "eYMUxjUG");
    public static final String TYPE_ALL = a.p("DkxM", "WlEydB4Z");

    public PdfPreviewEntity() {
        this.f24211id = 0L;
        this.favorite = 0;
        this.page = 1;
        this.recent = 0;
        this.recentDate = 0L;
        this.otherBoolOne = false;
        this.otherBoolTwo = false;
        this.otherBoolThree = false;
        this.otherBoolFour = false;
        this.otherIntOne = 0;
        this.otherIntTwo = 0;
        this.otherIntThree = 0;
        this.otherIntFour = 0;
        this.otherLongOne = 0L;
        this.otherLongTwo = 0L;
        this.otherLongThree = 0L;
        this.otherLongFour = 0L;
        this.deleted = 0;
        this.itemType = 0;
    }

    public long getDate() {
        return this.date;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public long getDeletedTime() {
        return this.deletedTime;
    }

    public int getFavorite() {
        return this.favorite;
    }

    public long getFavoriteDate() {
        return this.favoriteDate;
    }

    public File getFile() {
        return new File(getPath());
    }

    public long getId() {
        return this.f24211id;
    }

    public int getItemType() {
        return this.itemType;
    }

    public String getName() {
        return this.name;
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

    public long getOtherLongFour() {
        return this.otherLongFour;
    }

    public long getOtherLongOne() {
        return this.otherLongOne;
    }

    public long getOtherLongThree() {
        return this.otherLongThree;
    }

    public long getOtherLongTwo() {
        return this.otherLongTwo;
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

    public int getPage() {
        return this.page;
    }

    public String getPath() {
        return this.path;
    }

    public String getPreRenamePath() {
        return this.preRenamePath;
    }

    public int getRecent() {
        return this.recent;
    }

    public long getRecentDate() {
        return this.recentDate;
    }

    public long getSize() {
        return this.size;
    }

    public long getUpdateAt() {
        return this.updateAt;
    }

    public boolean isHighlightOnce() {
        return this.highlightOnce;
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

    public void reset() {
        this.deleted = 0;
        this.deletedTime = 0L;
        this.favorite = 0;
        this.favoriteDate = 0L;
        this.recent = 0;
        this.recentDate = 0L;
        this.date = 0L;
        this.updateAt = 0L;
    }

    public void setDate(long j10) {
        this.date = j10;
    }

    public void setDeleted(int i10) {
        this.deleted = i10;
    }

    public void setDeletedTime(long j10) {
        this.deletedTime = j10;
    }

    public void setFavorite(int i10) {
        this.favorite = i10;
    }

    public void setFavoriteDate(long j10) {
        this.favoriteDate = j10;
    }

    public void setHighlightOnce(boolean z10) {
        this.highlightOnce = z10;
    }

    public void setId(long j10) {
        this.f24211id = j10;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setName(String str) {
        this.name = str;
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

    public void setOtherLongFour(long j10) {
        this.otherLongFour = j10;
    }

    public void setOtherLongOne(long j10) {
        this.otherLongOne = j10;
    }

    public void setOtherLongThree(long j10) {
        this.otherLongThree = j10;
    }

    public void setOtherLongTwo(long j10) {
        this.otherLongTwo = j10;
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

    public void setPage(int i10) {
        this.page = i10;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPreRenamePath(String str) {
        this.preRenamePath = str;
    }

    public void setRecent(int i10) {
        this.recent = i10;
    }

    public void setRecentDate(long j10) {
        this.recentDate = j10;
    }

    public void setSize(long j10) {
        this.size = j10;
    }

    public void setUpdateAt(long j10) {
        this.updateAt = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.p("H2RXUAtlQWk_dw9uAWkceU5pCj0=", "FhkKDR28"));
        sb2.append(this.f24211id);
        sb2.append(a.p("HSAJYTZlPQ==", "od1mBA9t"));
        sb2.append(this.date);
        sb2.append(a.p("HyAtYQVvEGkGZT0=", "JGcO0hE9"));
        sb2.append(this.favorite);
        sb2.append(a.p("YyBXYQ9vRWkuZQ5hAWU9", "fIGfhsJp"));
        sb2.append(this.favoriteDate);
        sb2.append(a.p("dCAMYQFlZyc=", "TRXblZq4"));
        sb2.append(this.name);
        sb2.append('\'');
        sb2.append(a.p("YyBBYR5lPQ==", "wN8zKMDr"));
        sb2.append(this.page);
        sb2.append(a.p("HyA7YQdoXyc=", "6KSixRqG"));
        sb2.append(this.path);
        sb2.append('\'');
        sb2.append(a.p("YyBDZRplWXQ9", "xPOifstB"));
        sb2.append(this.recent);
        sb2.append(a.p("YyBDZRplWXQeYT5lPQ==", "Tce1cA6Y"));
        sb2.append(this.recentDate);
        sb2.append(a.p("WCADaTRlPQ==", "pHtpNKtw"));
        sb2.append(this.size);
        sb2.append(a.p("YyBEcB1hQ2UbdD0=", "WBXsl6vc"));
        sb2.append(this.updateAt);
        sb2.append(a.p("HyAkdBtlEFMGcntuDD0n", "cHcpSM1J"));
        sb2.append(this.otherStrOne);
        sb2.append('\'');
        sb2.append(a.p("HyAkdBtlEFMGcmB3Bj0n", "5owUE8Vy"));
        sb2.append(this.otherStrTwo);
        sb2.append('\'');
        sb2.append(a.p("YyBedBFlRVMuch5oB2UNPSc=", "ZJ3GLyUA"));
        sb2.append(this.otherStrThree);
        sb2.append('\'');
        sb2.append(a.p("YyBedBFlRVMucgtsGT0n", "mX1Vw8pE"));
        sb2.append(this.otherStrAll);
        sb2.append('\'');
        sb2.append(a.p("WyApdCNlOEInbwpPWmU9", "73wFKJTi"));
        sb2.append(this.otherBoolOne);
        sb2.append(a.p("HyAkdBtlEEIdb1hUHm89", "JoFyQ53U"));
        sb2.append(this.otherBoolTwo);
        sb2.append(a.p("HyAkdBtlEEIdb1hUAXIzZT0=", "s3uJYlkS"));
        sb2.append(this.otherBoolThree);
        sb2.append(a.p("SSA-dCdlREInbwpGW3UlPQ==", "A3eQO69t"));
        sb2.append(this.otherBoolFour);
        sb2.append(a.p("YyBedBFlRUk0dAVuED0=", "n68YhPBW"));
        sb2.append(this.otherIntOne);
        sb2.append(a.p("HyAkdBtlEEkcdGB3Bj0=", "72ES6jhi"));
        sb2.append(this.otherIntTwo);
        sb2.append(a.p("YyBedBFlRUk0dB5oB2UNPQ==", "UcdWfWuT"));
        sb2.append(this.otherIntThree);
        sb2.append(a.p("HyAkdBtlEEkcdHJvHHI9", "8h5BpSUK"));
        sb2.append(this.otherIntFour);
        sb2.append(a.p("YyBedBFlRUw1bi1PG2U9", "M4EJRKC1"));
        sb2.append(this.otherLongOne);
        sb2.append(a.p("HyAkdBtlEEwdblNUHm89", "ZJsM5YDC"));
        sb2.append(this.otherLongTwo);
        sb2.append(a.p("HyAkdBtlEEwdblNUAXIzZT0=", "k8fG0pFL"));
        sb2.append(this.otherLongThree);
        sb2.append(a.p("YyBedBFlRUw1bi1GGnUaPQ==", "RXrGBwV1"));
        sb2.append(this.otherLongFour);
        sb2.append(a.p("HSAsZQNlImUsPQ==", "AO1HoV7o"));
        sb2.append(this.deleted);
        sb2.append(a.p("YiA-ZSNlEmUsVA9tUT0=", "yTNZOfHY"));
        sb2.append(this.deletedTime);
        sb2.append(a.p("HyAyaVBoDmkvaBJPWmMyPQ==", "313Z7bM3"));
        sb2.append(this.highlightOnce);
        sb2.append(a.p("HyAidBZtNnkCZT0=", "zh0Y7d2C"));
        return f.n(sb2, this.itemType, '}');
    }

    public PdfPreviewEntity(int i10) {
        this.f24211id = 0L;
        this.favorite = 0;
        this.page = 1;
        this.recent = 0;
        this.recentDate = 0L;
        this.otherBoolOne = false;
        this.otherBoolTwo = false;
        this.otherBoolThree = false;
        this.otherBoolFour = false;
        this.otherIntOne = 0;
        this.otherIntTwo = 0;
        this.otherIntThree = 0;
        this.otherIntFour = 0;
        this.otherLongOne = 0L;
        this.otherLongTwo = 0L;
        this.otherLongThree = 0L;
        this.otherLongFour = 0L;
        this.deleted = 0;
        this.itemType = i10;
    }

    public PdfPreviewEntity(File file) {
        this.f24211id = 0L;
        this.favorite = 0;
        this.page = 1;
        this.recent = 0;
        this.recentDate = 0L;
        this.otherBoolOne = false;
        this.otherBoolTwo = false;
        this.otherBoolThree = false;
        this.otherBoolFour = false;
        this.otherIntOne = 0;
        this.otherIntTwo = 0;
        this.otherIntThree = 0;
        this.otherIntFour = 0;
        this.otherLongOne = 0L;
        this.otherLongTwo = 0L;
        this.otherLongThree = 0L;
        this.otherLongFour = 0L;
        this.deleted = 0;
        this.itemType = 0;
        this.path = file.getAbsolutePath();
        this.name = b.B0(file);
        this.size = file.length();
        this.date = file.lastModified();
        this.otherStrOne = v.y(file);
    }
