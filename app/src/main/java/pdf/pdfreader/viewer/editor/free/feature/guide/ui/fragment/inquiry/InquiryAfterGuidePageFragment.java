package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry;

import a6.h;
import am.u0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import com.google.android.play.core.assetpacks.c;
import ea.a;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.data.InquiryAfterGuideType;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel;
import pdf.pdfreader.viewer.editor.free.utils.b0;
import pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: InquiryAfterGuidePageFragment.kt */
/* loaded from: classes3.dex */
public final class InquiryAfterGuidePageFragment extends BaseVMFragment<u0> {

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f25036c0 = y0.a(this, i.a(InquiryAfterGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, a.p("QWU6dRpyB0ERdF12AHQvKG0uRGkjdw5vAmUrUxJvFmU=", "fGfd0EVi"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                g.d(defaultViewModelCreationExtras, a.p("BGUzdV5yI0ErdA92XXQuKBEuNmUvYUNsAFYYZSZNLWQTbAFyUmEyaSduI3hAcjZz", "bAvB7Fmx"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsJ1Y7ZRZNKWRWbBtyHHYLZBdycmEKdDlyeQ==", "SRaFlCKj"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public InquiryAfterGuideType f25037d0;

    /* renamed from: f0  reason: collision with root package name */
    public static final String f25035f0 = ea.a.p("JGVIXwlhUGUFdDNwZQ==", "id8RCdJJ");

    /* renamed from: e0  reason: collision with root package name */
    public static final a f25034e0 = new a();

    /* compiled from: InquiryAfterGuidePageFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static InquiryAfterGuidePageFragment a(InquiryAfterGuideType type) {
            g.e(type, "type");
            InquiryAfterGuidePageFragment inquiryAfterGuidePageFragment = new InquiryAfterGuidePageFragment();
            inquiryAfterGuidePageFragment.j0(t0.q(new Pair(ea.a.p("JGVIXwlhUGUFdDNwZQ==", "pZALnpRL"), Integer.valueOf(type.ordinal()))));
            return inquiryAfterGuidePageFragment;
        }
    }

    /* compiled from: InquiryAfterGuidePageFragment.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25038a;

        static {
            int[] iArr = new int[InquiryAfterGuideType.values().length];
            try {
                iArr[InquiryAfterGuideType.ROLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InquiryAfterGuideType.FEATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25038a = iArr;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final u0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_inquiry_after_guide_page, viewGroup, false);
        int i10 = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) c.u(inflate, R.id.recyclerView);
        if (recyclerView != null) {
            i10 = R.id.subtitleTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) c.u(inflate, R.id.subtitleTv);
            if (appCompatTextView != null) {
                i10 = R.id.titleTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) c.u(inflate, R.id.titleTv);
                if (appCompatTextView2 != null) {
                    u0 u0Var = new u0((ConstraintLayout) inflate, recyclerView, appCompatTextView, appCompatTextView2);
                    ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpNGUALG9mKmw8ZSk=", "RKYuZrOK");
                    return u0Var;
                }
            }
        }
        throw new NullPointerException(ea.a.p("JmkJczBuICA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "qXkzYGQU").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
        int ordinal;
        InquiryAfterGuideType.a aVar = InquiryAfterGuideType.Companion;
        Bundle bundle2 = this.f3674g;
        if (bundle2 != null) {
            ordinal = bundle2.getInt(f25035f0);
        } else {
            ordinal = InquiryAfterGuideType.ROLE.ordinal();
        }
        aVar.getClass();
        InquiryAfterGuideType inquiryAfterGuideType = InquiryAfterGuideType.ROLE;
        if (ordinal != inquiryAfterGuideType.ordinal()) {
            inquiryAfterGuideType = InquiryAfterGuideType.FEATURE;
        }
        this.f25037d0 = inquiryAfterGuideType;
        if (bundle == null) {
            if (inquiryAfterGuideType != null) {
                int i10 = b.f25038a[inquiryAfterGuideType.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        tf.c cVar = UserGuideEvent.f28677a;
                        UserGuideEvent.f(ea.a.p("N2EEZTI=", "HtGc6Vn9"));
                        return;
                    }
                    return;
                }
                tf.c cVar2 = UserGuideEvent.f28677a;
                UserGuideEvent.f(ea.a.p("Q2EsZTE=", "BPqarzDl"));
                return;
            }
            g.i(ea.a.p("O3lBZQ==", "GTx6otXJ"));
            throw null;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        Locale locale;
        qm.a aVar;
        LocaleList locales;
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        InquiryAfterGuideViewModel t02 = t0();
        InquiryAfterGuideType inquiryAfterGuideType = this.f25037d0;
        if (inquiryAfterGuideType != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = r4.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
                g.d(locale, ea.a.p("SAprIFMgQiBSIEZlGm8jcidlQS4lby1msYD0Zy50LW9QYSdlAChLLhVlQChZKVwgZCASfQ==", "SRKaFeXi"));
            } else {
                locale = r4.getResources().getConfiguration().locale;
                g.d(locale, ea.a.p("SAprIFMgQiBSIHRTHHAmciFzQShkRAZQjIDzbwZmWWdGcip0Gm8MLh5vV2EFZVwgZCASfQ==", "nUh0UUUm"));
            }
            if (!g.a(locale, t02.f25046j)) {
                t02.f25046j = locale;
                t02.f25047k = null;
                t02.f25048l = null;
            }
            int i10 = InquiryAfterGuideViewModel.a.f25049a[inquiryAfterGuideType.ordinal()];
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 == 2) {
                    aVar = t02.f25048l;
                    if (aVar == null) {
                        String string = r4.getString(R.string.arg_res_0x7f13007a);
                        String e10 = h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpOGdYYUNrLGZWYT91AWURXxVwQCk=", "Vv0slX48", string, r4, R.string.arg_res_0x7f130079);
                        g.d(e10, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpOGdDYSNrKWZWYT91AWURXxZlR2M2ZyZ0KQ==", "VmPvJa8b"));
                        String string2 = r4.getString(R.string.arg_res_0x7f130190);
                        g.d(string2, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpNmdZaD1nDWwmZ1l0JmFZbjV0K3QQXw9wQSk=", "pKJpXwTe"));
                        String string3 = r4.getString(R.string.arg_res_0x7f130113);
                        g.d(string3, ea.a.p("Bm9XdCt4ES4vZRJTQHI-bl8oAC46dERpGmdfZTVpNl8RZUF0EWkIYS9lOWdEdCk=", "k8e9Necp"));
                        String string4 = r4.getString(R.string.arg_res_0x7f13019b);
                        g.d(string4, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpX2d0aVVhUWUQdF5fCWRRKQ==", "UC2r1Z86"));
                        String string5 = r4.getString(R.string.arg_res_0x7f130453);
                        g.d(string5, ea.a.p("VG8EdDN4AC4vZRJTQHI-bl8oAC46dERpGmdfczJhLF9DbzVwMmYp", "4j7jVtjD"));
                        String string6 = r4.getString(R.string.arg_res_0x7f130478);
                        g.d(string6, ea.a.p("D29WdFx4MC4vZRJTQHI-bl8oAC46dERpGmdfczhnLF8KaVRsZm8xdBdnFnQp", "hwl89D8c"));
                        String string7 = r4.getString(R.string.arg_res_0x7f13058f);
                        g.d(string7, ea.a.p("NW8cdBx4ES4vZRJTQHI-bl8oAC46dERpGmdfdz5yJl8iby1wHWYp", "9YVryekB"));
                        String string8 = r4.getString(R.string.arg_res_0x7f13025a);
                        g.d(string8, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpBmdFbTNyFGUQc0FsEHRocD5mFWcFdCk=", "Lx14hkVs"));
                        String string9 = r4.getString(R.string.arg_res_0x7f1300da);
                        g.d(string9, ea.a.p("J29ZdBB4LS4vZRJTQHI-bl8oAC46dERpGmdfYyNlI3QhX0dkE18-cDwp", "1xD7uYDH"));
                        String string10 = r4.getString(R.string.arg_res_0x7f130240);
                        g.d(string10, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpVmdCbThuO2cqX0FhHmVEXz1wPik=", "dcc18lYZ"));
                        String string11 = r4.getString(R.string.arg_res_0x7f13033f);
                        g.d(string11, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpV2dFcAJmMHRcXyJtEmcHKQ==", "9kfoi0Fh"));
                        String string12 = r4.getString(R.string.arg_res_0x7f130038);
                        g.d(string12, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpX2d5YQFfG3M8aUJ0GG5DXz1wPik=", "NoWW1Whz"));
                        aVar = new qm.a(string, e10, ge.a.I(new qm.b(R.drawable.ic_inquiry_feature_annotate, string2), new qm.b(R.drawable.ic_inquiry_feature_edit, string3), new qm.b(R.drawable.ic_inquiry_feature_img2pdf, string4), new qm.b(R.drawable.ic_inquiry_feature_scan, string5), new qm.b(R.drawable.ic_inquiry_feature_signature, string6), new qm.b(R.drawable.ic_inquiry_feature_word2pdf, string7), new qm.b(R.drawable.ic_inquiry_feature_merge, string8), new qm.b(R.drawable.ic_inquiry_feature_create, string9), new qm.b(R.drawable.ic_inquiry_feature_manager, string10), new qm.b(R.drawable.ic_inquiry_feature_pdf2img, string11), new qm.b(R.drawable.ic_inquiry_feature_ai, string12)));
                        t02.f25048l = aVar;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aVar = t02.f25047k;
                if (aVar == null) {
                    String string13 = r4.getString(R.string.arg_res_0x7f13007c);
                    String e11 = h.e("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpA2cbYRZrF29QYz5wEnQLbxxfU3AdKQ==", "m5eH1qKl", string13, r4, R.string.arg_res_0x7f13007b);
                    g.d(e11, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpq4DnLjRzGV9cYyh1A2EWaR1ua2QMczVfI3BGKQ==", "IAUrjNYa"));
                    String string14 = r4.getString(R.string.arg_res_0x7f130114);
                    g.d(string14, ea.a.p("NW9adFJ4GS4vZRJTQHI-bl8oAC46dERpGmdfZTV1IWEib0ZfUHAZKQ==", "d6V47mkI"));
                    String string15 = r4.getString(R.string.arg_res_0x7f130076);
                    g.d(string15, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpJ2dYYSVjGWlHZSh0LHAPXxVwQCk=", "IvWq8r0C"));
                    String string16 = r4.getString(R.string.arg_res_0x7f1301c7);
                    g.d(string16, ea.a.p("Im9ZdAp4Oy4vZRJTQHI-bl8oAC46dERpGmdfbDRnI2wecEVvMGc_dCk=", "l3A7oOg2"));
                    String string17 = r4.getString(R.string.arg_res_0x7f130094);
                    g.d(string17, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdproDPcyduDXM8X0JhFWVEXzdhJGESZRpfUnAaKQ==", "8AwKLiNh"));
                    String string18 = r4.getString(R.string.arg_res_0x7f1301b9);
                    g.d(string18, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpWGdFaUZfKnBWYyJhH2kRdC1nRHQp", "6k2YhoG0"));
                    String string19 = r4.getString(R.string.arg_res_0x7f13049f);
                    g.d(string19, ea.a.p("NW8odAJ4Ny4vZRJTQHI-bl8oAC46dERpGmdfcyV1JmU4dBlnF3Qp", "8FVFgC19"));
                    String string20 = r4.getString(R.string.arg_res_0x7f13018d);
                    g.d(string20, ea.a.p("CW8YdFJ4DC4vZRJTQHI-bl8oAC46dERpGmdfaDRhLnQCYxdyUl8IcidfAXBAKQ==", "CJjv7xBM"));
                    String string21 = r4.getString(R.string.arg_res_0x7f1301bb);
                    g.d(string21, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpoICUaldiMnNWZSBlAV8QZRFyQWkdZSRfI3BGKQ==", "B28m5Wch"));
                    String string22 = r4.getString(R.string.arg_res_0x7f1302ee);
                    g.d(string22, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpNmdebxBoCHIp", "Xpdma4BW"));
                    aVar = new qm.a(string13, e11, ge.a.I(new qm.b(R.drawable.ic_inquiry_role_educator, string14), new qm.b(R.drawable.ic_inquiry_role_architect, string15), new qm.b(R.drawable.ic_inquiry_role_legal, string16), new qm.b(R.drawable.ic_inquiry_role_business, string17), new qm.b(R.drawable.ic_inquiry_role_it, string18), new qm.b(R.drawable.ic_inquiry_role_student, string19), new qm.b(R.drawable.ic_inquiry_role_healthcare, string20), new qm.b(R.drawable.ic_inquiry_role_seeker, string21), new qm.b(R.drawable.ic_inquiry_role_other, string22)));
                    t02.f25047k = aVar;
                }
            }
            VB vb2 = this.Y;
            g.b(vb2);
            ((u0) vb2).f1506d.setText(aVar.f29384a);
            VB vb3 = this.Y;
            g.b(vb3);
            ((u0) vb3).c.setText(aVar.f29385b);
            VB vb4 = this.Y;
            g.b(vb4);
            u0 u0Var = (u0) vb4;
            InquiryAfterGuideType inquiryAfterGuideType2 = this.f25037d0;
            if (inquiryAfterGuideType2 != null) {
                if (inquiryAfterGuideType2 == InquiryAfterGuideType.ROLE) {
                    z10 = true;
                }
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a aVar2 = new pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a(aVar.c, new l<Set<? extends Integer>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment$initView$1

                    /* compiled from: InquiryAfterGuidePageFragment.kt */
                    /* loaded from: classes3.dex */
                    public /* synthetic */ class a {

                        /* renamed from: a  reason: collision with root package name */
                        public static final /* synthetic */ int[] f25039a;

                        static {
                            int[] iArr = new int[InquiryAfterGuideType.values().length];
                            try {
                                iArr[InquiryAfterGuideType.ROLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[InquiryAfterGuideType.FEATURE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f25039a = iArr;
                        }
                    }

                    {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Set<Integer> it) {
                        g.e(it, "it");
                        InquiryAfterGuideType inquiryAfterGuideType3 = InquiryAfterGuidePageFragment.this.f25037d0;
                        if (inquiryAfterGuideType3 != null) {
                            int i11 = a.f25039a[inquiryAfterGuideType3.ordinal()];
                            if (i11 == 1) {
                                InquiryAfterGuideViewModel t03 = InquiryAfterGuidePageFragment.this.t0();
                                t03.getClass();
                                t03.f25040d.c(it, ea.a.p("PW9dZSplW2U5dANuEWV4", "UsKEI6mG"));
                                return;
                            } else if (i11 != 2) {
                                return;
                            } else {
                                InquiryAfterGuideViewModel t04 = InquiryAfterGuidePageFragment.this.t0();
                                t04.getClass();
                                t04.f25040d.c(it, ea.a.p("VWUqdAZyB1MXbFFjHUk4ZCF4", "1mcjga3e"));
                                return;
                            }
                        }
                        g.i(ea.a.p("O3lBZQ==", "Gs43M1rt"));
                        throw null;
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ d invoke(Set<? extends Integer> set) {
                        invoke2((Set<Integer>) set);
                        return d.f30009a;
                    }
                }, z10);
                InquiryAfterGuideType inquiryAfterGuideType3 = this.f25037d0;
                if (inquiryAfterGuideType3 != null) {
                    int i11 = b.f25038a[inquiryAfterGuideType3.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Set<Integer> set = (Set) t0().f25044h.d();
                            if (set == null) {
                                set = EmptySet.INSTANCE;
                            } else {
                                ea.a.p("EW4FdStyDVYhZRFNW2QybBZmN2E9dURlloDXST9kJ3hWdhVsN2VUP3IgA21EdC5TXXR6KQ==", "9AxtBtmY");
                            }
                            aVar2.i(set);
                        }
                    } else {
                        Set<Integer> set2 = (Set) t0().f25043g.d();
                        if (set2 == null) {
                            set2 = EmptySet.INSTANCE;
                        } else {
                            ea.a.p("Jm5AdRByTlYzZT1NGmQNbBtyAWwgUwBsoYDzSS1kL3hhdlBsDGUXP2AgL20FdBFTUHRGKQ==", "AlpyCUCJ");
                        }
                        aVar2.i(set2);
                    }
                    u0Var.f1505b.setAdapter(aVar2);
                    VB vb5 = this.Y;
                    g.b(vb5);
                    ((u0) vb5).f1505b.q(new b0(r4.getResources().getDimensionPixelSize(R.dimen.dp_10)));
                    return;
                }
                g.i(ea.a.p("O3lBZQ==", "MpUJxtbD"));
                throw null;
            }
            g.i(ea.a.p("R3k7ZQ==", "hWhllal7"));
            throw null;
        }
        g.i(ea.a.p("O3lBZQ==", "oWzLtNB3"));
        throw null;
    }

    public final InquiryAfterGuideViewModel t0() {
        return (InquiryAfterGuideViewModel) this.f25036c0.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }
}
