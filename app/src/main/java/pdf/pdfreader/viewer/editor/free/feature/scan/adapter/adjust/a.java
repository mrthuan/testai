package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.ChoosePDFAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.l;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25648b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f25647a = i10;
        this.f25648b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        int i10 = this.f25647a;
        int i11 = 0;
        Integer num = null;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.f25648b;
        switch (i10) {
            case 0:
                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = (ImageAdjustFiltersAdapter) obj2;
                ho.b bVar = (ho.b) obj;
                g.e(imageAdjustFiltersAdapter, ea.a.p("O2hYc10w", "2pEPnFp8"));
                g.e(bVar, ea.a.p("a2FYRhBsQ2Vy", "Iix44jR8"));
                imageAdjustFiltersAdapter.f25641f.b(bVar);
                return;
            case 1:
                ChoosePDFAdapter.a aVar = (ChoosePDFAdapter.a) obj2;
                ChoosePDFAdapter choosePDFAdapter = (ChoosePDFAdapter) obj;
                int i12 = ChoosePDFAdapter.a.f27098h;
                g.e(aVar, ea.a.p("R2gic1cw", "r5QwKAvJ"));
                g.e(choosePDFAdapter, ea.a.p("O2hYc10x", "wWRbyDhc"));
                Integer valueOf = Integer.valueOf(aVar.getAdapterPosition());
                int intValue = valueOf.intValue();
                if (!((intValue < 0 || intValue >= choosePDFAdapter.h().size()) ? false : false)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    long id2 = choosePDFAdapter.h().get(intValue2).getId();
                    for (Object obj3 : choosePDFAdapter.h()) {
                        int i13 = i11 + 1;
                        if (i11 >= 0) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj3;
                            if (pdfPreviewEntity.getId() == choosePDFAdapter.f27096h || pdfPreviewEntity.getId() == id2) {
                                choosePDFAdapter.notifyItemChanged(i11, ea.a.p("PGVdZRp0Z0RG", "BVXAw2cd"));
                            }
                            i11 = i13;
                        } else {
                            ge.a.c0();
                            throw null;
                        }
                    }
                    choosePDFAdapter.f27096h = id2;
                    choosePDFAdapter.f27093e.invoke(choosePDFAdapter.h().get(intValue2));
                    return;
                }
                return;
            case 2:
                l.a aVar2 = (l.a) obj2;
                l lVar = (l) obj;
                int i14 = l.a.f27267i;
                g.e(aVar2, ea.a.p("Imhdcx0w", "VyV49rwP"));
                g.e(lVar, ea.a.p("O2hYc10x", "fyB18eul"));
                Integer valueOf2 = Integer.valueOf(aVar2.getAdapterPosition());
                int intValue3 = valueOf2.intValue();
                if (intValue3 >= 0 && intValue3 < lVar.getItemCount()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    num = valueOf2;
                }
                if (num != null) {
                    aVar2.f27273h.f27260e.b(num.intValue());
                    return;
                }
                return;
            case 3:
                final String[] strArr = (String[]) obj2;
                final n nVar = (n) obj;
                int i15 = n.f27916d0;
                g.e(strArr, ea.a.p("aGEiSRplIXM=", "nwLFnL9C"));
                g.e(nVar, ea.a.p("TWhac3Qw", "tL93PgAP"));
                b.a aVar3 = new b.a(view.getContext());
                AlertController.b bVar2 = aVar3.f1918a;
                bVar2.f1906k = true;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        String str;
                        boolean z11;
                        Object obj4;
                        int i17 = n.f27916d0;
                        String p10 = ea.a.p("F2EvSQdlD3M=", "OXaLjJNe");
                        String[] strArr2 = strArr;
                        kotlin.jvm.internal.g.e(strArr2, p10);
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "er4PVuTz"));
                        String key = strArr2[i16];
                        AdUtils adUtils = AdUtils.f28513a;
                        kotlin.jvm.internal.g.e(key, "key");
                        AdUtils.f28513a.getClass();
                        final String str2 = (String) ((Map) AdUtils.c.getValue()).get(key);
                        if (str2 == null) {
                            str2 = "";
                        }
                        Context context = view.getContext();
                        kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "1P4OduQU"));
                        final ArrayList arrayList = new ArrayList();
                        String[] strArr3 = AdUtils.f28514b.get(str2);
                        if (strArr3 != null) {
                            for (String str3 : strArr3) {
                                arrayList.add(new cm.a(str3));
                            }
                        }
                        String[] strArr4 = AdUtils.f28514b.get(str2);
                        if (strArr4 == null) {
                            strArr4 = new String[0];
                        }
                        AdUtils.f28513a.getClass();
                        String c = AdUtils.c(strArr4);
                        try {
                            str = pdf.pdfreader.viewer.editor.free.utils.q0.h(ReaderPdfApplication.m()).getString(str2, c);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            str = "";
                        }
                        kotlin.jvm.internal.g.d(str, ea.a.p("LG9fZhBn", "ULhvYNkV"));
                        if (TextUtils.isEmpty(str)) {
                            z11 = kotlin.jvm.internal.g.a(str, "");
                        } else {
                            try {
                                new JSONArray(str).length();
                                z11 = true;
                            } catch (Exception unused) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            c = str;
                        }
                        if (!TextUtils.isEmpty(c)) {
                            JSONArray jSONArray = new JSONArray(c);
                            int length = jSONArray.length();
                            for (int i18 = 0; i18 < length; i18++) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (kotlin.jvm.internal.g.a(((cm.a) obj4).f5713a, jSONArray.get(i18))) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                cm.a aVar4 = (cm.a) obj4;
                                if (aVar4 != null) {
                                    aVar4.f5714b = true;
                                }
                            }
                        }
                        MaterialDialog.b bVar3 = new MaterialDialog.b(context);
                        bVar3.f5968x = androidx.core.content.a.getColor(context, R.color.colorPrimary);
                        bVar3.f5956l = d3.b.b(context);
                        bVar3.B = true;
                        bVar3.f5957m = d3.b.b(context);
                        bVar3.C = true;
                        bVar3.f5953i = androidx.core.content.a.getColor(context, R.color.colorSurface);
                        bVar3.A = true;
                        bVar3.f5952h = androidx.core.content.a.getColor(context, R.color.colorSurface);
                        bVar3.f5970z = true;
                        ea.a.p("DXVYbB1lRSg5byR0EHgcKT8gTiBlIEUg1ICVUi9zXFJhY15sFnIZYzVsJXImdRpmVGMLKQ==", "RFto63Jt");
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            cm.a aVar5 = (cm.a) it2.next();
                            CheckBox checkBox = new CheckBox(context);
                            checkBox.setTag(aVar5.f5713a);
                            checkBox.setText(aVar5.f5713a);
                            checkBox.setChecked(aVar5.f5714b);
                            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                                    Object obj5;
                                    int i19 = n.f27916d0;
                                    String p11 = ea.a.p("F3M_YQdlcw==", "RsBQwI5X");
                                    List list = arrayList;
                                    kotlin.jvm.internal.g.e(list, p11);
                                    Iterator it3 = list.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj5 = it3.next();
                                            if (kotlin.jvm.internal.g.a(((cm.a) obj5).f5713a, compoundButton.getTag())) {
                                                break;
                                            }
                                        } else {
                                            obj5 = null;
                                            break;
                                        }
                                    }
                                    cm.a aVar6 = (cm.a) obj5;
                                    if (aVar6 != null) {
                                        aVar6.f5714b = z12;
                                    }
                                }
                            });
                            linearLayout.addView(checkBox);
                        }
                        if (linearLayout.getParent() != null && (linearLayout.getParent() instanceof ViewGroup)) {
                            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
                        }
                        bVar3.f5954j = linearLayout;
                        bVar3.f5967w = true;
                        bVar3.f5966v = new DialogInterface.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface2) {
                                int i19 = n.f27916d0;
                                String p11 = ea.a.p("F2sueQ==", "rJ0VU5oC");
                                String str4 = str2;
                                kotlin.jvm.internal.g.e(str4, p11);
                                String p12 = ea.a.p("F3M_YQdlcw==", "82SUhK5R");
                                List list = arrayList;
                                kotlin.jvm.internal.g.e(list, p12);
                                AdUtils adUtils2 = AdUtils.f28513a;
                                Context m10 = ReaderPdfApplication.m();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj5 : list) {
                                    if (((cm.a) obj5).f5714b) {
                                        arrayList2.add(obj5);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(kotlin.collections.g.h0(arrayList2, 10));
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(((cm.a) it3.next()).f5713a);
                                }
                                AdUtils.f28513a.getClass();
                                pdf.pdfreader.viewer.editor.free.utils.q0.A(m10, str4, AdUtils.c((String[]) arrayList3.toArray(new String[0])));
                            }
                        };
                        new MaterialDialog(bVar3).show();
                    }
                };
                bVar2.f1908m = strArr;
                bVar2.f1910o = onClickListener;
                aVar3.a().show();
                return;
            case 4:
                DebugPageAndDialogFragment.u0((Context) obj2, (DebugPageAndDialogFragment) obj);
                return;
            default:
                Context context = (Context) obj2;
                e1 e1Var = (e1) obj;
                int i16 = e1.f27886d0;
                g.e(context, ea.a.p("F2MkbgdlGnQ=", "n5TYjYCR"));
                g.e(e1Var, ea.a.p("HWgecxIw", "7qiw6Djs"));
                j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f130096), true, null, -1);
                return;
        }
    }
}
