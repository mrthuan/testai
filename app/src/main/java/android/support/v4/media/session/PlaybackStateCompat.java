package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f1755a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1756b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1757d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1758e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1759f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f1760g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1761h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1762i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1763j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f1764k;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f1755a = i10;
        this.f1756b = j10;
        this.c = j11;
        this.f1757d = f10;
        this.f1758e = j12;
        this.f1759f = 0;
        this.f1760g = charSequence;
        this.f1761h = j13;
        this.f1762i = new ArrayList(arrayList);
        this.f1763j = j14;
        this.f1764k = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f1755a);
        sb2.append(", position=");
        sb2.append(this.f1756b);
        sb2.append(", buffered position=");
        sb2.append(this.c);
        sb2.append(", speed=");
        sb2.append(this.f1757d);
        sb2.append(", updated=");
        sb2.append(this.f1761h);
        sb2.append(", actions=");
        sb2.append(this.f1758e);
        sb2.append(", error code=");
        sb2.append(this.f1759f);
        sb2.append(", error message=");
        sb2.append(this.f1760g);
        sb2.append(", custom actions=");
        sb2.append(this.f1762i);
        sb2.append(", active item id=");
        return h.e(sb2, this.f1763j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1755a);
        parcel.writeLong(this.f1756b);
        parcel.writeFloat(this.f1757d);
        parcel.writeLong(this.f1761h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.f1758e);
        TextUtils.writeToParcel(this.f1760g, parcel, i10);
        parcel.writeTypedList(this.f1762i);
        parcel.writeLong(this.f1763j);
        parcel.writeBundle(this.f1764k);
        parcel.writeInt(this.f1759f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f1765a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f1766b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f1767d;

        /* renamed from: e  reason: collision with root package name */
        public Object f1768e;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f1765a = str;
            this.f1766b = charSequence;
            this.c = i10;
            this.f1767d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1766b) + ", mIcon=" + this.c + ", mExtras=" + this.f1767d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1765a);
            TextUtils.writeToParcel(this.f1766b, parcel, i10);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.f1767d);
        }

        public CustomAction(Parcel parcel) {
            this.f1765a = parcel.readString();
            this.f1766b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.f1767d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1755a = parcel.readInt();
        this.f1756b = parcel.readLong();
        this.f1757d = parcel.readFloat();
        this.f1761h = parcel.readLong();
        this.c = parcel.readLong();
        this.f1758e = parcel.readLong();
        this.f1760g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1762i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1763j = parcel.readLong();
        this.f1764k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1759f = parcel.readInt();
    }
}
