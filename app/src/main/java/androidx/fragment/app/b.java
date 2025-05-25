package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.p0;
import java.util.ArrayList;

/* compiled from: BackStackRecordState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3741a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f3742b;
    public final int[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f3743d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3744e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3745f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3746g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3747h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f3748i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3749j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f3750k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<String> f3751l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f3752m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3753n;

    /* compiled from: BackStackRecordState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f3898a.size();
        this.f3741a = new int[size * 6];
        if (aVar.f3903g) {
            this.f3742b = new ArrayList<>(size);
            this.c = new int[size];
            this.f3743d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                p0.a aVar2 = aVar.f3898a.get(i10);
                int i12 = i11 + 1;
                this.f3741a[i11] = aVar2.f3912a;
                ArrayList<String> arrayList = this.f3742b;
                Fragment fragment = aVar2.f3913b;
                arrayList.add(fragment != null ? fragment.f3673f : null);
                int[] iArr = this.f3741a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f3914d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f3915e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f3916f;
                iArr[i16] = aVar2.f3917g;
                this.c[i10] = aVar2.f3918h.ordinal();
                this.f3743d[i10] = aVar2.f3919i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f3744e = aVar.f3902f;
            this.f3745f = aVar.f3904h;
            this.f3746g = aVar.f3735r;
            this.f3747h = aVar.f3905i;
            this.f3748i = aVar.f3906j;
            this.f3749j = aVar.f3907k;
            this.f3750k = aVar.f3908l;
            this.f3751l = aVar.f3909m;
            this.f3752m = aVar.f3910n;
            this.f3753n = aVar.f3911o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3741a);
        parcel.writeStringList(this.f3742b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.f3743d);
        parcel.writeInt(this.f3744e);
        parcel.writeString(this.f3745f);
        parcel.writeInt(this.f3746g);
        parcel.writeInt(this.f3747h);
        TextUtils.writeToParcel(this.f3748i, parcel, 0);
        parcel.writeInt(this.f3749j);
        TextUtils.writeToParcel(this.f3750k, parcel, 0);
        parcel.writeStringList(this.f3751l);
        parcel.writeStringList(this.f3752m);
        parcel.writeInt(this.f3753n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f3741a = parcel.createIntArray();
        this.f3742b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.f3743d = parcel.createIntArray();
        this.f3744e = parcel.readInt();
        this.f3745f = parcel.readString();
        this.f3746g = parcel.readInt();
        this.f3747h = parcel.readInt();
        this.f3748i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3749j = parcel.readInt();
        this.f3750k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3751l = parcel.createStringArrayList();
        this.f3752m = parcel.createStringArrayList();
        this.f3753n = parcel.readInt() != 0;
    }
}
