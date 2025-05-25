package om;

import am.n1;
import am.w1;
import am.x1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.adapter.SubscriptionJPageType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView;

/* compiled from: SubscriptionJPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23508d;

    public e(boolean z10) {
        this.f23508d = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        if (this.f23508d) {
            int i11 = i10 % 4;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return SubscriptionJPageType.BASIC.ordinal();
                    }
                    return SubscriptionJPageType.AI.ordinal();
                }
                return SubscriptionJPageType.SIGN.ordinal();
            }
            return SubscriptionJPageType.EDITOR.ordinal();
        }
        int i12 = i10 % 3;
        if (i12 != 0) {
            if (i12 != 1) {
                return SubscriptionJPageType.BASIC.ordinal();
            }
            return SubscriptionJPageType.SIGN.ordinal();
        }
        return SubscriptionJPageType.EDITOR.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10) {
        a aVar;
        g.e(holder, "holder");
        if (holder instanceof a) {
            aVar = (a) holder;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        boolean z10;
        RecyclerView.b0 cVar;
        g.e(parent, "parent");
        if (i10 == SubscriptionJPageType.EDITOR.ordinal() || i10 == SubscriptionJPageType.SIGN.ordinal()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = R.id.topSpace;
        boolean z11 = this.f23508d;
        if (z10) {
            View i12 = androidx.activity.f.i(parent, R.layout.item_subscription_j_function, parent, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(i12, R.id.animLayout);
            if (constraintLayout != null) {
                Space space = (Space) com.google.android.play.core.assetpacks.c.u(i12, R.id.bottomSpace);
                if (space != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i12, R.id.imageView);
                    if (appCompatImageView != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i12, R.id.titleTv);
                        if (appCompatTextView != null) {
                            Space space2 = (Space) com.google.android.play.core.assetpacks.c.u(i12, R.id.topSpace);
                            if (space2 != null) {
                                n1 n1Var = new n1((ConstraintLayout) i12, constraintLayout, space, appCompatImageView, appCompatTextView, space2);
                                ea.a.p("BW5fbA10IygEYR9vQXQebl5sM3QschhmloDXLjJvLHQJeE0pQCA2YTplCHQYIDFhVHM3KQ==", "1wl9lFOm");
                                cVar = new d(n1Var, z11);
                            }
                        } else {
                            i11 = R.id.titleTv;
                        }
                    } else {
                        i11 = R.id.imageView;
                    }
                } else {
                    i11 = R.id.bottomSpace;
                }
            } else {
                i11 = R.id.animLayout;
            }
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpO2hESSk6IA==", "QKjuOdmN").concat(i12.getResources().getResourceName(i11)));
        } else if (i10 == SubscriptionJPageType.AI.ordinal()) {
            View i13 = androidx.activity.f.i(parent, R.layout.item_subscription_j_ai, parent, false);
            View u7 = com.google.android.play.core.assetpacks.c.u(i13, R.id.aiPrivilegesLayout);
            if (u7 != null) {
                int i14 = R.id.abstractImg;
                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.abstractImg)) != null) {
                    i14 = R.id.abstractTv;
                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.abstractTv)) != null) {
                        i14 = R.id.grammarCheckImg;
                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.grammarCheckImg)) != null) {
                            i14 = R.id.grammarCheckTv;
                            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.grammarCheckTv)) != null) {
                                i14 = R.id.guideline1;
                                if (((Guideline) com.google.android.play.core.assetpacks.c.u(u7, R.id.guideline1)) != null) {
                                    i14 = R.id.guideline2;
                                    if (((Guideline) com.google.android.play.core.assetpacks.c.u(u7, R.id.guideline2)) != null) {
                                        i14 = R.id.mindMapImg;
                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.mindMapImg)) != null) {
                                            i14 = R.id.mindMapTv;
                                            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.mindMapTv)) != null) {
                                                i14 = R.id.outlineImg;
                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.outlineImg)) != null) {
                                                    i14 = R.id.outlineTv;
                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.outlineTv)) != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) u7;
                                                        i14 = R.id.summarizeImg;
                                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.summarizeImg)) != null) {
                                                            i14 = R.id.summarizeTv;
                                                            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.summarizeTv)) != null) {
                                                                i14 = R.id.translateImg;
                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.translateImg)) != null) {
                                                                    i14 = R.id.translateTv;
                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.translateTv)) != null) {
                                                                        if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(i13, R.id.animLayout)) != null) {
                                                                            if (((Space) com.google.android.play.core.assetpacks.c.u(i13, R.id.bottomSpace)) != null) {
                                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i13, R.id.imageView)) != null) {
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i13, R.id.titleTv);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        if (((Space) com.google.android.play.core.assetpacks.c.u(i13, R.id.topSpace)) != null) {
                                                                                            w1 w1Var = new w1((ConstraintLayout) i13, appCompatTextView2);
                                                                                            ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1m0YCRLiVvL3RWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "37FAuW5Q");
                                                                                            cVar = new b(w1Var);
                                                                                        }
                                                                                    } else {
                                                                                        i11 = R.id.titleTv;
                                                                                    }
                                                                                } else {
                                                                                    i11 = R.id.imageView;
                                                                                }
                                                                            } else {
                                                                                i11 = R.id.bottomSpace;
                                                                            }
                                                                        } else {
                                                                            i11 = R.id.animLayout;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("CmkXcyduUCA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "XcGdN7LO").concat(u7.getResources().getResourceName(i14)));
            }
            i11 = R.id.aiPrivilegesLayout;
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpPmhrSXA6IA==", "ptXNJK4W").concat(i13.getResources().getResourceName(i11)));
        } else {
            View i15 = androidx.activity.f.i(parent, R.layout.item_subscription_j_basic, parent, false);
            int i16 = R.id.bottom_space;
            Space space3 = (Space) com.google.android.play.core.assetpacks.c.u(i15, R.id.bottom_space);
            if (space3 != null) {
                i16 = R.id.centerSpace;
                Space space4 = (Space) com.google.android.play.core.assetpacks.c.u(i15, R.id.centerSpace);
                if (space4 != null) {
                    i16 = R.id.scrollView;
                    BillingIntroduceDetailView billingIntroduceDetailView = (BillingIntroduceDetailView) com.google.android.play.core.assetpacks.c.u(i15, R.id.scrollView);
                    if (billingIntroduceDetailView != null) {
                        i16 = R.id.spike_left_img;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i15, R.id.spike_left_img);
                        if (appCompatImageView2 != null) {
                            i16 = R.id.spike_right_img;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i15, R.id.spike_right_img);
                            if (appCompatImageView3 != null) {
                                i16 = R.id.spike_tv;
                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(i15, R.id.spike_tv);
                                if (textView != null) {
                                    i16 = R.id.subscription_title_tv;
                                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(i15, R.id.subscription_title_tv);
                                    if (textView2 != null) {
                                        i16 = R.id.top_space;
                                        Space space5 = (Space) com.google.android.play.core.assetpacks.c.u(i15, R.id.top_space);
                                        if (space5 != null) {
                                            x1 x1Var = new x1((ConstraintLayout) i15, space3, space4, billingIntroduceDetailView, appCompatImageView2, appCompatImageView3, textView, textView2, space5);
                                            ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mhYDjLlZvB3RWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "gE5iLfEZ");
                                            cVar = new c(x1Var, z11);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpFWhySRE6IA==", "aRU54Riq").concat(i15.getResources().getResourceName(i16)));
        }
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.b0 holder) {
        a aVar;
        g.e(holder, "holder");
        if (holder instanceof a) {
            aVar = (a) holder;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.b0 holder) {
        a aVar;
        g.e(holder, "holder");
        if (holder instanceof a) {
            aVar = (a) holder;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.b();
        }
    }
}
