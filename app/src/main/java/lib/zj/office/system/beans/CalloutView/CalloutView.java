package lib.zj.office.system.beans.CalloutView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.PathHolder;
import lib.zj.office.system.f;
import qi.a;
import qi.b;
import qi.c;
import qi.d;
import qi.e;

/* loaded from: classes3.dex */
public class CalloutView extends View {

    /* renamed from: a  reason: collision with root package name */
    public float f20977a;

    /* renamed from: b  reason: collision with root package name */
    public float f20978b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public List<e> f20979d;

    /* renamed from: e  reason: collision with root package name */
    public e f20980e;

    /* renamed from: f  reason: collision with root package name */
    public c f20981f;

    /* renamed from: g  reason: collision with root package name */
    public int f20982g;

    /* renamed from: h  reason: collision with root package name */
    public int f20983h;

    /* renamed from: i  reason: collision with root package name */
    public a f20984i;

    /* renamed from: j  reason: collision with root package name */
    public b f20985j;

    /* renamed from: k  reason: collision with root package name */
    public int f20986k;

    /* renamed from: l  reason: collision with root package name */
    public d f20987l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f20988m;

    /* renamed from: n  reason: collision with root package name */
    public Canvas f20989n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f20990o;

    /* renamed from: p  reason: collision with root package name */
    public Paint f20991p;

    /* renamed from: q  reason: collision with root package name */
    public Paint f20992q;

    /* renamed from: r  reason: collision with root package name */
    public PathHolder f20993r;

    /* renamed from: s  reason: collision with root package name */
    public PathHolder f20994s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f20995t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f20996u;

    public CalloutView(Context context) {
        super(context);
        this.f20977a = 1.0f;
        this.f20979d = null;
        this.f20980e = null;
        this.f20982g = 0;
        this.f20983h = 0;
        this.f20985j = null;
        this.f20986k = 0;
        a();
    }

