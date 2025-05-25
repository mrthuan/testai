package pdf.pdfreader.viewer.editor.free.bean;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.g;

/* compiled from: ThirdOpenBean.kt */
@Keep
/* loaded from: classes3.dex */
public final class ThirdOpenBean implements Parcelable {
    public static final Parcelable.Creator<ThirdOpenBean> CREATOR = new a();
    private final int thirdType;
    private final Uri uri;

    /* compiled from: ThirdOpenBean.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ThirdOpenBean> {
        @Override // android.os.Parcelable.Creator
        public final ThirdOpenBean createFromParcel(Parcel parcel) {
            g.e(parcel, "parcel");
            return new ThirdOpenBean((Uri) parcel.readParcelable(ThirdOpenBean.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ThirdOpenBean[] newArray(int i10) {
            return new ThirdOpenBean[i10];
        }
    }

    public ThirdOpenBean(Uri uri, int i10) {
        g.e(uri, ea.a.p("RnJp", "PSPAGlty"));
        this.uri = uri;
        this.thirdType = i10;
    }

    public static /* synthetic */ ThirdOpenBean copy$default(ThirdOpenBean thirdOpenBean, Uri uri, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uri = thirdOpenBean.uri;
        }
        if ((i11 & 2) != 0) {
            i10 = thirdOpenBean.thirdType;
        }
        return thirdOpenBean.copy(uri, i10);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final int component2() {
        return this.thirdType;
    }

    public final ThirdOpenBean copy(Uri uri, int i10) {
        g.e(uri, "uri");
        return new ThirdOpenBean(uri, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdOpenBean)) {
            return false;
        }
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) obj;
        if (g.a(this.uri, thirdOpenBean.uri) && this.thirdType == thirdOpenBean.thirdType) {
            return true;
        }
        return false;
    }

    public final int getThirdType() {
        return this.thirdType;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + this.thirdType;
    }

    public String toString() {
        Uri uri = this.uri;
        int i10 = this.thirdType;
        return "ThirdOpenBean(uri=" + uri + ", thirdType=" + i10 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        g.e(out, "out");
        out.writeParcelable(this.uri, i10);
        out.writeInt(this.thirdType);
    }
}
