package pdf.pdfreader.viewer.editor.free.split;

import androidx.activity.f;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: SplitPdfData.kt */
/* loaded from: classes3.dex */
public final class SplitPdfData implements Serializable {
    private String fileName;
    private final String filePath;

    /* renamed from: id  reason: collision with root package name */
    private final long f26574id;
    private final List<Integer> pageList;
    private String pageText;

    public SplitPdfData(long j10, String str, String str2, List<Integer> list) {
        g.e(str, ea.a.p("VWknZT1hD2U=", "Ii9eEGza"));
        g.e(str2, ea.a.p("Umk9ZQBhDGg=", "BF4QPxTq"));
        g.e(list, ea.a.p("NmEXZXppFnQ=", "k9Fp6eyb"));
        this.f26574id = j10;
        this.fileName = str;
        this.filePath = str2;
        this.pageList = list;
        this.pageText = "";
    }

    public static /* synthetic */ SplitPdfData copy$default(SplitPdfData splitPdfData, long j10, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = splitPdfData.f26574id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = splitPdfData.fileName;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = splitPdfData.filePath;
        }
        String str4 = str2;
        List<Integer> list2 = list;
        if ((i10 & 8) != 0) {
            list2 = splitPdfData.pageList;
        }
        return splitPdfData.copy(j11, str3, str4, list2);
    }

    public final long component1() {
        return this.f26574id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.filePath;
    }

    public final List<Integer> component4() {
        return this.pageList;
    }

    public final SplitPdfData copy(long j10, String fileName, String filePath, List<Integer> pageList) {
        g.e(fileName, "fileName");
        g.e(filePath, "filePath");
        g.e(pageList, "pageList");
        return new SplitPdfData(j10, fileName, filePath, pageList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPdfData)) {
            return false;
        }
        SplitPdfData splitPdfData = (SplitPdfData) obj;
        if (this.f26574id == splitPdfData.f26574id && g.a(this.fileName, splitPdfData.fileName) && g.a(this.filePath, splitPdfData.filePath) && g.a(this.pageList, splitPdfData.pageList)) {
            return true;
        }
        return false;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getId() {
        return this.f26574id;
    }

    public final List<Integer> getPageList() {
        return this.pageList;
    }

    public final String getPageText() {
        return this.pageText;
    }

    public int hashCode() {
        long j10 = this.f26574id;
        return this.pageList.hashCode() + f.h(this.filePath, f.h(this.fileName, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31);
    }

    public final void setFileName(String str) {
        g.e(str, "<set-?>");
        this.fileName = str;
    }

    public final void setPageText(String str) {
        g.e(str, "<set-?>");
        this.pageText = str;
    }

    public String toString() {
        long j10 = this.f26574id;
        String str = this.fileName;
        String str2 = this.filePath;
        List<Integer> list = this.pageList;
        return "SplitPdfData(id=" + j10 + ", fileName=" + str + ", filePath=" + str2 + ", pageList=" + list + ")";
    }
}
