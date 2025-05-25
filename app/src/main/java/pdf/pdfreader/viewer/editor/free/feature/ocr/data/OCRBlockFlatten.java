package pdf.pdfreader.viewer.editor.free.feature.ocr.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

/* compiled from: OCRData.kt */
@Keep
/* loaded from: classes3.dex */
public final class OCRBlockFlatten implements Parcelable {
    public static final Parcelable.Creator<OCRBlockFlatten> CREATOR = new a();
    private final boolean isFirstWordOfBlock;
    private boolean isSelected;
    private final String text;
    private final OCRBlockType type;

    /* compiled from: OCRData.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OCRBlockFlatten> {
        @Override // android.os.Parcelable.Creator
        public final OCRBlockFlatten createFromParcel(Parcel parcel) {
            boolean z10;
            g.e(parcel, "parcel");
            String readString = parcel.readString();
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new OCRBlockFlatten(readString, z10, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final OCRBlockFlatten[] newArray(int i10) {
            return new OCRBlockFlatten[i10];
        }
    }

    public OCRBlockFlatten(String str, boolean z10, boolean z11) {
        g.e(str, ea.a.p("R2UzdA==", "rJaTdBfy"));
        this.text = str;
        this.isFirstWordOfBlock = z10;
        this.isSelected = z11;
        this.type = OCRBlockType.NORMAL;
    }

    public static /* synthetic */ OCRBlockFlatten copy$default(OCRBlockFlatten oCRBlockFlatten, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oCRBlockFlatten.text;
        }
        if ((i10 & 2) != 0) {
            z10 = oCRBlockFlatten.isFirstWordOfBlock;
        }
        if ((i10 & 4) != 0) {
            z11 = oCRBlockFlatten.isSelected;
        }
        return oCRBlockFlatten.copy(str, z10, z11);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isFirstWordOfBlock;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final OCRBlockFlatten copy(String text, boolean z10, boolean z11) {
        g.e(text, "text");
        return new OCRBlockFlatten(text, z10, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OCRBlockFlatten)) {
            return false;
        }
        OCRBlockFlatten oCRBlockFlatten = (OCRBlockFlatten) obj;
        if (g.a(this.text, oCRBlockFlatten.text) && this.isFirstWordOfBlock == oCRBlockFlatten.isFirstWordOfBlock && this.isSelected == oCRBlockFlatten.isSelected) {
            return true;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final OCRBlockType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        boolean z10 = this.isFirstWordOfBlock;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z11 = this.isSelected;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i12 + i10;
    }

    public final boolean isFirstWordOfBlock() {
        return this.isFirstWordOfBlock;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        String str = this.text;
        boolean z10 = this.isFirstWordOfBlock;
        boolean z11 = this.isSelected;
        return "OCRBlockFlatten(text=" + str + ", isFirstWordOfBlock=" + z10 + ", isSelected=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        g.e(out, "out");
        out.writeString(this.text);
        out.writeInt(this.isFirstWordOfBlock ? 1 : 0);
        out.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ OCRBlockFlatten(String str, boolean z10, boolean z11, int i10, d dVar) {
        this(str, z10, (i10 & 4) != 0 ? false : z11);
    }
}
