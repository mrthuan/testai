package com.facebook.ads.internal.androidx.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.redexgen.X.AbstractC05484o;

/* loaded from: assets/audience_network.dex */
public class RecyclerView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<RecyclerView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<RecyclerView$SavedState>() { // from class: com.facebook.ads.redexgen.X.4y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A00 */
        public final RecyclerView$SavedState createFromParcel(Parcel parcel) {
            return new RecyclerView$SavedState(parcel, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: A01 */
        public final RecyclerView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new RecyclerView$SavedState(parcel, classLoader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A02 */
        public final RecyclerView$SavedState[] newArray(int i10) {
            return new RecyclerView$SavedState[i10];
        }
    };
    public Parcelable A00;

    public RecyclerView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? AbstractC05484o.class.getClassLoader() : classLoader);
    }

    public RecyclerView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final void A03(RecyclerView$SavedState recyclerView$SavedState) {
        this.A00 = recyclerView$SavedState.A00;
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.A00, 0);
    }
}
