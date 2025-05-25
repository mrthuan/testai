package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.io.File;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.adapter.c;
import pdf.pdfreader.viewer.editor.free.ui.adapter.o;
import qn.a;

/* compiled from: FeedbackActivity.kt */
/* loaded from: classes3.dex */
public abstract class e extends androidx.appcompat.app.c implements c.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f26901p = ea.a.p("PHgHcilfHGUtZARhV2sIdEFwZQ==", "D3YsHzYy");

    /* renamed from: q  reason: collision with root package name */
    public static final String f26902q = ea.a.p("Vng_chJfBGUXZFZhCmsJYytuRmUodA==", "gqtaaSC5");

    /* renamed from: r  reason: collision with root package name */
    public static final String f26903r = ea.a.p("KnhFchhfUWU_ZChhFms3aVhhCWU=", "iwvC6Yme");

    /* renamed from: s  reason: collision with root package name */
    public static final String f26904s = ea.a.p("D3g3cixfB2Upcwlua3MybF1jJmVk", "THjCMuiK");

    /* renamed from: t  reason: collision with root package name */
    public static final String f26905t = ea.a.p("Vng_chJfEmgddFtfBWkldA==", "M5OptQ5F");

    /* renamed from: u  reason: collision with root package name */
    public static final String f26906u = ea.a.p("Vng_chJfEmgddFtfHWE9ZQ==", "JFSc15SW");

    /* renamed from: a  reason: collision with root package name */
    public EditText f26907a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f26908b;
    public RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f26909d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f26910e;

    /* renamed from: g  reason: collision with root package name */
    public Parcelable f26912g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f26913h;

    /* renamed from: i  reason: collision with root package name */
    public pn.a[] f26914i;

    /* renamed from: j  reason: collision with root package name */
    public o.a f26915j;

    /* renamed from: k  reason: collision with root package name */
    public String f26916k;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<String> f26911f = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f26917l = 1;

    /* renamed from: m  reason: collision with root package name */
    public float f26918m = 0.95f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f26919n = true;

    /* renamed from: o  reason: collision with root package name */
    public String f26920o = "";

    /* compiled from: FeedbackActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements a.InterfaceC0367a {
        public a() {
        }

        @Override // qn.a.InterfaceC0367a
        public final void a() {
            e.this.E1();
        }

        @Override // qn.a.InterfaceC0367a
        public final void b() {
            e.this.z1();
        }
    }

    public final void A1(Editable editable) {
        boolean z10;
        int i10 = 0;
        if (editable != null && editable.length() >= 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView textView = this.f26908b;
        if (textView != null) {
            if (!((true ^ this.f26919n) | z10)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
        TextView textView2 = this.f26908b;
        if (textView2 != null) {
            textView2.setEnabled(z10);
        }
    }

    public abstract void C1(String str, ArrayList arrayList);

    public final void D1() {
        try {
            Intent intent = new Intent(ea.a.p("A25TcippNC4lZQJpVS42Y0xpPW5nSXtBM0UuQxBQFlUwRQ==", "kZb7EPzm"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                ea.a.p("QWU4bx92B0ERdF12AHQvKDRhUWsnZyZNVW4nZ1ByKQ==", "4F5vsntT");
                String p10 = ea.a.p("ek1H", "xbEyzoaH");
                String p11 = ea.a.p("XWoEZw==", "V7stqOrm");
                File filesDir = getFilesDir();
                kotlin.jvm.internal.g.d(filesDir, ea.a.p("VWknZQBEC3I=", "5CVEs7mR"));
                File createTempFile = File.createTempFile(p10, p11, filesDir);
                String str = this.f26916k;
                Uri uri = (str == null || (uri = FileProvider.getUriForFile(this, str, createTempFile)) == null) ? null : null;
                this.f26913h = uri;
                if (uri != null) {
                    intent.putExtra(ea.a.p("XHU_cAZ0", "ZaCHFZkh"), this.f26913h);
                    intent.addFlags(2);
                    startActivityForResult(intent, 1001);
                }
                createTempFile.deleteOnExit();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.c.a
    public final void Z(int i10) {
        Editable editable;
        RecyclerView.Adapter adapter;
        ArrayList<String> arrayList = this.f26911f;
        if (arrayList.size() > i10) {
            arrayList.remove(i10);
        }
        x1();
        RecyclerView recyclerView = this.f26910e;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        EditText editText = this.f26907a;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        A1(editable);
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        String str;
        if (i11 != -1) {
            return;
        }
        if (i10 != 1001) {
            if (i10 == 1002) {
                if (intent != null) {
                    try {
                        data = intent.getData();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    data = null;
                }
                String b10 = rn.a.b(this, data);
                if (b10 != null && (str = this.f26916k) != null) {
                    Uri uriForFile = FileProvider.getUriForFile(this, str, new File(b10));
                    kotlin.jvm.internal.g.d(uriForFile, ea.a.p("RnIiRhxyJGkeZQ==", "0ohtRnvQ"));
                    w1(uriForFile);
                }
            }
        } else {
            Uri uri = this.f26913h;
            if (uri != null) {
                w1(uri);
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        Uri uri;
        super.onCreate(bundle);
        setContentView(R.layout.feedback_activity_feedback);
        boolean z10 = true;
        setRequestedOrientation(1);
        this.f26920o = "";
        ArrayList<String> arrayList = this.f26911f;
        Editable editable = null;
        if (bundle != null) {
            String string = bundle.getString(f26904s, "");
            kotlin.jvm.internal.g.d(string, ea.a.p("HXR7ZzB0BnQ6aQhnHEUPVGpBDVIMQWVPOl8iRR1FAVQxRHkgdyIp", "rftUUUW9"));
            this.f26920o = string;
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f26905t);
            if (stringArrayList != null && stringArrayList.size() > 0) {
                arrayList.addAll(stringArrayList);
            }
            String string2 = bundle.getString(f26906u);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    uri = Uri.parse(string2);
                } catch (Exception unused) {
                    uri = null;
                }
                this.f26913h = uri;
            }
        }
        B1();
        this.f26908b = (TextView) findViewById(R.id.tv_submit);
        this.f26907a = (EditText) findViewById(R.id.et_input);
        this.c = (RecyclerView) findViewById(R.id.rv_reason);
        this.f26910e = (RecyclerView) findViewById(R.id.rv_photo);
        EditText editText = this.f26907a;
        if (editText != null) {
            editText.setHint(getString(R.string.arg_res_0x7f130140, ea.a.p("Ng==", "QRt1qF1t")));
        }
        EditText editText2 = this.f26907a;
        if (editText2 != null) {
            editText2.addTextChangedListener(new d(this));
        }
        TextView textView = this.f26908b;
        if (textView != null) {
            textView.setOnClickListener(new u4.j(this, 18));
        }
        findViewById(R.id.ll_toolbar).setOnClickListener(new d9.f(this, 14));
        ((InputMethodManager) getSystemService(ea.a.p("Jm5BdQ1fWmUuaCVk", "uQzZxfWu"))).hideSoftInputFromWindow(this.f26907a.getWindowToken(), 2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.e1(0);
        if (flexboxLayoutManager.f9959r != 0) {
            flexboxLayoutManager.f9959r = 0;
            flexboxLayoutManager.z0();
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(flexboxLayoutManager);
        }
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new pdf.pdfreader.viewer.editor.free.ui.adapter.o(this.f26914i, this.f26915j));
        }
        RecyclerView recyclerView3 = this.f26910e;
        if (recyclerView3 != null) {
            if (this.f26917l <= 0) {
                z10 = false;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            recyclerView3.setVisibility(i10);
        }
        RecyclerView recyclerView4 = this.f26910e;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(0));
        }
        RecyclerView recyclerView5 = this.f26910e;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(new pdf.pdfreader.viewer.editor.free.ui.adapter.c(arrayList, this));
        }
        EditText editText3 = this.f26907a;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        A1(editable);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        boolean z10;
        EditText editText;
        kotlin.jvm.internal.g.e(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        try {
            String string = savedInstanceState.getString(f26902q);
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (editText = this.f26907a) != null) {
                    editText.setText(string);
                }
            }
            this.f26909d = savedInstanceState.getParcelable(f26901p);
            this.f26912g = savedInstanceState.getParcelable(f26903r);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        RecyclerView recyclerView;
        RecyclerView.m layoutManager;
        RecyclerView recyclerView2;
        RecyclerView.m layoutManager2;
        super.onResume();
        Parcelable parcelable = this.f26909d;
        if (parcelable != null && (recyclerView2 = this.c) != null && (layoutManager2 = recyclerView2.getLayoutManager()) != null) {
            layoutManager2.q0(parcelable);
        }
        Parcelable parcelable2 = this.f26912g;
        if (parcelable2 != null && (recyclerView = this.f26910e) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.q0(parcelable2);
        }
    }

    @Override // androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Parcelable parcelable;
        Parcelable parcelable2;
        RecyclerView.m layoutManager;
        RecyclerView.m layoutManager2;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        try {
            EditText editText = this.f26907a;
            if (editText != null) {
                outState.putString(f26902q, editText.getText().toString());
            }
            RecyclerView recyclerView = this.c;
            String str = null;
            if (recyclerView != null && (layoutManager2 = recyclerView.getLayoutManager()) != null) {
                parcelable = layoutManager2.r0();
            } else {
                parcelable = null;
            }
            this.f26909d = parcelable;
            outState.putParcelable(f26901p, parcelable);
            RecyclerView recyclerView2 = this.f26910e;
            if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                parcelable2 = layoutManager.r0();
            } else {
                parcelable2 = null;
            }
            this.f26912g = parcelable2;
            outState.putParcelable(f26903r, parcelable2);
            StringBuilder sb2 = new StringBuilder();
            pn.a[] aVarArr = this.f26914i;
            if (aVarArr != null) {
                int length = aVarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (aVarArr[i10].f28985b) {
                        sb2.append(i11);
                        sb2.append(ea.a.p("LA==", "AvUSPucA"));
                    }
                    i10++;
                    i11 = i12;
                }
            }
            outState.putString(f26904s, sb2.toString());
            outState.putStringArrayList(f26905t, this.f26911f);
            String str2 = f26906u;
            Uri uri = this.f26913h;
            if (uri != null) {
                str = uri.toString();
            }
            outState.putString(str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.c.a
    public final void q0() {
        try {
            int i10 = qn.a.f29388q0;
            float f10 = this.f26918m;
            a aVar = new a();
            qn.a aVar2 = new qn.a();
            aVar2.f29389o0 = f10;
            aVar2.f29390p0 = aVar;
            androidx.fragment.app.g0 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.g.d(supportFragmentManager, ea.a.p("FXU7cA1yPUY6YQFtUW4jTVluM2cscg==", "ExfKbIq8"));
            aVar2.s0(supportFragmentManager);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void w1(Uri uri) {
        Editable editable;
        RecyclerView.Adapter adapter;
        String path = Uri.parse(rn.a.b(this, uri)).getPath();
        if (path == null) {
            return;
        }
        this.f26911f.add(path);
        x1();
        RecyclerView recyclerView = this.f26910e;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        EditText editText = this.f26907a;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        A1(editable);
    }

    public final void x1() {
        RecyclerView.Adapter adapter;
        boolean z10;
        RecyclerView recyclerView = this.f26910e;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        kotlin.jvm.internal.g.c(adapter, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuI24ebj5sByA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU-LlZkInQEcmFmQ2UcLkJpdGEuYQV0DXIbQwZvKnMAUCRvR28ZQz1BK2FBdBxy", "o4weL3Kk"));
        pdf.pdfreader.viewer.editor.free.ui.adapter.c cVar = (pdf.pdfreader.viewer.editor.free.ui.adapter.c) adapter;
        if (this.f26911f.size() < this.f26917l) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f27128f = z10;
    }

    public final boolean y1(int i10) {
        return kotlin.text.k.O(this.f26920o, String.valueOf(i10), false);
    }

    public void B1() {
    }

    public void E1() {
    }

    public void z1() {
    }
}
