package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class RequestConfiguration {

    /* renamed from: f  reason: collision with root package name */
    public static final List f10039f = Arrays.asList("MA", PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE, "PG", OperatorName.STROKING_COLOR_GRAY);

    /* renamed from: a  reason: collision with root package name */
    public final int f10040a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10041b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final List f10042d;

    /* renamed from: e  reason: collision with root package name */
    public final PublisherPrivacyPersonalizationState f10043e;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public int f10044a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f10045b = -1;
        public String c = null;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f10046d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final PublisherPrivacyPersonalizationState f10047e = PublisherPrivacyPersonalizationState.DEFAULT;

        public final RequestConfiguration a() {
            return new RequestConfiguration(this.f10044a, this.f10045b, this.c, this.f10046d, this.f10047e);
        }

        public final void b(String str) {
            if (str != null && !"".equals(str)) {
                if (!OperatorName.STROKING_COLOR_GRAY.equals(str) && !"PG".equals(str) && !PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE.equals(str) && !"MA".equals(str)) {
                    zzm.e("Invalid value passed to setMaxAdContentRating: ".concat(str));
                    return;
                } else {
                    this.c = str;
                    return;
                }
            }
            this.c = null;
        }

        public final void c(int i10) {
            if (i10 != -1 && i10 != 0 && i10 != 1) {
                zzm.e("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
                return;
            }
            this.f10044a = i10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);
        
        private final int zzb;

        PublisherPrivacyPersonalizationState(int i10) {
            this.zzb = i10;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i10, int i11, String str, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.f10040a = i10;
        this.f10041b = i11;
        this.c = str;
        this.f10042d = arrayList;
        this.f10043e = publisherPrivacyPersonalizationState;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.c(this.f10040a);
        int i10 = this.f10041b;
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            zzm.e("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
        } else {
            builder.f10045b = i10;
        }
        builder.b(this.c);
        ArrayList arrayList = builder.f10046d;
        arrayList.clear();
        List list = this.f10042d;
        if (list != null) {
            arrayList.addAll(list);
        }
        return builder;
    }
}
