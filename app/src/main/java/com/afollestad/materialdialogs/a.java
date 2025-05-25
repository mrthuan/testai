package com.afollestad.materialdialogs;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DefaultRvAdapter.java */
/* loaded from: classes.dex */
public final class a extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final MaterialDialog f5973d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5974e;

    /* renamed from: f  reason: collision with root package name */
    public c f5975f;

    /* compiled from: DefaultRvAdapter.java */
    /* renamed from: com.afollestad.materialdialogs.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0046a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5976a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f5976a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5976a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DefaultRvAdapter.java */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.b0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final CompoundButton f5977b;
        public final a c;

        public b(View view, a aVar) {
            super(view);
            this.f5977b = (CompoundButton) view.findViewById(R.id.md_control);
            TextView textView = (TextView) view.findViewById(R.id.md_title);
            this.c = aVar;
            view.setOnClickListener(this);
            aVar.f5973d.c.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = this.c;
            if (aVar.f5975f != null && getAdapterPosition() != -1) {
                aVar.f5973d.c.getClass();
                ((MaterialDialog) aVar.f5975f).d(view, getAdapterPosition(), false);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            a aVar = this.c;
            if (aVar.f5975f != null && getAdapterPosition() != -1) {
                aVar.f5973d.c.getClass();
                return ((MaterialDialog) aVar.f5975f).d(view, getAdapterPosition(), true);
            }
            return false;
        }
    }

    /* compiled from: DefaultRvAdapter.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public a(MaterialDialog materialDialog, int i10) {
        this.f5973d = materialDialog;
        this.f5974e = i10;
        GravityEnum gravityEnum = materialDialog.c.f5949e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        this.f5973d.c.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        boolean z10;
        int i11;
        b bVar2 = bVar;
        View view = bVar2.itemView;
        MaterialDialog materialDialog = this.f5973d;
        materialDialog.c.getClass();
        MaterialDialog.b bVar3 = materialDialog.c;
        int i12 = bVar3.f5969y;
        bVar2.itemView.setEnabled(true);
        int i13 = C0046a.f5976a[materialDialog.f5942p.ordinal()];
        CompoundButton compoundButton = bVar2.f5977b;
        if (i13 != 1) {
            if (i13 == 2) {
                CheckBox checkBox = (CheckBox) compoundButton;
                throw null;
            }
        } else {
            RadioButton radioButton = (RadioButton) compoundButton;
            if (bVar3.f5961q == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = bVar3.f5955k;
            if (d3.b.d(d3.b.g(radioButton.getContext(), 16842806, 0))) {
                i11 = -16777216;
            } else {
                i11 = -1;
            }
            int a10 = d3.b.a(0.3f, i11);
            radioButton.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{d3.b.g(radioButton.getContext(), R.attr.colorControlNormal, 0), i14, a10, a10}));
            radioButton.setChecked(z10);
            radioButton.setEnabled(true);
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f5974e, viewGroup, false);
        MaterialDialog materialDialog = this.f5973d;
        MaterialDialog.b bVar = materialDialog.c;
        bVar.getClass();
        Drawable h10 = d3.b.h(bVar.f5946a, R.attr.md_list_selector);
        if (h10 == null) {
            h10 = d3.b.h(materialDialog.getContext(), R.attr.md_list_selector);
        }
        inflate.setBackground(h10);
        return new b(inflate, this);
    }
}