    public final void a() {
        this.f20987l = new d();
        this.f20988m = new Rect();
        this.f20995t = new ArrayList();
        this.f20996u = new ArrayList();
        this.f20991p = new Paint();
        this.f20992q = new Paint();
        this.f20993r = new PathHolder();
        this.f20994s = new PathHolder();
        this.f20991p.setColor(-65536);
        this.f20991p.setStyle(Paint.Style.STROKE);
        this.f20992q.setStyle(Paint.Style.STROKE);
        this.f20991p.setStrokeWidth(20.0f);
        this.f20991p.setAntiAlias(true);
        this.f20991p.setStrokeCap(Paint.Cap.ROUND);
        this.f20991p.setStrokeJoin(Paint.Join.ROUND);
        this.f20992q.setStrokeWidth(20.0f);
        this.f20992q.setStrokeCap(Paint.Cap.ROUND);
        this.f20992q.setStrokeJoin(Paint.Join.ROUND);
        this.f20992q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int getMode() {
        a aVar = this.f20984i;
        if (aVar != null) {
            return aVar.f29350d;
        }
        return -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int mode = getMode();
        int i10 = 0;
        if (mode != 0 && mode != 1 && mode != 2) {
            if (mode == 3 || mode == 4 || mode == 5) {
                int width = getWidth();
                int height = getHeight();
                if (this.f20990o == null && width > 0 && height > 0) {
                    this.f20990o = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
                    this.f20989n = new Canvas(this.f20990o);
                }
                Bitmap bitmap = this.f20990o;
                if (bitmap != null && this.f20989n != null) {
                    bitmap.eraseColor(0);
                    while (i10 < this.f20995t.size()) {
                        Canvas canvas2 = this.f20989n;
                        Path path = (Path) this.f20995t.get(i10);
                        if (((Boolean) this.f20996u.get(i10)).booleanValue()) {
                            paint = this.f20992q;
                        } else {
                            paint = this.f20991p;
                        }
                        canvas2.drawPath(path, paint);
                        i10++;
                    }
                    canvas.drawBitmap(this.f20990o, 0.0f, 0.0f, this.f20991p);
                    return;
                }
                return;
            }
            return;
        }
        canvas.getClipBounds(this.f20988m);
        a aVar = this.f20984i;
        if (aVar != null) {
            this.f20979d = aVar.b(this.f20986k, false);
        }
        if (this.f20979d != null) {
            while (i10 < this.f20979d.size()) {
                e eVar = this.f20979d.get(i10);
                this.f20987l.setStrokeWidth(eVar.f29354b);
                this.f20987l.setColor(eVar.c);
                canvas.save();
                int i11 = this.f20982g;
                int i12 = this.f20983h;
                Rect rect = this.f20988m;
                canvas.clipRect(i11, i12, rect.right, rect.bottom);
                float f10 = this.f20977a;
                canvas.scale(f10, f10);
                canvas.drawPath(eVar.f29353a, this.f20987l);
                canvas.restore();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        a aVar = this.f20984i;
        if (aVar == null || aVar.f29350d == 0) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f20984i != null) {
                        float f10 = this.f20977a;
                        float f11 = rawX / f10;
                        float f12 = rawY / f10;
                        float abs = Math.abs(f11 - this.f20978b);
                        float abs2 = Math.abs(f12 - this.c);
                        int i10 = this.f20984i.f29350d;
                        if (i10 != 1) {
                            if (i10 != 3) {
                                if (i10 == 4 && (abs >= 4.0f || abs2 >= 4.0f)) {
                                    PathHolder pathHolder = this.f20994s;
                                    float f13 = this.f20978b;
                                    float f14 = this.c;
                                    pathHolder.quadTo(f13, f14, (f11 + f13) / 2.0f, (f12 + f14) / 2.0f);
                                    this.f20978b = f11;
                                    this.c = f12;
                                }
                            } else if (abs >= 4.0f || abs2 >= 4.0f) {
                                PathHolder pathHolder2 = this.f20993r;
                                float f15 = this.f20978b;
                                float f16 = this.c;
                                pathHolder2.quadTo(f15, f16, (f11 + f15) / 2.0f, (f12 + f16) / 2.0f);
                                this.f20978b = f11;
                                this.c = f12;
                            }
                        } else if (((abs >= 4.0f || abs2 >= 4.0f) && abs <= 160.0f) || abs2 <= 160.0f) {
                            PathHolder pathHolder3 = this.f20980e.f29353a;
                            float f17 = this.f20978b;
                            float f18 = this.c;
                            pathHolder3.quadTo(f17, f18, (f11 + f17) / 2.0f, (f12 + f18) / 2.0f);
                            this.f20978b = f11;
                            this.c = f12;
                        }
                    }
                    invalidate();
                }
            } else {
                a aVar2 = this.f20984i;
                if (aVar2 != null && (eVar = this.f20980e) != null) {
                    int i11 = aVar2.f29350d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    this.f20994s.lineTo(this.f20978b, this.c);
                                }
                            } else {
                                this.f20993r.lineTo(this.f20978b, this.c);
                            }
                        } else if (this.f20979d != null) {
                            for (int i12 = 0; i12 < this.f20979d.size(); i12++) {
                                e eVar2 = this.f20979d.get(i12);
                                PathHolder pathHolder4 = new PathHolder(eVar2.f29353a);
                                pathHolder4.lineTo(eVar2.f29355d, eVar2.f29356e);
                                RectF rectF = new RectF();
                                pathHolder4.computeBounds(rectF, false);
                                Region region = new Region();
                                region.setPath(pathHolder4, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
                                int i13 = (int) this.f20978b;
                                int i14 = (int) this.c;
                                if (region.op(new Region(i13 - 5, i14 - 5, i13 + 5, i14 + 5), Region.Op.INTERSECT)) {
                                    this.f20979d.remove(i12);
                                }
                            }
                        }
                    } else {
                        eVar.f29353a.lineTo(this.f20978b, this.c);
                        e eVar3 = this.f20980e;
                        eVar3.f29355d = this.f20978b + 1.0f;
                        eVar3.f29356e = this.c + 1.0f;
                    }
                }
                invalidate();
                Runnable runnable = this.f20985j;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                b bVar = new b(this);
                this.f20985j = bVar;
                postDelayed(bVar, 1000L);
            }
        } else {
            float f19 = this.f20977a;
            float f20 = rawX / f19;
            float f21 = rawY / f19;
            this.f20978b = f20;
            this.c = f21;
            int i15 = this.f20984i.f29350d;
            if (i15 != 1) {
                if (i15 != 3) {
                    if (i15 == 4) {
                        PathHolder pathHolder5 = new PathHolder();
                        this.f20994s = pathHolder5;
                        pathHolder5.moveTo(f20, f21);
                        this.f20995t.add(this.f20994s);
                        this.f20996u.add(Boolean.TRUE);
                    }
                } else {
                    PathHolder pathHolder6 = new PathHolder();
                    this.f20993r = pathHolder6;
                    pathHolder6.moveTo(f20, f21);
                    this.f20995t.add(this.f20993r);
                    this.f20996u.add(Boolean.FALSE);
                }
            } else {
                e eVar4 = new e();
                this.f20980e = eVar4;
                eVar4.f29353a.moveTo(f20, f21);
                e eVar5 = this.f20980e;
                a aVar3 = this.f20984i;
                eVar5.c = aVar3.f29349b;
                eVar5.f29354b = aVar3.c;
                List<e> b10 = aVar3.b(this.f20986k, true);
                this.f20979d = b10;
                b10.add(this.f20980e);
            }
            invalidate();
        }
        return true;
    }

    public void setColor(int i10) {
        a aVar = this.f20984i;
        if (aVar != null) {
            aVar.f29349b = i10;
        }
    }

    public void setControl(f fVar) {
        a b10 = fVar.o().b();
        this.f20984i = b10;
        b10.c(0);
    }

    public void setExportListener(c cVar) {
        this.f20981f = cVar;
    }

    public void setIndex(int i10) {
        this.f20986k = i10;
        invalidate();
    }

    public void setMode(int i10) {
        a aVar = this.f20984i;
        if (aVar != null) {
            aVar.c(i10);
        }
    }

    public void setZoom(float f10) {
        this.f20977a = f10;
    }

    public CalloutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20977a = 1.0f;
        this.f20979d = null;
        this.f20980e = null;
        this.f20982g = 0;
        this.f20983h = 0;
        this.f20985j = null;
        this.f20986k = 0;
        a();
    }

    public CalloutView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20977a = 1.0f;
        this.f20979d = null;
        this.f20980e = null;
        this.f20982g = 0;
        this.f20983h = 0;
        this.f20985j = null;
        this.f20986k = 0;
        a();
    }

    public CalloutView(Context context, f fVar, c cVar) {
        super(context);
        this.f20977a = 1.0f;
        this.f20979d = null;
        this.f20980e = null;
        this.f20982g = 0;
        this.f20983h = 0;
        this.f20985j = null;
        this.f20986k = 0;
        this.f20981f = cVar;
        this.f20984i = fVar.o().b();
        a();
    }
}
