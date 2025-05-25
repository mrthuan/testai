package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ChoosePhotoRCVAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f27126d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27127e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27128f;

    /* compiled from: ChoosePhotoRCVAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void Z(int i10);

        void q0();
    }

    /* compiled from: ChoosePhotoRCVAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f27129b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final View f27130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            ea.a.p("RWkudw==", "Yv2ScXji");
            View findViewById = view.findViewById(R.id.iv_photo);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("QWkJd3RmAm4sVg9lQ0IuSVwoAC4gZBhpAl8BaD50LSk=", "3D7lZkYx"));
            this.f27129b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.iv_delete);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("OWlUd1dmXm4-ViNlAkIRSVEoPC4sZEtpHl8UZS1lJWUp", "NfwKhpAQ"));
            this.c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.frame_view);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("OWlUd1dmXm4-ViNlAkIRSVEoPC4sZEtmJmEgZTB2OWU4KQ==", "NKRdTMoP"));
            this.f27130d = findViewById3;
        }
    }

    public c(ArrayList arrayList, a aVar) {
        kotlin.jvm.internal.g.e(arrayList, ea.a.p("K2FFYQ==", "vkkKrnVQ"));
        kotlin.jvm.internal.g.e(aVar, ea.a.p("B2lCdC1uIHI=", "4mk1HEQ7"));
        this.f27126d = arrayList;
        this.f27127e = aVar;
        this.f27128f = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        boolean z10 = this.f27128f;
        List<String> list = this.f27126d;
        if (z10) {
            return list.size() + 1;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, final int i10) {
        int i11;
        int i12;
        int i13;
        Bitmap bitmap;
        int attributeInt;
        b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        List<String> list = this.f27126d;
        int size = list.size();
        View view = holder.f27130d;
        ImageView imageView = holder.c;
        ImageView imageView2 = holder.f27129b;
        if (i10 == size) {
            imageView2.setImageResource(R.drawable.feedback_layerlist_ic_add_photo);
            imageView.setVisibility(8);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String p10 = ea.a.p("Nmgfc2Iw", "x7BvFhdl");
                    c cVar = this;
                    kotlin.jvm.internal.g.e(cVar, p10);
                    if (i10 == cVar.f27126d.size()) {
                        cVar.f27127e.q0();
                    }
                }
            });
            view.setVisibility(4);
        } else {
            String str = list.get(i10);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inJustDecodeBounds = false;
                int i14 = options.outHeight;
                if (i14 > 200) {
                    i11 = i14 / 200;
                } else {
                    i11 = 1;
                }
                int i15 = options.outWidth;
                if (i15 > 200) {
                    i12 = i15 / 200;
                } else {
                    i12 = 1;
                }
                if (i11 <= i12) {
                    i11 = i12;
                }
                options.inSampleSize = i11;
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile != null) {
                    try {
                        attributeInt = new ExifInterface(str).getAttributeInt(ea.a.p("AHJYZRd0VnQzb24=", "2ODu6cWz"), 1);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    if (attributeInt != 3) {
                        if (attributeInt != 6) {
                            if (attributeInt == 8) {
                                i13 = 270;
                            }
                            i13 = 0;
                        } else {
                            i13 = 90;
                        }
                    } else {
                        i13 = ShapeTypes.MATH_EQUAL;
                    }
                    if (i13 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i13);
                        try {
                            bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                        } catch (OutOfMemoryError e11) {
                            e11.printStackTrace();
                            bitmap = null;
                        }
                        if (bitmap == null) {
                            bitmap = decodeFile;
                        }
                        if (decodeFile != bitmap) {
                            decodeFile.recycle();
                        }
                        decodeFile = bitmap;
                    }
                    imageView2.setImageBitmap(decodeFile);
                }
            } catch (Throwable th2) {
                try {
                    imageView2.setImageBitmap(BitmapFactory.decodeFile(str));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                th2.printStackTrace();
            }
            imageView.setVisibility(0);
            view.setVisibility(0);
        }
        imageView.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.adapter.b(i10, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.feedback_item_rcv_photo, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1ms4DCchB2DHBbbz9vXyASYQBlWnRFIDBhKHNXKQ==", "QdsSTZgd"));
        return new b(i11);
    }
}
